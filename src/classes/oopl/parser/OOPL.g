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

grammar OOPL;

options {
	k = 4;
	}

@header {
package oopl.parser;

import ail.syntax.ast.*;
import ail.mas.*;
import goal.syntax.ast.*;
import random.syntax.ast.*;
import oopl.syntax.ast.*;
import java.util.HashMap;
}

@lexer::header {
package oopl.parser;
}

@members {
	private static HashMap<String,Abstract_VarTerm> variables = new HashMap<String,Abstract_VarTerm>();
	private String name = "";
}

@lexer::members {
    public int plain_nesting = 0;
    public int sq_nesting = 0;
    public int curly_nesting = 0;
    public boolean stringterm = false;
    public boolean preconditiontypemode = false;
    public boolean condaction = false;
    public boolean actionspec = false;
    public boolean start = true;
    public int commacount = 0;
}

// Mas involving GOAL and OOPL Agents
mas returns [Abstract_MAS mas] : org=organisation {$mas = $org.org.getMAS();};

// OOPL AGent stuff
organisation returns [Abstract_OOPLAgent org] : NAME w=word {try {$org = new Abstract_OOPLAgent($w.s);} catch (Exception e) {System.err.println(e);}} 
   BRUTEFACTS (l=literal {$org.addInitialBel($l.l);})*
   EFFECTRULES (er=erule {try {$org.addEffectRule($er.er);} catch (Exception e) {System.err.println(e);}})* 
   COUNTSASRULES (car=carule {try {$org.addCountsAsRule($car.car);} catch (Exception e) {System.err.println(e);}})* 
   SANCTIONRULES (sr=srule {try {$org.addSanctionRule($sr.sr);} catch (Exception e) {System.err.println(e);}})*;

erule returns [Abstract_EffectRule er] : CURLYOPEN pre=bpre CURLYCLOSE t=pred CURLYOPEN 
				post=bpost CURLYCLOSE 
					{Abstract_Literal l = new Abstract_Literal(Abstract_Literal.LPos, 
						new Abstract_Pred($t.t)); $er = new Abstract_EffectRule(l, 
						$pre.pre, $post.post); variables.clear();};
carule returns [Abstract_CountsAsRule car] : CURLYOPEN pre=bpre CURLYCLOSE 
				    CURLYOPEN pre2=ipre CURLYCLOSE ORULEARROW 
				    CURLYOPEN post=ipost CURLYCLOSE 
				    {$car = new Abstract_CountsAsRule($pre.pre, $pre2.pre, $post.post); variables.clear();};
srule returns [Abstract_SanctionRule sr] : CURLYOPEN pre=ipre CURLYCLOSE ORULEARROW 
				  CURLYOPEN post=bpost CURLYCLOSE 
				  	{$sr = new Abstract_SanctionRule($pre.pre, $post.post); variables.clear();};

ipre returns [Abstract_Precondition pre] : {$pre = new Abstract_Precondition("inst");} iprecondition[$pre] (COMMA iprecondition[$pre])*;
iprecondition[Abstract_Precondition pre]	: ( i=literal {$pre.addLiteral($i.l);}  | 
                                                    eq=equation {$pre.addEquation($eq.eq);}
                                                    );
bpre returns [Abstract_Precondition pre] : {$pre = new Abstract_Precondition("brute");} bprecondition[$pre];
bprecondition[Abstract_Precondition pre]	: ( b=literal {$pre.addLiteral($b.l);} (COMMA bprecondition[$pre])* | i=equation 
					(COMMA bprecondition[$pre])* {$pre.addEquation($i.eq);});

ipost returns [Abstract_Postcondition post] : {$post = new Abstract_Postcondition("inst");} ipostcondition[$post];
ipostcondition[Abstract_Postcondition post]	: i=literal (COMMA ipostcondition[$post])* {$post.addLiteral($i.l);};
bpost returns [Abstract_Postcondition post] : {$post = new Abstract_Postcondition("brute");} bpostcondition[$post];
bpostcondition[Abstract_Postcondition post]	: b=literal (COMMA bpostcondition[$post])* {$post.addLiteral($b.l);};


LITTEST :	'??';
TELL	:	':tell';
OOPL	:	'OOPL';
RANDOM	:	{plain_nesting == 0 & curly_nesting == 0}?=> 'RANDOM';
BRUTEFACTS 
	:	':Brute Facts:';
