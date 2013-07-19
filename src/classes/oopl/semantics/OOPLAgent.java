// ----------------------------------------------------------------------------
// Copyright (C) 2012 Louise A. Dennis, and Nick Tinnemeier
//
// This file is part of OOPL
// 
// OOPL is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 3 of the License, or (at your option) any later version.
// 
// OOPL is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public
// License along with OOPL; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
// 
// To contact the authors:
// http://www.csc.liv.ac.uk/~lad
//
//----------------------------------------------------------------------------

package oopl.semantics;

import ail.util.AILConfig;
import ail.util.AILexception;
import ail.mas.ActionScheduler;
import ail.mas.MAS;
import ajpf.MCAPLScheduler;
import ajpf.PerceptListener;
import ajpf.util.AJPFLogger;
import ajpf.util.VerifyMap;
import ajpf.util.VerifySet;
import ajpf.util.VerifyList;
import ail.semantics.AILAgent;
import ail.syntax.ApplicablePlan;
import ail.syntax.Message;
import ail.syntax.Unifier;
import ail.syntax.Intention;
import ail.syntax.Action;
import ail.syntax.BeliefBase;
import ail.syntax.Deed;
import ail.syntax.Event;
import ail.syntax.GBelief;
import ail.syntax.Literal;
import ail.syntax.Predicate;
import ail.syntax.Plan;
import ail.syntax.SendAction;
import ail.syntax.VarTerm;
import ail.syntax.PlanLibrary;
import ail.syntax.Predicate;

//import gov.nasa.jpf.jvm.Verify;
import gov.nasa.jpf.annotation.FilterField;
//import gov.nasa.jpf.jvm.abstraction.filter.*;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import oopl.syntax.CountsAsRule;
import oopl.syntax.EffectRule;
import oopl.semantics.OOPLRC;
import oopl.syntax.SanctionRule;
import ail.mas.AILEnv;
import ajpf.MCAPLcontroller;
import ajpf.MCAPLJobber;

/**
 * A Gwendolen Agent - a demonstration of how to subclass an AIL Agent and
 * create a reasoning cycle.
 * 
 * @author louiseadennis
 *
 */
public class OOPLAgent extends AILAgent implements AILEnv { 

	public static byte OOPLTell = 1;

	
	// Institutional facts are stored in their own belief base.
	// brute facts are stored in the default one.
    //private BeliefBase inst = new BeliefBase();
     
	// Counts-as rules and sanctions are stored in a plan library.
	// Effect rules are stored in the default one.
	//private PlanLibrary caRules = new PlanLibrary();
	//private PlanLibrary sRules = new PlanLibrary();
	
	// The last action performed and the agent performing it.
	@FilterField
	private Action lastAction;
	@FilterField
	private String lastAgent;
	
	// Two queues are used to handle the synchronisation
	// between agents performing an action and the handling of actions. We want to 
	// make an agent wait for its action to be handled and we want to handle only
	// one action at a time.
	private final Queue<Literal> nextAction = new LinkedList<Literal>();
	//@FilterField
	//private final Queue<Literal> actionResult = new Queue<Literal>(1);
	// private final Queue<Literal> actionResult = new LinkedList<Literal>(1);
	private VerifyMap<String, Literal> actionResult = new VerifyMap<String, Literal>();
	
	
	// The plans that have already been applied.
	@FilterField
	private LinkedList<ApplicablePlan> generated = new LinkedList<ApplicablePlan>();
	
	/**
	 * A map of agents to their pending messages.
	 */
	/**
	 * A map of agents to their pending messages.
	 */
	private Map<String, VerifySet<Message>> agMessages = new VerifyMap<String, VerifySet<Message>>();

	/**
	 * List of agents who have already "collected" the current set of percepts.
	 */
	@FilterField
	protected List<String> uptodateAgs = new ArrayList<String>();
	
	private ArrayList<Message> mymessages = new ArrayList<Message>();

	/**
	 * The list of percept listeners.
	 */
	@FilterField
	private static List<PerceptListener> perceptListeners = new ArrayList<PerceptListener>();

	/**
	 * The scheduler associated with this environment
	 */
	protected MCAPLScheduler scheduler;
	
	protected MCAPLcontroller controller;
	
	/**
	 * Add an agent to the list the environment knows about.
	 * @param a
	 */
	public void addAgent(AILAgent a) {
		VerifySet<Message> msgl = new VerifySet<Message>();
		if (agMessages.get(a.getAgName()) == null) {
			agMessages.put(a.getAgName(), msgl);
		}
	}


	/** Clears the list of  messages of a specific agent */
	private void clearMessages(String agName) {
			if (agName != null) {
				VerifySet<Message> agl = agMessages.get(agName);
				if (agl != null) {
					 agl.clear();
				}
			}
	 }
	
