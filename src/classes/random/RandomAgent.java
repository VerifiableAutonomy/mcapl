// ----------------------------------------------------------------------------
// Copyright (C) 2012 Louise A. Dennis, and  Michael Fisher 
//
// This file is part of the Agent Infrastructure Layer (AIL)
// 
// The AIL is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 3 of the License, or (at your option) any later version.
// 
// The AIL is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public
// License along with the AIL; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
// 
// To contact the authors:
// http://www.csc.liv.ac.uk/~lad
//
//----------------------------------------------------------------------------

package random;

import ail.util.AILexception;
import ail.semantics.ReasoningCycle;
import ail.semantics.RCStage;
import ail.semantics.AILAgent;
import ail.semantics.OSRule;
import ail.syntax.Action;
import ail.mas.MAS;
import ail.mas.AILEnv;

import ajpf.util.AJPFLogger;

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

import gov.nasa.jpf.annotation.FilterField;
//import gov.nasa.jpf.jvm.abstraction.filter.*;
import gov.nasa.jpf.jvm.Verify;

/**
 * A Random Agent - Takes actions at random without any reasoning.  Can be used to model a "black box" agent.
 * 
 * @author louiseadennis
 *
 */
public class RandomAgent extends AILAgent { 
	//static Logger log = Logger.getLogger("random");
	String logname = "random.RandomAgent";
	
	public RandomAgent() {
		super();
		setReasoningCycle(new RandomRC(new ArrayList<Action>()));
	}
		
	public RandomAgent(MAS mas, String name) throws AILexception {
		// first we create an AIL Agent.
		super(mas, name);
		// Then we create a MAS		
		setReasoningCycle(new RandomRC(new ArrayList<Action>()));
	//	Logger.getLogger("random").setLevel(Level.FINE);
		//getEnv().executeAction(name, new Action("eat"));
	}

	/**
	 * Construct an OOPLAgent from a name.
	 * 
	 * @param name the name of the agent.
	 */
	public RandomAgent(ArrayList<Action> actions) {
		// first we create an AIL Agent.
		super();
		setReasoningCycle(new RandomRC(actions));
		//getEnv().executeAction(name, new Action("eat"));
	}
	
	/**
	 * Construct an OOPLAgent from a name.
	 * 
	 * @param name the name of the agent.
	 */
	public RandomAgent(String name, ArrayList<Action> actions) {
		// first we create an AIL Agent.
		super(name);
		setReasoningCycle(new RandomRC(actions));
		//getEnv().executeAction(name, new Action("eat"));
	}
	/**
	 * Add an action the agent can take.
	 * @param a
	 */
	public void addAction(Action a) {
		((RandomRC) getReasoningCycle()).addAction(a);
	}
	
	final class RandomRC implements ReasoningCycle {
		@FilterField
		public RandomStage Stage;
		@FilterField
		public boolean stopandcheck = true;
		public boolean interrupted = false;
		
		public RandomRC(ArrayList<Action> actions) {
			Stage = new RandomStage(actions);
		}
		
		public void cycle(AILAgent ag) {setStopandCheck(true);}
		
		public void setStopandCheck(boolean b) {stopandcheck = b;};
		
		public boolean stopandcheck() {return stopandcheck;};
		
		public RCStage getStage() {
			return Stage;
		}
		
		public void setCurrentStage(RCStage r) {};
		
		public void addAction(Action a) {
			Stage.addAction(a);
		}
		
		public boolean not_interrupted() {
			return !interrupted;
		}

		
	}
	
	final class RandomStage implements RCStage {
		@FilterField
		RandomAction ra;
		@FilterField
		ArrayList<OSRule> rules = new ArrayList<OSRule>();
		
		public RandomStage(ArrayList<Action> actions) {
			ra = new RandomAction(actions);
			rules.add(ra);
		}
		
		public String getStageName() {
			return "Random Stage";
		}
		
		public int getStageNum() {
			return 1;
		}
		
		public Iterator<OSRule> getStageRules() {
			return rules.iterator();
		}
		
		public void setRule(OSRule r) {};
		
		public void addAction(Action a) {
			ra.addAction(a);
		}
		
	}
	
	/**
	 * Act at random
	 * @author lad
	 *
	 */
	final class RandomAction implements OSRule {
		@FilterField
		private ArrayList<Action> actions = new ArrayList<Action>();
		@FilterField
		private int size = 0;
		
		boolean firstaction = false;
		
		Random r = new Random();
		// Useful to limit number of actions that may be taken before shutting down.
		@FilterField
		private int counter = 0;
		// May be useful to limit number of actions that may be taken before shutting down.
		int numactions = 2;
		@FilterField
		int choice;
		
		// Action a;
		
		public RandomAction(ArrayList<Action> as) {
			actions = as;
			size = actions.size();
			//if (size > 0) {
				//log.fine("picking an action at random in RandomAction");
				//System.err.println("picking an action at random in RandomAction");
			//	choice = r.nextInt(size);
			//	a = actions.get(choice);
			//}
		}
		
		/*
		 * 
		 */
		private static final String name = "Random Action";
		
		public String getName() {
			return name;
		}

		/*
		 * 
		 */
		public boolean checkPreconditions(AILAgent ag) {
			//if (a == null) {
				// log.fine("picking an action at random in checkPreconditions");
			//	System.err.println("picking an action at random in checkPreconditions");
				//choice = r.nextInt(size);
			//	a = actions.get(choice);
		//	}
			AJPFLogger.fine("random.RandomAgent", "checking preconditions");
			if (counter < numactions) {
				return (size > 0);
			} else {
				ag.sleep();
			 	ag.stop();
				return false;
			}
		}
		
		public void addAction(Action act) {
			actions.add(act);
			size++;
		//	choice = r.nextInt(size);
		//	a = actions.get(choice);
		}
	
		public void apply(AILAgent ag) {
			AJPFLogger.fine(logname, "picking an action at random in apply");
			// RandomAgent.this.getEnv().ping();
			choice = r.nextInt(size);
			Action a = actions.get(choice);
			
			try {
				ag.getEnv().executeAction(ag.getAgName(), a);
				// counter++;
			} catch (Exception e) {
				AJPFLogger.warning(logname, e.getMessage());
			} 
			
			if (counter == numactions) {
				AJPFLogger.warning(logname, "ACTION COUNT EXCEEDED");
			//	System.err.println("ACTION COUNT EXCEEDED");
				ag.sleep();
			 	ag.stop();
			} 
		 }
		
	}

}


