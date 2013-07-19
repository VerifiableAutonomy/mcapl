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

package oopl.syntax;


/**
 * Class for a sanction rule consisting of a precondition and a
 * postcondition.
 * 
 * @author nicktinnemeier
 *
 */
public class SanctionRule extends OOPLRule { 
	
	/**
	 * Create an effect rule from a literal (a 'does(a,act)' predicate), a 
	 * precondition and postcondition.
	 * 
	 * @param pre
	 * @param post
	 */
	public SanctionRule(Precondition pre, Postcondition post) {
		super(pre, post);
	}
}
