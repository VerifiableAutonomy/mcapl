package eass.imp.platooning;

import java.util.ArrayList;

import ail.mas.scheduling.NActionScheduler;
import eass.imp.platooning.util.Leader;
import eass.imp.platooning.util.Vehicle;
import ail.syntax.Action;
import ail.syntax.Literal;
import ail.syntax.Message;
import ail.syntax.NumberTerm;
import ail.syntax.NumberTermImpl;
import ail.syntax.Predicate;
import ail.syntax.SendAction;
import ail.syntax.StringTermImpl;
import ail.syntax.Term;
import ail.syntax.Unifier;
import ail.syntax.VarTerm;
import ail.util.AILexception;
import ajpf.util.AJPFLogger;
import eass.mas.DefaultEASSEnvironment;


//import eass.mas.matlab.EASSMatLabEnvironment;


public class LeaderEnvironment extends DefaultEASSEnvironment{
	String logname = "eass.platooning.PlatoonEnvironment";

	Leader l = new Leader();	
	/**
	 * Constructor.
	 *
	 */
	public LeaderEnvironment() {
		super();
	//	RoundRobinScheduler s = new RoundRobinScheduler();
		NActionScheduler s = new NActionScheduler(20);
		s.addJobber(this);
		setScheduler(s);
		addPerceptListener(s);
	}
		
	
	/*
	 * (non-Javadoc)
	 * @see eass.mas.DefaultEASSEnvironment#initialise()
	 */
	public void initialise() {
		super.initialise();

		// according to j_pos value, leader add a percept about allowed_position
		Literal allowed_p = new Literal("allowed_position");
		allowed_p.addTerm(new Literal("follower1")); 
/*		allowed_p.addTerm(new Literal("follower2")); */
		// join from behind, allowed_position is 0
/*		allowed_p.addTerm(new NumberTermImpl(0)); */
		addPercept("abstraction_leader", allowed_p);
		
		Literal platoon_member2 = new Literal("platoon_m");
		platoon_member2.addTerm(new Literal("leader"));
		platoon_member2.addTerm(new Literal("follower1"));
		addPercept("abstraction_leader", platoon_member2);

		Literal platoon_member = new Literal("platoon_m");
		platoon_member.addTerm(new Literal("follower1"));
		platoon_member.addTerm(new Literal("follower2"));
		addPercept("abstraction_leader", platoon_member);				
		
	}

	public void eachrun() {
		System.out.println(l.getMessage());
	//	addMessage("leader", l.getMessage());
	}
	
	public boolean done() {
		   return false;
		}
	
    public void executeSendAction(String agName, SendAction act) {
    	Message m = act.getMessage(agName);
 		String r = m.getReceiver();
 		if(agName.equals("leader")){
 			l.sendMessage(r, m.toString());
 		}
//    	super.executeSendAction(agName, act);
    }	
}
