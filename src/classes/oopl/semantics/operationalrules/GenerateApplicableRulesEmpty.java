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

package oopl.semantics.operationalrules;

import ail.semantics.operationalrules.GenerateApplicablePlansEmpty;

public class GenerateApplicableRulesEmpty extends GenerateApplicablePlansEmpty 
{
	private static final String name = "GenerateApplicableRulesEmpty";
	
	public String getName() {
		return name;
	}
}
