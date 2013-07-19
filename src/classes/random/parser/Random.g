// ----------------------------------------------------------------------------
// Copyright (C) 2012 Louise A. Dennis, and  Michael Fisher 
//
// This file is part of the Agent Infrastructure Layer (AIL)
// 
// The AIL is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 3 of the License, or (at your option) any later version.
// 
// The AIL is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public
// License along with the AIL; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
// 
// To contact the authors:
// http://www.csc.liv.ac.uk/~lad
//
//----------------------------------------------------------------------------

grammar Random;

@header {
package random.parser;

import ail.syntax.ast.*;
import random.syntax.ast.*;
import java.util.HashMap;
}

@members {
	private static HashMap<String,Abstract_VarTerm> variables = new HashMap<String,Abstract_VarTerm>();
	private Abstract_Literal agentname = new Abstract_Literal("");
	}

@lexer::header {
package random.parser;
}
	
@lexer::members {
    public int plain_nesting = 0;
    public int sq_nesting = 0;
    public int curly_nesting = 0;
    public boolean stringterm = false;
    public boolean gwendolen = false;
    public int belief_rules = 0;
}


randomagents returns[ArrayList<Abstract_RandomAgent> rags]: {rags=new ArrayList<Abstract_RandomAgent>();} 
			(r=randomagent {rags.add($r.r);})+;

randomagent returns [Abstract_RandomAgent r] : 
		{try {$r = new Abstract_RandomAgent();} catch (Exception e) {System.err.println(e);}}
		(NAME w=word {$r.setAgName(w);})?
		ACTIONS (a=action {$r.addAction($a.a);})+;
		

// General parsing
action returns [Abstract_Action a] : (SEND OPEN an=agentnameterm COMMA t=pred CLOSE {$a = new Abstract_SendAction($an.s, 1, $t.t);}) | 
	t=pred {$a = new Abstract_Action($t.t, Abstract_Action.normalAction);};

NAME	:	':name:';
ACTIONS	:	':Actions:';

word returns [String s] : (CONST {$s=$CONST.getText();} | VAR {$s=$VAR.getText();});                                                                                     
agentnameterm returns [Abstract_StringTerm s] : CONST {$s = new Abstract_StringTermImpl($CONST.getText());} | v=var {$s = $v.v;};
pred 	returns [Abstract_Structure t]:	v=var {$t = $v.v;}| f=function {$t = $f.f;};
function returns [Abstract_Structure f]: CONST {$f = new Abstract_Structure($CONST.getText());} (OPEN terms[$f] CLOSE)?;

terms[Abstract_Structure f] : t=term {$f.addTerm($t.t);} (COMMA terms[$f])? ;
term	returns [Abstract_Term t]:  a = atom {$t = $a.t;} | s = stringterm {$t = $s.s;} | f=function {$t = $f.f;};

atom	returns [Abstract_NumberTerm t]	:	n = numberstring {$t = new Abstract_NumberTermImpl($n.s);}| 
					v=var {$t = $v.v;} | OPEN a=arithexpr CLOSE {$t = $a.t;};
stringterm returns [Abstract_StringTerm s] : DOUBLEQUOTE  STRING DOUBLEQUOTE {$s = new Abstract_StringTermImpl($STRING.getText());};

var 	returns [Abstract_VarTerm v]:	VAR {
	if (variables.containsKey($VAR.getText())) {
		$v = variables.get($VAR.getText());
		} else {
		$v = new Abstract_VarTerm($VAR.getText());
		variables.put($VAR.getText(), $v);
		}
	};

numberstring returns [String s] :	{$s = "";} (MINUS {$s += "-";})? (n1=NUMBER {$s += $n1.getText();}
					(POINT {$s += ".";} n2=NUMBER {$s += $n2.getText();})?);
equation returns[Abstract_Equation eq] : a1=arithexpr oper=eqoper a2=arithexpr  {$eq = new Abstract_Equation($a1.t, $oper.oper, $a2.t);};
eqoper returns [int oper] : LESS {$oper=Abstract_Equation.less;} | EQ {$oper=Abstract_Equation.equal;};

arithexpr returns [Abstract_NumberTerm t]	:	m=multexpr {$t = $m.t;} ( oper=addoper m1=multexpr {$t = new Abstract_ArithExpr($m.t, $oper.oper, $m1.t);})?;
multexpr returns [Abstract_NumberTerm t]	:	a=atom {$t = $a.t;} (oper=multoper a1=atom {$t = new Abstract_ArithExpr($a.t, $oper.oper, $a1.t);})?;

addoper	returns [int oper] :	(PLUS {$oper=Abstract_ArithExpr.plus;}| MINUS {$oper=Abstract_ArithExpr.minus;});
multoper returns [int oper] : (MULT {$oper=Abstract_ArithExpr.times;} | DIV {$oper=Abstract_ArithExpr.div;} | MOD {$oper=Abstract_ArithExpr.mod;});


SEND	:	'.send';
STRING	:	{stringterm}?=> ('a'..'z'|'A'..'Z'|'0'..'9'|'_')+;
CONST 	: 	{!stringterm}?=>'a'..'z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
VAR	:	{!stringterm}?=>'A'..'Z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
DOUBLEQUOTE
	:	'"' {if (stringterm) {stringterm = false;} else {stringterm = true;}};

NUMBER	:	{!stringterm}?=>'0'..'9' ('0'..'9')*;


LESS	:	'<';
EQ	: 	'==';
POINT	:	'.';
MULT	:	'*';
PLUS	:	'+';
MINUS	:	'-';
DIV	:	'/';
MOD	:	'%';

OPEN	: 	'(' {plain_nesting++;};
CLOSE	:	')' {plain_nesting--;};
COMMA	:	',';

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

