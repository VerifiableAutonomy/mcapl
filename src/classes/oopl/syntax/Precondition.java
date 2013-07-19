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

import ail.syntax.GBelief;
import ail.syntax.Guard;
import ail.syntax.Literal;
import ail.syntax.Predicate;
import ail.syntax.PredicatewAnnotation;
import ail.syntax.StringTermImpl;

import java.util.ArrayList;

/**
 * Class for modelling Preconditions.
 * @author nicktinnemeier
 *
 */
public class Precondition { 
	
	private ArrayList<Literal> lits = new ArrayList<Literal>();
	private ArrayList<GBelief> eqs = new ArrayList<GBelief>();
	private String bruteoreffect = "brute";
	
	public Precondition() {
	}
	
	public Precondition(String s) {
		bruteoreffect = s;
	}

	public Precondition(ArrayList<Literal> lits) {
		this.lits = lits;
	}
	
	public void addLiteral(Literal l) {
		lits.add(l);
	}
	
	public void addEquation(GBelief gb) {
		eqs.add(gb);
	}
	
	public void add(Guard g) {
		lits.add(new Literal(true, new PredicatewAnnotation((Predicate) g.toTerm()))); 
	}
	
	public Guard toGuard() {
		Guard g = new Guard();
		GBelief gb;
		
		for( Literal l : lits) {
			// for the special cases l is 'true' or 'false'
			boolean flag = l.negated();
			l.setNegated(true);
			
			if( l.equals(Predicate.PTrue) ) {
				gb = new GBelief( GBelief.GTrue );
			}
		//	else if( l.equals(Predicate.PFalse) ) {
		//		gb = new GBelief( GBelief.GFalse );
		//	}
			else {
				gb = new GBelief( GBelief.AILBel, l );
			}
			
			boolean brute = bruteoreffect.equals("brute");
			gb.setDBnum(brute ? new StringTermImpl("") : new StringTermImpl("1"));
			g.add(gb, !flag);
		}
		
		for (GBelief eq: eqs) {
			g.add(eq);
		}
		
		return( g );
	}
	
	public ArrayList<Literal> getLiterals() {
		return lits;
	}
	
	public String getBruteEffect() {
		return bruteoreffect;
	}
	
	/**
	 * WARNING:  This does very wrong things with negated literals.
	 * @return
	 */
	public ArrayList<GBelief> gbeliefs() {
		ArrayList<GBelief> gbs = new ArrayList<GBelief>();
		GBelief gb;
		for (Literal l : lits) {
			boolean flag = l.negated();
			l.setNegated(true);
			
			if( l.equals(Predicate.PTrue) ) {
				gb = new GBelief( GBelief.GTrue );
			}
	//		else if( l.equals(Predicate.PFalse) ) {
	//			gb = new GBelief( GBelief.GFalse );
	//		}
			else {
				gb = new GBelief( GBelief.AILBel, l );
			}
			
			boolean brute = bruteoreffect.equals("brute");
			gb.setDBnum(brute ? new StringTermImpl("") : new StringTermImpl("1"));
			gbs.add(gb);
		}
		return gbs;
	}
	
	
	public int size() {
		return( lits.size() + eqs.size());
	}
}

