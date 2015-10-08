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
package eass.verification.platoon;

import java.util.Set;
import java.util.TreeSet;

import eass.mas.verification.EASSVerificationEnvironment;
import eass.semantics.EASSAgent;
import gov.nasa.jpf.annotation.FilterField;
import ail.syntax.Literal;
import ail.syntax.NumberTermImpl;
import ail.syntax.Predicate;
import ajpf.util.AJPFLogger;
import ail.syntax.Message;
import ail.syntax.ast.GroundPredSets;

public class LeaderVerificationEnvironment extends EASSVerificationEnvironment {
		
	@FilterField
	public String logname = "eass.platooning.PlatoonVerificationEnvironment";
	
	// Predefining messages and percepts in order to reduce the number of objects
/*	static Predicate allowed_position = new Predicate("allowed_position");
	static{ GroundPredSets.check_add(new Predicate("follower1")); GroundPredSets.check_add(new Literal("follower1")); allowed_position.addTerm(new Predicate("follower1")); GroundPredSets.check_add_percept(allowed_position); }

	static Predicate platoon_m_1 = new Predicate("platoon_m");
	static{ GroundPredSets.check_add(new Predicate("leader")); GroundPredSets.check_add(new Literal("leader")); 
			GroundPredSets.check_add(new Predicate("follower1")); GroundPredSets.check_add(new Literal("follower1")); platoon_m_1.addTerm(new Literal("leader")); platoon_m_1.addTerm(new Literal("follower1")); GroundPredSets.check_add_percept(platoon_m_1);
	}
	
	static Predicate platoon_m_2 = new Predicate("platoon_m");
	static{ GroundPredSets.check_add(new Predicate("follower1")); GroundPredSets.check_add(new Literal("follower1")); 
			GroundPredSets.check_add(new Predicate("follower2")); GroundPredSets.check_add(new Literal("follower2")); platoon_m_2.addTerm(new Literal("follower1")); platoon_m_2.addTerm(new Literal("follower2")); GroundPredSets.check_add_percept(platoon_m_2);
	}	
*/
	
	static Predicate message_0 = new Predicate("message");
	static{message_0.addTerm(new Predicate("follower3"));
			message_0.addTerm(new NumberTermImpl(0));
	}
	static Message leave_message = new Message(EASSAgent.TELL, "follower3", "leader", message_0);
	
	static Predicate message_1 = new Predicate("message");
	static{message_1.addTerm(new Predicate("follower3"));
			message_1.addTerm(new NumberTermImpl(1));
			message_1.addTerm(new Predicate("follower1"));
	}
	static Message join_message = new Message(EASSAgent.TELL, "follower3", "leader", message_1);
	
	static Predicate message_2 = new Predicate("message");
	static{message_2.addTerm(new Predicate("follower3"));
			message_2.addTerm(new NumberTermImpl(2));
	}
	static Message ack_message = new Message(EASSAgent.TELL, "follower3", "leader", message_2);
	
	
	static Predicate set_sp_from_f1 = new Predicate("set_spacing_from");
	static{set_sp_from_f1.addTerm(new Predicate("follower1"));}
	static Message set_spacing_from_message_f1 = new Message(EASSAgent.TELL, "follower1", "leader", set_sp_from_f1);

	static Predicate set_sp_from_f3 = new Predicate("set_spacing_from");
	static{set_sp_from_f3.addTerm(new Predicate("follower3"));}
	static Message set_spacing_from_message_f3 = new Message(EASSAgent.TELL, "follower3", "leader", set_sp_from_f3);

