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

package oopl.semantics.operationalrules;

import java.util.ArrayList;

import oopl.semantics.OOPLAgent;

import ail.semantics.AILAgent;
import ail.syntax.Intention;
import ail.syntax.Unifier;
import ail.semantics.OSRule;
import ail.syntax.Literal;
import ail.syntax.Event;
import ail.syntax.Deed;
import ail.syntax.Guard;
import ail.syntax.GBelief;

import gov.nasa.jpf.annotation.FilterField;
//import gov.nasa.jpf.jvm.abstraction.filter.FilterField;
import gov.nasa.jpf.jvm.Verify;

/**
 * Perception rule.  Gets a list of all literals the agent can perceive from the
 * environment.  It all gets a list of things the agent believes it can perceive
 * from the agent and compares the two.  Any discrepancies are turned into intentions
 * to either add or delete beliefs.
 * 
 * @author lad
 *
 */
public class ReceiveAction implements OSRule {
	@FilterField
	private static final String name = "ReceiveAction";
	
	/*
	 * (non-Javadoc)
	 * @see ail.semantics.operationalrules.OSRule#getName()
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * (non-Javadoc)
	 * @see ail.semantics.operationalrules.OSRule#checkPreconditions(ail.semantics.AILAgent)
	 */
	public boolean checkPreconditions(AILAgent a) {
		return true;
	}
			
	/*
	 * (non-Javadoc)
	 * @see ail.semantics.operationalrules.OSRule#apply(ail.semantics.AILAgent)
	 */
	public void apply(AILAgent a) {
		OOPLAgent org = (OOPLAgent)a;
		Verify.beginAtomic();
		Literal action = org.getAction( );
		// System.err.println("b " + action);
		Verify.endAtomic();
			
		// if action == null then there is no change in the agent's perceptions.
		if (action != null) {
		
			ArrayList<Deed> ds = new ArrayList<Deed>()	;
			ArrayList<Guard> gs  = new ArrayList<Guard>();
			Unifier u = new Unifier();
			
			ds.add(new Deed(Deed.Dnpy));
			gs.add(new Guard(new GBelief(GBelief.GTrue)));
			Intention i = new Intention(new Event(Event.AILAddition, Event.AILBel, action), ds, gs, u, AILAgent.refertoself());
			
			a.setIntention(i);
			a.tellawake();
		} else {
			a.sleep();
		}
	}
} 