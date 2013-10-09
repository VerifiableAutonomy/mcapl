// ----------------------------------------------------------------------------
// Copyright (C) 2012 Louise A. Dennis, and  Michael Fisher 
//
// This file is part of Agent JPF (AJPF)
// 
// AJPF is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 3 of the License, or (at your option) any later version.
// 
// AJPF is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public
// License along with AJPF; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
// 
// To contact the authors:
// http://www.csc.liv.ac.uk/~lad
//
//----------------------------------------------------------------------------

package ajpf.psl.ast;

import gov.nasa.jpf.vm.MJIEnv;

import ajpf.MCAPLcontroller;
import ajpf.MCAPLmas;
import ajpf.psl.And;
import ajpf.psl.MCAPLProperty;

/**
 * Generic Description of Abstract Classes in AIL and AJPF
 * -------------------------------------------------------
 * 
 * We use "Abstract" versions of syntax items for all bits of state that we sometimes wish to store in the native
 * java VM as well in the JavaPathfinder VM.  In particular files are parsed into the native VM and then the relevant
 * initial state of the multi-agent system is reconstructed in the model-checking VM.  This is done to improve
 * efficiency of parsing (the native VM is faster).  We also represent properties for model checking in the native VM 
 * and, indeed the property automata is stored only in the native VM.  We used Abstract classes partly because less
 * computational content is needed for these objects in the native VM and so a smaller representation can be used
 * but also because specific support is needed for transferring information between the two virtual machines both
 * in terms of methods and in terms of the data types chosen for the various fields.  It was felt preferable to 
 * separate these things out from the classes used for the objects that determine the run time behaviour of a MAS.
 * 
 * Abstract classes all have a method (toMCAPL) for creating a class for the equivalent concrete object used
 * when executing the MAS.  They also have a method (newJPFObject) that will create an equivalent object in the 
 * model-checking virtual machine from one that is held in the native VM.  At the start of execution the agent
 * program is parsed into abstract classes in the native VM.  An equivalent structure is then created in the JVM
 * using calls to newJPFObject and this structure is then converted into the structures used for executing the MAS
 * by calls to toMCAPL.
 * 
 */

/**
 * Default class for conjuctions.
 * 
 * @author louiseadennis
 *
 */
public class Abstract_And implements Abstract_Property {
	/**
	 * The properties
	 */
	private Abstract_Property inL;
	private Abstract_Property inR;
		
	/**
	 * Constructor.
	 * 
	 * @param p1 the property on the left.
	 * @param p2 the property on the right.
	 */
	public Abstract_And(Abstract_Property p1, Abstract_Property p2) {
		inL = p1;
		inR = p2;
	}
	
	public MCAPLProperty toMCAPL(MCAPLmas mas, MCAPLcontroller c) {
		return new And(inL.toMCAPL(mas, c), inR.toMCAPL(mas, c));
	}
	
	public MCAPLProperty toMCAPLNative() {
		return new And(inL.toMCAPLNative(), inR.toMCAPLNative());
	}

	public int newJPFObject(MJIEnv env) {
		int ref = env.newObject("ajpf.psl.ast.Abstract_And");
		env.setReferenceField(ref, "inL", inL.newJPFObject(env));
		env.setReferenceField(ref, "inR", inR.newJPFObject(env));
		return ref;
	}
	
	public Abstract_Property toNormalForm() {
		return new Abstract_And(inL.toNormalForm(), inR.toNormalForm());
	}
	
	public Abstract_Property negate() {
		return new Abstract_Or(inL.negate(), inR.negate());
	}
	
	public String toString() {
		String s = "(" + inL.toString();
		s += " & " + inR.toString() + ")";
		return s;
		
	}


}
