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

package oopl.semantics;

import oopl.semantics.OOPLRCStage;
import oopl.semantics.OOPLAgent;
import oopl.semantics.operationalrules.ApplyApplicableRules;
import oopl.semantics.operationalrules.Finalize;
import oopl.semantics.operationalrules.GenerateApplicableRulesEmpty;
import oopl.semantics.operationalrules.GenerateApplicableRulesIfNonEmpty;
import oopl.semantics.operationalrules.HandleAddFact;
import oopl.semantics.operationalrules.HandleDropFact;
import oopl.semantics.operationalrules.NextRuleToApply;
import oopl.semantics.operationalrules.NoMoreRuleToApply;
import oopl.semantics.operationalrules.ReceiveAction;
import ail.semantics.ReasoningCycle;
import ail.semantics.RCStage;
import ail.semantics.AILAgent;
import ail.semantics.operationalrules.*;
import ail.semantics.OSRule;

/**
 * A Gwendolen Reasonning Cycle.  An Example of how to set up a language
 * specific reasoning cycle.  Likely to change as the implementation of
 * OSRule's changes in AIL.
 * 
 * @author louiseadennis
 *
 */
public class OOPLRC implements ReasoningCycle {
	/**
	 * Place holder for the current stage of the reasoning cycle.
	 */
	private RCStage currentstage;

	/**
	 * Set up the reasoning cycle stages.
	 */
	public OOPLRCStage StageRA  	= new OOPLRCStage(0, "ReceiveAction");
	public OOPLRCStage StageGE  	= new OOPLRCStage(1, "GenerateEffects");
	public OOPLRCStage StageAE  	= new OOPLRCStage(2, "ApplyEffects");
	public OOPLRCStage StageGCA 	= new OOPLRCStage(3, "GenerateCountsAs");
	public OOPLRCStage StageAC  	= new OOPLRCStage(4, "ApplyCountsAs");
	public OOPLRCStage StageGS  	= new OOPLRCStage(5, "GenerateSanctions");
	public OOPLRCStage StageAS  	= new OOPLRCStage(6, "ApplySanctions");
	public OOPLRCStage StageFINAL 	= new OOPLRCStage(7, "Final");

	/**
	 * Set up the transition rules 
	 */
	private OSRule receiveAction = new ReceiveAction();
	private OSRule generateApplicableRulesIfNonEmpty = new GenerateApplicableRulesIfNonEmpty();
	private OSRule generateApplicableRulesEmpty = new GenerateApplicableRulesEmpty();
	private OSRule applyApplicableRules = new ApplyApplicableRules();
	private OSRule handleAddFact = new HandleAddFact();
	private OSRule handleDropFact = new HandleDropFact();
	private OSRule nextRuleToApply = new NextRuleToApply();
	private OSRule noMoreRuleToApply = new NoMoreRuleToApply();
	private OSRule finalize = new Finalize();
	
	
	/**
	 * Flag indicating whether this is a point where the properties of the 
	 * multi-agent system should be checked.
	 */
	private boolean stopandcheck = true;
	
	/**
	 * Start at Stage A.
	 *
	 */
	public OOPLRC() {
		currentstage = StageRA;
		
		StageRA.setRule(receiveAction);
		
		// Generate applicable effect rules
		StageGE.setRule(generateApplicableRulesIfNonEmpty);
		StageGE.setRule(generateApplicableRulesEmpty);
		
		// Apply one applicable effect rule
		StageAE.setRule(applyApplicableRules);
		StageAE.setRule(handleAddFact);
		StageAE.setRule(handleDropFact);
		
		// Generate applicable counts-as rules
		StageGCA.setRule(generateApplicableRulesIfNonEmpty);
		StageGCA.setRule(generateApplicableRulesEmpty);
		
		// Apply counts-as rules
		StageAC.setRule(applyApplicableRules);
		StageAC.setRule(handleAddFact);
		StageAC.setRule(handleDropFact);
		StageAC.setRule(noMoreRuleToApply);
		StageAC.setRule(nextRuleToApply);
		
		// Generate applicable sanction rules
		StageGS.setRule(generateApplicableRulesIfNonEmpty);
		StageGS.setRule(generateApplicableRulesEmpty);
		
		// Apply sanction rules
		StageAS.setRule(applyApplicableRules);
		StageAS.setRule(handleAddFact);
		StageAS.setRule(handleDropFact);
		StageAS.setRule(noMoreRuleToApply);
		StageAS.setRule(nextRuleToApply);
		
		// Finalise
		StageFINAL.setRule(finalize);
	}

