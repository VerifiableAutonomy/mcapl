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

package oopl.syntax;

import java.util.ArrayList;

import oopl.syntax.Postcondition;
import oopl.syntax.Precondition;

import ail.syntax.Event;
import ail.syntax.Goal;
import ail.syntax.Plan;
import ail.syntax.Deed;
import ail.syntax.StringTermImpl;
import ail.syntax.VarTerm;
import ail.syntax.annotation.SourceAnnotation;
import ail.syntax.Predicate;
import ail.syntax.Guard;
import ail.syntax.GBelief;
import ail.syntax.Literal;

/**
 * Class for OOPLRules consisting of a precondition and a 
 * postcondition.
 * 
 * @author nicktinnemeier
 *
 */
public class OOPLRule extends Plan { 
	
	/**
	 * Create an OOPLRule from a precondition and a postcondition.
	 * Essentially, creates a plan with the guard pertaining to the
	 * precondition and the context pertaining to its postcondition,
	 * i.e. the facts to be added and retracted. The plan is modelled
	 * as a reactive plan, but this can be overridden by means of 
	 * the setTrigger method.
	 * 
	 * @param pre
	 * @param post
	 */
	public OOPLRule(Precondition pre, Postcondition post) {
		// The trigger of the plan is set to model a reactive plan
		setTrigger(new Event(Event.AILAddition, new Goal(new VarTerm("Any"), Goal.achieveGoal)));
		
		// The guard denotes the precondition
		setContextSingle(pre.toGuard(), post.size());
		
		// The deeds denote the postcondition
		ArrayList<Deed> prf = new ArrayList<Deed>();
		// prf.add(new Deed(Deed.Dnpy));
		setPrefix(prf);
		setBody(post.toDeeds());
		setSource(new SourceAnnotation(new Predicate("self")));
	}
	
	public void addPrecondition(Precondition pre) {
		Guard g = this.getContext().get(0);
		GBelief gb;

		for (Literal l: pre.getLiterals()) {
			boolean flag = l.negated();
			l.setNegated(true);
			if( l.equals(Predicate.PTrue) ) {
				gb = new GBelief( GBelief.GTrue );
			}
			else {
				gb = new GBelief( GBelief.AILBel, l );
			}
			
			boolean brute = pre.getBruteEffect().equals("brute");
			gb.setDBnum(brute ? new StringTermImpl("") : new StringTermImpl("1"));
			g.add(gb, !flag);
		}
	}
}
