// ----------------------------------------------------------------------------
// Copyright (C) 2015 Louise A. Dennis, Michael Fisher, Maryam Kamali, Owen McAree 
// and Sandor Veres
// 
// This file is part of the Engineering Autonomous Space Software (EASS) Library.
// 
// The EASS Library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 3 of the License, or (at your option) any later version.
// 
// The EASS Library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public
// License along with the EASS Library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
// 
// To contact the authors:
// http://www.csc.liv.ac.uk/~lad
//
//----------------------------------------------------------------------------
package eass.verification.multiagent.platoon;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.FileHandler;

import eass.mas.verification.EASSMASVerificationEnvironment;
import eass.semantics.EASSAgent;
import gov.nasa.jpf.annotation.FilterField;
import ail.syntax.Action;
import ail.syntax.Literal;
import ail.syntax.NumberTermImpl;
import ail.syntax.Predicate;
import ail.syntax.Unifier;
import ajpf.MCAPLcontroller;
import ajpf.util.AJPFLogger;
import ail.syntax.Message;
import ail.syntax.ast.GroundPredSets;
import ail.util.AILexception;

public class PlatoonVerificationEnvironment extends EASSMASVerificationEnvironment {
		
	@FilterField
	public String logname = "eass.multiagent.platooning.PlatoonVerificationEnvironment";

	static Predicate id_pred = new Predicate("id");
	static{ GroundPredSets.check_add(new NumberTermImpl(3)); id_pred.addTerm(new NumberTermImpl(3)); GroundPredSets.check_add_percept(id_pred);}
	
	static Predicate name = new Predicate("name");
	static{ GroundPredSets.check_add(new Predicate("follower3")); GroundPredSets.check_add(new Literal("follower3")); name.addTerm(new Predicate("follower3")); GroundPredSets.check_add_percept(name); }
	
	static Predicate name_front = new Predicate("name_front");
	static {GroundPredSets.check_add(new Predicate("follower1")); GroundPredSets.check_add(new Literal("follower1")); name_front.addTerm(new Literal("follower1")); GroundPredSets.check_add_percept(name_front); }
	
	static Predicate ready_to_join = new Predicate("ready_to_join");
	static Predicate ready_to_leave = new Predicate("ready_to_leave");

	static Predicate changed_lane = new Predicate("changed_lane");
	static Predicate initial_distance = new Predicate("initial_distance");
	static Predicate spacing = new Predicate("spacing");
	
	static {GroundPredSets.check_add_percept(ready_to_join); GroundPredSets.check_add_percept(ready_to_leave); GroundPredSets.check_add_percept(changed_lane); GroundPredSets.check_add_percept(initial_distance); GroundPredSets.check_add_percept(spacing);}
	
//	static Predicate set_spacing_goal = new Predicate("set_spacing");
//	static{GroundPredSets.check_add(new NumberTermImpl(17)); set_spacing_goal.addTerm(new NumberTermImpl(17)); GroundPredSets.check_add_percept(set_spacing_goal);}


	
	/*
	 * (non-Javadoc)
	 * @see eass.mas.verification.EASSVerificationEnvironment#generate_sharedbeliefs()
	 */
	public Set<Predicate> generate_sharedbeliefs() {
		TreeSet<Predicate> percepts = new TreeSet<Predicate>();

		percepts.add(id_pred);

		percepts.add(name);

		percepts.add(name_front);
		
		percepts.add(ready_to_join);
		
		percepts.add(ready_to_leave);
		
		int assertP = random_generator.nextInt(8);		
		if (assertP == 0){
			AJPFLogger.info(logname, "No assert_changed_lane");			
			AJPFLogger.info(logname, "No assert_initial_distance");
			AJPFLogger.info(logname, "No assert_spacing");
		} else if (assertP == 1) {
			percepts.add(changed_lane);
			AJPFLogger.info(logname, "assert_changed_lane");			
			AJPFLogger.info(logname, "No assert_initial_distance");
			AJPFLogger.info(logname, "No assert_spacing");
		} else if (assertP == 2){
			AJPFLogger.info(logname, "No assert_changed_lane");			
			percepts.add(initial_distance);
			AJPFLogger.info(logname, "assert_initial_distance");
			AJPFLogger.info(logname, "No assert_spacing");
		} else if (assertP == 3) {
			percepts.add(changed_lane);
			AJPFLogger.info(logname, "assert_changed_lane");	
			percepts.add(initial_distance);
			AJPFLogger.info(logname, "assert_initial_distance");
			AJPFLogger.info(logname, "No assert_spacing");			
		} else if (assertP == 4) {
			AJPFLogger.info(logname, "No assert_changed_lane");			
			AJPFLogger.info(logname, "No assert_initial_distance");
			percepts.add(spacing);
			AJPFLogger.info(logname, "assert_spacing");						
		} else if (assertP == 5){
			percepts.add(changed_lane);
			AJPFLogger.info(logname, "assert_changed_lane");
			AJPFLogger.info(logname, "No assert_initial_distance");
			percepts.add(spacing);
			AJPFLogger.info(logname, "assert_spacing");						
		} else if (assertP == 6){
			AJPFLogger.info(logname, "No assert_changed_lane");			
			percepts.add(initial_distance);
			AJPFLogger.info(logname, "assert_initial_distance");
			percepts.add(spacing);
			AJPFLogger.info(logname, "assert_spacing");						
		} else if (assertP == 7) {
			percepts.add(changed_lane);
			AJPFLogger.info(logname, "No assert_changed_lane");			
			percepts.add(initial_distance);
			AJPFLogger.info(logname, "No assert_initial_distance");
			percepts.add(spacing);
			AJPFLogger.info(logname, "assert_spacing");			
		} 
		
		return percepts;
	}
	
	/*
	 * (non-Javadoc)
	 * @see eass.mas.verification.EASSVerificationEnvironment#generate_messages()
	 */
	public Set<Message> generate_messages() {
		TreeSet<Message> messages = new TreeSet<Message>();
		
		return messages;
	};
	
/*	@Override
	public Unifier executeAction(String AgName, Action act) throws AILexception {
		MCAPLcontroller.force_transition();
		return super.executeAction(AgName, act);
	} */

	
}