	/*
	 * (non-Javadoc)
	 * @see ail.semantics.ReasoningCycle#cycle(ail.semantics.AILAgent)
	 */
	public void cycle(AILAgent ag) {
		// Only move to the next stage if some action has been received
		if( currentstage == StageRA ) {
			if (!ag.getIntention().empty()) {
				currentstage = StageGE;
			}
		}
		// If no applicable effect rules were found, process actions
		// else apply the applicable effect rule(s)
		else if( currentstage == StageGE ) {
			if( ag.getNameOfLastRule().equals(generateApplicableRulesEmpty.getName()) ) {
				currentstage = StageFINAL;
			} else {
				currentstage = StageAE;
			}
		}
		// Add and drop all facts; there are no more facts to process
		// when the current intention is empty, so, we do not want to 
		// move to the next stage when there is still an intention. 
		else if( currentstage == StageAE ) {
			if( ag.getIntention().empty() ) {
			  ((OOPLAgent)ag).cleanGenerated();
			  currentstage = StageGCA;
			}	
		}
		// If no applicable counts-as rule has been found, process sanctions
		// else apply the applicable counts-as rules.
		else if( currentstage == StageGCA ) {
			if( ag.getNameOfLastRule().equals(generateApplicableRulesEmpty.getName()) ||
					ag.getNameOfLastRule().equals(noMoreRuleToApply.getName())
					) {
				((OOPLAgent)ag).cleanGenerated();
				currentstage = StageGS;
			} else {
				currentstage = StageAC;
			}
		}
		// If all counts-as rules have been applied loop back to generation phase. More rules might be
		// applicable as a result of applying the former set of applicable rules.
		else if( currentstage == StageAC && ag.getNameOfLastRule().equals(noMoreRuleToApply.getName()) ) {
			currentstage = StageGCA;
		}
		// If sanctions have been generated, apply them
		// else start processing actions again.
		else if( currentstage == StageGS ) {
	            if( ag.getNameOfLastRule().equals(noMoreRuleToApply.getName()) ) {
	                ((OOPLAgent)ag).cleanGenerated();
	                currentstage = StageFINAL;
	            } else {
	                currentstage = StageAS;
	            }
			}

		// After applying sanctions go to the finalisation phase.
		else if( currentstage == StageAS && ag.getNameOfLastRule().equals(noMoreRuleToApply.getName()) ) {
			((OOPLAgent)ag).cleanGenerated();
			currentstage = StageFINAL;
		}
		// After having finalised go to sleep until new actions arrive to be processed.
		else if( currentstage == StageFINAL ) {
			currentstage = StageRA;
	    	ag.sleep();
			stopandcheck();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see ail.semantics.ReasoningCycle#getStage()
	 */
	public RCStage getStage() {
		return currentstage;
	}
	
	
	public void setCurrentStage(RCStage s) {
		this.currentstage = s;
	}


	/*
	 * (non-Javadoc)
	 * @see ail.semantics.ReasoningCycle#stopandcheck()
	 */
	public boolean stopandcheck() {
		boolean tmp = stopandcheck;
		return tmp;
	} 
	
	public void setStopandCheck(boolean b) {
		stopandcheck = b;
	}

	public RCStage getStageRA() {
		return StageRA;
	}
	
	public boolean not_interrupted() {
		return stopandcheck;
	}

}
