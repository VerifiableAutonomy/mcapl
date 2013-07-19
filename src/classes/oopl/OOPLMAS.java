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
package oopl;

import ajpf.MCAPLcontroller;
import ajpf.util.AJPFException;
import ajpf.util.AJPFLogger;
import ail.mas.ActionScheduler;
import ail.mas.MAS;
import goal.mas.GoalEnvironment;

import oopl.semantics.OOPLAgent;

/**
 * Example Set up for running the pickup agent.
 * 
 * @author louiseadennis
 *
 */
public abstract class OOPLMAS {
	MCAPLcontroller mccontrol;

	public OOPLMAS(String[] args) {
		String filename = args[0];
		String abs_filename = null;
		try {
			abs_filename = MCAPLcontroller.getFilename(filename);
		} catch (AJPFException e) {
			AJPFLogger.severe("oopl.OOPLMAS", e.getMessage());
			System.exit(1);
		}

		String propertystring = getProperty(0);
		if (args.length > 1) {
			propertystring = getProperty(Integer.parseInt(args[1]));
		}
		
		OOPLMASBuilder masBuilder = new OOPLMASBuilder(abs_filename, true);
		MAS mas = masBuilder.getMAS();
		ActionScheduler s = new ActionScheduler();
		OOPLAgent org = (OOPLAgent) mas.getAg("");
		org.setScheduler(s);
		org.addPerceptListener(s);
		
		for (int i = 2; i < args.length; i++ ) {
			String fname = args[i];
			String abs_fname = null;
			try {
				abs_fname = MCAPLcontroller.getFilename(fname);
			} catch (AJPFException e) {
				AJPFLogger.severe("oopl.OOPLMAS", e.getMessage());
				System.exit(1);
			}
			
	//		org.addAgent(masBuilder.AgentFactory(abs_fname));
 		}
			
			// Set up a MCAPL controller and specification.
		mccontrol = new MCAPLcontroller(mas, propertystring, 1);
			// Start the system.
		
	}
		
	public void runexample() {
			// Start the system.
		mccontrol.begin(); 
           
 
	}
	
	public abstract String getProperty(int i);

}
