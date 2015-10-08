package eass.platooning;

import java.util.Set;
import java.util.TreeSet;

import eass.mas.verification.EASSVerificationEnvironment;
import eass.semantics.EASSAgent;
import ail.syntax.Literal;
import ail.syntax.NumberTermImpl;
import ail.syntax.Predicate;
import ajpf.util.AJPFLogger;
import ail.syntax.Message;

public class LTLVerificationEnvironment extends EASSVerificationEnvironment {
			
	public String logname = "eass.platooning.LTLVerificationEnvironment";
	boolean joining_cycle= false;
	boolean j_cyc_change_lane= false;
	boolean j_cyc_initial_dis= false;
	int j_cyc_pl_m= 0;
	boolean leaving_cycle= false;
	int l_cyc_no_pl_m = 0;
	
	/*
	 * (non-Javadoc)
	 * @see eass.mas.verification.EASSVerificationEnvironment#generate_sharedbeliefs()
	 */
	public Set<Predicate> generate_sharedbeliefs() {
		TreeSet<Predicate> percepts = new TreeSet<Predicate>();
  		
/*		Predicate id = new Predicate("id");
		id.addTerm(new NumberTermImpl(3));
		percepts.add(id);
		AJPFLogger.info(logname, "vehicle_id");

		Predicate name = new Predicate("name");
		name.addTerm(new Literal("follower3"));
		percepts.add(name);
		AJPFLogger.info(logname, "vehicle_name");

		Predicate name_front = new Predicate("name_front");
		name_front.addTerm(new Literal("follower1"));
		percepts.add(name_front);
		AJPFLogger.info(logname, "name_front_follower1");
*/
		
		boolean assert_join = random_bool_generator.nextBoolean();
		boolean assert_leave = random_bool_generator.nextBoolean();
		if(assert_join && !assert_leave){
			percepts.add(new Predicate("ready_to_join"));
			AJPFLogger.info(logname, "assert ready_to_join");
		}else{
			AJPFLogger.info(logname, "No assert_ready_to_join");
		}

		if(assert_leave && !assert_join){
			percepts.add(new Predicate("ready_to_leave"));
			AJPFLogger.info(logname, "assert ready_to_leave");
		}else{
			AJPFLogger.info(logname, "No assert ready_to_leave");
		}
		

		if( joining_cycle || leaving_cycle){
			boolean assert_change_lane = random_bool_generator.nextBoolean();
			if(assert_change_lane && !j_cyc_change_lane){
				j_cyc_change_lane=true;
			}
			if(j_cyc_change_lane){
				percepts.add(new Literal("changed_lane"));
				AJPFLogger.info(logname, "assert_changed_lane");
			}else{
				AJPFLogger.info(logname, "No assert_changed_lane");	
			}
		}else{
			boolean assert_change_lane = random_bool_generator.nextBoolean();
			if(assert_change_lane){
				percepts.add(new Literal("changed_lane"));
				AJPFLogger.info(logname, "assert_changed_lane");	
			}else{
				AJPFLogger.info(logname, "No assert_changed_lane");	
			}
		}	
			

		if(joining_cycle && j_cyc_change_lane){
			boolean assert_init_dis = random_bool_generator.nextBoolean();			
			if(assert_init_dis && !j_cyc_initial_dis){
				j_cyc_initial_dis = true;
			}
			if(j_cyc_initial_dis){
				percepts.add(new Literal("initial_distance"));
				AJPFLogger.info(logname, "assert_initial_distance"+j_cyc_initial_dis);
			}else{
				AJPFLogger.info(logname, "No assert_changed_lane");	
			}
		}else{
			boolean assert_init_dis = random_bool_generator.nextBoolean();			
			if(assert_init_dis){
				percepts.add(new Literal("initial_distance"));
				AJPFLogger.info(logname, "assert_initial_distance");				
			}else{
			AJPFLogger.info(logname, "No assert_initial_distance");
			}
		}

		
		boolean assert_spacing_x = random_bool_generator.nextBoolean();
		boolean assert_spacing = random_bool_generator.nextBoolean();

		if(assert_spacing_x && !joining_cycle){
			Predicate spacing_x = new Predicate("spacing");
			spacing_x.addTerm(new NumberTermImpl(17));
			percepts.add(spacing_x);
			AJPFLogger.info(logname, "assert_spacing_x");
		}else{
			AJPFLogger.info(logname, "Not assert_spacing_x");
		}
		
		if(assert_spacing && !joining_cycle){
			percepts.add(new Literal("spacing"));
			AJPFLogger.info(logname, "assert_spacing");
		}else{
			AJPFLogger.info(logname, "No assert_spacing");
		}

		
		
		return percepts;
	}
	
