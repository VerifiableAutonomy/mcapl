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

import java.util.Iterator;

import oopl.semantics.OOPLAgent;

import ail.semantics.AILAgent;
import ail.semantics.OSRule;
import ail.syntax.Literal;
import ail.syntax.VarTerm;

import gov.nasa.jpf.annotation.FilterField;
//import gov.nasa.jpf.jvm.abstraction.filter.FilterField;
import gov.nasa.jpf.jvm.Verify;

/**
 * Housekeeping rule
 *
 */
public class Finalize implements OSRule {
	@FilterField
	private static final String name = "Finalize";
	
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
		
		Literal result;
		
		Literal l = new Literal("return");
		l.addTerm(new VarTerm("X"));
		
		Iterator<Literal> i = a.getBB().getRelevant(l);
		if( i.hasNext() ) {
			result = i.next();
			a.getBB().remove(result);
		} else {
			result = new Literal("nil");
		}
		
		org.cleanInstitutional();
		org.postResult(result);
	}
} 