	/**
	 * Construct an OOPLAgent from a name.
	 * 
	 * @param name the name of the agent.
	 */
	public OOPLAgent(String name)  {
		// first we create an AIL Agent.
		super(name);
		addBeliefBase(new BeliefBase(), 1);
		setPlanLibrary(new PlanLibrary("2"), "2");
		setPlanLibrary(new PlanLibrary("3"), "3");
		

		// Then we construct Gwendolen's reasoning cycle, starting with
		// an empty reasoning cycle.  See the GwendolenRC class for how
		// to create a language specific reasoning cycle.  NB. this will
		// change when we get the rules to return state change objects.
		setReasoningCycle(new OOPLRC());
		ActionScheduler s = new ActionScheduler();
		setScheduler(s);
		addPerceptListener(s);
	}
	
	String processing;
	public Literal getAction() {
		Literal action = nextAction.poll();
		if (action == null) {
			AJPFLogger.fine("oopl.semantics.OOPLAgent", "next Action is null");
			scheduler.notActive(getAgName());
			getReasoningCycle().setStopandCheck(true);
			return null;
		} else {
			AJPFLogger.fine("oopl.semantics.OOPLAgent", "next Action is " + action);
			processing = action.getTerm(0).getFunctor();
			AJPFLogger.fine("oopl.semantics.OOPLAgent", "remaining Actions are " + nextAction);
			return( action);
		}
	}

	/** Adds a perception for a specific agent */
	public void addMessage(String agName, Message msg) {
		if (msg != null && agName != null) {
			VerifySet<Message> msgl = agMessages.get(agName);
			if (msgl == null) {
				msgl = new VerifySet<Message>();
				msgl.add(msg);
				agMessages.put( agName, msgl);
			} else {
				boolean havem = false;
				for (Message m: msgl) {
					if (m.compareTo(msg) == 0) {
						havem = true;
						break;
					}
				}
				if (!havem) {
					msgl.add(msg);
				}
			}
		}
		notifyListeners(agName);
	}
	
	public void setMAS(MAS mas) {
		super.setMAS(mas);
		mas.setEnv(this);
	}

	  /*
     * (non-Javadoc)
     * @see ail.others.AILEnv#getMessages(java.lang.String)
     */
    public Set<Message> getMessages(String agName) {
    	if (agMessages.get(agName).isEmpty()) {
			return new HashSet<Message>();
		}

    	Set<Message> agl = agMessages.get(agName);
     	HashSet<Message> p = new HashSet<Message>();
		
    	if (agl != null) {
    		p.addAll(agl);
    		clearMessages(agName);
    	}
		
    	return p;
    }
	 
	 // Only one agent can be executing an action at a time.
	 //@FilterFrame
	public Unifier executeAction(String agName, Action act) throws AILexception {
		AJPFLogger.fine("oopl.semantics.OOPLAgent", "Entering executeAction");
		 lastAgent = agName;
		 lastAction = act;
	    	    	
	    Literal does = new Literal("does");
	    does.addTerm(new Predicate(agName));

	    if (act instanceof SendAction) {
    		SendAction sent = (SendAction) act;
    		Message m = sent.getMessage(agName);
    		String r = m.getReceiver();
    		addMessage(r, m);
    		does.addTerm(m.toTerm());
    	} else {
    		does.addTerm(act);
    	}
 
	   	AJPFLogger.info("oopl.semantics.OOPLAgent", does.toString());
	    
	    // Verify.beginAtomic();
	    notifyListeners(getAgName());
	    
	    
	    // Put the does literal in the queue that stores the action to be processed
	    // next. Note that there can only be one action in here at a time.
	    nextAction.offer(does);
	    this.tellawake();
	    scheduler.notActive(agName);
	    	// OK we are now going to do scheduling from within execute Action!! brace yourselves!!!
/*	    	MCAPLJobber a = null;
			while (actionResult == null & (a == null || a.getName() != agName)) {
				a = getController().scheduling(a);
			}

			// At this point we know our action is being processed next. Wait for it
	    	// to be fully processed and read the result.
	    	//System.out.println(generated);
	    	Literal r1 = getResult();
	    	// Try to unify the result and return the unifier.
	    	Literal r2 = new Literal("return");
	    	r2.addTerm( new VarTerm("R") );
	    	Unifier u = new Unifier();
	    	r2.unifies(r1, u);	
		   	AJPFLogger.info("oopl.semantics.OOPLAgent", agName + " done " + act.toString());
	    	return( u ); */
	    setExecuting(agName, act);
	    return new Unifier();
	}
	
	VerifyList<String> executing = new VerifyList<String>();
	public void setExecuting(String agName, Action act) {
	//	executing.add(agName);
	}
	
