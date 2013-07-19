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

import oopl.parser.OOPLLexer;
import oopl.parser.OOPLParser;
import gov.nasa.jpf.jvm.ClinitRequired;
import gov.nasa.jpf.jvm.MJIEnv;
import mcaplantlr.runtime.ANTLRFileStream;
import mcaplantlr.runtime.ANTLRStringStream;
import mcaplantlr.runtime.CommonTokenStream;
import ail.syntax.ast.Abstract_MAS;

public class JPF_oopl_OOPLMASBuilder {
	public static void parse__Ljava_lang_String_2__ (MJIEnv env, int objref, int masRef) {
		String masstring = env.getStringObject(masRef);
	   	OOPLLexer lexer = new OOPLLexer(new ANTLRStringStream(masstring));
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
    	OOPLParser parser = new OOPLParser(tokens);
 		try {
 	   		Abstract_MAS amas = parser.mas();
			int ref = amas.newJPFObject(env);
			env.setReferenceField(objref, "amas", ref);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void parsefile__Ljava_lang_String_2__ (MJIEnv env, int objref, int masRef) {
		String masstring = env.getStringObject(masRef);
 		try {
 			OOPLLexer lexer = new OOPLLexer(new ANTLRFileStream(masstring));
 	    	CommonTokenStream tokens = new CommonTokenStream(lexer);
 	    	OOPLParser parser = new OOPLParser(tokens);
 	    	//System.err.println("parsing");
 	   		Abstract_MAS amas = parser.mas();
 	   		//System.err.println("done parsing");
			int ref = amas.newJPFObject(env);
			env.setReferenceField(objref, "amas", ref);
		} catch (ClinitRequired e) {
			env.repeatInvocation();
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
