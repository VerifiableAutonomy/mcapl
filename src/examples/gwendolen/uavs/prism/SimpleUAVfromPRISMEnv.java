// ----------------------------------------------------------------------------
// Copyright (C) 2012 Louise A. Dennis,  and Michael Fisher
//
// This file is part of Gwendolen
// 
// Gwendolen is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 3 of the License, or (at your option) any later version.
// 
// Gwendolen is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public
// License along with Gwendolen; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
// 
// To contact the authors:
// http://www.csc.liv.ac.uk/~lad
//
//----------------------------------------------------------------------------

package gwendolen.uavs.prism;

import ail.mas.vehicle.VehicleEnvironment;
import ajpf.MCAPLJobber;

import ail.mas.RoundRobinScheduler;
import ajpf.util.Choice;
import ail.syntax.Action;
import ail.syntax.Predicate;
import ail.syntax.Unifier;
import ail.semantics.AILAgent;
import ail.util.AILexception;

/**
 * A Probabilistic Environment for a UAV intended for generating model to use verify in PRISM.
 * @author lad
 *
 */
public class SimpleUAVfromPRISMEnv extends VehicleEnvironment implements MCAPLJobber{
	String name;
	// The choice over whether there will be a collision
	Choice<Boolean> objectSet = new Choice<Boolean>();
	// The choice of actions returned by the navigation manager.
	Choice<Integer> navMan = new Choice<Integer>();
	
	// Tracking state.
	public boolean colliding = false;
	public boolean done = false;
	public boolean flying = false;
	
	public SimpleUAVfromPRISMEnv() {
		name = "Simple UAV Environment";
		RoundRobinScheduler s = new RoundRobinScheduler();
		s.addJobber(this);
		setScheduler(s);
		addPerceptListener(s);
		objectSet.addChoice(0.1, new Boolean(false));
		objectSet.addChoice(0.9, new Boolean(true));
		navMan.addChoice(0.3, new Integer(1));
		navMan.addChoice(0.4, new Integer(2));
		navMan.addChoice(0.3, new Integer(3));
	}
	
	/*
	 * (non-Javadoc)
	 * @see ajpf.MCAPLJobber#getName()
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * 
	 */
	public void setName(String s) {
		name = s;
	}
	
	/*
	 * (non-Javadoc)
	 * @see ail.mas.DefaultEnvironment#addAgent(ail.semantics.AILAgent)
	 */
	public void addAgent(AILAgent a) {
		SimpleUAV uav = new SimpleUAV(a);
		addVehicle(uav);
	}
	
	// Tracking the stages of the example
	int navAction = 0;
	boolean collision_happened = false;
	/*
	 * (non-Javadoc)
	 * @see ajpf.MCAPLJobber#do_job()
	 */
	public void do_job() {
		
		navAction = navMan.get_choice();
		if (navAction == 1 & flying) {
			addPercept(new Predicate("changeHeading"));
		} else if (navAction == 2 & flying) {
			addPercept(new Predicate("headingOK"));
		} else if (navAction == 3 & flying) {
			addPercept(new Predicate("landing"));
		}
		
		boolean uptodate = agentIsUpToDate("uav");
		
		if (flying & !colliding) {
		if (objectSet.get_choice() & !collision_happened) {
				colliding = true;
				collision_happened = true;
				addPercept(new Predicate("collision"));
			}
		} else if (flying & colliding & uptodate) {
			colliding = false;
		}
		
		getScheduler().notActive(name);
	}
	
	/*
	 * (non-Javadoc)
	 * @see ail.mas.DefaultEnvironment#done()
	 */
	public boolean done() {
		return done;
	}
	
	/*
	 * (non-Javadoc)
	 * @see ail.mas.DefaultEnvironment#executeAction(java.lang.String, ail.syntax.Action)
	 */
	public Unifier executeAction(String agName, Action act) throws AILexception {
		if (act.getFunctor().equals("take_off")) {
			flying = true;
		} else if (act.getFunctor().equals("land")) {
			flying = false;
			colliding = false;
			removePercept(new Predicate("collision"));
			done = true;
		} else if (act.getFunctor().equals("evade")) {
			colliding = false;
			removePercept(new Predicate("collision"));
		}
		
		getScheduler().isActive(name);
		
		return super.executeAction(agName, act);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(MCAPLJobber j) {
		return j.getName().compareTo(getName());
	}
}
