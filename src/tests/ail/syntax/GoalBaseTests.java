// ----------------------------------------------------------------------------
// Copyright (C) 2013 Louise A. Dennis, and  Michael Fisher 
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

package ail.syntax;

import java.util.LinkedList;

import junit.framework.Assert;

import org.junit.Test;

import ail.semantics.AILAgent;
import ail.semantics.operationalrules.HandleDropGeneralGoal;

public class GoalBaseTests {
	@Test public void DropMultipleGoals() {
		Literal l1 = new Literal("goal1");
		Literal l2 = new Literal("goal2");
		
		Goal g1 = new Goal(l1, Goal.achieveGoal);
		Goal g2 = new Goal(l2, Goal.achieveGoal);

		Intention i = new Intention(g1, AILAgent.refertoself());
		AILAgent a = new AILAgent("ag");
		
		a.addGoal(g1);
		a.addGoal(g2);
		
		a.setIntention(i);
		
		Unifier u = new Unifier();
		i.iCons(new Event(Event.AILAddition, g1), new Deed(Deed.Dnpy), new Guard(new GBelief(GBelief.GTrue)), u);
		i.iCons(new Event(Event.AILAddition, g2), new Deed(Deed.Dnpy), new Guard(new GBelief(GBelief.GTrue)), u);
		i.iCons(new Event(Event.AILAddition, g2), new Deed(Deed.AILDeletion, new Goal(l1, Goal.achieveGoal)), new Guard(new GBelief(GBelief.GTrue)), u);
		
		HandleDropGeneralGoal dropgoal = new HandleDropGeneralGoal(new LinkedList<Integer>());
		dropgoal.checkPreconditions(a);
		dropgoal.apply(a);
		
		Assert.assertFalse(a.getGoalBase().getAll().contains(g2));

	}
}
