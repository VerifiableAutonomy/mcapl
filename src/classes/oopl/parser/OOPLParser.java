// $ANTLR 3.4 /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g 2012-11-13 16:46:53

package oopl.parser;

import ail.syntax.ast.*;
import ail.mas.*;
import goal.syntax.ast.*;
import random.syntax.ast.*;
import oopl.syntax.ast.*;
import java.util.HashMap;


import mcaplantlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class OOPLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTIONS", "ADOPT", "AND", "BELIEVE", "BRULEARROW", "BRULES", "BRUTEFACTS", "CLOSE", "CLOSEKEY", "COLON", "COMMA", "COMMENT", "CONST", "CONTENT", "CONTEXT", "COUNTSASRULES", "CURLYCLOSE", "CURLYOPEN", "DEL", "DIV", "DOUBLEQUOTE", "DROP", "EFFECTRULES", "EQ", "HAVEGOAL", "IF", "INS", "IN_CONTENT", "IN_CONTEXT", "LESS", "LINE_COMMENT", "LITTEST", "MINUS", "MOD", "MULT", "NAME", "NEWLINE", "NUMBER", "NUMMARKER", "OOPL", "OPEN", "ORULEARROW", "PLUS", "POINT", "QUERY", "RANDOM", "SANCTIONRULES", "SEMI", "SEND", "SHRIEK", "SQCLOSE", "SQOPEN", "STRING", "TELL", "THEN", "TRUE", "VAR", "WS"
    };

    public static final int EOF=-1;
    public static final int ACTIONS=4;
    public static final int ADOPT=5;
    public static final int AND=6;
    public static final int BELIEVE=7;
    public static final int BRULEARROW=8;
    public static final int BRULES=9;
    public static final int BRUTEFACTS=10;
    public static final int CLOSE=11;
    public static final int CLOSEKEY=12;
    public static final int COLON=13;
    public static final int COMMA=14;
    public static final int COMMENT=15;
    public static final int CONST=16;
    public static final int CONTENT=17;
    public static final int CONTEXT=18;
    public static final int COUNTSASRULES=19;
    public static final int CURLYCLOSE=20;
    public static final int CURLYOPEN=21;
    public static final int DEL=22;
    public static final int DIV=23;
    public static final int DOUBLEQUOTE=24;
    public static final int DROP=25;
    public static final int EFFECTRULES=26;
    public static final int EQ=27;
    public static final int HAVEGOAL=28;
    public static final int IF=29;
    public static final int INS=30;
    public static final int IN_CONTENT=31;
    public static final int IN_CONTEXT=32;
    public static final int LESS=33;
    public static final int LINE_COMMENT=34;
    public static final int LITTEST=35;
    public static final int MINUS=36;
    public static final int MOD=37;
    public static final int MULT=38;
    public static final int NAME=39;
    public static final int NEWLINE=40;
    public static final int NUMBER=41;
    public static final int NUMMARKER=42;
    public static final int OOPL=43;
    public static final int OPEN=44;
    public static final int ORULEARROW=45;
    public static final int PLUS=46;
    public static final int POINT=47;
    public static final int QUERY=48;
    public static final int RANDOM=49;
    public static final int SANCTIONRULES=50;
    public static final int SEMI=51;
    public static final int SEND=52;
    public static final int SHRIEK=53;
    public static final int SQCLOSE=54;
    public static final int SQOPEN=55;
    public static final int STRING=56;
    public static final int TELL=57;
    public static final int THEN=58;
    public static final int TRUE=59;
    public static final int VAR=60;
    public static final int WS=61;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public OOPLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public OOPLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return OOPLParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g"; }


    	private static HashMap<String,Abstract_VarTerm> variables = new HashMap<String,Abstract_VarTerm>();
    	private String name = "";



    // $ANTLR start "mas"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:64:1: mas returns [Abstract_MAS mas] : org= organisation ;
    public final Abstract_MAS mas() throws RecognitionException {
        Abstract_MAS mas = null;


        Abstract_OOPLAgent org =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:64:32: (org= organisation )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:64:34: org= organisation
            {
            pushFollow(FOLLOW_organisation_in_mas85);
            org=organisation();

            state._fsp--;


            mas = org.getMAS();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return mas;
    }
    // $ANTLR end "mas"



    // $ANTLR start "organisation"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:67:1: organisation returns [Abstract_OOPLAgent org] : NAME w= word BRUTEFACTS (l= literal )* EFFECTRULES (er= erule )* COUNTSASRULES (car= carule )* SANCTIONRULES (sr= srule )* ;
    public final Abstract_OOPLAgent organisation() throws RecognitionException {
        Abstract_OOPLAgent org = null;


        String w =null;

        Abstract_Literal l =null;

        Abstract_EffectRule er =null;

        Abstract_CountsAsRule car =null;

        Abstract_SanctionRule sr =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:67:47: ( NAME w= word BRUTEFACTS (l= literal )* EFFECTRULES (er= erule )* COUNTSASRULES (car= carule )* SANCTIONRULES (sr= srule )* )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:67:49: NAME w= word BRUTEFACTS (l= literal )* EFFECTRULES (er= erule )* COUNTSASRULES (car= carule )* SANCTIONRULES (sr= srule )*
            {
            match(input,NAME,FOLLOW_NAME_in_organisation100); 

            pushFollow(FOLLOW_word_in_organisation104);
            w=word();

            state._fsp--;


            try {org = new Abstract_OOPLAgent(w);} catch (Exception e) {System.err.println(e);}

            match(input,BRUTEFACTS,FOLLOW_BRUTEFACTS_in_organisation112); 

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:68:15: (l= literal )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CONST||LA1_0==MINUS||(LA1_0 >= TRUE && LA1_0 <= VAR)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:68:16: l= literal
            	    {
            	    pushFollow(FOLLOW_literal_in_organisation117);
            	    l=literal();

            	    state._fsp--;


            	    org.addInitialBel(l);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,EFFECTRULES,FOLLOW_EFFECTRULES_in_organisation126); 

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:69:16: (er= erule )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CURLYOPEN) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:69:17: er= erule
            	    {
            	    pushFollow(FOLLOW_erule_in_organisation131);
            	    er=erule();

            	    state._fsp--;


            	    try {org.addEffectRule(er);} catch (Exception e) {System.err.println(e);}

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,COUNTSASRULES,FOLLOW_COUNTSASRULES_in_organisation141); 

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:70:18: (car= carule )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CURLYOPEN) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:70:19: car= carule
            	    {
            	    pushFollow(FOLLOW_carule_in_organisation146);
            	    car=carule();

            	    state._fsp--;


            	    try {org.addCountsAsRule(car);} catch (Exception e) {System.err.println(e);}

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,SANCTIONRULES,FOLLOW_SANCTIONRULES_in_organisation156); 

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:71:18: (sr= srule )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==CURLYOPEN) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:71:19: sr= srule
            	    {
            	    pushFollow(FOLLOW_srule_in_organisation161);
            	    sr=srule();

            	    state._fsp--;


            	    try {org.addSanctionRule(sr);} catch (Exception e) {System.err.println(e);}

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return org;
    }
    // $ANTLR end "organisation"



    // $ANTLR start "erule"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:73:1: erule returns [Abstract_EffectRule er] : CURLYOPEN pre= bpre CURLYCLOSE t= pred CURLYOPEN post= bpost CURLYCLOSE ;
    public final Abstract_EffectRule erule() throws RecognitionException {
        Abstract_EffectRule er = null;


        Abstract_Precondition pre =null;

        Abstract_Predicate t =null;

        Abstract_Postcondition post =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:73:40: ( CURLYOPEN pre= bpre CURLYCLOSE t= pred CURLYOPEN post= bpost CURLYCLOSE )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:73:42: CURLYOPEN pre= bpre CURLYCLOSE t= pred CURLYOPEN post= bpost CURLYCLOSE
            {
            match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_erule177); 

            pushFollow(FOLLOW_bpre_in_erule181);
            pre=bpre();

            state._fsp--;


            match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_erule183); 

            pushFollow(FOLLOW_pred_in_erule187);
            t=pred();

            state._fsp--;


            match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_erule189); 

            pushFollow(FOLLOW_bpost_in_erule198);
            post=bpost();

            state._fsp--;


            match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_erule200); 

            Abstract_Literal l = new Abstract_Literal(Abstract_Literal.LPos, 
            						new Abstract_Pred(t)); er = new Abstract_EffectRule(l, 
            						pre, post); variables.clear();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return er;
    }
    // $ANTLR end "erule"



    // $ANTLR start "carule"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:78:1: carule returns [Abstract_CountsAsRule car] : CURLYOPEN pre= bpre CURLYCLOSE CURLYOPEN pre2= ipre CURLYCLOSE ORULEARROW CURLYOPEN post= ipost CURLYCLOSE ;
    public final Abstract_CountsAsRule carule() throws RecognitionException {
        Abstract_CountsAsRule car = null;


        Abstract_Precondition pre =null;

        Abstract_Precondition pre2 =null;

        Abstract_Postcondition post =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:78:44: ( CURLYOPEN pre= bpre CURLYCLOSE CURLYOPEN pre2= ipre CURLYCLOSE ORULEARROW CURLYOPEN post= ipost CURLYCLOSE )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:78:46: CURLYOPEN pre= bpre CURLYCLOSE CURLYOPEN pre2= ipre CURLYCLOSE ORULEARROW CURLYOPEN post= ipost CURLYCLOSE
            {
            match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_carule219); 

            pushFollow(FOLLOW_bpre_in_carule223);
            pre=bpre();

            state._fsp--;


            match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_carule225); 

            match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_carule236); 

            pushFollow(FOLLOW_ipre_in_carule240);
            pre2=ipre();

            state._fsp--;


            match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_carule242); 

            match(input,ORULEARROW,FOLLOW_ORULEARROW_in_carule244); 

            match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_carule255); 

            pushFollow(FOLLOW_ipost_in_carule259);
            post=ipost();

            state._fsp--;


            match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_carule261); 

            car = new Abstract_CountsAsRule(pre, pre2, post); variables.clear();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return car;
    }
    // $ANTLR end "carule"



    // $ANTLR start "srule"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:82:1: srule returns [Abstract_SanctionRule sr] : CURLYOPEN pre= ipre CURLYCLOSE ORULEARROW CURLYOPEN post= bpost CURLYCLOSE ;
    public final Abstract_SanctionRule srule() throws RecognitionException {
        Abstract_SanctionRule sr = null;


        Abstract_Precondition pre =null;

        Abstract_Postcondition post =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:82:42: ( CURLYOPEN pre= ipre CURLYCLOSE ORULEARROW CURLYOPEN post= bpost CURLYCLOSE )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:82:44: CURLYOPEN pre= ipre CURLYCLOSE ORULEARROW CURLYOPEN post= bpost CURLYCLOSE
            {
            match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_srule283); 

            pushFollow(FOLLOW_ipre_in_srule287);
            pre=ipre();

            state._fsp--;


            match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_srule289); 

            match(input,ORULEARROW,FOLLOW_ORULEARROW_in_srule291); 

            match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_srule300); 

            pushFollow(FOLLOW_bpost_in_srule304);
            post=bpost();

            state._fsp--;


            match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_srule306); 

            sr = new Abstract_SanctionRule(pre, post); variables.clear();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return sr;
    }
    // $ANTLR end "srule"



    // $ANTLR start "ipre"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:86:1: ipre returns [Abstract_Precondition pre] : iprecondition[$pre] ( COMMA iprecondition[$pre] )* ;
    public final Abstract_Precondition ipre() throws RecognitionException {
        Abstract_Precondition pre = null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:86:42: ( iprecondition[$pre] ( COMMA iprecondition[$pre] )* )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:86:44: iprecondition[$pre] ( COMMA iprecondition[$pre] )*
            {
            pre = new Abstract_Precondition("inst");

            pushFollow(FOLLOW_iprecondition_in_ipre330);
            iprecondition(pre);

            state._fsp--;


            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:86:108: ( COMMA iprecondition[$pre] )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:86:109: COMMA iprecondition[$pre]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_ipre334); 

            	    pushFollow(FOLLOW_iprecondition_in_ipre336);
            	    iprecondition(pre);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return pre;
    }
    // $ANTLR end "ipre"



    // $ANTLR start "iprecondition"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:87:1: iprecondition[Abstract_Precondition pre] : (i= literal |eq= equation ) ;
    public final void iprecondition(Abstract_Precondition pre) throws RecognitionException {
        Abstract_Literal i =null;

        Abstract_Equation eq =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:87:42: ( (i= literal |eq= equation ) )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:87:44: (i= literal |eq= equation )
            {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:87:44: (i= literal |eq= equation )
            int alt6=2;
            switch ( input.LA(1) ) {
            case CONST:
            case TRUE:
                {
                alt6=1;
                }
                break;
            case MINUS:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==CONST||LA6_2==VAR) ) {
                    alt6=1;
                }
                else if ( (LA6_2==NUMBER) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case VAR:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==COMMA||LA6_3==CURLYCLOSE) ) {
                    alt6=1;
                }
                else if ( (LA6_3==DIV||LA6_3==EQ||LA6_3==LESS||(LA6_3 >= MINUS && LA6_3 <= MULT)||LA6_3==PLUS) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;

                }
                }
                break;
            case NUMBER:
            case OPEN:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:87:46: i= literal
                    {
                    pushFollow(FOLLOW_literal_in_iprecondition351);
                    i=literal();

                    state._fsp--;


                    pre.addLiteral(i);

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:88:53: eq= equation
                    {
                    pushFollow(FOLLOW_equation_in_iprecondition413);
                    eq=equation();

                    state._fsp--;


                    pre.addEquation(eq);

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "iprecondition"



    // $ANTLR start "bpre"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:90:1: bpre returns [Abstract_Precondition pre] : bprecondition[$pre] ;
    public final Abstract_Precondition bpre() throws RecognitionException {
        Abstract_Precondition pre = null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:90:42: ( bprecondition[$pre] )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:90:44: bprecondition[$pre]
            {
            pre = new Abstract_Precondition("brute");

            pushFollow(FOLLOW_bprecondition_in_bpre482);
            bprecondition(pre);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return pre;
    }
    // $ANTLR end "bpre"



    // $ANTLR start "bprecondition"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:91:1: bprecondition[Abstract_Precondition pre] : (b= literal ( COMMA bprecondition[$pre] )* |i= equation ( COMMA bprecondition[$pre] )* ) ;
    public final void bprecondition(Abstract_Precondition pre) throws RecognitionException {
        Abstract_Literal b =null;

        Abstract_Equation i =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:91:42: ( (b= literal ( COMMA bprecondition[$pre] )* |i= equation ( COMMA bprecondition[$pre] )* ) )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:91:44: (b= literal ( COMMA bprecondition[$pre] )* |i= equation ( COMMA bprecondition[$pre] )* )
            {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:91:44: (b= literal ( COMMA bprecondition[$pre] )* |i= equation ( COMMA bprecondition[$pre] )* )
            int alt9=2;
            switch ( input.LA(1) ) {
            case CONST:
            case TRUE:
                {
                alt9=1;
                }
                break;
            case MINUS:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==CONST||LA9_2==VAR) ) {
                    alt9=1;
                }
                else if ( (LA9_2==NUMBER) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;

                }
                }
                break;
            case VAR:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==COMMA||LA9_3==CURLYCLOSE) ) {
                    alt9=1;
                }
                else if ( (LA9_3==DIV||LA9_3==EQ||LA9_3==LESS||(LA9_3 >= MINUS && LA9_3 <= MULT)||LA9_3==PLUS) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;

                }
                }
                break;
            case NUMBER:
            case OPEN:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:91:46: b= literal ( COMMA bprecondition[$pre] )*
                    {
                    pushFollow(FOLLOW_literal_in_bprecondition495);
                    b=literal();

                    state._fsp--;


                    pre.addLiteral(b);

                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:91:81: ( COMMA bprecondition[$pre] )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:91:82: COMMA bprecondition[$pre]
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_bprecondition500); 

                    	    pushFollow(FOLLOW_bprecondition_in_bprecondition502);
                    	    bprecondition(pre);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:91:112: i= equation ( COMMA bprecondition[$pre] )*
                    {
                    pushFollow(FOLLOW_equation_in_bprecondition511);
                    i=equation();

                    state._fsp--;


                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:92:6: ( COMMA bprecondition[$pre] )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:92:7: COMMA bprecondition[$pre]
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_bprecondition520); 

                    	    pushFollow(FOLLOW_bprecondition_in_bprecondition522);
                    	    bprecondition(pre);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    pre.addEquation(i);

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bprecondition"



    // $ANTLR start "ipost"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:94:1: ipost returns [Abstract_Postcondition post] : ipostcondition[$post] ;
    public final Abstract_Postcondition ipost() throws RecognitionException {
        Abstract_Postcondition post = null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:94:45: ( ipostcondition[$post] )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:94:47: ipostcondition[$post]
            {
            post = new Abstract_Postcondition("inst");

            pushFollow(FOLLOW_ipostcondition_in_ipost542);
            ipostcondition(post);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return post;
    }
    // $ANTLR end "ipost"



    // $ANTLR start "ipostcondition"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:95:1: ipostcondition[Abstract_Postcondition post] : i= literal ( COMMA ipostcondition[$post] )* ;
    public final void ipostcondition(Abstract_Postcondition post) throws RecognitionException {
        Abstract_Literal i =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:95:45: (i= literal ( COMMA ipostcondition[$post] )* )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:95:47: i= literal ( COMMA ipostcondition[$post] )*
            {
            pushFollow(FOLLOW_literal_in_ipostcondition553);
            i=literal();

            state._fsp--;


            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:95:57: ( COMMA ipostcondition[$post] )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:95:58: COMMA ipostcondition[$post]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_ipostcondition556); 

            	    pushFollow(FOLLOW_ipostcondition_in_ipostcondition558);
            	    ipostcondition(post);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            post.addLiteral(i);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ipostcondition"



    // $ANTLR start "bpost"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:96:1: bpost returns [Abstract_Postcondition post] : bpostcondition[$post] ;
    public final Abstract_Postcondition bpost() throws RecognitionException {
        Abstract_Postcondition post = null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:96:45: ( bpostcondition[$post] )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:96:47: bpostcondition[$post]
            {
            post = new Abstract_Postcondition("brute");

            pushFollow(FOLLOW_bpostcondition_in_bpost576);
            bpostcondition(post);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return post;
    }
    // $ANTLR end "bpost"



    // $ANTLR start "bpostcondition"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:97:1: bpostcondition[Abstract_Postcondition post] : b= literal ( COMMA bpostcondition[$post] )* ;
    public final void bpostcondition(Abstract_Postcondition post) throws RecognitionException {
        Abstract_Literal b =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:97:45: (b= literal ( COMMA bpostcondition[$post] )* )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:97:47: b= literal ( COMMA bpostcondition[$post] )*
            {
            pushFollow(FOLLOW_literal_in_bpostcondition587);
            b=literal();

            state._fsp--;


            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:97:57: ( COMMA bpostcondition[$post] )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:97:58: COMMA bpostcondition[$post]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_bpostcondition590); 

            	    pushFollow(FOLLOW_bpostcondition_in_bpostcondition592);
            	    bpostcondition(post);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            post.addLiteral(b);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bpostcondition"



    // $ANTLR start "word"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:147:1: word returns [String s] : ( CONST | VAR ) ;
    public final String word() throws RecognitionException {
        String s = null;


        Token CONST1=null;
        Token VAR2=null;

        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:147:25: ( ( CONST | VAR ) )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:147:27: ( CONST | VAR )
            {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:147:27: ( CONST | VAR )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==CONST) ) {
                alt12=1;
            }
            else if ( (LA12_0==VAR) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:147:28: CONST
                    {
                    CONST1=(Token)match(input,CONST,FOLLOW_CONST_in_word891); 

                    s =CONST1.getText();

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:147:59: VAR
                    {
                    VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_word897); 

                    s =VAR2.getText();

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "word"



    // $ANTLR start "agentnameterm"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:149:1: agentnameterm returns [Abstract_StringTerm s] : ( CONST |v= var );
    public final Abstract_StringTerm agentnameterm() throws RecognitionException {
        Abstract_StringTerm s = null;


        Token CONST3=null;
        Abstract_VarTerm v =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:149:47: ( CONST |v= var )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==CONST) ) {
                alt13=1;
            }
            else if ( (LA13_0==VAR) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:149:49: CONST
                    {
                    CONST3=(Token)match(input,CONST,FOLLOW_CONST_in_agentnameterm997); 

                    s = new Abstract_StringTermImpl(CONST3.getText());

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:149:111: v= var
                    {
                    pushFollow(FOLLOW_var_in_agentnameterm1005);
                    v=var();

                    state._fsp--;


                    s = v;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "agentnameterm"



    // $ANTLR start "literal"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:152:1: literal returns [Abstract_Literal l] : ( ( TRUE | MINUS nt= pred ) |t= pred );
    public final Abstract_Literal literal() throws RecognitionException {
        Abstract_Literal l = null;


        Abstract_Predicate nt =null;

        Abstract_Predicate t =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:152:37: ( ( TRUE | MINUS nt= pred ) |t= pred )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==MINUS||LA15_0==TRUE) ) {
                alt15=1;
            }
            else if ( (LA15_0==CONST||LA15_0==VAR) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:152:40: ( TRUE | MINUS nt= pred )
                    {
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:152:40: ( TRUE | MINUS nt= pred )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==TRUE) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==MINUS) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;

                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:152:41: TRUE
                            {
                            match(input,TRUE,FOLLOW_TRUE_in_literal1021); 

                            l = new Abstract_Literal(Abstract_Literal.LTrue);

                            }
                            break;
                        case 2 :
                            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:153:5: MINUS nt= pred
                            {
                            match(input,MINUS,FOLLOW_MINUS_in_literal1032); 

                            pushFollow(FOLLOW_pred_in_literal1036);
                            nt=pred();

                            state._fsp--;



                            				if (nt instanceof Abstract_VarTerm) 
                            					{l = (Abstract_VarTerm) nt; l.setNegated(false);}
                            					else { l = new Abstract_Literal(Abstract_Literal.LNeg, new Abstract_Pred(nt));}

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:157:5: t= pred
                    {
                    pushFollow(FOLLOW_pred_in_literal1050);
                    t=pred();

                    state._fsp--;


                    if (t instanceof Abstract_VarTerm) 
                    				            {l = (Abstract_VarTerm) t;} 
                    				            else {l = new Abstract_Literal(Abstract_Literal.LPos, new Abstract_Pred(t));}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return l;
    }
    // $ANTLR end "literal"



    // $ANTLR start "pred"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:161:1: pred returns [Abstract_Structure t] : (v= var |f= function );
    public final Abstract_Predicate pred() throws RecognitionException {
        Abstract_Predicate t = null;


        Abstract_VarTerm v =null;

        Abstract_Predicate f =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:161:37: (v= var |f= function )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==VAR) ) {
                alt16=1;
            }
            else if ( (LA16_0==CONST) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:161:39: v= var
                    {
                    pushFollow(FOLLOW_var_in_pred1066);
                    v=var();

                    state._fsp--;


                    t = v;

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:161:59: f= function
                    {
                    pushFollow(FOLLOW_function_in_pred1073);
                    f=function();

                    state._fsp--;


                    t = f;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return t;
    }
    // $ANTLR end "pred"



    // $ANTLR start "function"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:162:1: function returns [Abstract_Structure f] : CONST ( OPEN terms[$f] CLOSE )? ;
    public final Abstract_Predicate function() throws RecognitionException {
        Abstract_Predicate f = null;


        Token CONST4=null;

        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:162:40: ( CONST ( OPEN terms[$f] CLOSE )? )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:162:42: CONST ( OPEN terms[$f] CLOSE )?
            {
            CONST4=(Token)match(input,CONST,FOLLOW_CONST_in_function1085); 

            f = new Abstract_Predicate(CONST4.getText());

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:162:97: ( OPEN terms[$f] CLOSE )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==OPEN) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:162:98: OPEN terms[$f] CLOSE
                    {
                    match(input,OPEN,FOLLOW_OPEN_in_function1090); 

                    pushFollow(FOLLOW_terms_in_function1092);
                    terms(f);

                    state._fsp--;


                    match(input,CLOSE,FOLLOW_CLOSE_in_function1095); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return f;
    }
    // $ANTLR end "function"



    // $ANTLR start "terms"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:164:1: terms[Abstract_Structure f] : t= term ( COMMA terms[$f] )? ;
    public final void terms(Abstract_Predicate f) throws RecognitionException {
        Abstract_Term t =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:164:29: (t= term ( COMMA terms[$f] )? )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:164:31: t= term ( COMMA terms[$f] )?
            {
            pushFollow(FOLLOW_term_in_terms1108);
            t=term();

            state._fsp--;


            f.addTerm(t);

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:164:58: ( COMMA terms[$f] )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==COMMA) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:164:59: COMMA terms[$f]
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_terms1113); 

                    pushFollow(FOLLOW_terms_in_terms1115);
                    terms(f);

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "terms"



    // $ANTLR start "term"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:165:1: term returns [Abstract_Term t] : (a= atom |s= stringterm |f= function );
    public final Abstract_Term term() throws RecognitionException {
        Abstract_Term t = null;


        Abstract_NumberTerm a =null;

        Abstract_StringTerm s =null;

        Abstract_Predicate f =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:165:31: (a= atom |s= stringterm |f= function )
            int alt19=3;
            switch ( input.LA(1) ) {
            case MINUS:
            case NUMBER:
            case OPEN:
            case VAR:
                {
                alt19=1;
                }
                break;
            case DOUBLEQUOTE:
                {
                alt19=2;
                }
                break;
            case CONST:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:165:34: a= atom
                    {
                    pushFollow(FOLLOW_atom_in_term1134);
                    a=atom();

                    state._fsp--;


                    t = a;

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:165:58: s= stringterm
                    {
                    pushFollow(FOLLOW_stringterm_in_term1144);
                    s=stringterm();

                    state._fsp--;


                    t = s;

                    }
                    break;
                case 3 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:165:88: f= function
                    {
                    pushFollow(FOLLOW_function_in_term1152);
                    f=function();

                    state._fsp--;


                    t = f;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return t;
    }
    // $ANTLR end "term"



    // $ANTLR start "atom"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:167:1: atom returns [Abstract_NumberTerm t] : (n= numberstring |v= var | OPEN a= arithexpr CLOSE );
    public final Abstract_NumberTerm atom() throws RecognitionException {
        Abstract_NumberTerm t = null;


        String n =null;

        Abstract_VarTerm v =null;

        Abstract_NumberTerm a =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:167:38: (n= numberstring |v= var | OPEN a= arithexpr CLOSE )
            int alt20=3;
            switch ( input.LA(1) ) {
            case MINUS:
            case NUMBER:
                {
                alt20=1;
                }
                break;
            case VAR:
                {
                alt20=2;
                }
                break;
            case OPEN:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:167:40: n= numberstring
                    {
                    pushFollow(FOLLOW_numberstring_in_atom1170);
                    n=numberstring();

                    state._fsp--;


                    t = new Abstract_NumberTermImpl(n);

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:168:6: v= var
                    {
                    pushFollow(FOLLOW_var_in_atom1183);
                    v=var();

                    state._fsp--;


                    t = v;

                    }
                    break;
                case 3 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:168:27: OPEN a= arithexpr CLOSE
                    {
                    match(input,OPEN,FOLLOW_OPEN_in_atom1189); 

                    pushFollow(FOLLOW_arithexpr_in_atom1193);
                    a=arithexpr();

                    state._fsp--;


                    match(input,CLOSE,FOLLOW_CLOSE_in_atom1195); 

                    t = a;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return t;
    }
    // $ANTLR end "atom"



    // $ANTLR start "stringterm"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:169:1: stringterm returns [Abstract_StringTerm s] : DOUBLEQUOTE STRING DOUBLEQUOTE ;
    public final Abstract_StringTerm stringterm() throws RecognitionException {
        Abstract_StringTerm s = null;


        Token STRING5=null;

        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:169:44: ( DOUBLEQUOTE STRING DOUBLEQUOTE )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:169:46: DOUBLEQUOTE STRING DOUBLEQUOTE
            {
            match(input,DOUBLEQUOTE,FOLLOW_DOUBLEQUOTE_in_stringterm1208); 

            STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_stringterm1211); 

            match(input,DOUBLEQUOTE,FOLLOW_DOUBLEQUOTE_in_stringterm1213); 

            s = new Abstract_StringTermImpl(STRING5.getText());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "stringterm"



    // $ANTLR start "var"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:171:1: var returns [Abstract_VarTerm v] : VAR ;
    public final Abstract_VarTerm var() throws RecognitionException {
        Abstract_VarTerm v = null;


        Token VAR6=null;

        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:171:34: ( VAR )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:171:36: VAR
            {
            VAR6=(Token)match(input,VAR,FOLLOW_VAR_in_var1227); 


            	if (variables.containsKey(VAR6.getText())) {
            		v = variables.get(VAR6.getText());
            		} else {
            		v = new Abstract_VarTerm(VAR6.getText());
            		variables.put(VAR6.getText(), v);
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "var"



    // $ANTLR start "numberstring"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:181:1: numberstring returns [String s] : ( MINUS )? (n1= NUMBER ( POINT n2= NUMBER )? ) ;
    public final String numberstring() throws RecognitionException {
        String s = null;


        Token n1=null;
        Token n2=null;

        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:181:33: ( ( MINUS )? (n1= NUMBER ( POINT n2= NUMBER )? ) )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:181:35: ( MINUS )? (n1= NUMBER ( POINT n2= NUMBER )? )
            {
            s = "";

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:181:46: ( MINUS )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==MINUS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:181:47: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_numberstring1245); 

                    s += "-";

                    }
                    break;

            }


            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:181:68: (n1= NUMBER ( POINT n2= NUMBER )? )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:181:69: n1= NUMBER ( POINT n2= NUMBER )?
            {
            n1=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_numberstring1254); 

            s += n1.getText();

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:182:6: ( POINT n2= NUMBER )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==POINT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:182:7: POINT n2= NUMBER
                    {
                    match(input,POINT,FOLLOW_POINT_in_numberstring1264); 

                    s += ".";

                    n2=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_numberstring1270); 

                    s += n2.getText();

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "numberstring"



    // $ANTLR start "equation"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:183:1: equation returns [Abstract_Equation eq] : a1= arithexpr oper= eqoper a2= arithexpr ;
    public final Abstract_Equation equation() throws RecognitionException {
        Abstract_Equation eq = null;


        Abstract_NumberTerm a1 =null;

        int oper =0;

        Abstract_NumberTerm a2 =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:183:40: (a1= arithexpr oper= eqoper a2= arithexpr )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:183:42: a1= arithexpr oper= eqoper a2= arithexpr
            {
            pushFollow(FOLLOW_arithexpr_in_equation1287);
            a1=arithexpr();

            state._fsp--;


            pushFollow(FOLLOW_eqoper_in_equation1291);
            oper=eqoper();

            state._fsp--;


            pushFollow(FOLLOW_arithexpr_in_equation1295);
            a2=arithexpr();

            state._fsp--;


            eq = new Abstract_Equation(a1, oper, a2);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return eq;
    }
    // $ANTLR end "equation"



    // $ANTLR start "eqoper"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:184:1: eqoper returns [int oper] : ( LESS | EQ );
    public final int eqoper() throws RecognitionException {
        int oper = 0;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:184:27: ( LESS | EQ )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LESS) ) {
                alt23=1;
            }
            else if ( (LA23_0==EQ) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:184:29: LESS
                    {
                    match(input,LESS,FOLLOW_LESS_in_eqoper1309); 

                    oper =Abstract_Equation.less;

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:184:68: EQ
                    {
                    match(input,EQ,FOLLOW_EQ_in_eqoper1315); 

                    oper =Abstract_Equation.equal;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return oper;
    }
    // $ANTLR end "eqoper"



    // $ANTLR start "arithexpr"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:186:1: arithexpr returns [Abstract_NumberTerm t] : m= multexpr (oper= addoper m1= multexpr )? ;
    public final Abstract_NumberTerm arithexpr() throws RecognitionException {
        Abstract_NumberTerm t = null;


        Abstract_NumberTerm m =null;

        int oper =0;

        Abstract_NumberTerm m1 =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:186:43: (m= multexpr (oper= addoper m1= multexpr )? )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:186:45: m= multexpr (oper= addoper m1= multexpr )?
            {
            pushFollow(FOLLOW_multexpr_in_arithexpr1331);
            m=multexpr();

            state._fsp--;


            t = m;

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:186:69: (oper= addoper m1= multexpr )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==MINUS||LA24_0==PLUS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:186:71: oper= addoper m1= multexpr
                    {
                    pushFollow(FOLLOW_addoper_in_arithexpr1339);
                    oper=addoper();

                    state._fsp--;


                    pushFollow(FOLLOW_multexpr_in_arithexpr1343);
                    m1=multexpr();

                    state._fsp--;


                    t = new Abstract_ArithExpr(m, oper, m1);

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return t;
    }
    // $ANTLR end "arithexpr"



    // $ANTLR start "multexpr"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:187:1: multexpr returns [Abstract_NumberTerm t] : a= atom (oper= multoper a1= atom )? ;
    public final Abstract_NumberTerm multexpr() throws RecognitionException {
        Abstract_NumberTerm t = null;


        Abstract_NumberTerm a =null;

        int oper =0;

        Abstract_NumberTerm a1 =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:187:42: (a= atom (oper= multoper a1= atom )? )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:187:44: a= atom (oper= multoper a1= atom )?
            {
            pushFollow(FOLLOW_atom_in_multexpr1360);
            a=atom();

            state._fsp--;


            t = a;

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:187:64: (oper= multoper a1= atom )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==DIV||(LA25_0 >= MOD && LA25_0 <= MULT)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:187:65: oper= multoper a1= atom
                    {
                    pushFollow(FOLLOW_multoper_in_multexpr1367);
                    oper=multoper();

                    state._fsp--;


                    pushFollow(FOLLOW_atom_in_multexpr1371);
                    a1=atom();

                    state._fsp--;


                    t = new Abstract_ArithExpr(a, oper, a1);

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return t;
    }
    // $ANTLR end "multexpr"



    // $ANTLR start "addoper"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:189:1: addoper returns [int oper] : ( PLUS | MINUS ) ;
    public final int addoper() throws RecognitionException {
        int oper = 0;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:189:28: ( ( PLUS | MINUS ) )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:189:30: ( PLUS | MINUS )
            {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:189:30: ( PLUS | MINUS )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==PLUS) ) {
                alt26=1;
            }
            else if ( (LA26_0==MINUS) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:189:31: PLUS
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_addoper1388); 

                    oper =Abstract_ArithExpr.plus;

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:189:70: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_addoper1393); 

                    oper =Abstract_ArithExpr.minus;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return oper;
    }
    // $ANTLR end "addoper"



    // $ANTLR start "multoper"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:190:1: multoper returns [int oper] : ( MULT | DIV | MOD ) ;
    public final int multoper() throws RecognitionException {
        int oper = 0;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:190:29: ( ( MULT | DIV | MOD ) )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:190:31: ( MULT | DIV | MOD )
            {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:190:31: ( MULT | DIV | MOD )
            int alt27=3;
            switch ( input.LA(1) ) {
            case MULT:
                {
                alt27=1;
                }
                break;
            case DIV:
                {
                alt27=2;
                }
                break;
            case MOD:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:190:32: MULT
                    {
                    match(input,MULT,FOLLOW_MULT_in_multoper1408); 

                    oper =Abstract_ArithExpr.times;

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:190:73: DIV
                    {
                    match(input,DIV,FOLLOW_DIV_in_multoper1414); 

                    oper =Abstract_ArithExpr.div;

                    }
                    break;
                case 3 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:190:111: MOD
                    {
                    match(input,MOD,FOLLOW_MOD_in_multoper1420); 

                    oper =Abstract_ArithExpr.mod;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return oper;
    }
    // $ANTLR end "multoper"

    // Delegated rules


 

    public static final BitSet FOLLOW_organisation_in_mas85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_organisation100 = new BitSet(new long[]{0x1000000000010000L});
    public static final BitSet FOLLOW_word_in_organisation104 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BRUTEFACTS_in_organisation112 = new BitSet(new long[]{0x1800001004010000L});
    public static final BitSet FOLLOW_literal_in_organisation117 = new BitSet(new long[]{0x1800001004010000L});
    public static final BitSet FOLLOW_EFFECTRULES_in_organisation126 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_erule_in_organisation131 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_COUNTSASRULES_in_organisation141 = new BitSet(new long[]{0x0004000000200000L});
    public static final BitSet FOLLOW_carule_in_organisation146 = new BitSet(new long[]{0x0004000000200000L});
    public static final BitSet FOLLOW_SANCTIONRULES_in_organisation156 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_srule_in_organisation161 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_CURLYOPEN_in_erule177 = new BitSet(new long[]{0x1800121000010000L});
    public static final BitSet FOLLOW_bpre_in_erule181 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CURLYCLOSE_in_erule183 = new BitSet(new long[]{0x1000000000010000L});
    public static final BitSet FOLLOW_pred_in_erule187 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CURLYOPEN_in_erule189 = new BitSet(new long[]{0x1800001000010000L});
    public static final BitSet FOLLOW_bpost_in_erule198 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CURLYCLOSE_in_erule200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLYOPEN_in_carule219 = new BitSet(new long[]{0x1800121000010000L});
    public static final BitSet FOLLOW_bpre_in_carule223 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CURLYCLOSE_in_carule225 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CURLYOPEN_in_carule236 = new BitSet(new long[]{0x1800121000010000L});
    public static final BitSet FOLLOW_ipre_in_carule240 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CURLYCLOSE_in_carule242 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ORULEARROW_in_carule244 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CURLYOPEN_in_carule255 = new BitSet(new long[]{0x1800001000010000L});
    public static final BitSet FOLLOW_ipost_in_carule259 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CURLYCLOSE_in_carule261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLYOPEN_in_srule283 = new BitSet(new long[]{0x1800121000010000L});
    public static final BitSet FOLLOW_ipre_in_srule287 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CURLYCLOSE_in_srule289 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ORULEARROW_in_srule291 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CURLYOPEN_in_srule300 = new BitSet(new long[]{0x1800001000010000L});
    public static final BitSet FOLLOW_bpost_in_srule304 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CURLYCLOSE_in_srule306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iprecondition_in_ipre330 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_ipre334 = new BitSet(new long[]{0x1800121000010000L});
    public static final BitSet FOLLOW_iprecondition_in_ipre336 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_literal_in_iprecondition351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equation_in_iprecondition413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bprecondition_in_bpre482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_bprecondition495 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_bprecondition500 = new BitSet(new long[]{0x1800121000010000L});
    public static final BitSet FOLLOW_bprecondition_in_bprecondition502 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_equation_in_bprecondition511 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_bprecondition520 = new BitSet(new long[]{0x1800121000010000L});
    public static final BitSet FOLLOW_bprecondition_in_bprecondition522 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ipostcondition_in_ipost542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_ipostcondition553 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_ipostcondition556 = new BitSet(new long[]{0x1800001000010000L});
    public static final BitSet FOLLOW_ipostcondition_in_ipostcondition558 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_bpostcondition_in_bpost576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_bpostcondition587 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_bpostcondition590 = new BitSet(new long[]{0x1800001000010000L});
    public static final BitSet FOLLOW_bpostcondition_in_bpostcondition592 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_CONST_in_word891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_word897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_agentnameterm997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_agentnameterm1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_literal1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_literal1032 = new BitSet(new long[]{0x1000000000010000L});
    public static final BitSet FOLLOW_pred_in_literal1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pred_in_literal1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_pred1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_pred1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_function1085 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_OPEN_in_function1090 = new BitSet(new long[]{0x1000121001010000L});
    public static final BitSet FOLLOW_terms_in_function1092 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_in_function1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_terms1108 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_terms1113 = new BitSet(new long[]{0x1000121001010000L});
    public static final BitSet FOLLOW_terms_in_terms1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_term1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringterm_in_term1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_term1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberstring_in_atom1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_atom1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_in_atom1189 = new BitSet(new long[]{0x1000121000000000L});
    public static final BitSet FOLLOW_arithexpr_in_atom1193 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_in_atom1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLEQUOTE_in_stringterm1208 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_in_stringterm1211 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOUBLEQUOTE_in_stringterm1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_var1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_numberstring1245 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NUMBER_in_numberstring1254 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_POINT_in_numberstring1264 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NUMBER_in_numberstring1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithexpr_in_equation1287 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_eqoper_in_equation1291 = new BitSet(new long[]{0x1000121000000000L});
    public static final BitSet FOLLOW_arithexpr_in_equation1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_eqoper1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_eqoper1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multexpr_in_arithexpr1331 = new BitSet(new long[]{0x0000401000000002L});
    public static final BitSet FOLLOW_addoper_in_arithexpr1339 = new BitSet(new long[]{0x1000121000000000L});
    public static final BitSet FOLLOW_multexpr_in_arithexpr1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_multexpr1360 = new BitSet(new long[]{0x0000006000800002L});
    public static final BitSet FOLLOW_multoper_in_multexpr1367 = new BitSet(new long[]{0x1000121000000000L});
    public static final BitSet FOLLOW_atom_in_multexpr1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_addoper1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_addoper1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULT_in_multoper1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_multoper1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_multoper1420 = new BitSet(new long[]{0x0000000000000002L});

}