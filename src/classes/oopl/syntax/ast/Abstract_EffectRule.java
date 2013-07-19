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

import oopl.syntax.Postcondition;
import oopl.syntax.Precondition;
import oopl.syntax.EffectRule;

import gov.nasa.jpf.jvm.MJIEnv;
import ail.syntax.Literal;
import ail.syntax.ast.Abstract_Deed;
import ail.syntax.ast.Abstract_Event;
import ail.syntax.ast.Abstract_Literal;
import ail.syntax.ast.Abstract_Plan;

public class Abstract_EffectRule {
	Abstract_Precondition pre;
	Abstract_Postcondition post;
	Abstract_Literal trigger;
	
	public Abstract_EffectRule(Abstract_Literal l, Abstract_Precondition prec, Abstract_Postcondition postc) {
		// The trigger of the plan is set to model a reactive plan
		// The trigger of the plan is the literal denoting the action
		//setTrigger(new Abstract_Event(Abstract_Event.AILAddition, Abstract_Event.AILBel, l));
		
		// The guard denotes the precondition
		//setContextSingle(pre.toGuard(), post.size());
		
		// The deeds denote the postcondition
		ArrayList<Abstract_Deed> prf = new ArrayList<Abstract_Deed>();
		// prf.add(new Deed(Deed.Dnpy));
	//	setPrefix(prf);
		//setBody(post.toDeeds());
		trigger = l;
		pre = prec;
		post = postc;
		
	}
	public EffectRule toMCAPL() {
		Precondition prec = pre.toMCAPL();

		Postcondition postc = post.toMCAPL();
    	
    	Literal l =  trigger.toMCAPL();
    	
    	return new EffectRule(l, prec, postc);
	}

    public int newJPFObject(MJIEnv env) {
    	int objref = env.newObject("oopl.syntax.ast.Abstract_EffectRule");
    	int triggerref = trigger.newJPFObject(env);
    	int pre_ref = pre.newJPFObject(env);
    	int post_ref = post.newJPFObject(env);
    	env.setReferenceField(objref, "trigger", triggerref);
    	env.setReferenceField(objref, "pre", pre_ref);
    	env.setReferenceField(objref, "post", post_ref);
    	return objref;

    }
}