	/*
	 * (non-Javadoc)
	 * @see eass.mas.verification.EASSVerificationEnvironment#generate_sharedbeliefs()
	 */
	public Set<Predicate> generate_sharedbeliefs() {
		TreeSet<Predicate> percepts = new TreeSet<Predicate>();
  		
//		percepts.add(allowed_position);
//		percepts.add(platoon_m_1);
//		percepts.add(platoon_m_2);		
		return percepts;
	}

	
	/*
	 * (non-Javadoc)
	 * @see eass.mas.verification.EASSVerificationEnvironment#generate_messages()
	 */
	public Set<Message> generate_messages() {
		TreeSet<Message> messages = new TreeSet<Message>();		


 		int assertM = random_generator.nextInt(16);
		if (assertM == 0) {
			messages.add(join_message);
			AJPFLogger.info(logname, "assert_join_request");
			messages.add(ack_message);
			AJPFLogger.info(logname, "assert_ack");
			messages.add(set_spacing_from_message_f1);
			AJPFLogger.info(logname, "assert_set_sp_from_follower1");
		} else if (assertM == 1) {
			messages.add(leave_message);
			AJPFLogger.info(logname, "assert_leave_request");
			messages.add(ack_message);
			AJPFLogger.info(logname, "assert_ack");
			messages.add(set_spacing_from_message_f3);
			AJPFLogger.info(logname, "assert_set_sp_from_follower3");			
		} else if (assertM == 2) {
			messages.add(leave_message);
			AJPFLogger.info(logname, "assert_join_request");
			messages.add(ack_message);
			AJPFLogger.info(logname, "assert_ack");
		} else if (assertM == 3) {
			messages.add(leave_message);
			AJPFLogger.info(logname, "assert_leave_request");
			messages.add(ack_message);
			AJPFLogger.info(logname, "assert_ack");
		} else if (assertM == 4) {
			messages.add(join_message);
			AJPFLogger.info(logname, "assert_join_request");
			messages.add(set_spacing_from_message_f1);
			AJPFLogger.info(logname, "assert_set_sp_from_follower1");
		} else if (assertM == 5) {
			messages.add(leave_message);
			AJPFLogger.info(logname, "assert_leave_request");
			messages.add(set_spacing_from_message_f3);
			AJPFLogger.info(logname, "assert_set_sp_from_follower3");			
		} else if (assertM == 6) {
			messages.add(join_message);
			AJPFLogger.info(logname, "assert_join_request");
			messages.add(set_spacing_from_message_f3);
			AJPFLogger.info(logname, "assert_set_sp_from_follower3");
		} else if (assertM == 7) {
			messages.add(leave_message);
			AJPFLogger.info(logname, "assert_leave_request");
			messages.add(set_spacing_from_message_f1);
			AJPFLogger.info(logname, "assert_set_sp_from_follower1");			
		} else if (assertM == 8) {
			messages.add(join_message);
			AJPFLogger.info(logname, "assert_join_request");
			messages.add(ack_message);
			AJPFLogger.info(logname, "assert_ack");
			messages.add(set_spacing_from_message_f3);
			AJPFLogger.info(logname, "assert_set_sp_from_follower3");
		} else if (assertM == 9) {
			messages.add(leave_message);
			AJPFLogger.info(logname, "assert_leave_request");
			messages.add(ack_message);
			AJPFLogger.info(logname, "assert_ack");
			messages.add(set_spacing_from_message_f1);
			AJPFLogger.info(logname, "assert_set_sp_from_follower1");			
		} else if (assertM == 10){
			AJPFLogger.info(logname, "Not assert join_request or leave_request");
			messages.add(ack_message);
			AJPFLogger.info(logname, "assert_ack");
		}  else if (assertM == 11){
			AJPFLogger.info(logname, "Not assert join_request or leave_request");
			messages.add(set_spacing_from_message_f3);
			AJPFLogger.info(logname, "assert set_sp_from_follower3");
		} else if (assertM == 12){
			AJPFLogger.info(logname, "Not assert join_request or leave_request");
			messages.add(set_spacing_from_message_f1);
			AJPFLogger.info(logname, "assert set_sp_from_follower1");			
		} else if (assertM == 13) {
			messages.add(join_message);
			AJPFLogger.info(logname, "assert_join_agreement");
			AJPFLogger.info(logname, "Not assert set_sp_from_follower1 or set_sp_from_follower3");
		} else if (assertM == 14) {
			messages.add(leave_message);
			AJPFLogger.info(logname, "assert_leave_request");
			AJPFLogger.info(logname, "Not assert set_sp_from_follower1 or set_sp_from_follower3");
		} else if (assertM == 15){
			AJPFLogger.info(logname, "Not assert join_request or leave_request");
			AJPFLogger.info(logname, "Not assert set_sp_from_follower1 or set_sp_from_follower3");
		} 
		
		
		
		
/*		int assert_platoon_m = random_generator.nextInt(3);
		if (assert_platoon_m == 0) {
			messages.add(set_spacing_from_message_f1);
			AJPFLogger.info(logname, "assert set_spacing_from_message_f1");
		}else{
			AJPFLogger.info(logname, "Not assert set_spacing_from_message_f1");
		}
		
		int assert_join_message = random_generator.nextInt(2);
		if ( assert_join_message == 1){
			messages.add(join_message);
			AJPFLogger.info(logname, "assert join message");
		} else {
			AJPFLogger.info(logname, "Not assert join message");
		} 
*/
	
		return messages;
	}



}
