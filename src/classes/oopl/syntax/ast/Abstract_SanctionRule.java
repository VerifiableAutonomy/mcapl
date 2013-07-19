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
import ail.syntax.ast.Abstract_Deed;
import ail.syntax.ast.Abstract_Event;
import ail.syntax.ast.Abstract_Goal;
import ail.syntax.ast.Abstract_Plan;
import ail.syntax.ast.Abstract_VarTerm;
import oopl.syntax.Postcondition;
import oopl.syntax.Precondition;
import oopl.syntax.SanctionRule;

public class Abstract_SanctionRule {
	Abstract_Precondition precondition;
	Abstract_Postcondition postcondition;

	public Abstract_SanctionRule(Abstract_Precondition pre, Abstract_Postcondition post) {
		precondition = pre;
		postcondition = post;
		
	}
	
	public SanctionRule toMCAPL() {
		Precondition pre = precondition.toMCAPL();
		Postcondition post = postcondition.toMCAPL();
    	
    	return new SanctionRule(pre, post);
		
	}

    public int newJPFObject(MJIEnv env) {
    	int objref = env.newObject("oopl.syntax.ast.Abstract_SanctionRule");
       	int pre_ref = precondition.newJPFObject(env);
    	int post_ref = postcondition.newJPFObject(env);
    	env.setReferenceField(objref, "precondition", pre_ref);
    	env.setReferenceField(objref, "postcondition", post_ref);
    	return objref;

    }
}
