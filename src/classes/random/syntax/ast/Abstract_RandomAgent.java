// ----------------------------------------------------------------------------
// Copyright (C) 2012 Louise A. Dennis, and  Michael Fisher 
//
// This file is part of the Agent Infrastructure Layer (AIL)
// 
// The AIL is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 3 of the License, or (at your option) any later version.
// 
// The AIL is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public
// License along with the AIL; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
// 
// To contact the authors:
// http://www.csc.liv.ac.uk/~lad
//
//----------------------------------------------------------------------------

package random.syntax.ast;

import ail.syntax.ast.Abstract_Agent;
import ail.syntax.ast.Abstract_Action;
import random.RandomAgent;

import gov.nasa.jpf.jvm.MJIEnv;

import java.util.ArrayList;
import ail.syntax.Action;

public class Abstract_RandomAgent extends Abstract_Agent {
	protected Abstract_Action[] actions = new Abstract_Action[0];
	
	public Abstract_RandomAgent() {};
	
	public Abstract_RandomAgent(String w) {
		super(w);
	}
	
	public void setAgName(String w) {
		fAgName = w;
	}
	
	public void addAction(Abstract_Action a) {
		int current_size = actions.length;
		Abstract_Action[] new_actions = new Abstract_Action[current_size + 1];
		for (int i = 0; i < current_size; i++) {
			new_actions[i] = actions[i];
		}
		new_actions[current_size] = a;
		actions = new_actions;
		
	}
	
	public RandomAgent toMCAPL() {
		ArrayList<Action> acts = new ArrayList<Action>();
		for (Abstract_Action a: actions) {
			acts.add(a.toMCAPL());
		}
		RandomAgent ra = new RandomAgent(acts);
		return ra;
	}
	
    public int newJPFObject(MJIEnv env) {
        	int objref = env.newObject("random.syntax.ast.Abstract_RandomAgent");
        	int actionref = env.newObjectArray("ail.syntax.Abstract_Action", actions.length);
        	if (fAgName != null) {
        		env.setReferenceField(objref, "fAgName", env.newString(fAgName));
        	}
        	for (int index = 0; index < actions.length; index++) {
    			env.setReferenceArrayElement(actionref, index, actions[index].newJPFObject(env));
    		}
        	env.setReferenceField(objref, "actions", actionref);
        	return objref;
    }

}
