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

import ail.syntax.Deed;
import ail.syntax.Literal;
import ail.syntax.StringTermImpl;

import java.util.ArrayList;

/**
 * Class for modelling Postconditions.
 * @author nicktinnemeier
 *
 */
public class Postcondition { 
	
	private ArrayList<Literal> lits = new ArrayList<Literal>();
	
	private String bruteoreffect = "brute";
	
	public Postcondition() {
	}
	
	public Postcondition(String s) {
		bruteoreffect = s;
	}

	public Postcondition(ArrayList<Literal> lits) {
		this.lits = lits;
	}
	
	public void addLiteral(Literal l) {
		lits.add(l);
	}
	
	public void add(int i, Deed d) {
		lits.add(i, d.getLiteral());
	}
	
	public ArrayList<Deed> toDeeds() {
		ArrayList<Deed> ds = new ArrayList<Deed>();
		for( Literal l : lits ) {
			// We assume each literal to have an annotation marking it either
			// as a brute or an institutional fact.
			boolean brute = bruteoreffect.equals("brute");
			boolean adddel =!l.negated();
			l.setNegated(true);
			int adddelmarker;
			if (adddel) {adddelmarker = 0;} else {adddelmarker = 1;};
			Deed d = new Deed( adddelmarker, Deed.AILBel, l );
			d.setDBnum(brute ? new StringTermImpl("") : new StringTermImpl("1"));
			ds.add(d);
		}
		return( ds );
	}
	
	public int size() {
		return( lits.size() );
	}
}

