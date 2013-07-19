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

import java.util.ArrayList;

import ail.syntax.ast.Abstract_Deed;
import ail.syntax.ast.Abstract_Event;
import ail.syntax.ast.Abstract_Goal;
import ail.syntax.ast.Abstract_Predicate;
import ail.syntax.ast.Abstract_VarTerm;
import ail.syntax.ast.Abstract_Plan;

import oopl.syntax.CountsAsRule;
import oopl.syntax.Precondition;
import oopl.syntax.Postcondition;

public class Abstract_CountsAsRule {
	Abstract_Precondition bprecondition;
	Abstract_Precondition iprecondition;
	Abstract_Postcondition postcondition;

	public Abstract_CountsAsRule(Abstract_Precondition bpre, Abstract_Precondition ipre, Abstract_Postcondition post) {
		bprecondition = bpre;
		iprecondition = ipre;
		postcondition = post;
		
	}
	
	public CountsAsRule toMCAPL() {
		Precondition bpre = bprecondition.toMCAPL();
		Precondition ipre = iprecondition.toMCAPL();
		Postcondition post = postcondition.toMCAPL();
    	
    	
    	return new CountsAsRule(bpre, ipre, post);
	}

    public int newJPFObject(MJIEnv env) {
    	int objref = env.newObject("oopl.syntax.ast.Abstract_CountsAsRule");
       	int bpre_ref = bprecondition.newJPFObject(env);
       	int ipre_ref = iprecondition.newJPFObject(env);
    	int post_ref = postcondition.newJPFObject(env);
    	env.setReferenceField(objref, "bprecondition", bpre_ref);
    	env.setReferenceField(objref, "iprecondition", ipre_ref);
    	env.setReferenceField(objref, "postcondition", post_ref);
    	return objref;

    }
}