	public boolean executing(String agName, Action act) {
		return executing.contains(agName);
	}
	
	public Unifier actionResult(String agName, Action act) {	    	
		if (executing(agName, act) && done(agName, act)) {
			Literal r1 = getResult(agName, act);
	// Try to unify the result and return the unifier.
			Literal r2 = new Literal("return");
			r2.addTerm( new VarTerm("R") );
			Unifier u = new Unifier();
			r2.unifies(r1, u);	
			AJPFLogger.info("oopl.semantics.OOPLAgent", agName + " done " + act.toString());
			executing.remove(agName);
			return( u );
		} else {
			return null;
		}
	}
	
	public boolean done(String agName, Action act) {
		return actionResult.containsKey(agName);
	}
	
	public Literal getResult(String agName, Action act) {
		if (actionResult.containsKey(agName)) {
			Literal l = actionResult.get(agName);
			actionResult.remove(agName);
			return l;
		} else {
			return null;
		}
	}
	
	public MCAPLcontroller getController() {
		return getMAS().getController();
	}
	   
	
	public Set<Predicate> getPercepts(String agName, boolean update) {
		return (new HashSet<Predicate>());
	}
	
	public PlanLibrary getCARules() {
		return getPL("2");
	}
	
	public PlanLibrary getSRules() {
		return getPL("3");
	}
	
	public PlanLibrary getERules() {
		return getPL();
	}
	   
	
	protected Iterator<ApplicablePlan> getAllReactivePlans(Event ple) {
		if(this.getReasoningCycle().getStage() == ((OOPLRC)this.getReasoningCycle()).StageGCA) {
	    	return(getCARules().getAllReactivePlans(this));
	    }
   		else if(this.getReasoningCycle().getStage() == ((OOPLRC)this.getReasoningCycle()).StageGS) {
   			return(getSRules().getAllReactivePlans(this));
   		}
   		else {
   			return(new LinkedList<ApplicablePlan>().iterator());
   		}
	}
		
	protected Iterator<ApplicablePlan> getAllRelevantPlans(Event ple) {
	  	if (this.getReasoningCycle().getStage() == ((OOPLRC)this.getReasoningCycle()).StageGE) {
    		return getERules().getAllRelevant(ple.getPredicateIndicator(), this);
	   	} else {
	   		return(new LinkedList<ApplicablePlan>().iterator());
	   	}
	} 
	
	public LinkedList<ApplicablePlan> filterPlans(LinkedList<ApplicablePlan> aps) {
		// If we are applying effect rules and there is more than one applicable rule,
		// just return only one.
		if(this.getReasoningCycle().getStage() == ((OOPLRC)this.getReasoningCycle()).StageGE && aps.size() > 1) {
			LinkedList<ApplicablePlan> naps = new LinkedList<ApplicablePlan>();
			naps.add( aps.get(0) );
			return( naps );	
		} 
		// If we are applying counts-as and sanction rules we only apply those rules which have not been
		// applied before. That is, we filter out the set of applied plans recorded thus far.
		else if( this.getReasoningCycle().getStage() == ((OOPLRC)this.getReasoningCycle()).StageGCA ||
				 this.getReasoningCycle().getStage() == ((OOPLRC)this.getReasoningCycle()).StageGS) {
			aps.removeAll(generated);
			return( aps );
		}
		else {
			return(aps);
		}
	}
	    
	public boolean done() {
		AJPFLogger.fine("oopl.semantics.OOPLAgent", "next action is empty:" + nextAction.isEmpty());
		AJPFLogger.fine("oopl.semantics.OOPLAgent", "next action is:" + nextAction);
	    return( nextAction.isEmpty() );
	}
	    
	public Action lastAction() {
	    return( lastAction );
	}
	    
	public String lastActionby() {
	    return( lastAgent );
	}
	    
	public boolean nothingPending(String agName) {
		if (agName != getAgName()) {
			return true;
		} else {
			System.err.println(nextAction.isEmpty());
			return (nextAction.isEmpty());
		}
	}

	public boolean separateThread() {
	    return( false );
	}
	
	public void addEffectRule( EffectRule e ) throws AILexception {
		this.addPlan(e);
	}
	
	public void addCountsAsRule( CountsAsRule ca ) throws AILexception {
		this.getCARules().add(ca);
	}
	
	public void addSanctionRule( SanctionRule s ) throws AILexception {
		this.getSRules().add(s);
	}
	
	public void addGenerated(Iterator<ApplicablePlan> aps) {
		while (aps.hasNext()) {
			this.generated.add(aps.next());
		}
	}
	
	public void cleanGenerated() {
		this.generated.clear();
	}
	
