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


import gov.nasa.jpf.jvm.MJIEnv;
import ail.syntax.ast.Abstract_GBelief;
import ail.syntax.ast.Abstract_StringTermImpl;
import ail.syntax.ast.Abstract_Guard;
import ail.syntax.ast.Abstract_Literal;
import ail.syntax.ast.Abstract_Equation;

import ajpf.util.AJPFLogger;

import oopl.syntax.Precondition;

public class Abstract_Precondition {
	private Abstract_Literal[] lits = new Abstract_Literal[0];
	private Abstract_Equation[] eqs = new Abstract_Equation[0];
	private String bruteoreffect = "brute";

	public Abstract_Precondition(String s) {
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
	
	public void addEquation(Abstract_Equation e) {
       	int newsize = eqs.length + 1;
    	Abstract_Equation[] neweqs = new Abstract_Equation[newsize];
    	for (int i = 0; i < eqs.length; i++) {
    		neweqs[i] = eqs[i];
    	}
       	neweqs[eqs.length] = e;
    	eqs = neweqs;
		
	}
	
	public Precondition toMCAPL() {
		Precondition pre = new Precondition(bruteoreffect);
		for (int i = 0; i < lits.length; i++) {
			pre.addLiteral(lits[i].toMCAPL());
		}
		for (int i = 0; i < eqs.length; i++) {
			pre.addEquation(eqs[i].toMCAPL());
		}
		return pre;
		
	}

    public int newJPFObject(MJIEnv env) {
    	int objref = env.newObject("oopl.syntax.ast.Abstract_Precondition");
     	env.setReferenceField(objref, "bruteoreffect", env.newString(bruteoreffect));
       	int lRef = env.newObjectArray("oopl.syntax.ast.Abstract_Literal", lits.length);
      	for (int i = 0; i < lits.length; i++) {
       		env.setReferenceArrayElement(lRef, i, lits[i].newJPFObject(env));
       	}
      	env.setReferenceField(objref, "lits", lRef);
       	int eRef = env.newObjectArray("oopl.syntax.ast.Abstract_Equations", eqs.length);
      	for (int i = 0; i < eqs.length; i++) {
       		env.setReferenceArrayElement(eRef, i, eqs[i].newJPFObject(env));
       	}
      	env.setReferenceField(objref, "eqs", eRef);
      	return objref;

    }
    
	public Abstract_Guard toGuard() {
		Abstract_Guard g = new Abstract_Guard();
		Abstract_GBelief gb = null;
		
		for( Abstract_Literal l : lits) {
			// for the special cases l is 'true' or 'false'
			boolean flag = l.negated();
			l.setNegated(true);
			
			if( l.equals(Abstract_Literal.LTrue) ) {
				gb = new Abstract_GBelief( Abstract_GBelief.GTrue );
			}
			else if( l.equals(Abstract_Literal.LFalse) ) {
				AJPFLogger.warning("oopl.syntax.ast.Abstract_Precondition", "Should not set False as a Preconditions");
			}
			else {
				gb = new Abstract_GBelief( Abstract_GBelief.AILBel, l );
			}
			
			boolean brute = bruteoreffect.equals("brute");
			gb.setDBnum(brute ? new Abstract_StringTermImpl("") : new Abstract_StringTermImpl("1"));
			g.add(gb, !flag);
		}
		
		for (Abstract_GBelief eq: eqs) {
			g.add(eq);
		}
		
		return( g );
		
	}

}
