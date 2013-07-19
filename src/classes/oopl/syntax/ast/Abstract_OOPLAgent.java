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
import ail.syntax.ast.Abstract_Agent;
import ail.syntax.ast.Abstract_Literal;
import ail.syntax.ast.Abstract_MAS;
import oopl.semantics.OOPLAgent;
import ail.mas.MAS;

import java.util.ArrayList;

public class Abstract_OOPLAgent extends Abstract_Agent {
	Abstract_MAS mas = new Abstract_MAS();
	/**
	 * The Plan Library.
	 */
	public Abstract_EffectRule[] ers = new Abstract_EffectRule[0];
	/**
	 * The Plan Library.
	 */
	public Abstract_CountsAsRule[] crs = new Abstract_CountsAsRule[0];
	/**
	 * The Plan Library.
	 */
	public Abstract_SanctionRule[] srs = new Abstract_SanctionRule[0];
	
	public Abstract_OOPLAgent(String name) {
		super(name);
	}
 
	public void addEffectRule(Abstract_EffectRule er) {
       	int newsize = ers.length + 1;
    	Abstract_EffectRule[] newplans = new Abstract_EffectRule[newsize];
    	for (int i = 0; i < ers.length; i++) {
    		newplans[i] = ers[i];
    	}
       	newplans[ers.length] = er;
    	ers = newplans;
	}
	
	public void addCountsAsRule(Abstract_CountsAsRule er) {
       	int newsize = crs.length + 1;
    	Abstract_CountsAsRule[] newplans = new Abstract_CountsAsRule[newsize];
    	for (int i = 0; i < crs.length; i++) {
    		newplans[i] = crs[i];
    	}
       	newplans[crs.length] = er;
    	crs = newplans;
	}

	public void addSanctionRule(Abstract_SanctionRule er) {
       	int newsize = srs.length + 1;
    	Abstract_SanctionRule[] newplans = new Abstract_SanctionRule[newsize];
    	for (int i = 0; i < srs.length; i++) {
    		newplans[i] = srs[i];
    	}
       	newplans[srs.length] = er;
    	srs = newplans;
	}

	public Abstract_MAS getMAS() {
		ArrayList<Abstract_Agent> ags = new ArrayList<Abstract_Agent>();
		ags.add(this);
		mas.setAgs(ags);
		return mas;
	}
	
	public OOPLAgent toMCAPL(MAS mas) {
		OOPLAgent ag = new OOPLAgent(fAgName);
    	for (Abstract_Literal l: beliefs) {
    		ag.addInitialBel(l.toMCAPL());
    	}
	   	for (Abstract_EffectRule p: ers) {
    		try {
    			ag.addEffectRule(p.toMCAPL());
    		} catch (Exception e) {
    			System.err.println("Here" + e);
    		}
    	}
	   	for (Abstract_CountsAsRule p: crs) {
    		try {
    			ag.addCountsAsRule(p.toMCAPL());
    		} catch (Exception e) {
    			
    		}
    	}
	   	for (Abstract_SanctionRule p: srs) {
    		try {
    			ag.addSanctionRule(p.toMCAPL());
    		} catch (Exception e) {
    			
    		}
    	}
	   	ag.setMAS(mas);
	   	return ag;

	}

    public int newJPFObject(MJIEnv env) {
    	int objref = env.newObject("oopl.syntax.ast.Abstract_OOPLAgent");
     	env.setReferenceField(objref, "fAgName", env.newString(fAgName));
     	int bRef = env.newObjectArray("ail.syntax.ast.Abstract_Literal", beliefs.length);
       	int rRef = env.newObjectArray("ail.syntax.ast.Abstract_Rule", rules.length);
       	int pRef = env.newObjectArray("ail.syntax.ast.Abstract_Plan", plans.length);
       	int erRef = env.newObjectArray("oopl.syntax.ast.Abstract_EffectRule", ers.length);
       	int crRef = env.newObjectArray("oopl.syntax.ast.Abstract_CountsAsRule", crs.length);
       	int srRef = env.newObjectArray("oopl.syntax.ast.Abstract_SanctionRule", srs.length);
      	for (int i = 0; i < beliefs.length; i++) {
       		env.setReferenceArrayElement(bRef, i, beliefs[i].newJPFObject(env));
       	}
      	for (int i = 0; i < rules.length; i++) {
       		env.setReferenceArrayElement(rRef, i, rules[i].newJPFObject(env));
       	}
      	for (int i = 0; i < plans.length; i++) {
       		env.setReferenceArrayElement(pRef, i, plans[i].newJPFObject(env));
       	}
      	for (int i = 0; i < ers.length; i++) {
       		env.setReferenceArrayElement(erRef, i, ers[i].newJPFObject(env));
       	}
      	for (int i = 0; i < crs.length; i++) {
       		env.setReferenceArrayElement(crRef, i, crs[i].newJPFObject(env));
       	}
      	for (int i = 0; i < srs.length; i++) {
       		env.setReferenceArrayElement(srRef, i, srs[i].newJPFObject(env));
       	}
      	env.setReferenceField(objref, "beliefs", bRef);
      	env.setReferenceField(objref, "rules", rRef);
      	env.setReferenceField(objref, "plans", pRef);
      	env.setReferenceField(objref, "ers", erRef);
      	env.setReferenceField(objref, "crs", crRef);
      	env.setReferenceField(objref, "srs", srRef);
      	return objref;

    }
}