	public void cleanInstitutional() {
	//	this.inst = new BeliefBase();
		bbmap.remove("1.0");
		bbmap.put("1.0", new BeliefBase());
	}
	
	
	public void postResult( Literal r ) {
		if (processing == null ) {
			
		} else {
			this.actionResult.put(processing, r);
			scheduler.isActive(processing);
			AJPFLogger.info("oopl.semantics.OOPLAgent", "Posted: " + r + " for " + processing);
			processing = null;
		}
	}
	
	/**
	 * Send the agent to sleep - stop processing the reasoning cycle until notified otherwise.
	 *
	 */
	public void sleep() {
		//LinkedList<Intention> Iss = Is;
		// Collections.sort((LinkedList<Intention>) Is);
		RC.setStopandCheck(true);
		if (nextAction.isEmpty()) {
			super.sleep();
		}
	}

	
	public String toString() {
 		
 		StringBuffer s = new StringBuffer();
 		s.append("Brute state: \n");
 		s.append(this.getBB().toString());
 		s.append("\n");
 		
 		s.append("Institutional state: \n");
 		s.append(getBB("1").toString());
 		
 		if( getNameOfLastRule() != null && getNameOfLastRule().equals("ApplyApplicableRules") ) {
 			Intention i = this.getIntention();
 			List<Intention> is = this.getIntentions();
 			
 			if( !i.empty() ) {
 				s.append("\nApplying effect rule:");
 				s.append("{ ");
 				s.append(i.hdG().toString());
 				s.append("} ");
 				try{
 					s.append(i.hdE().getLiteral().getTerm(1).toString());
 				} catch (Exception e) {
 					s.append("help!");
 				}
				s.append(" { ");
 				for( Deed d : i.deeds() ) {
 					s.append(d.getLiteral().toString());
 					s.append(" ");
 				} 
 				s.append("}");
 			}
 			else if( !is.isEmpty() ) {
 				s.append("\nApplying rules:\n");
 				
 				for( Intention r : is ) {
 	 				s.append("{ ");
 	 				s.append(r.hdG().toString());
 	 				s.append("} => { ");
 	 				for( Deed d : r.deeds() ) {
 	 					s.append(d.getLiteral().toString());
 	 					s.append(" ");
 	 				} 
 	 				s.append("}\n");
 				}
 			}
 		}
 		
 		String s1 = s.toString();
 		return s1;
 	}
	
	/**
	 * Add a percept listener to the environment.
	 * @param l
	 */
	public void addPerceptListener(PerceptListener l) {
		if (perceptListeners == null) {
			perceptListeners = new ArrayList<PerceptListener>();
		}
		perceptListeners.add(l);
	 }
	
	   /**
     * Notify the listeners that the perceptions have changed.
     *
     */
	   /**
     * Notify the listeners that the perceptions have changed.
     *
     */
    public void notifyListeners() {
    	if (perceptListeners != null) {
    		for (PerceptListener l: perceptListeners) {
    			l.perceptChanged("perception changed");
     		}
    	}
    }

    /**
     * Notify the listeners that a particular agent's perceptions have changed.
     * 
     * @param s the name of the agent whose perceptions have changed.
     */
    public void notifyListeners(String s) {
     	if (perceptListeners != null) {
    		for (PerceptListener l: perceptListeners) {
    			// NB.  We also inform the scheduler as well as any listener associated with the agent.
     			if (l.getListenerName().equals(s) || l.getListenerName().equals("scheduler")) {
    				l.perceptChanged(s);
    			}
    		}
    	}
     	
    }
    
     
    public void cleanup() {}
    
    public void init() {}
    
	/*
	 * (non-Javadoc)
	 * @see ail.mas.AILEnv#configure(ail.util.AILConfig)
	 */
	public void configure(AILConfig config) {
	}

	/*
	 * (non-Javadoc)
	 * @see ail.mas.AILEnv#getScheduler()
	 */
	public MCAPLScheduler getScheduler() {
		return scheduler;
	}
	
	/*
	 * (non-Javadoc)
	 * @see ail.mas.AILEnv#setScheduler(ajpf.MCAPLScheduler)
	 */
	public void setScheduler(MCAPLScheduler s) {
		scheduler = s;
	}
	
	public int compareTo(MCAPLJobber j) {
		return j.getName().compareTo(getAgName());
	}

	public void do_job() {
		MCAPLreason(1);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	public void finalize() {}
	
	/*
	 * (non-Javadoc)
	 * @see ail.mas.AILEnv#initialise()
	 */
	public void initialise() {}

 	/*
  	 * (non-Javadoc)
  	 * @see ail.mas.AILEnv#agentIsUpToDate(java.lang.String)
  	 */
  	public boolean agentIsUpToDate(String agName) {
  		return uptodateAgs.contains(agName);
  	}

}

