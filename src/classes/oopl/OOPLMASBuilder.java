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

import mcaplantlr.runtime.ANTLRFileStream;
import mcaplantlr.runtime.ANTLRStringStream;
import mcaplantlr.runtime.CommonTokenStream;

import ail.mas.MAS;
import ail.syntax.ast.Abstract_MAS;
import ail.mas.MASBuilder;

import oopl.parser.OOPLLexer;
import oopl.parser.OOPLParser;
import oopl.semantics.OOPLAgent;

import ail.semantics.AILAgent;

import ajpf.MCAPLLanguageAgent;

/**
 * Utility class.  Builds a OOPL MAS by parsing a string or a file.
 * @author louiseadennis
 *
 */
public class OOPLMASBuilder implements MASBuilder {
	MAS mas;
	Abstract_MAS amas;
	
	public OOPLMASBuilder(){};
	
	public OOPLMASBuilder(String masstring, boolean filename) {
		if (filename) {
			parsefile(masstring);
		} else {
			parse(masstring);
		}
		mas = amas.toMCAPL();
	}

	public void parse(String masstring) {
		OOPLLexer lexer = new OOPLLexer(new ANTLRStringStream(masstring));
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
    	OOPLParser parser = new OOPLParser(tokens);
    	try {
    		amas = parser.mas();
    	} catch (Exception e) {
    		System.err.println(e);
    	}
    }
	
	public void parsefile(String filename) {
		try {
			OOPLLexer lexer = new OOPLLexer(new ANTLRFileStream(filename));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			OOPLParser parser = new OOPLParser(tokens);
			amas = parser.mas();
		} catch (Exception e) {
			System.err.println(e);
		}

	}
	
	public MAS getMAS(String filename) {
		parsefile(filename);
		mas = amas.toMCAPL();
		return mas;
	}
	
	
	/**
	 * Getter method for the resulting MAS.
	 * @return
	 */
	public MAS getMAS() {
		return mas;
	}
	

}