	/*
	 * (non-Javadoc)
	 * @see eass.mas.verification.EASSVerificationEnvironment#generate_messages()
	 */
	public Set<Message> generate_messages() {
		TreeSet<Message> messages = new TreeSet<Message>();

		boolean assert_set_spacing_goal = random_bool_generator.nextBoolean();
		if(assert_set_spacing_goal && !joining_cycle){
			Predicate set_spacing_goal = new Predicate("set_spacing");
			set_spacing_goal.addTerm(new NumberTermImpl(17));
			messages.add(new Message(EASSAgent.ACHIEVE, "leader", "follower3", set_spacing_goal));
			AJPFLogger.info(logname, "assert_set_spacing_goal");
		}else{
			AJPFLogger.info(logname, "Not assert_set_spacing_goal");
		}
		
		if(!joining_cycle && !leaving_cycle){
			boolean assert_join_leave_agreement = random_bool_generator.nextBoolean();
			if(assert_join_leave_agreement){
				joining_cycle= true;
				AJPFLogger.info(logname, "joining cycle started");
			}else{
				leaving_cycle= true;
				AJPFLogger.info(logname, "leaving cycle started");
			}
		}
		
		if(joining_cycle && leaving_cycle){
			AJPFLogger.info(logname, "assert_both_joining_leaving");
		}
		
//		boolean assert_join_agreement = random_generator.nextBoolean();
//		boolean assert_leave_agreement = random_generator.nextBoolean();
		if (joining_cycle && !leaving_cycle) {
			Predicate join_agreement = new Predicate("join_agreement");
			join_agreement.addTerm(new Literal("follower3"));
			join_agreement.addTerm(new Literal("follower1"));
			messages.add(new Message(EASSAgent.TELL, "leader", "follower3", join_agreement));
			AJPFLogger.info(logname, "assert_join_agreement");
		} else {
			AJPFLogger.info(logname, "Not assert_joing_agreement");
		}

		if (leaving_cycle && !joining_cycle) {
			Predicate leave_agreement = new Predicate("leave_agreement");
			leave_agreement.addTerm(new Literal("follower3"));
			messages.add(new Message(EASSAgent.TELL, "leader", "follower3", leave_agreement));
			AJPFLogger.info(logname, "assert_leave_agreement");
		} else {
			AJPFLogger.info(logname, "Not assert_leave_agreement");
		}

		
//		boolean assert_platoon_m = random_generator.nextBoolean();
//		boolean assert_no_platoon_m = random_generator.nextBoolean();
		if (joining_cycle && j_cyc_change_lane && j_cyc_initial_dis && j_cyc_pl_m<4) {
			boolean assert_platoon_m = random_bool_generator.nextBoolean();
			if(assert_platoon_m && j_cyc_pl_m==0){
				j_cyc_pl_m= j_cyc_pl_m+1;
				AJPFLogger.info(logname, "set platoon_m cyc");
			}
			if(j_cyc_pl_m> 0) {
				messages.add(new Message(EASSAgent.TELL, "leader", "follower3", new Predicate("platoon_m")));
				AJPFLogger.info(logname, "assert_platoon_m"+j_cyc_pl_m);
				j_cyc_pl_m= j_cyc_pl_m+1;
			}else{
				AJPFLogger.info(logname, "Not assert_platoon_m");
			}
		}
		else {
			if (j_cyc_pl_m ==4){
				joining_cycle = false;
				j_cyc_change_lane = false;
				j_cyc_initial_dis = false;
				j_cyc_pl_m= 0;
				AJPFLogger.info(logname, "reset joining cycle");
			}
			AJPFLogger.info(logname, "Not assert_platoon_m"+ j_cyc_change_lane + j_cyc_initial_dis+j_cyc_pl_m);
		}
		
		// UP TO HERE CHECKED
		if (leaving_cycle && j_cyc_change_lane && l_cyc_no_pl_m< 4) {
			messages.add(new Message(EASSAgent.TELL, "leader", "follower3", new Predicate("no_platoon_m")));
			AJPFLogger.info(logname, "assert_no_platoon_m");
			l_cyc_no_pl_m= l_cyc_no_pl_m+1;
		} else {
			if(l_cyc_no_pl_m==4){
				leaving_cycle= false;
				j_cyc_change_lane = false;
				l_cyc_no_pl_m= 0;
			}
			AJPFLogger.info(logname, "Not assert_no_platoon_m");
		}

		
		return messages;
	};

	
}
