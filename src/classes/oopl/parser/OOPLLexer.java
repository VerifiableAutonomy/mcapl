// $ANTLR 3.4 /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g 2012-11-13 16:46:53

package oopl.parser;


import mcaplantlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class OOPLLexer extends Lexer {
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

        public int plain_nesting = 0;
        public int sq_nesting = 0;
        public int curly_nesting = 0;
        public boolean stringterm = false;
        public boolean preconditiontypemode = false;
        public boolean condaction = false;
        public boolean actionspec = false;
        public boolean start = true;
        public int commacount = 0;


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public OOPLLexer() {} 
    public OOPLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public OOPLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g"; }

    // $ANTLR start "LITTEST"
    public final void mLITTEST() throws RecognitionException {
        try {
            int _type = LITTEST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:100:9: ( '??' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:100:11: '??'
            {
            match("??"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LITTEST"

    // $ANTLR start "TELL"
    public final void mTELL() throws RecognitionException {
        try {
            int _type = TELL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:101:6: ( ':tell' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:101:8: ':tell'
            {
            match(":tell"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TELL"

    // $ANTLR start "OOPL"
    public final void mOOPL() throws RecognitionException {
        try {
            int _type = OOPL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:102:6: ( 'OOPL' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:102:8: 'OOPL'
            {
            match("OOPL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OOPL"

    // $ANTLR start "RANDOM"
    public final void mRANDOM() throws RecognitionException {
        try {
            int _type = RANDOM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:103:8: ({...}? => 'RANDOM' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:103:10: {...}? => 'RANDOM'
            {
            if ( !((plain_nesting == 0 & curly_nesting == 0)) ) {
                throw new FailedPredicateException(input, "RANDOM", "plain_nesting == 0 & curly_nesting == 0");
            }

            match("RANDOM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RANDOM"

    // $ANTLR start "BRUTEFACTS"
    public final void mBRUTEFACTS() throws RecognitionException {
        try {
            int _type = BRUTEFACTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:105:2: ( ':Brute Facts:' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:105:4: ':Brute Facts:'
            {
            match(":Brute Facts:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BRUTEFACTS"

    // $ANTLR start "EFFECTRULES"
    public final void mEFFECTRULES() throws RecognitionException {
        try {
            int _type = EFFECTRULES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:107:2: ( ':Effect Rules:' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:107:4: ':Effect Rules:'
            {
            match(":Effect Rules:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EFFECTRULES"

    // $ANTLR start "COUNTSASRULES"
    public final void mCOUNTSASRULES() throws RecognitionException {
        try {
            int _type = COUNTSASRULES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:109:2: ( ':CountsAs Rules:' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:109:4: ':CountsAs Rules:'
            {
            match(":CountsAs Rules:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COUNTSASRULES"

    // $ANTLR start "SANCTIONRULES"
    public final void mSANCTIONRULES() throws RecognitionException {
        try {
            int _type = SANCTIONRULES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:111:2: ( ':Sanction Rules:' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:111:4: ':Sanction Rules:'
            {
            match(":Sanction Rules:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SANCTIONRULES"

    // $ANTLR start "ORULEARROW"
    public final void mORULEARROW() throws RecognitionException {
        try {
            int _type = ORULEARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:112:12: ( '=>' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:112:14: '=>'
            {
            match("=>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ORULEARROW"

    // $ANTLR start "ACTIONS"
    public final void mACTIONS() throws RecognitionException {
        try {
            int _type = ACTIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:114:9: ( ':Actions:' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:114:11: ':Actions:'
            {
            match(":Actions:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ACTIONS"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:118:6: ( ':name:' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:118:8: ':name:'
            {
            match(":name:"); 



            actionspec=false;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:119:6: ({...}? => 'True' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:119:8: {...}? => 'True'
            {
            if ( !((curly_nesting > 0 && plain_nesting == 0)) ) {
                throw new FailedPredicateException(input, "TRUE", "curly_nesting > 0 && plain_nesting == 0");
            }

            match("True"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:120:4: ({...}? => 'if' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:120:6: {...}? => 'if'
            {
            if ( !((condaction)) ) {
                throw new FailedPredicateException(input, "IF", "condaction");
            }

            match("if"); 



            preconditiontypemode = true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:121:6: ({...}? => 'then' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:121:8: {...}? => 'then'
            {
            if ( !((condaction)) ) {
                throw new FailedPredicateException(input, "THEN", "condaction");
            }

            match("then"); 



            preconditiontypemode = false;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "BELIEVE"
    public final void mBELIEVE() throws RecognitionException {
        try {
            int _type = BELIEVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:122:9: ({...}? => 'B' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:122:11: {...}? => 'B'
            {
            if ( !(((preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0))) ) {
                throw new FailedPredicateException(input, "BELIEVE", "(preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0)");
            }

            match('B'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BELIEVE"

    // $ANTLR start "HAVEGOAL"
    public final void mHAVEGOAL() throws RecognitionException {
        try {
            int _type = HAVEGOAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:124:2: ({...}? => 'G' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:124:4: {...}? => 'G'
            {
            if ( !(((preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0))) ) {
                throw new FailedPredicateException(input, "HAVEGOAL", "(preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0)");
            }

            match('G'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HAVEGOAL"

    // $ANTLR start "IN_CONTENT"
    public final void mIN_CONTENT() throws RecognitionException {
        try {
            int _type = IN_CONTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:126:2: ({...}? => 'N' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:126:4: {...}? => 'N'
            {
            if ( !(((preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0))) ) {
                throw new FailedPredicateException(input, "IN_CONTENT", "(preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0)");
            }

            match('N'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN_CONTENT"

    // $ANTLR start "IN_CONTEXT"
    public final void mIN_CONTEXT() throws RecognitionException {
        try {
            int _type = IN_CONTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:128:2: ({...}? => 'X' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:128:4: {...}? => 'X'
            {
            if ( !(((preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0))) ) {
                throw new FailedPredicateException(input, "IN_CONTEXT", "(preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0)");
            }

            match('X'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN_CONTEXT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:129:5: ( '&' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:129:8: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "NUMMARKER"
    public final void mNUMMARKER() throws RecognitionException {
        try {
            int _type = NUMMARKER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:131:2: ( '_' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:131:4: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMMARKER"

    // $ANTLR start "BRULEARROW"
    public final void mBRULEARROW() throws RecognitionException {
        try {
            int _type = BRULEARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:132:12: ( ':-' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:132:14: ':-'
            {
            match(":-"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BRULEARROW"

    // $ANTLR start "BRULES"
    public final void mBRULES() throws RecognitionException {
        try {
            int _type = BRULES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:133:9: ( ':Belief Rules:' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:133:11: ':Belief Rules:'
            {
            match(":Belief Rules:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BRULES"

    // $ANTLR start "DEL"
    public final void mDEL() throws RecognitionException {
        try {
            int _type = DEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:134:5: ({...}? => 'del' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:134:7: {...}? => 'del'
            {
            if ( !(((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {
                throw new FailedPredicateException(input, "DEL", "(condaction==true && preconditiontypemode==false && plain_nesting==0)");
            }

            match("del"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEL"

    // $ANTLR start "ADOPT"
    public final void mADOPT() throws RecognitionException {
        try {
            int _type = ADOPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:135:7: ({...}? => 'adopt' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:135:9: {...}? => 'adopt'
            {
            if ( !(((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {
                throw new FailedPredicateException(input, "ADOPT", "(condaction==true && preconditiontypemode==false && plain_nesting==0)");
            }

            match("adopt"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADOPT"

    // $ANTLR start "CLOSEKEY"
    public final void mCLOSEKEY() throws RecognitionException {
        try {
            int _type = CLOSEKEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:136:10: ({...}? => 'close' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:136:12: {...}? => 'close'
            {
            if ( !(((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {
                throw new FailedPredicateException(input, "CLOSEKEY", "(condaction==true && preconditiontypemode==false && plain_nesting==0)");
            }

            match("close"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSEKEY"

    // $ANTLR start "SEND"
    public final void mSEND() throws RecognitionException {
        try {
            int _type = SEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:137:6: ({...}? => 'send' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:137:8: {...}? => 'send'
            {
            if ( !(((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {
                throw new FailedPredicateException(input, "SEND", "(condaction==true && preconditiontypemode==false && plain_nesting==0)");
            }

            match("send"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEND"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:138:6: ({...}? => 'drop' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:138:8: {...}? => 'drop'
            {
            if ( !(((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {
                throw new FailedPredicateException(input, "DROP", "(condaction==true && preconditiontypemode==false && plain_nesting==0)");
            }

            match("drop"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "INS"
    public final void mINS() throws RecognitionException {
        try {
            int _type = INS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:139:5: ({...}? => 'ins' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:139:7: {...}? => 'ins'
            {
            if ( !(((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {
                throw new FailedPredicateException(input, "INS", "(condaction==true && preconditiontypemode==false && plain_nesting==0)");
            }

            match("ins"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INS"

    // $ANTLR start "CONTENT"
    public final void mCONTENT() throws RecognitionException {
        try {
            int _type = CONTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:140:9: ({...}? => 'nt' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:140:11: {...}? => 'nt'
            {
            if ( !(((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {
                throw new FailedPredicateException(input, "CONTENT", "(condaction==true && preconditiontypemode==false && plain_nesting==0)");
            }

            match("nt"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTENT"

    // $ANTLR start "CONTEXT"
    public final void mCONTEXT() throws RecognitionException {
        try {
            int _type = CONTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:141:9: ({...}? => 'xt' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:141:11: {...}? => 'xt'
            {
            if ( !(((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {
                throw new FailedPredicateException(input, "CONTEXT", "(condaction==true && preconditiontypemode==false && plain_nesting==0)");
            }

            match("xt"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTEXT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:194:5: ( '/*' ( . )* '*/' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:194:7: '/*' ( . )* '*/'
            {
            match("/*"); 



            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:194:12: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1 >= '\u0000' && LA1_1 <= '.')||(LA1_1 >= '0' && LA1_1 <= '\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= ')')||(LA1_0 >= '+' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:194:12: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:197:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:197:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:197:12: (~ ( '\\n' | '\\r' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:197:26: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:197:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:199:8: ( ( '\\r' )? '\\n' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:199:9: ( '\\r' )? '\\n'
            {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:199:9: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:199:9: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:200:5: ( ( ' ' | '\\t' )+ )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:200:9: ( ' ' | '\\t' )+
            {
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:200:9: ( ' ' | '\\t' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "OPEN"
    public final void mOPEN() throws RecognitionException {
        try {
            int _type = OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:203:6: ( '(' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:203:9: '('
            {
            match('('); 

            plain_nesting++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN"

    // $ANTLR start "CLOSE"
    public final void mCLOSE() throws RecognitionException {
        try {
            int _type = CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:204:7: ( ')' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:204:9: ')'
            {
            match(')'); 

            plain_nesting--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE"

    // $ANTLR start "SQOPEN"
    public final void mSQOPEN() throws RecognitionException {
        try {
            int _type = SQOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:205:8: ( '[' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:205:10: '['
            {
            match('['); 

            sq_nesting++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQOPEN"

    // $ANTLR start "SQCLOSE"
    public final void mSQCLOSE() throws RecognitionException {
        try {
            int _type = SQCLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:206:9: ( ']' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:206:11: ']'
            {
            match(']'); 

            sq_nesting--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQCLOSE"

    // $ANTLR start "CURLYOPEN"
    public final void mCURLYOPEN() throws RecognitionException {
        try {
            int _type = CURLYOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:207:11: ( '{' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:207:13: '{'
            {
            match('{'); 

            curly_nesting++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CURLYOPEN"

    // $ANTLR start "CURLYCLOSE"
    public final void mCURLYCLOSE() throws RecognitionException {
        try {
            int _type = CURLYCLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:208:12: ( '}' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:208:14: '}'
            {
            match('}'); 

            curly_nesting--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CURLYCLOSE"

    // $ANTLR start "DOUBLEQUOTE"
    public final void mDOUBLEQUOTE() throws RecognitionException {
        try {
            int _type = DOUBLEQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:210:2: ( '\"' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:210:4: '\"'
            {
            match('\"'); 

            if (stringterm) {stringterm = false;} else {stringterm = true;}

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLEQUOTE"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:212:8: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:212:10: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            {
            if ( !((stringterm)) ) {
                throw new FailedPredicateException(input, "STRING", "stringterm");
            }

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:212:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:213:8: ({...}? => 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:213:11: {...}? => 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( !((!stringterm)) ) {
                throw new FailedPredicateException(input, "CONST", "!stringterm");
            }

            matchRange('a','z'); 

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:213:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:214:5: ({...}? => 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:214:7: {...}? => 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( !((!stringterm)) ) {
                throw new FailedPredicateException(input, "VAR", "!stringterm");
            }

            matchRange('A','Z'); 

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:214:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:215:8: ({...}? => '0' .. '9' ( '0' .. '9' )* )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:215:10: {...}? => '0' .. '9' ( '0' .. '9' )*
            {
            if ( !((!stringterm)) ) {
                throw new FailedPredicateException(input, "NUMBER", "!stringterm");
            }

            matchRange('0','9'); 

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:215:35: ( '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:218:6: ( '<' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:218:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:219:4: ( '==' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:219:7: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:220:7: ( '.' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:220:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:221:6: ( '*' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:221:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:222:6: ( '+' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:222:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:223:7: ( '-' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:223:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:224:5: ( '/' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:224:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:225:5: ( '%' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:225:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "SHRIEK"
    public final void mSHRIEK() throws RecognitionException {
        try {
            int _type = SHRIEK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:227:8: ( '!' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:227:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHRIEK"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:228:7: ( ',' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:228:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:229:6: ( ';' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:229:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:230:7: ( ':' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:230:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "QUERY"
    public final void mQUERY() throws RecognitionException {
        try {
            int _type = QUERY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:231:7: ( '?' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:231:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUERY"

    public void mTokens() throws RecognitionException {
        // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:8: ( LITTEST | TELL | OOPL | RANDOM | BRUTEFACTS | EFFECTRULES | COUNTSASRULES | SANCTIONRULES | ORULEARROW | ACTIONS | NAME | TRUE | IF | THEN | BELIEVE | HAVEGOAL | IN_CONTENT | IN_CONTEXT | AND | NUMMARKER | BRULEARROW | BRULES | DEL | ADOPT | CLOSEKEY | SEND | DROP | INS | CONTENT | CONTEXT | COMMENT | LINE_COMMENT | NEWLINE | WS | OPEN | CLOSE | SQOPEN | SQCLOSE | CURLYOPEN | CURLYCLOSE | DOUBLEQUOTE | STRING | CONST | VAR | NUMBER | LESS | EQ | POINT | MULT | PLUS | MINUS | DIV | MOD | SHRIEK | COMMA | SEMI | COLON | QUERY )
        int alt10=58;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:10: LITTEST
                {
                mLITTEST(); 


                }
                break;
            case 2 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:18: TELL
                {
                mTELL(); 


                }
                break;
            case 3 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:23: OOPL
                {
                mOOPL(); 


                }
                break;
            case 4 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:28: RANDOM
                {
                mRANDOM(); 


                }
                break;
            case 5 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:35: BRUTEFACTS
                {
                mBRUTEFACTS(); 


                }
                break;
            case 6 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:46: EFFECTRULES
                {
                mEFFECTRULES(); 


                }
                break;
            case 7 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:58: COUNTSASRULES
                {
                mCOUNTSASRULES(); 


                }
                break;
            case 8 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:72: SANCTIONRULES
                {
                mSANCTIONRULES(); 


                }
                break;
            case 9 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:86: ORULEARROW
                {
                mORULEARROW(); 


                }
                break;
            case 10 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:97: ACTIONS
                {
                mACTIONS(); 


                }
                break;
            case 11 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:105: NAME
                {
                mNAME(); 


                }
                break;
            case 12 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:110: TRUE
                {
                mTRUE(); 


                }
                break;
            case 13 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:115: IF
                {
                mIF(); 


                }
                break;
            case 14 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:118: THEN
                {
                mTHEN(); 


                }
                break;
            case 15 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:123: BELIEVE
                {
                mBELIEVE(); 


                }
                break;
            case 16 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:131: HAVEGOAL
                {
                mHAVEGOAL(); 


                }
                break;
            case 17 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:140: IN_CONTENT
                {
                mIN_CONTENT(); 


                }
                break;
            case 18 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:151: IN_CONTEXT
                {
                mIN_CONTEXT(); 


                }
                break;
            case 19 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:162: AND
                {
                mAND(); 


                }
                break;
            case 20 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:166: NUMMARKER
                {
                mNUMMARKER(); 


                }
                break;
            case 21 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:176: BRULEARROW
                {
                mBRULEARROW(); 


                }
                break;
            case 22 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:187: BRULES
                {
                mBRULES(); 


                }
                break;
            case 23 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:194: DEL
                {
                mDEL(); 


                }
                break;
            case 24 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:198: ADOPT
                {
                mADOPT(); 


                }
                break;
            case 25 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:204: CLOSEKEY
                {
                mCLOSEKEY(); 


                }
                break;
            case 26 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:213: SEND
                {
                mSEND(); 


                }
                break;
            case 27 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:218: DROP
                {
                mDROP(); 


                }
                break;
            case 28 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:223: INS
                {
                mINS(); 


                }
                break;
            case 29 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:227: CONTENT
                {
                mCONTENT(); 


                }
                break;
            case 30 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:235: CONTEXT
                {
                mCONTEXT(); 


                }
                break;
            case 31 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:243: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 32 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:251: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;
            case 33 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:264: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 34 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:272: WS
                {
                mWS(); 


                }
                break;
            case 35 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:275: OPEN
                {
                mOPEN(); 


                }
                break;
            case 36 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:280: CLOSE
                {
                mCLOSE(); 


                }
                break;
            case 37 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:286: SQOPEN
                {
                mSQOPEN(); 


                }
                break;
            case 38 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:293: SQCLOSE
                {
                mSQCLOSE(); 


                }
                break;
            case 39 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:301: CURLYOPEN
                {
                mCURLYOPEN(); 


                }
                break;
            case 40 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:311: CURLYCLOSE
                {
                mCURLYCLOSE(); 


                }
                break;
            case 41 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:322: DOUBLEQUOTE
                {
                mDOUBLEQUOTE(); 


                }
                break;
            case 42 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:334: STRING
                {
                mSTRING(); 


                }
                break;
            case 43 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:341: CONST
                {
                mCONST(); 


                }
                break;
            case 44 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:347: VAR
                {
                mVAR(); 


                }
                break;
            case 45 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:351: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 46 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:358: LESS
                {
                mLESS(); 


                }
                break;
            case 47 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:363: EQ
                {
                mEQ(); 


                }
                break;
            case 48 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:366: POINT
                {
                mPOINT(); 


                }
                break;
            case 49 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:372: MULT
                {
                mMULT(); 


                }
                break;
            case 50 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:377: PLUS
                {
                mPLUS(); 


                }
                break;
            case 51 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:382: MINUS
                {
                mMINUS(); 


                }
                break;
            case 52 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:388: DIV
                {
                mDIV(); 


                }
                break;
            case 53 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:392: MOD
                {
                mMOD(); 


                }
                break;
            case 54 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:396: SHRIEK
                {
                mSHRIEK(); 


                }
                break;
            case 55 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:403: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 56 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:409: SEMI
                {
                mSEMI(); 


                }
                break;
            case 57 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:414: COLON
                {
                mCOLON(); 


                }
                break;
            case 58 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/oopl/parser/OOPL.g:1:420: QUERY
                {
                mQUERY(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\54\1\65\2\67\1\uffff\1\67\2\77\1\102\1\103\1\104\1\105"+
        "\1\uffff\1\106\6\77\1\121\11\uffff\1\77\1\67\1\122\24\uffff\1\67"+
        "\1\uffff\2\67\2\uffff\1\67\1\132\1\77\1\uffff\2\77\6\uffff\5\77"+
        "\1\150\1\151\4\uffff\1\122\2\uffff\1\67\1\uffff\2\67\1\uffff\1\157"+
        "\1\uffff\1\77\5\uffff\1\161\4\77\3\uffff\1\170\1\67\1\172\2\uffff"+
        "\1\174\1\uffff\1\176\2\77\1\u0081\3\uffff\1\67\5\uffff\1\u0087\1"+
        "\u0088\2\uffff\1\u008a\12\uffff";
    static final String DFA10_eofS =
        "\u008e\uffff";
    static final String DFA10_minS =
        "\1\11\1\77\1\55\2\60\1\75\7\60\1\uffff\7\60\1\52\11\uffff\3\60\14"+
        "\uffff\1\145\7\uffff\1\60\1\0\2\60\2\uffff\3\60\1\0\2\60\5\0\1\uffff"+
        "\7\60\3\uffff\1\0\1\60\2\uffff\1\60\1\uffff\2\60\1\0\1\60\1\uffff"+
        "\1\60\5\uffff\5\60\2\0\1\uffff\3\60\1\uffff\1\0\1\60\1\0\4\60\2"+
        "\uffff\1\0\1\60\1\0\1\uffff\1\0\1\uffff\1\0\2\60\1\0\1\uffff\1\60"+
        "\3\uffff\2\0\1\uffff\1\0\3\uffff";
    static final String DFA10_maxS =
        "\1\175\1\77\1\164\2\172\1\76\7\172\1\uffff\7\172\1\57\11\uffff\3"+
        "\172\14\uffff\1\162\7\uffff\1\172\1\0\2\172\2\uffff\3\172\1\0\2"+
        "\172\5\0\1\uffff\7\172\3\uffff\1\0\1\172\2\uffff\1\172\1\uffff\2"+
        "\172\1\0\1\172\1\uffff\1\172\5\uffff\5\172\2\0\1\uffff\3\172\1\uffff"+
        "\1\0\1\172\1\0\4\172\2\uffff\1\0\1\172\1\0\1\uffff\1\0\1\uffff\1"+
        "\0\2\172\1\0\1\uffff\1\172\3\uffff\2\0\1\uffff\1\0\3\uffff";
    static final String DFA10_acceptS =
        "\15\uffff\1\23\10\uffff\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
        "\1\51\3\uffff\1\56\1\60\1\61\1\62\1\63\1\65\1\66\1\67\1\70\1\1\1"+
        "\72\1\2\1\uffff\1\6\1\7\1\10\1\12\1\13\1\25\1\71\4\uffff\1\11\1"+
        "\57\13\uffff\1\52\7\uffff\1\37\1\40\1\64\2\uffff\1\5\1\26\1\uffff"+
        "\1\54\4\uffff\1\53\1\uffff\1\17\1\20\1\21\1\22\1\24\7\uffff\1\55"+
        "\3\uffff\1\15\7\uffff\1\35\1\36\3\uffff\1\34\1\uffff\1\27\4\uffff"+
        "\1\3\1\uffff\1\14\1\16\1\33\2\uffff\1\32\1\uffff\1\30\1\31\1\4";
    static final String DFA10_specialS =
        "\1\10\2\uffff\1\77\1\65\1\uffff\1\20\1\5\1\47\1\62\1\53\1\55\1\52"+
        "\1\uffff\1\21\1\71\1\23\1\24\1\26\1\15\1\0\12\uffff\1\44\1\36\1"+
        "\4\24\uffff\1\27\1\13\1\73\1\40\2\uffff\1\57\1\31\1\42\1\11\1\14"+
        "\1\17\1\100\1\102\1\101\1\76\1\6\1\uffff\1\51\1\45\1\110\1\75\1"+
        "\64\1\25\1\30\3\uffff\1\12\1\54\2\uffff\1\32\1\uffff\1\37\1\56\1"+
        "\67\1\22\1\uffff\1\16\5\uffff\1\41\1\43\1\106\1\72\1\63\1\111\1"+
        "\107\1\uffff\1\46\1\35\1\113\1\uffff\1\104\1\33\1\114\1\7\1\103"+
        "\1\74\1\3\2\uffff\1\60\1\34\1\66\1\uffff\1\70\1\uffff\1\105\1\1"+
        "\1\2\1\115\1\uffff\1\50\3\uffff\1\112\1\116\1\uffff\1\61\3\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\27\1\26\2\uffff\1\26\22\uffff\1\27\1\50\1\36\2\uffff\1\47"+
            "\1\15\1\uffff\1\30\1\31\1\44\1\45\1\51\1\46\1\43\1\25\12\41"+
            "\1\2\1\52\1\42\1\5\1\uffff\1\1\1\uffff\1\40\1\11\4\40\1\12\6"+
            "\40\1\13\1\3\2\40\1\4\1\40\1\6\3\40\1\14\2\40\1\32\1\uffff\1"+
            "\33\1\uffff\1\16\1\uffff\1\20\1\37\1\21\1\17\4\37\1\7\4\37\1"+
            "\23\4\37\1\22\1\10\3\37\1\24\2\37\1\34\1\uffff\1\35",
            "\1\53",
            "\1\64\23\uffff\1\62\1\56\1\60\1\uffff\1\57\15\uffff\1\61\32"+
            "\uffff\1\63\5\uffff\1\55",
            "\12\70\7\uffff\16\70\1\66\13\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\1\71\31\70\4\uffff\1\70\1\uffff\32\70",
            "\1\73\1\72",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\74\10\70",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\5\100\1\75\7\100"+
            "\1\76\14\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\7\100\1\101\22"+
            "\100",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\4\100\1\110\14"+
            "\100\1\111\10\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\3\100\1\112\26"+
            "\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\13\100\1\113\16"+
            "\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\4\100\1\114\25"+
            "\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\23\100\1\115\6"+
            "\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\23\100\1\116\6"+
            "\100",
            "\1\117\4\uffff\1\120",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\123\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\125\14\uffff\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\17\70\1\126\12\70\4\uffff\1\70\1\uffff\32\70",
            "\1\uffff",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\15\70\1\130\14\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\131\5\70",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\133\7"+
            "\100",
            "\1\uffff",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\4\100\1\135\25"+
            "\100",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\13\100\1\143\16"+
            "\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\16\100\1\144\13"+
            "\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\16\100\1\145\13"+
            "\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\16\100\1\146\13"+
            "\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\15\100\1\147\14"+
            "\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "",
            "\1\uffff",
            "\12\123\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "",
            "",
            "\12\70\7\uffff\13\70\1\153\16\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\3\70\1\154\26\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\155\25\70",
            "\1\uffff",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\15\100\1\160\14"+
            "\100",
            "",
            "",
            "",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\17\100\1\162\12"+
            "\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\17\100\1\163\12"+
            "\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\164\7"+
            "\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\3\100\1\165\26"+
            "\100",
            "\1\uffff",
            "\1\uffff",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\16\70\1\171\13\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\uffff",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\uffff",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\23\100\1\177\6"+
            "\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\4\100\1\u0080"+
            "\25\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "\1\uffff",
            "\12\70\7\uffff\14\70\1\u0083\15\70\4\uffff\1\70\1\uffff\32"+
            "\70",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\uffff",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( LITTEST | TELL | OOPL | RANDOM | BRUTEFACTS | EFFECTRULES | COUNTSASRULES | SANCTIONRULES | ORULEARROW | ACTIONS | NAME | TRUE | IF | THEN | BELIEVE | HAVEGOAL | IN_CONTENT | IN_CONTEXT | AND | NUMMARKER | BRULEARROW | BRULES | DEL | ADOPT | CLOSEKEY | SEND | DROP | INS | CONTENT | CONTEXT | COMMENT | LINE_COMMENT | NEWLINE | WS | OPEN | CLOSE | SQOPEN | SQCLOSE | CURLYOPEN | CURLYCLOSE | DOUBLEQUOTE | STRING | CONST | VAR | NUMBER | LESS | EQ | POINT | MULT | PLUS | MINUS | DIV | MOD | SHRIEK | COMMA | SEMI | COLON | QUERY );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_20 = input.LA(1);

                         
                        int index10_20 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_20=='t') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 78;}

                        else if ( ((LA10_20 >= '0' && LA10_20 <= '9')||(LA10_20 >= 'A' && LA10_20 <= 'Z')||LA10_20=='_'||(LA10_20 >= 'a' && LA10_20 <= 's')||(LA10_20 >= 'u' && LA10_20 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_20);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA10_127 = input.LA(1);

                         
                        int index10_127 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_127 >= '0' && LA10_127 <= '9')||(LA10_127 >= 'A' && LA10_127 <= 'Z')||LA10_127=='_'||(LA10_127 >= 'a' && LA10_127 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 135;

                         
                        input.seek(index10_127);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA10_128 = input.LA(1);

                         
                        int index10_128 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_128 >= '0' && LA10_128 <= '9')||(LA10_128 >= 'A' && LA10_128 <= 'Z')||LA10_128=='_'||(LA10_128 >= 'a' && LA10_128 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 136;

                         
                        input.seek(index10_128);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA10_117 = input.LA(1);

                         
                        int index10_117 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_117 >= '0' && LA10_117 <= '9')||(LA10_117 >= 'A' && LA10_117 <= 'Z')||LA10_117=='_'||(LA10_117 >= 'a' && LA10_117 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 129;

                         
                        input.seek(index10_117);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA10_33 = input.LA(1);

                         
                        int index10_33 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_33 >= '0' && LA10_33 <= '9')) && (((!stringterm)||(stringterm)))) {s = 83;}

                        else if ( ((LA10_33 >= 'A' && LA10_33 <= 'Z')||LA10_33=='_'||(LA10_33 >= 'a' && LA10_33 <= 'z')) && ((stringterm))) {s = 71;}

                        else s = 82;

                         
                        input.seek(index10_33);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_7=='f') && (((condaction)||(stringterm)||(!stringterm)))) {s = 61;}

                        else if ( (LA10_7=='n') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 62;}

                        else if ( ((LA10_7 >= '0' && LA10_7 <= '9')||(LA10_7 >= 'A' && LA10_7 <= 'Z')||LA10_7=='_'||(LA10_7 >= 'a' && LA10_7 <= 'e')||(LA10_7 >= 'g' && LA10_7 <= 'm')||(LA10_7 >= 'o' && LA10_7 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_7);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA10_70 = input.LA(1);

                         
                        int index10_70 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((stringterm)))) ) {s = 98;}

                        else if ( ((stringterm)) ) {s = 71;}

                         
                        input.seek(index10_70);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA10_114 = input.LA(1);

                         
                        int index10_114 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_114 >= '0' && LA10_114 <= '9')||(LA10_114 >= 'A' && LA10_114 <= 'Z')||LA10_114=='_'||(LA10_114 >= 'a' && LA10_114 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 126;

                         
                        input.seek(index10_114);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA10_0 = input.LA(1);

                         
                        int index10_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_0=='?') ) {s = 1;}

                        else if ( (LA10_0==':') ) {s = 2;}

                        else if ( (LA10_0=='O') ) {s = 3;}

                        else if ( (LA10_0=='R') && (((plain_nesting == 0 & curly_nesting == 0)||(!stringterm)||(stringterm)))) {s = 4;}

                        else if ( (LA10_0=='=') ) {s = 5;}

                        else if ( (LA10_0=='T') && (((curly_nesting > 0 && plain_nesting == 0)||(!stringterm)||(stringterm)))) {s = 6;}

                        else if ( (LA10_0=='i') && (((condaction)||(!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 7;}

                        else if ( (LA10_0=='t') && (((condaction)||(!stringterm)||(stringterm)))) {s = 8;}

                        else if ( (LA10_0=='B') && (((!stringterm)||(stringterm)||((preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0))))) {s = 9;}

                        else if ( (LA10_0=='G') && (((!stringterm)||(stringterm)||((preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0))))) {s = 10;}

                        else if ( (LA10_0=='N') && (((!stringterm)||(stringterm)||((preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0))))) {s = 11;}

                        else if ( (LA10_0=='X') && (((!stringterm)||(stringterm)||((preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0))))) {s = 12;}

                        else if ( (LA10_0=='&') ) {s = 13;}

                        else if ( (LA10_0=='_') ) {s = 14;}

                        else if ( (LA10_0=='d') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 15;}

                        else if ( (LA10_0=='a') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 16;}

                        else if ( (LA10_0=='c') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 17;}

                        else if ( (LA10_0=='s') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 18;}

                        else if ( (LA10_0=='n') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 19;}

                        else if ( (LA10_0=='x') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 20;}

                        else if ( (LA10_0=='/') ) {s = 21;}

                        else if ( (LA10_0=='\n'||LA10_0=='\r') ) {s = 22;}

                        else if ( (LA10_0=='\t'||LA10_0==' ') ) {s = 23;}

                        else if ( (LA10_0=='(') ) {s = 24;}

                        else if ( (LA10_0==')') ) {s = 25;}

                        else if ( (LA10_0=='[') ) {s = 26;}

                        else if ( (LA10_0==']') ) {s = 27;}

                        else if ( (LA10_0=='{') ) {s = 28;}

                        else if ( (LA10_0=='}') ) {s = 29;}

                        else if ( (LA10_0=='\"') ) {s = 30;}

                        else if ( (LA10_0=='b'||(LA10_0 >= 'e' && LA10_0 <= 'h')||(LA10_0 >= 'j' && LA10_0 <= 'm')||(LA10_0 >= 'o' && LA10_0 <= 'r')||(LA10_0 >= 'u' && LA10_0 <= 'w')||(LA10_0 >= 'y' && LA10_0 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 31;}

                        else if ( (LA10_0=='A'||(LA10_0 >= 'C' && LA10_0 <= 'F')||(LA10_0 >= 'H' && LA10_0 <= 'M')||(LA10_0 >= 'P' && LA10_0 <= 'Q')||LA10_0=='S'||(LA10_0 >= 'U' && LA10_0 <= 'W')||(LA10_0 >= 'Y' && LA10_0 <= 'Z')) && (((!stringterm)||(stringterm)))) {s = 32;}

                        else if ( ((LA10_0 >= '0' && LA10_0 <= '9')) && (((!stringterm)||(stringterm)))) {s = 33;}

                        else if ( (LA10_0=='<') ) {s = 34;}

                        else if ( (LA10_0=='.') ) {s = 35;}

                        else if ( (LA10_0=='*') ) {s = 36;}

                        else if ( (LA10_0=='+') ) {s = 37;}

                        else if ( (LA10_0=='-') ) {s = 38;}

                        else if ( (LA10_0=='%') ) {s = 39;}

                        else if ( (LA10_0=='!') ) {s = 40;}

                        else if ( (LA10_0==',') ) {s = 41;}

                        else if ( (LA10_0==';') ) {s = 42;}

                         
                        input.seek(index10_0);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA10_63 = input.LA(1);

                         
                        int index10_63 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 92;}

                         
                        input.seek(index10_63);

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA10_82 = input.LA(1);

                         
                        int index10_82 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 106;}

                         
                        input.seek(index10_82);

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA10_55 = input.LA(1);

                         
                        int index10_55 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 87;}

                         
                        input.seek(index10_55);

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA10_64 = input.LA(1);

                         
                        int index10_64 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_64 >= '0' && LA10_64 <= '9')||(LA10_64 >= 'A' && LA10_64 <= 'Z')||LA10_64=='_'||(LA10_64 >= 'a' && LA10_64 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_64);

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA10_19 = input.LA(1);

                         
                        int index10_19 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_19=='t') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 77;}

                        else if ( ((LA10_19 >= '0' && LA10_19 <= '9')||(LA10_19 >= 'A' && LA10_19 <= 'Z')||LA10_19=='_'||(LA10_19 >= 'a' && LA10_19 <= 's')||(LA10_19 >= 'u' && LA10_19 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_19);

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA10_93 = input.LA(1);

                         
                        int index10_93 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_93=='n') && (((condaction)||(stringterm)||(!stringterm)))) {s = 112;}

                        else if ( ((LA10_93 >= '0' && LA10_93 <= '9')||(LA10_93 >= 'A' && LA10_93 <= 'Z')||LA10_93=='_'||(LA10_93 >= 'a' && LA10_93 <= 'm')||(LA10_93 >= 'o' && LA10_93 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_93);

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA10_65 = input.LA(1);

                         
                        int index10_65 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_65=='e') && (((condaction)||(!stringterm)||(stringterm)))) {s = 93;}

                        else if ( ((LA10_65 >= '0' && LA10_65 <= '9')||(LA10_65 >= 'A' && LA10_65 <= 'Z')||LA10_65=='_'||(LA10_65 >= 'a' && LA10_65 <= 'd')||(LA10_65 >= 'f' && LA10_65 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_65);

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_6=='r') && (((curly_nesting > 0 && plain_nesting == 0)||(!stringterm)||(stringterm)))) {s = 60;}

                        else if ( ((LA10_6 >= '0' && LA10_6 <= '9')||(LA10_6 >= 'A' && LA10_6 <= 'Z')||LA10_6=='_'||(LA10_6 >= 'a' && LA10_6 <= 'q')||(LA10_6 >= 's' && LA10_6 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 55;

                         
                        input.seek(index10_6);

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA10_14 = input.LA(1);

                         
                        int index10_14 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_14 >= '0' && LA10_14 <= '9')||(LA10_14 >= 'A' && LA10_14 <= 'Z')||LA10_14=='_'||(LA10_14 >= 'a' && LA10_14 <= 'z')) && ((stringterm))) {s = 71;}

                        else s = 70;

                         
                        input.seek(index10_14);

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA10_91 = input.LA(1);

                         
                        int index10_91 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_91 >= '0' && LA10_91 <= '9')||(LA10_91 >= 'A' && LA10_91 <= 'Z')||LA10_91=='_'||(LA10_91 >= 'a' && LA10_91 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 111;

                         
                        input.seek(index10_91);

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA10_16 = input.LA(1);

                         
                        int index10_16 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_16=='d') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 74;}

                        else if ( ((LA10_16 >= '0' && LA10_16 <= '9')||(LA10_16 >= 'A' && LA10_16 <= 'Z')||LA10_16=='_'||(LA10_16 >= 'a' && LA10_16 <= 'c')||(LA10_16 >= 'e' && LA10_16 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_16);

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA10_17 = input.LA(1);

                         
                        int index10_17 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_17=='l') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 75;}

                        else if ( ((LA10_17 >= '0' && LA10_17 <= '9')||(LA10_17 >= 'A' && LA10_17 <= 'Z')||LA10_17=='_'||(LA10_17 >= 'a' && LA10_17 <= 'k')||(LA10_17 >= 'm' && LA10_17 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_17);

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA10_77 = input.LA(1);

                         
                        int index10_77 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_77 >= '0' && LA10_77 <= '9')||(LA10_77 >= 'A' && LA10_77 <= 'Z')||LA10_77=='_'||(LA10_77 >= 'a' && LA10_77 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 104;

                         
                        input.seek(index10_77);

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA10_18 = input.LA(1);

                         
                        int index10_18 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_18=='e') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 76;}

                        else if ( ((LA10_18 >= '0' && LA10_18 <= '9')||(LA10_18 >= 'A' && LA10_18 <= 'Z')||LA10_18=='_'||(LA10_18 >= 'a' && LA10_18 <= 'd')||(LA10_18 >= 'f' && LA10_18 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_18);

                        if ( s>=0 ) return s;
                        break;

                    case 23 : 
                        int LA10_54 = input.LA(1);

                         
                        int index10_54 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_54=='P') ) {s = 86;}

                        else if ( ((LA10_54 >= '0' && LA10_54 <= '9')||(LA10_54 >= 'A' && LA10_54 <= 'O')||(LA10_54 >= 'Q' && LA10_54 <= 'Z')||LA10_54=='_'||(LA10_54 >= 'a' && LA10_54 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 55;

                         
                        input.seek(index10_54);

                        if ( s>=0 ) return s;
                        break;

                    case 24 : 
                        int LA10_78 = input.LA(1);

                         
                        int index10_78 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_78 >= '0' && LA10_78 <= '9')||(LA10_78 >= 'A' && LA10_78 <= 'Z')||LA10_78=='_'||(LA10_78 >= 'a' && LA10_78 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 105;

                         
                        input.seek(index10_78);

                        if ( s>=0 ) return s;
                        break;

                    case 25 : 
                        int LA10_61 = input.LA(1);

                         
                        int index10_61 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_61 >= '0' && LA10_61 <= '9')||(LA10_61 >= 'A' && LA10_61 <= 'Z')||LA10_61=='_'||(LA10_61 >= 'a' && LA10_61 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 90;

                         
                        input.seek(index10_61);

                        if ( s>=0 ) return s;
                        break;

                    case 26 : 
                        int LA10_86 = input.LA(1);

                         
                        int index10_86 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_86=='L') ) {s = 107;}

                        else if ( ((LA10_86 >= '0' && LA10_86 <= '9')||(LA10_86 >= 'A' && LA10_86 <= 'K')||(LA10_86 >= 'M' && LA10_86 <= 'Z')||LA10_86=='_'||(LA10_86 >= 'a' && LA10_86 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 55;

                         
                        input.seek(index10_86);

                        if ( s>=0 ) return s;
                        break;

                    case 27 : 
                        int LA10_112 = input.LA(1);

                         
                        int index10_112 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_112 >= '0' && LA10_112 <= '9')||(LA10_112 >= 'A' && LA10_112 <= 'Z')||LA10_112=='_'||(LA10_112 >= 'a' && LA10_112 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 124;

                         
                        input.seek(index10_112);

                        if ( s>=0 ) return s;
                        break;

                    case 28 : 
                        int LA10_121 = input.LA(1);

                         
                        int index10_121 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_121=='M') && (((plain_nesting == 0 & curly_nesting == 0)||(!stringterm)||(stringterm)))) {s = 131;}

                        else if ( ((LA10_121 >= '0' && LA10_121 <= '9')||(LA10_121 >= 'A' && LA10_121 <= 'L')||(LA10_121 >= 'N' && LA10_121 <= 'Z')||LA10_121=='_'||(LA10_121 >= 'a' && LA10_121 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 55;

                         
                        input.seek(index10_121);

                        if ( s>=0 ) return s;
                        break;

                    case 29 : 
                        int LA10_108 = input.LA(1);

                         
                        int index10_108 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_108=='O') && (((plain_nesting == 0 & curly_nesting == 0)||(!stringterm)||(stringterm)))) {s = 121;}

                        else if ( ((LA10_108 >= '0' && LA10_108 <= '9')||(LA10_108 >= 'A' && LA10_108 <= 'N')||(LA10_108 >= 'P' && LA10_108 <= 'Z')||LA10_108=='_'||(LA10_108 >= 'a' && LA10_108 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 55;

                         
                        input.seek(index10_108);

                        if ( s>=0 ) return s;
                        break;

                    case 30 : 
                        int LA10_32 = input.LA(1);

                         
                        int index10_32 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_32 >= '0' && LA10_32 <= '9')||(LA10_32 >= 'A' && LA10_32 <= 'Z')||LA10_32=='_'||(LA10_32 >= 'a' && LA10_32 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 55;

                         
                        input.seek(index10_32);

                        if ( s>=0 ) return s;
                        break;

                    case 31 : 
                        int LA10_88 = input.LA(1);

                         
                        int index10_88 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_88=='D') && (((plain_nesting == 0 & curly_nesting == 0)||(!stringterm)||(stringterm)))) {s = 108;}

                        else if ( ((LA10_88 >= '0' && LA10_88 <= '9')||(LA10_88 >= 'A' && LA10_88 <= 'C')||(LA10_88 >= 'E' && LA10_88 <= 'Z')||LA10_88=='_'||(LA10_88 >= 'a' && LA10_88 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 55;

                         
                        input.seek(index10_88);

                        if ( s>=0 ) return s;
                        break;

                    case 32 : 
                        int LA10_57 = input.LA(1);

                         
                        int index10_57 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_57=='N') && (((plain_nesting == 0 & curly_nesting == 0)||(!stringterm)||(stringterm)))) {s = 88;}

                        else if ( ((LA10_57 >= '0' && LA10_57 <= '9')||(LA10_57 >= 'A' && LA10_57 <= 'M')||(LA10_57 >= 'O' && LA10_57 <= 'Z')||LA10_57=='_'||(LA10_57 >= 'a' && LA10_57 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 55;

                         
                        input.seek(index10_57);

                        if ( s>=0 ) return s;
                        break;

                    case 33 : 
                        int LA10_99 = input.LA(1);

                         
                        int index10_99 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_99 >= '0' && LA10_99 <= '9')||(LA10_99 >= 'A' && LA10_99 <= 'Z')||LA10_99=='_'||(LA10_99 >= 'a' && LA10_99 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 113;

                         
                        input.seek(index10_99);

                        if ( s>=0 ) return s;
                        break;

                    case 34 : 
                        int LA10_62 = input.LA(1);

                         
                        int index10_62 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_62=='s') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 91;}

                        else if ( ((LA10_62 >= '0' && LA10_62 <= '9')||(LA10_62 >= 'A' && LA10_62 <= 'Z')||LA10_62=='_'||(LA10_62 >= 'a' && LA10_62 <= 'r')||(LA10_62 >= 't' && LA10_62 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_62);

                        if ( s>=0 ) return s;
                        break;

                    case 35 : 
                        int LA10_100 = input.LA(1);

                         
                        int index10_100 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_100=='p') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 114;}

                        else if ( ((LA10_100 >= '0' && LA10_100 <= '9')||(LA10_100 >= 'A' && LA10_100 <= 'Z')||LA10_100=='_'||(LA10_100 >= 'a' && LA10_100 <= 'o')||(LA10_100 >= 'q' && LA10_100 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_100);

                        if ( s>=0 ) return s;
                        break;

                    case 36 : 
                        int LA10_31 = input.LA(1);

                         
                        int index10_31 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_31 >= '0' && LA10_31 <= '9')||(LA10_31 >= 'A' && LA10_31 <= 'Z')||LA10_31=='_'||(LA10_31 >= 'a' && LA10_31 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_31);

                        if ( s>=0 ) return s;
                        break;

                    case 37 : 
                        int LA10_73 = input.LA(1);

                         
                        int index10_73 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_73=='o') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 100;}

                        else if ( ((LA10_73 >= '0' && LA10_73 <= '9')||(LA10_73 >= 'A' && LA10_73 <= 'Z')||LA10_73=='_'||(LA10_73 >= 'a' && LA10_73 <= 'n')||(LA10_73 >= 'p' && LA10_73 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_73);

                        if ( s>=0 ) return s;
                        break;

                    case 38 : 
                        int LA10_107 = input.LA(1);

                         
                        int index10_107 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_107 >= '0' && LA10_107 <= '9')||(LA10_107 >= 'A' && LA10_107 <= 'Z')||LA10_107=='_'||(LA10_107 >= 'a' && LA10_107 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 120;

                         
                        input.seek(index10_107);

                        if ( s>=0 ) return s;
                        break;

                    case 39 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_8=='h') && (((condaction)||(!stringterm)||(stringterm)))) {s = 65;}

                        else if ( ((LA10_8 >= '0' && LA10_8 <= '9')||(LA10_8 >= 'A' && LA10_8 <= 'Z')||LA10_8=='_'||(LA10_8 >= 'a' && LA10_8 <= 'g')||(LA10_8 >= 'i' && LA10_8 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_8);

                        if ( s>=0 ) return s;
                        break;

                    case 40 : 
                        int LA10_131 = input.LA(1);

                         
                        int index10_131 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_131 >= '0' && LA10_131 <= '9')||(LA10_131 >= 'A' && LA10_131 <= 'Z')||LA10_131=='_'||(LA10_131 >= 'a' && LA10_131 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 138;

                         
                        input.seek(index10_131);

                        if ( s>=0 ) return s;
                        break;

                    case 41 : 
                        int LA10_72 = input.LA(1);

                         
                        int index10_72 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_72=='l') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 99;}

                        else if ( ((LA10_72 >= '0' && LA10_72 <= '9')||(LA10_72 >= 'A' && LA10_72 <= 'Z')||LA10_72=='_'||(LA10_72 >= 'a' && LA10_72 <= 'k')||(LA10_72 >= 'm' && LA10_72 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_72);

                        if ( s>=0 ) return s;
                        break;

                    case 42 : 
                        int LA10_12 = input.LA(1);

                         
                        int index10_12 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_12 >= '0' && LA10_12 <= '9')||(LA10_12 >= 'A' && LA10_12 <= 'Z')||LA10_12=='_'||(LA10_12 >= 'a' && LA10_12 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 69;

                         
                        input.seek(index10_12);

                        if ( s>=0 ) return s;
                        break;

                    case 43 : 
                        int LA10_10 = input.LA(1);

                         
                        int index10_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_10 >= '0' && LA10_10 <= '9')||(LA10_10 >= 'A' && LA10_10 <= 'Z')||LA10_10=='_'||(LA10_10 >= 'a' && LA10_10 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 67;

                         
                        input.seek(index10_10);

                        if ( s>=0 ) return s;
                        break;

                    case 44 : 
                        int LA10_83 = input.LA(1);

                         
                        int index10_83 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_83 >= '0' && LA10_83 <= '9')) && (((!stringterm)||(stringterm)))) {s = 83;}

                        else if ( ((LA10_83 >= 'A' && LA10_83 <= 'Z')||LA10_83=='_'||(LA10_83 >= 'a' && LA10_83 <= 'z')) && ((stringterm))) {s = 71;}

                        else s = 82;

                         
                        input.seek(index10_83);

                        if ( s>=0 ) return s;
                        break;

                    case 45 : 
                        int LA10_11 = input.LA(1);

                         
                        int index10_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_11 >= '0' && LA10_11 <= '9')||(LA10_11 >= 'A' && LA10_11 <= 'Z')||LA10_11=='_'||(LA10_11 >= 'a' && LA10_11 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 68;

                         
                        input.seek(index10_11);

                        if ( s>=0 ) return s;
                        break;

                    case 46 : 
                        int LA10_89 = input.LA(1);

                         
                        int index10_89 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_89=='e') && (((curly_nesting > 0 && plain_nesting == 0)||(!stringterm)||(stringterm)))) {s = 109;}

                        else if ( ((LA10_89 >= '0' && LA10_89 <= '9')||(LA10_89 >= 'A' && LA10_89 <= 'Z')||LA10_89=='_'||(LA10_89 >= 'a' && LA10_89 <= 'd')||(LA10_89 >= 'f' && LA10_89 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 55;

                         
                        input.seek(index10_89);

                        if ( s>=0 ) return s;
                        break;

                    case 47 : 
                        int LA10_60 = input.LA(1);

                         
                        int index10_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_60=='u') && (((curly_nesting > 0 && plain_nesting == 0)||(!stringterm)||(stringterm)))) {s = 89;}

                        else if ( ((LA10_60 >= '0' && LA10_60 <= '9')||(LA10_60 >= 'A' && LA10_60 <= 'Z')||LA10_60=='_'||(LA10_60 >= 'a' && LA10_60 <= 't')||(LA10_60 >= 'v' && LA10_60 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 55;

                         
                        input.seek(index10_60);

                        if ( s>=0 ) return s;
                        break;

                    case 48 : 
                        int LA10_120 = input.LA(1);

                         
                        int index10_120 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!((((!stringterm)||(stringterm))))) ) {s = 130;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 87;}

                         
                        input.seek(index10_120);

                        if ( s>=0 ) return s;
                        break;

                    case 49 : 
                        int LA10_138 = input.LA(1);

                         
                        int index10_138 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((plain_nesting == 0 & curly_nesting == 0)) ) {s = 141;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 87;}

                         
                        input.seek(index10_138);

                        if ( s>=0 ) return s;
                        break;

                    case 50 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_9 >= '0' && LA10_9 <= '9')||(LA10_9 >= 'A' && LA10_9 <= 'Z')||LA10_9=='_'||(LA10_9 >= 'a' && LA10_9 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 66;

                         
                        input.seek(index10_9);

                        if ( s>=0 ) return s;
                        break;

                    case 51 : 
                        int LA10_103 = input.LA(1);

                         
                        int index10_103 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_103=='d') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 117;}

                        else if ( ((LA10_103 >= '0' && LA10_103 <= '9')||(LA10_103 >= 'A' && LA10_103 <= 'Z')||LA10_103=='_'||(LA10_103 >= 'a' && LA10_103 <= 'c')||(LA10_103 >= 'e' && LA10_103 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_103);

                        if ( s>=0 ) return s;
                        break;

                    case 52 : 
                        int LA10_76 = input.LA(1);

                         
                        int index10_76 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_76=='n') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 103;}

                        else if ( ((LA10_76 >= '0' && LA10_76 <= '9')||(LA10_76 >= 'A' && LA10_76 <= 'Z')||LA10_76=='_'||(LA10_76 >= 'a' && LA10_76 <= 'm')||(LA10_76 >= 'o' && LA10_76 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_76);

                        if ( s>=0 ) return s;
                        break;

                    case 53 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_4=='A') && (((plain_nesting == 0 & curly_nesting == 0)||(!stringterm)||(stringterm)))) {s = 57;}

                        else if ( ((LA10_4 >= '0' && LA10_4 <= '9')||(LA10_4 >= 'B' && LA10_4 <= 'Z')||LA10_4=='_'||(LA10_4 >= 'a' && LA10_4 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 55;

                         
                        input.seek(index10_4);

                        if ( s>=0 ) return s;
                        break;

                    case 54 : 
                        int LA10_122 = input.LA(1);

                         
                        int index10_122 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((curly_nesting > 0 && plain_nesting == 0)) ) {s = 132;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 87;}

                         
                        input.seek(index10_122);

                        if ( s>=0 ) return s;
                        break;

                    case 55 : 
                        int LA10_90 = input.LA(1);

                         
                        int index10_90 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((condaction)) ) {s = 110;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 92;}

                         
                        input.seek(index10_90);

                        if ( s>=0 ) return s;
                        break;

                    case 56 : 
                        int LA10_124 = input.LA(1);

                         
                        int index10_124 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((condaction)) ) {s = 133;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 92;}

                         
                        input.seek(index10_124);

                        if ( s>=0 ) return s;
                        break;

                    case 57 : 
                        int LA10_15 = input.LA(1);

                         
                        int index10_15 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_15=='e') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 72;}

                        else if ( (LA10_15=='r') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 73;}

                        else if ( ((LA10_15 >= '0' && LA10_15 <= '9')||(LA10_15 >= 'A' && LA10_15 <= 'Z')||LA10_15=='_'||(LA10_15 >= 'a' && LA10_15 <= 'd')||(LA10_15 >= 'f' && LA10_15 <= 'q')||(LA10_15 >= 's' && LA10_15 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_15);

                        if ( s>=0 ) return s;
                        break;

                    case 58 : 
                        int LA10_102 = input.LA(1);

                         
                        int index10_102 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_102=='s') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 116;}

                        else if ( ((LA10_102 >= '0' && LA10_102 <= '9')||(LA10_102 >= 'A' && LA10_102 <= 'Z')||LA10_102=='_'||(LA10_102 >= 'a' && LA10_102 <= 'r')||(LA10_102 >= 't' && LA10_102 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_102);

                        if ( s>=0 ) return s;
                        break;

                    case 59 : 
                        int LA10_56 = input.LA(1);

                         
                        int index10_56 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_56 >= '0' && LA10_56 <= '9')||(LA10_56 >= 'A' && LA10_56 <= 'Z')||LA10_56=='_'||(LA10_56 >= 'a' && LA10_56 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 55;

                         
                        input.seek(index10_56);

                        if ( s>=0 ) return s;
                        break;

                    case 60 : 
                        int LA10_116 = input.LA(1);

                         
                        int index10_116 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_116=='e') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 128;}

                        else if ( ((LA10_116 >= '0' && LA10_116 <= '9')||(LA10_116 >= 'A' && LA10_116 <= 'Z')||LA10_116=='_'||(LA10_116 >= 'a' && LA10_116 <= 'd')||(LA10_116 >= 'f' && LA10_116 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_116);

                        if ( s>=0 ) return s;
                        break;

                    case 61 : 
                        int LA10_75 = input.LA(1);

                         
                        int index10_75 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_75=='o') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 102;}

                        else if ( ((LA10_75 >= '0' && LA10_75 <= '9')||(LA10_75 >= 'A' && LA10_75 <= 'Z')||LA10_75=='_'||(LA10_75 >= 'a' && LA10_75 <= 'n')||(LA10_75 >= 'p' && LA10_75 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_75);

                        if ( s>=0 ) return s;
                        break;

                    case 62 : 
                        int LA10_69 = input.LA(1);

                         
                        int index10_69 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0))) ) {s = 97;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 87;}

                         
                        input.seek(index10_69);

                        if ( s>=0 ) return s;
                        break;

                    case 63 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_3=='O') ) {s = 54;}

                        else if ( ((LA10_3 >= '0' && LA10_3 <= '9')||(LA10_3 >= 'A' && LA10_3 <= 'N')||(LA10_3 >= 'P' && LA10_3 <= 'Z')||LA10_3=='_'||(LA10_3 >= 'a' && LA10_3 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 55;

                         
                        input.seek(index10_3);

                        if ( s>=0 ) return s;
                        break;

                    case 64 : 
                        int LA10_66 = input.LA(1);

                         
                        int index10_66 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0))) ) {s = 94;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 87;}

                         
                        input.seek(index10_66);

                        if ( s>=0 ) return s;
                        break;

                    case 65 : 
                        int LA10_68 = input.LA(1);

                         
                        int index10_68 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0))) ) {s = 96;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 87;}

                         
                        input.seek(index10_68);

                        if ( s>=0 ) return s;
                        break;

                    case 66 : 
                        int LA10_67 = input.LA(1);

                         
                        int index10_67 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((preconditiontypemode && plain_nesting == 0) || (actionspec && curly_nesting > 0 && plain_nesting == 0))) ) {s = 95;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 87;}

                         
                        input.seek(index10_67);

                        if ( s>=0 ) return s;
                        break;

                    case 67 : 
                        int LA10_115 = input.LA(1);

                         
                        int index10_115 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_115=='t') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 127;}

                        else if ( ((LA10_115 >= '0' && LA10_115 <= '9')||(LA10_115 >= 'A' && LA10_115 <= 'Z')||LA10_115=='_'||(LA10_115 >= 'a' && LA10_115 <= 's')||(LA10_115 >= 'u' && LA10_115 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_115);

                        if ( s>=0 ) return s;
                        break;

                    case 68 : 
                        int LA10_111 = input.LA(1);

                         
                        int index10_111 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {s = 123;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 92;}

                         
                        input.seek(index10_111);

                        if ( s>=0 ) return s;
                        break;

                    case 69 : 
                        int LA10_126 = input.LA(1);

                         
                        int index10_126 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {s = 134;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 92;}

                         
                        input.seek(index10_126);

                        if ( s>=0 ) return s;
                        break;

                    case 70 : 
                        int LA10_101 = input.LA(1);

                         
                        int index10_101 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_101=='p') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 115;}

                        else if ( ((LA10_101 >= '0' && LA10_101 <= '9')||(LA10_101 >= 'A' && LA10_101 <= 'Z')||LA10_101=='_'||(LA10_101 >= 'a' && LA10_101 <= 'o')||(LA10_101 >= 'q' && LA10_101 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_101);

                        if ( s>=0 ) return s;
                        break;

                    case 71 : 
                        int LA10_105 = input.LA(1);

                         
                        int index10_105 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {s = 119;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 92;}

                         
                        input.seek(index10_105);

                        if ( s>=0 ) return s;
                        break;

                    case 72 : 
                        int LA10_74 = input.LA(1);

                         
                        int index10_74 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_74=='o') && (((!stringterm)||(stringterm)||((condaction==true && preconditiontypemode==false && plain_nesting==0))))) {s = 101;}

                        else if ( ((LA10_74 >= '0' && LA10_74 <= '9')||(LA10_74 >= 'A' && LA10_74 <= 'Z')||LA10_74=='_'||(LA10_74 >= 'a' && LA10_74 <= 'n')||(LA10_74 >= 'p' && LA10_74 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index10_74);

                        if ( s>=0 ) return s;
                        break;

                    case 73 : 
                        int LA10_104 = input.LA(1);

                         
                        int index10_104 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {s = 118;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 92;}

                         
                        input.seek(index10_104);

                        if ( s>=0 ) return s;
                        break;

                    case 74 : 
                        int LA10_135 = input.LA(1);

                         
                        int index10_135 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {s = 139;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 92;}

                         
                        input.seek(index10_135);

                        if ( s>=0 ) return s;
                        break;

                    case 75 : 
                        int LA10_109 = input.LA(1);

                         
                        int index10_109 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA10_109 >= '0' && LA10_109 <= '9')||(LA10_109 >= 'A' && LA10_109 <= 'Z')||LA10_109=='_'||(LA10_109 >= 'a' && LA10_109 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 56;}

                        else s = 122;

                         
                        input.seek(index10_109);

                        if ( s>=0 ) return s;
                        break;

                    case 76 : 
                        int LA10_113 = input.LA(1);

                         
                        int index10_113 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {s = 125;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 92;}

                         
                        input.seek(index10_113);

                        if ( s>=0 ) return s;
                        break;

                    case 77 : 
                        int LA10_129 = input.LA(1);

                         
                        int index10_129 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {s = 137;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 92;}

                         
                        input.seek(index10_129);

                        if ( s>=0 ) return s;
                        break;

                    case 78 : 
                        int LA10_136 = input.LA(1);

                         
                        int index10_136 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((condaction==true && preconditiontypemode==false && plain_nesting==0))) ) {s = 140;}

                        else if ( ((stringterm)) ) {s = 71;}

                        else if ( ((!stringterm)) ) {s = 92;}

                         
                        input.seek(index10_136);

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}