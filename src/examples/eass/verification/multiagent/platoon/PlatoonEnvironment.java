package eass.verification.multiagent.platoon;

import java.util.ArrayList;

import ail.mas.scheduling.NActionScheduler;
import eass.platooning.util.Vehicle;
import ail.syntax.Action;
import ail.syntax.Literal;
import ail.syntax.NumberTerm;
import ail.syntax.NumberTermImpl;
import ail.syntax.Predicate;
import ail.syntax.StringTermImpl;
import ail.syntax.Term;
import ail.syntax.Unifier;
import ail.syntax.VarTerm;
import ail.util.AILexception;
import ajpf.util.AJPFLogger;
import eass.mas.DefaultEASSEnvironment;


//import eass.mas.matlab.EASSMatLabEnvironment;


public class PlatoonEnvironment extends DefaultEASSEnvironment{
	String logname = "eass.multiagent.platooning.PlatoonEnvironment";

	/**
	 * Constructor.
	 *
	 */
	public PlatoonEnvironment() {
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
		
		Literal name = new Literal("name");
		name.addTerm(new Literal("follower3"));	
		addUniquePercept("follower3", "name", name);
		
		Literal front = new Literal("name_front");
		front.addTerm(new Literal("follower1"));
		addPercept("follower3", front);
		
		
	}

	public void eachrun() {
		super.eachrun();
				
	} 

	
	public boolean done() {
		   return false;
		}

	public Unifier executeAction(String agName, Action act) throws AILexception {

		super.executeAction(agName, act);
		
		
		Unifier u = new Unifier();
	   return u;
	  }	  		
}
