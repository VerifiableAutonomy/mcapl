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
import java.util.LinkedList;
import java.util.Iterator;

import ail.semantics.AILAgent;
import ail.syntax.ApplicablePlan;
import ail.syntax.Intention;
import ail.semantics.OSRule;
import ail.syntax.Literal;
import ail.syntax.Event;
import ail.syntax.Guard;
import ail.syntax.DefaultAILStructure;

import gov.nasa.jpf.annotation.FilterField;
//import gov.nasa.jpf.jvm.abstraction.filter.FilterField;

/**
 * Applying all of the applicable plans to the current intention.
 * 
 * @author nicktinnemeier
 *
 */
public class ApplyApplicableRules implements OSRule {
	@FilterField
	private static final String name = "ApplyApplicableRules";
	
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
		return (a.getApplicablePlans().hasNext());
	}
	
	/*
	 * (non-Javadoc)
	 * @see ail.semantics.operationalrules.OSRule#apply(ail.semantics.AILAgent)
	 */
	public void apply(AILAgent a) {
		Intention i = a.getIntention();
		Iterator<ApplicablePlan> aps = a.getApplicablePlans();
		// System.out.println(aps);
		ArrayList<Intention> is = new ArrayList<Intention>();
		
		while (aps.hasNext()) {	
			ApplicablePlan p = aps.next();
			// p is triggered by the state of the agent - i.e., its nothing to do with the current intention
			// and everything to do with the fact the plan's guard is not trivial and has been satisfied.
			// In this case start off a new intention referencing this state.
			ArrayList<Guard> guardstack = p.getGuard();
			
			if (p.getN() == 0 && (! (guardstack.isEmpty()) && (! (guardstack.get(guardstack.size() - 1).isTrivial())))) {
				Literal gl = new Literal("state");
				gl.addTerm(guardstack.get(guardstack.size() - 1).toTerm());
				Event state = new Event(Event.AILAddition, DefaultAILStructure.AILBel, gl);
				// change the head of the guardstack to trivial - presumably the head should be false by the time the plan has finished executing
				//guardstack.set(guardstack.size() - 1, new Guard(new GBelief(GBelief.GTrue)));
				is.add(new Intention(state, p.getPrefix(), guardstack, p.getUnifier().clone(), AILAgent.refertoself()));
			} else {
				i.dropP(p.getN());
				i.replace(p.getUnifier().clone());
				i.iConcat(p.getEvent(), p.getPrefix(), p.getGuard(), p.getUnifier().clone());
			}
		}
		
		// System.out.println(is);
		
		a.getIntentions().addAll(is);
		a.clearApplicablePlans();
	}
}