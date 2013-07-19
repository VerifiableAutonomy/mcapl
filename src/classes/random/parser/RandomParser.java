// $ANTLR 3.4 /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g 2012-07-11 14:15:49

package random.parser;

import ail.syntax.ast.*;
import random.syntax.ast.*;
import java.util.HashMap;


import mcaplantlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RandomParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTIONS", "CLOSE", "COMMA", "COMMENT", "CONST", "DIV", "DOUBLEQUOTE", "EQ", "LESS", "MINUS", "MOD", "MULT", "NAME", "NUMBER", "OPEN", "PLUS", "POINT", "SEND", "STRING", "VAR", "WS"
    };

    public static final int EOF=-1;
    public static final int ACTIONS=4;
    public static final int CLOSE=5;
    public static final int COMMA=6;
    public static final int COMMENT=7;
    public static final int CONST=8;
    public static final int DIV=9;
    public static final int DOUBLEQUOTE=10;
    public static final int EQ=11;
    public static final int LESS=12;
    public static final int MINUS=13;
    public static final int MOD=14;
    public static final int MULT=15;
    public static final int NAME=16;
    public static final int NUMBER=17;
    public static final int OPEN=18;
    public static final int PLUS=19;
    public static final int POINT=20;
    public static final int SEND=21;
    public static final int STRING=22;
    public static final int VAR=23;
    public static final int WS=24;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public RandomParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public RandomParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return RandomParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g"; }


    	private static HashMap<String,Abstract_VarTerm> variables = new HashMap<String,Abstract_VarTerm>();
    	private Abstract_Literal agentname = new Abstract_Literal("");
    	


    // $ANTLR start "randomagents"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:30:1: randomagents returns [ArrayList<Abstract_RandomAgent> rags] : (r= randomagent )+ ;
    public final ArrayList<Abstract_RandomAgent> randomagents() throws RecognitionException {
        ArrayList<Abstract_RandomAgent> rags = null;


        Abstract_RandomAgent r =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:30:59: ( (r= randomagent )+ )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:30:61: (r= randomagent )+
            {
            rags=new ArrayList<Abstract_RandomAgent>();

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:31:4: (r= randomagent )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ACTIONS||LA1_0==NAME) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:31:5: r= randomagent
            	    {
            	    pushFollow(FOLLOW_randomagent_in_randomagents53);
            	    r=randomagent();

            	    state._fsp--;


            	    rags.add(r);

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
        return rags;
    }
    // $ANTLR end "randomagents"



    // $ANTLR start "randomagent"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:33:1: randomagent returns [Abstract_RandomAgent r] : ( NAME w= word )? ACTIONS (a= action )+ ;
    public final Abstract_RandomAgent randomagent() throws RecognitionException {
        Abstract_RandomAgent r = null;


        String w =null;

        Abstract_Action a =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:33:46: ( ( NAME w= word )? ACTIONS (a= action )+ )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:34:3: ( NAME w= word )? ACTIONS (a= action )+
            {
            try {r = new Abstract_RandomAgent();} catch (Exception e) {System.err.println(e);}

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:35:3: ( NAME w= word )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NAME) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:35:4: NAME w= word
                    {
                    match(input,NAME,FOLLOW_NAME_in_randomagent77); 

                    pushFollow(FOLLOW_word_in_randomagent81);
                    w=word();

                    state._fsp--;


                    r.setAgName(w);

                    }
                    break;

            }


            match(input,ACTIONS,FOLLOW_ACTIONS_in_randomagent89); 

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:36:11: (a= action )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CONST||LA3_0==SEND||LA3_0==VAR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:36:12: a= action
            	    {
            	    pushFollow(FOLLOW_action_in_randomagent94);
            	    a=action();

            	    state._fsp--;


            	    r.addAction(a);

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
        return r;
    }
    // $ANTLR end "randomagent"



    // $ANTLR start "action"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:40:1: action returns [Abstract_Action a] : ( ( SEND OPEN an= agentnameterm COMMA t= pred CLOSE ) |t= pred );
    public final Abstract_Action action() throws RecognitionException {
        Abstract_Action a = null;


        Abstract_StringTerm an =null;

        Abstract_Predicate t =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:40:36: ( ( SEND OPEN an= agentnameterm COMMA t= pred CLOSE ) |t= pred )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SEND) ) {
                alt4=1;
            }
            else if ( (LA4_0==CONST||LA4_0==VAR) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:40:38: ( SEND OPEN an= agentnameterm COMMA t= pred CLOSE )
                    {
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:40:38: ( SEND OPEN an= agentnameterm COMMA t= pred CLOSE )
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:40:39: SEND OPEN an= agentnameterm COMMA t= pred CLOSE
                    {
                    match(input,SEND,FOLLOW_SEND_in_action115); 

                    match(input,OPEN,FOLLOW_OPEN_in_action117); 

                    pushFollow(FOLLOW_agentnameterm_in_action121);
                    an=agentnameterm();

                    state._fsp--;


                    match(input,COMMA,FOLLOW_COMMA_in_action123); 

                    pushFollow(FOLLOW_pred_in_action127);
                    t=pred();

                    state._fsp--;


                    match(input,CLOSE,FOLLOW_CLOSE_in_action129); 

                    a = new Abstract_SendAction(an, 1, t);

                    }


                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:41:2: t= pred
                    {
                    pushFollow(FOLLOW_pred_in_action140);
                    t=pred();

                    state._fsp--;


                    a = new Abstract_Action(t, Abstract_Action.normalAction);

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
        return a;
    }
    // $ANTLR end "action"



    // $ANTLR start "word"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:46:1: word returns [String s] : ( CONST | VAR ) ;
    public final String word() throws RecognitionException {
        String s = null;


        Token CONST1=null;
        Token VAR2=null;

        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:46:25: ( ( CONST | VAR ) )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:46:27: ( CONST | VAR )
            {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:46:27: ( CONST | VAR )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CONST) ) {
                alt5=1;
            }
            else if ( (LA5_0==VAR) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:46:28: CONST
                    {
                    CONST1=(Token)match(input,CONST,FOLLOW_CONST_in_word170); 

                    s =CONST1.getText();

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:46:59: VAR
                    {
                    VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_word176); 

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
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:47:1: agentnameterm returns [Abstract_StringTerm s] : ( CONST |v= var );
    public final Abstract_StringTerm agentnameterm() throws RecognitionException {
        Abstract_StringTerm s = null;


        Token CONST3=null;
        Abstract_VarTerm v =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:47:47: ( CONST |v= var )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==CONST) ) {
                alt6=1;
            }
            else if ( (LA6_0==VAR) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:47:49: CONST
                    {
                    CONST3=(Token)match(input,CONST,FOLLOW_CONST_in_agentnameterm275); 

                    s = new Abstract_StringTermImpl(CONST3.getText());

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:47:111: v= var
                    {
                    pushFollow(FOLLOW_var_in_agentnameterm283);
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



    // $ANTLR start "pred"
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:48:1: pred returns [Abstract_Structure t] : (v= var |f= function );
    public final Abstract_Predicate pred() throws RecognitionException {
        Abstract_Predicate t = null;


        Abstract_VarTerm v =null;

        Abstract_Predicate f =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:48:37: (v= var |f= function )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==VAR) ) {
                alt7=1;
            }
            else if ( (LA7_0==CONST) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:48:39: v= var
                    {
                    pushFollow(FOLLOW_var_in_pred298);
                    v=var();

                    state._fsp--;


                    t = v;

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:48:59: f= function
                    {
                    pushFollow(FOLLOW_function_in_pred305);
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
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:49:1: function returns [Abstract_Structure f] : CONST ( OPEN terms[$f] CLOSE )? ;
    public final Abstract_Predicate function() throws RecognitionException {
        Abstract_Predicate f = null;


        Token CONST4=null;

        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:49:40: ( CONST ( OPEN terms[$f] CLOSE )? )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:49:42: CONST ( OPEN terms[$f] CLOSE )?
            {
            CONST4=(Token)match(input,CONST,FOLLOW_CONST_in_function317); 

            f = new Abstract_Predicate(CONST4.getText());

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:49:97: ( OPEN terms[$f] CLOSE )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==OPEN) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:49:98: OPEN terms[$f] CLOSE
                    {
                    match(input,OPEN,FOLLOW_OPEN_in_function322); 

                    pushFollow(FOLLOW_terms_in_function324);
                    terms(f);

                    state._fsp--;


                    match(input,CLOSE,FOLLOW_CLOSE_in_function327); 

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
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:51:1: terms[Abstract_Structure f] : t= term ( COMMA terms[$f] )? ;
    public final void terms(Abstract_Predicate f) throws RecognitionException {
        Abstract_Term t =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:51:29: (t= term ( COMMA terms[$f] )? )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:51:31: t= term ( COMMA terms[$f] )?
            {
            pushFollow(FOLLOW_term_in_terms340);
            t=term();

            state._fsp--;


            f.addTerm(t);

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:51:58: ( COMMA terms[$f] )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==COMMA) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:51:59: COMMA terms[$f]
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_terms345); 

                    pushFollow(FOLLOW_terms_in_terms347);
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
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:52:1: term returns [Abstract_Term t] : (a= atom |s= stringterm |f= function );
    public final Abstract_Term term() throws RecognitionException {
        Abstract_Term t = null;


        Abstract_NumberTerm a =null;

        Abstract_StringTerm s =null;

        Abstract_Predicate f =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:52:31: (a= atom |s= stringterm |f= function )
            int alt10=3;
            switch ( input.LA(1) ) {
            case MINUS:
            case NUMBER:
            case OPEN:
            case VAR:
                {
                alt10=1;
                }
                break;
            case DOUBLEQUOTE:
                {
                alt10=2;
                }
                break;
            case CONST:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:52:34: a= atom
                    {
                    pushFollow(FOLLOW_atom_in_term366);
                    a=atom();

                    state._fsp--;


                    t = a;

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:52:58: s= stringterm
                    {
                    pushFollow(FOLLOW_stringterm_in_term376);
                    s=stringterm();

                    state._fsp--;


                    t = s;

                    }
                    break;
                case 3 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:52:88: f= function
                    {
                    pushFollow(FOLLOW_function_in_term384);
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
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:54:1: atom returns [Abstract_NumberTerm t] : (n= numberstring |v= var | OPEN a= arithexpr CLOSE );
    public final Abstract_NumberTerm atom() throws RecognitionException {
        Abstract_NumberTerm t = null;


        String n =null;

        Abstract_VarTerm v =null;

        Abstract_NumberTerm a =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:54:38: (n= numberstring |v= var | OPEN a= arithexpr CLOSE )
            int alt11=3;
            switch ( input.LA(1) ) {
            case MINUS:
            case NUMBER:
                {
                alt11=1;
                }
                break;
            case VAR:
                {
                alt11=2;
                }
                break;
            case OPEN:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:54:40: n= numberstring
                    {
                    pushFollow(FOLLOW_numberstring_in_atom402);
                    n=numberstring();

                    state._fsp--;


                    t = new Abstract_NumberTermImpl(n);

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:55:6: v= var
                    {
                    pushFollow(FOLLOW_var_in_atom415);
                    v=var();

                    state._fsp--;


                    t = v;

                    }
                    break;
                case 3 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:55:27: OPEN a= arithexpr CLOSE
                    {
                    match(input,OPEN,FOLLOW_OPEN_in_atom421); 

                    pushFollow(FOLLOW_arithexpr_in_atom425);
                    a=arithexpr();

                    state._fsp--;


                    match(input,CLOSE,FOLLOW_CLOSE_in_atom427); 

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
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:56:1: stringterm returns [Abstract_StringTerm s] : DOUBLEQUOTE STRING DOUBLEQUOTE ;
    public final Abstract_StringTerm stringterm() throws RecognitionException {
        Abstract_StringTerm s = null;


        Token STRING5=null;

        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:56:44: ( DOUBLEQUOTE STRING DOUBLEQUOTE )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:56:46: DOUBLEQUOTE STRING DOUBLEQUOTE
            {
            match(input,DOUBLEQUOTE,FOLLOW_DOUBLEQUOTE_in_stringterm440); 

            STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_stringterm443); 

            match(input,DOUBLEQUOTE,FOLLOW_DOUBLEQUOTE_in_stringterm445); 

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
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:58:1: var returns [Abstract_VarTerm v] : VAR ;
    public final Abstract_VarTerm var() throws RecognitionException {
        Abstract_VarTerm v = null;


        Token VAR6=null;

        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:58:34: ( VAR )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:58:36: VAR
            {
            VAR6=(Token)match(input,VAR,FOLLOW_VAR_in_var459); 


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
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:67:1: numberstring returns [String s] : ( MINUS )? (n1= NUMBER ( POINT n2= NUMBER )? ) ;
    public final String numberstring() throws RecognitionException {
        String s = null;


        Token n1=null;
        Token n2=null;

        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:67:33: ( ( MINUS )? (n1= NUMBER ( POINT n2= NUMBER )? ) )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:67:35: ( MINUS )? (n1= NUMBER ( POINT n2= NUMBER )? )
            {
            s = "";

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:67:46: ( MINUS )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==MINUS) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:67:47: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_numberstring476); 

                    s += "-";

                    }
                    break;

            }


            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:67:68: (n1= NUMBER ( POINT n2= NUMBER )? )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:67:69: n1= NUMBER ( POINT n2= NUMBER )?
            {
            n1=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_numberstring485); 

            s += n1.getText();

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:68:6: ( POINT n2= NUMBER )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==POINT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:68:7: POINT n2= NUMBER
                    {
                    match(input,POINT,FOLLOW_POINT_in_numberstring495); 

                    s += ".";

                    n2=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_numberstring501); 

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
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:69:1: equation returns [Abstract_Equation eq] : a1= arithexpr oper= eqoper a2= arithexpr ;
    public final Abstract_Equation equation() throws RecognitionException {
        Abstract_Equation eq = null;


        Abstract_NumberTerm a1 =null;

        int oper =0;

        Abstract_NumberTerm a2 =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:69:40: (a1= arithexpr oper= eqoper a2= arithexpr )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:69:42: a1= arithexpr oper= eqoper a2= arithexpr
            {
            pushFollow(FOLLOW_arithexpr_in_equation518);
            a1=arithexpr();

            state._fsp--;


            pushFollow(FOLLOW_eqoper_in_equation522);
            oper=eqoper();

            state._fsp--;


            pushFollow(FOLLOW_arithexpr_in_equation526);
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
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:70:1: eqoper returns [int oper] : ( LESS | EQ );
    public final int eqoper() throws RecognitionException {
        int oper = 0;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:70:27: ( LESS | EQ )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LESS) ) {
                alt14=1;
            }
            else if ( (LA14_0==EQ) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:70:29: LESS
                    {
                    match(input,LESS,FOLLOW_LESS_in_eqoper540); 

                    oper =Abstract_Equation.less;

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:70:68: EQ
                    {
                    match(input,EQ,FOLLOW_EQ_in_eqoper546); 

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
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:72:1: arithexpr returns [Abstract_NumberTerm t] : m= multexpr (oper= addoper m1= multexpr )? ;
    public final Abstract_NumberTerm arithexpr() throws RecognitionException {
        Abstract_NumberTerm t = null;


        Abstract_NumberTerm m =null;

        int oper =0;

        Abstract_NumberTerm m1 =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:72:43: (m= multexpr (oper= addoper m1= multexpr )? )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:72:45: m= multexpr (oper= addoper m1= multexpr )?
            {
            pushFollow(FOLLOW_multexpr_in_arithexpr562);
            m=multexpr();

            state._fsp--;


            t = m;

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:72:69: (oper= addoper m1= multexpr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==MINUS||LA15_0==PLUS) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:72:71: oper= addoper m1= multexpr
                    {
                    pushFollow(FOLLOW_addoper_in_arithexpr570);
                    oper=addoper();

                    state._fsp--;


                    pushFollow(FOLLOW_multexpr_in_arithexpr574);
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
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:73:1: multexpr returns [Abstract_NumberTerm t] : a= atom (oper= multoper a1= atom )? ;
    public final Abstract_NumberTerm multexpr() throws RecognitionException {
        Abstract_NumberTerm t = null;


        Abstract_NumberTerm a =null;

        int oper =0;

        Abstract_NumberTerm a1 =null;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:73:42: (a= atom (oper= multoper a1= atom )? )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:73:44: a= atom (oper= multoper a1= atom )?
            {
            pushFollow(FOLLOW_atom_in_multexpr591);
            a=atom();

            state._fsp--;


            t = a;

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:73:64: (oper= multoper a1= atom )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==DIV||(LA16_0 >= MOD && LA16_0 <= MULT)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:73:65: oper= multoper a1= atom
                    {
                    pushFollow(FOLLOW_multoper_in_multexpr598);
                    oper=multoper();

                    state._fsp--;


                    pushFollow(FOLLOW_atom_in_multexpr602);
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
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:75:1: addoper returns [int oper] : ( PLUS | MINUS ) ;
    public final int addoper() throws RecognitionException {
        int oper = 0;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:75:28: ( ( PLUS | MINUS ) )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:75:30: ( PLUS | MINUS )
            {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:75:30: ( PLUS | MINUS )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==PLUS) ) {
                alt17=1;
            }
            else if ( (LA17_0==MINUS) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:75:31: PLUS
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_addoper619); 

                    oper =Abstract_ArithExpr.plus;

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:75:70: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_addoper624); 

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
    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:76:1: multoper returns [int oper] : ( MULT | DIV | MOD ) ;
    public final int multoper() throws RecognitionException {
        int oper = 0;


        try {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:76:29: ( ( MULT | DIV | MOD ) )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:76:31: ( MULT | DIV | MOD )
            {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:76:31: ( MULT | DIV | MOD )
            int alt18=3;
            switch ( input.LA(1) ) {
            case MULT:
                {
                alt18=1;
                }
                break;
            case DIV:
                {
                alt18=2;
                }
                break;
            case MOD:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:76:32: MULT
                    {
                    match(input,MULT,FOLLOW_MULT_in_multoper639); 

                    oper =Abstract_ArithExpr.times;

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:76:73: DIV
                    {
                    match(input,DIV,FOLLOW_DIV_in_multoper645); 

                    oper =Abstract_ArithExpr.div;

                    }
                    break;
                case 3 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:76:111: MOD
                    {
                    match(input,MOD,FOLLOW_MOD_in_multoper651); 

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


 

    public static final BitSet FOLLOW_randomagent_in_randomagents53 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_NAME_in_randomagent77 = new BitSet(new long[]{0x0000000000800100L});
    public static final BitSet FOLLOW_word_in_randomagent81 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ACTIONS_in_randomagent89 = new BitSet(new long[]{0x0000000000A00100L});
    public static final BitSet FOLLOW_action_in_randomagent94 = new BitSet(new long[]{0x0000000000A00102L});
    public static final BitSet FOLLOW_SEND_in_action115 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_OPEN_in_action117 = new BitSet(new long[]{0x0000000000800100L});
    public static final BitSet FOLLOW_agentnameterm_in_action121 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_action123 = new BitSet(new long[]{0x0000000000800100L});
    public static final BitSet FOLLOW_pred_in_action127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CLOSE_in_action129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pred_in_action140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_word170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_word176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_agentnameterm275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_agentnameterm283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_pred298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_pred305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_function317 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_OPEN_in_function322 = new BitSet(new long[]{0x0000000000862500L});
    public static final BitSet FOLLOW_terms_in_function324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CLOSE_in_function327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_terms340 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_terms345 = new BitSet(new long[]{0x0000000000862500L});
    public static final BitSet FOLLOW_terms_in_terms347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_term366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringterm_in_term376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_term384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberstring_in_atom402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_atom415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_in_atom421 = new BitSet(new long[]{0x0000000000862000L});
    public static final BitSet FOLLOW_arithexpr_in_atom425 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CLOSE_in_atom427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLEQUOTE_in_stringterm440 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_STRING_in_stringterm443 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DOUBLEQUOTE_in_stringterm445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_var459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_numberstring476 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NUMBER_in_numberstring485 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_POINT_in_numberstring495 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NUMBER_in_numberstring501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithexpr_in_equation518 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_eqoper_in_equation522 = new BitSet(new long[]{0x0000000000862000L});
    public static final BitSet FOLLOW_arithexpr_in_equation526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_eqoper540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_eqoper546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multexpr_in_arithexpr562 = new BitSet(new long[]{0x0000000000082002L});
    public static final BitSet FOLLOW_addoper_in_arithexpr570 = new BitSet(new long[]{0x0000000000862000L});
    public static final BitSet FOLLOW_multexpr_in_arithexpr574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_multexpr591 = new BitSet(new long[]{0x000000000000C202L});
    public static final BitSet FOLLOW_multoper_in_multexpr598 = new BitSet(new long[]{0x0000000000862000L});
    public static final BitSet FOLLOW_atom_in_multexpr602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_addoper619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_addoper624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULT_in_multoper639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_multoper645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_multoper651 = new BitSet(new long[]{0x0000000000000002L});

}