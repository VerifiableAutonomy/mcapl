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

package oopl.syntax.ast;

import java.util.ArrayList;

import gov.nasa.jpf.jvm.MJIEnv;
import ail.syntax.ast.Abstract_StringTermImpl;
import ail.syntax.ast.Abstract_Literal;
import ail.syntax.ast.Abstract_Deed;

import oopl.syntax.Postcondition;

public class Abstract_Postcondition {
	
	Abstract_Literal[] lits = new Abstract_Literal[0];
	String bruteoreffect = "brute";
	
	public Abstract_Postcondition() {
		
	}
	
	public Abstract_Postcondition(String s) {
		bruteoreffect = s;
	}
	
	public void addLiteral(Abstract_Literal l) {
       	int newsize = lits.length + 1;
    	Abstract_Literal[] newlits = new Abstract_Literal[newsize];
    	for (int i = 0; i < lits.length; i++) {
    		newlits[i] = lits[i];
    	}
       	newlits[lits.length] = l;
    	lits = newlits;

	}
	
	public Postcondition toMCAPL() {
		Postcondition post = new Postcondition(bruteoreffect);
		for (int i = 0; i < lits.length; i++) {
			post.addLiteral(lits[i].toMCAPL());
		}
		return post;
	}

    public int newJPFObject(MJIEnv env) {
    	int objref = env.newObject("oopl.syntax.ast.Abstract_Postcondition");
     	env.setReferenceField(objref, "bruteoreffect", env.newString(bruteoreffect));
       	int lRef = env.newObjectArray("oopl.syntax.ast.Abstract_Literal", lits.length);
      	for (int i = 0; i < lits.length; i++) {
       		env.setReferenceArrayElement(lRef, i, lits[i].newJPFObject(env));
       	}
      	env.setReferenceField(objref, "lits", lRef);
      	return objref;
    }
    
	public int size() {
		return lits.length;
	}
	
	public ArrayList<Abstract_Deed> toDeeds() {
		ArrayList<Abstract_Deed> ds = new ArrayList<Abstract_Deed>();
		for( int i = 0; i < lits.length; i++ ) {
			// We assume each literal to have an annotation marking it either
			// as a brute or an institutional fact.
			Abstract_Literal l = lits[i];
			boolean brute = bruteoreffect.equals("brute");
			boolean adddel =!l.negated();
			l.setNegated(true);
			int adddelmarker;
			if (adddel) {adddelmarker = 0;} else {adddelmarker = 1;};
			Abstract_Deed d = new Abstract_Deed( adddelmarker, Abstract_Deed.AILBel, l );
			d.setDBnum(brute ? new Abstract_StringTermImpl("") : new Abstract_StringTermImpl("1"));
			ds.add(d);
		}
		return( ds );
	}

}