EFFECTRULES 
	:	':Effect Rules:';
COUNTSASRULES
	:	':CountsAs Rules:';
SANCTIONRULES
	:	':Sanction Rules:';
ORULEARROW :	'=>';

ACTIONS :	':Actions:';



NAME	:	':name:' {actionspec=false;};
TRUE	:	{curly_nesting > 0 && plain_nesting == 0}?=> 'True';
IF	:	{condaction}?=> 'if' {preconditiontypemode = true;};
THEN	:	{condaction}?=> 'then'{preconditiontypemode = false;};
BELIEVE :	{(preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0)}?=> 'B';
HAVEGOAL 
	:	{(preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0)}?=> 'G';
IN_CONTENT 
	:	{(preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0)}?=> 'N';
IN_CONTEXT 
	:	{(preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0)}?=> 'X';
AND	: 	'&';
NUMMARKER
	:	'_';
BRULEARROW	: ':-';
BRULES 	:	':Belief Rules:';
DEL	:	{(condaction==true && preconditiontypemode==false && plain_nesting==0)}?=> 'del';
ADOPT	:	{(condaction==true && preconditiontypemode==false && plain_nesting==0)}?=>'adopt';
CLOSEKEY	:	{(condaction==true && preconditiontypemode==false && plain_nesting==0)}?=>'close';
SEND	:	{(condaction==true && preconditiontypemode==false && plain_nesting==0)}?=>'send';
DROP	:	{(condaction==true && preconditiontypemode==false && plain_nesting==0)}?=>'drop';
INS	:	{(condaction==true && preconditiontypemode==false && plain_nesting==0)}?=>'ins';
CONTENT	:	{(condaction==true && preconditiontypemode==false && plain_nesting==0)}?=>'nt';
CONTEXT	:	{(condaction==true && preconditiontypemode==false && plain_nesting==0)}?=>'xt';



// General AIL Parsing stuff

word returns [String s] : (CONST {$s=$CONST.getText();} | VAR {$s=$VAR.getText();});                                                                                     

agentnameterm returns [Abstract_StringTerm s] : CONST {$s = new Abstract_StringTermImpl($CONST.getText());} | v=var {$s = $v.v;};

// littest returns [Literal l]: LITTEST literal;
literal returns [Abstract_Literal l]:  (TRUE {$l = new Abstract_Literal(Abstract_Literal.LTrue);} | 
				MINUS nt=pred {
				if ($nt.t instanceof Abstract_VarTerm) 
					{$l = (Abstract_VarTerm) $nt.t; $l.setNegated(false);}
					else { $l = new Abstract_Literal(Abstract_Literal.LNeg, new Abstract_Pred($nt.t));}}) | 
				t=pred {if ($t.t instanceof Abstract_VarTerm) 
				            {$l = (Abstract_VarTerm) $t.t;} 
				            else {$l = new Abstract_Literal(Abstract_Literal.LPos, new Abstract_Pred($t.t));}};

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

// General AIL Lexing stuff
COMMENT
    : '/*' .* '*/' {$channel=HIDDEN;}
    ;
LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
NEWLINE:'\r'? '\n' {skip();} ;
WS  :   (' '|'\t')+ {skip();} ;


OPEN	: 	'(' {plain_nesting++;};
CLOSE	:	')' {plain_nesting--;};
SQOPEN	:	'[' {sq_nesting++;};
SQCLOSE	:	']' {sq_nesting--;};
CURLYOPEN	: '{' {curly_nesting++;};
CURLYCLOSE	: '}' {curly_nesting--;};
DOUBLEQUOTE
	:	'"' {if (stringterm) {stringterm = false;} else {stringterm = true;}};

STRING	:	{stringterm}?=> ('a'..'z'|'A'..'Z'|'0'..'9'|'_')+;
CONST 	: 	{!stringterm}?=>'a'..'z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
VAR	:	{!stringterm}?=>'A'..'Z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
NUMBER	:	{!stringterm}?=>'0'..'9' ('0'..'9')*;


LESS	:	'<';
EQ	: 	'==';
POINT	:	'.';
MULT	:	'*';
PLUS	:	'+';
MINUS	:	'-';
DIV	:	'/';
MOD	:	'%';

SHRIEK	:	'!';
COMMA	:	',';
SEMI	:	';';
COLON	:	':';
QUERY	:	'?';

