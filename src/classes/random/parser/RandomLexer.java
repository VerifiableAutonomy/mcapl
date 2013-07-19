// $ANTLR 3.4 /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g 2012-07-11 14:15:49

package random.parser;


import mcaplantlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RandomLexer extends Lexer {
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

        public int plain_nesting = 0;
        public int sq_nesting = 0;
        public int curly_nesting = 0;
        public boolean stringterm = false;
        public boolean gwendolen = false;
        public int belief_rules = 0;


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public RandomLexer() {} 
    public RandomLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RandomLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g"; }

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:43:6: ( ':name:' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:43:8: ':name:'
            {
            match(":name:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "ACTIONS"
    public final void mACTIONS() throws RecognitionException {
        try {
            int _type = ACTIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:44:9: ( ':Actions:' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:44:11: ':Actions:'
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

    // $ANTLR start "SEND"
    public final void mSEND() throws RecognitionException {
        try {
            int _type = SEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:79:6: ( '.send' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:79:8: '.send'
            {
            match(".send"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEND"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:80:8: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:80:10: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            {
            if ( !((stringterm)) ) {
                throw new FailedPredicateException(input, "STRING", "stringterm");
            }

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:80:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:81:8: ({...}? => 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:81:11: {...}? => 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( !((!stringterm)) ) {
                throw new FailedPredicateException(input, "CONST", "!stringterm");
            }

            matchRange('a','z'); 

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:81:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:
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
            	    break loop2;
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
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:82:5: ({...}? => 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:82:7: {...}? => 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( !((!stringterm)) ) {
                throw new FailedPredicateException(input, "VAR", "!stringterm");
            }

            matchRange('A','Z'); 

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:82:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:
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
            	    break loop3;
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

    // $ANTLR start "DOUBLEQUOTE"
    public final void mDOUBLEQUOTE() throws RecognitionException {
        try {
            int _type = DOUBLEQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:84:2: ( '\"' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:84:4: '\"'
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

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:86:8: ({...}? => '0' .. '9' ( '0' .. '9' )* )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:86:10: {...}? => '0' .. '9' ( '0' .. '9' )*
            {
            if ( !((!stringterm)) ) {
                throw new FailedPredicateException(input, "NUMBER", "!stringterm");
            }

            matchRange('0','9'); 

            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:86:35: ( '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:
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
            	    break loop4;
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
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:89:6: ( '<' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:89:8: '<'
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
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:90:4: ( '==' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:90:7: '=='
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
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:91:7: ( '.' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:91:9: '.'
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
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:92:6: ( '*' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:92:8: '*'
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
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:93:6: ( '+' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:93:8: '+'
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
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:94:7: ( '-' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:94:9: '-'
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
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:95:5: ( '/' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:95:7: '/'
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
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:96:5: ( '%' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:96:7: '%'
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

    // $ANTLR start "OPEN"
    public final void mOPEN() throws RecognitionException {
        try {
            int _type = OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:98:6: ( '(' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:98:9: '('
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
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:99:7: ( ')' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:99:9: ')'
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

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:100:7: ( ',' )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:100:9: ','
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:103:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='/') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='*') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:103:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:103:14: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:
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
                    	    break loop5;
                        }
                    } while (true);


                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:103:28: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:103:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:104:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:104:14: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:104:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:107:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:107:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:8: ( NAME | ACTIONS | SEND | STRING | CONST | VAR | DOUBLEQUOTE | NUMBER | LESS | EQ | POINT | MULT | PLUS | MINUS | DIV | MOD | OPEN | CLOSE | COMMA | COMMENT | WS )
        int alt9=21;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:10: NAME
                {
                mNAME(); 


                }
                break;
            case 2 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:15: ACTIONS
                {
                mACTIONS(); 


                }
                break;
            case 3 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:23: SEND
                {
                mSEND(); 


                }
                break;
            case 4 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:28: STRING
                {
                mSTRING(); 


                }
                break;
            case 5 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:35: CONST
                {
                mCONST(); 


                }
                break;
            case 6 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:41: VAR
                {
                mVAR(); 


                }
                break;
            case 7 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:45: DOUBLEQUOTE
                {
                mDOUBLEQUOTE(); 


                }
                break;
            case 8 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:57: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 9 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:64: LESS
                {
                mLESS(); 


                }
                break;
            case 10 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:69: EQ
                {
                mEQ(); 


                }
                break;
            case 11 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:72: POINT
                {
                mPOINT(); 


                }
                break;
            case 12 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:78: MULT
                {
                mMULT(); 


                }
                break;
            case 13 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:83: PLUS
                {
                mPLUS(); 


                }
                break;
            case 14 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:88: MINUS
                {
                mMINUS(); 


                }
                break;
            case 15 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:94: DIV
                {
                mDIV(); 


                }
                break;
            case 16 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:98: MOD
                {
                mMOD(); 


                }
                break;
            case 17 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:102: OPEN
                {
                mOPEN(); 


                }
                break;
            case 18 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:107: CLOSE
                {
                mCLOSE(); 


                }
                break;
            case 19 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:113: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 20 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:119: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 21 :
                // /Users/louiseadennis/Eclipse/ajpf/src/classes/random/parser/Random.g:1:127: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\2\uffff\1\26\1\27\1\31\1\33\7\uffff\1\36\12\uffff\1\27\1\uffff"+
        "\1\31\1\uffff\1\33\5\uffff";
    static final String DFA9_eofS =
        "\42\uffff";
    static final String DFA9_minS =
        "\1\11\1\101\1\163\3\60\7\uffff\1\52\11\uffff\1\0\1\60\1\0\1\60\1"+
        "\0\1\60\5\uffff";
    static final String DFA9_maxS =
        "\1\172\1\156\1\163\3\172\7\uffff\1\57\11\uffff\1\0\1\172\1\0\1\172"+
        "\1\0\1\172\5\uffff";
    static final String DFA9_acceptS =
        "\6\uffff\1\7\1\4\1\11\1\12\1\14\1\15\1\16\1\uffff\1\20\1\21\1\22"+
        "\1\23\1\25\1\1\1\2\1\3\1\13\6\uffff\1\24\1\17\1\5\1\6\1\10";
    static final String DFA9_specialS =
        "\1\3\2\uffff\1\10\1\6\1\0\21\uffff\1\5\1\11\1\4\1\7\1\2\1\1\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\22\2\uffff\1\22\22\uffff\1\22\1\uffff\1\6\2\uffff\1\16\2"+
            "\uffff\1\17\1\20\1\12\1\13\1\21\1\14\1\2\1\15\12\5\1\1\1\uffff"+
            "\1\10\1\11\3\uffff\32\4\4\uffff\1\7\1\uffff\32\3",
            "\1\24\54\uffff\1\23",
            "\1\25",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\34\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35\4\uffff\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\uffff",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\uffff",
            "\12\34\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( NAME | ACTIONS | SEND | STRING | CONST | VAR | DOUBLEQUOTE | NUMBER | LESS | EQ | POINT | MULT | PLUS | MINUS | DIV | MOD | OPEN | CLOSE | COMMA | COMMENT | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA9_5 >= '0' && LA9_5 <= '9')) && (((!stringterm)||(stringterm)))) {s = 28;}

                        else if ( ((LA9_5 >= 'A' && LA9_5 <= 'Z')||LA9_5=='_'||(LA9_5 >= 'a' && LA9_5 <= 'z')) && ((stringterm))) {s = 7;}

                        else s = 27;

                         
                        input.seek(index9_5);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA9_28 = input.LA(1);

                         
                        int index9_28 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA9_28 >= '0' && LA9_28 <= '9')) && (((!stringterm)||(stringterm)))) {s = 28;}

                        else if ( ((LA9_28 >= 'A' && LA9_28 <= 'Z')||LA9_28=='_'||(LA9_28 >= 'a' && LA9_28 <= 'z')) && ((stringterm))) {s = 7;}

                        else s = 27;

                         
                        input.seek(index9_28);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA9_27 = input.LA(1);

                         
                        int index9_27 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((stringterm)) ) {s = 7;}

                        else if ( ((!stringterm)) ) {s = 33;}

                         
                        input.seek(index9_27);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA9_0 = input.LA(1);

                         
                        int index9_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA9_0==':') ) {s = 1;}

                        else if ( (LA9_0=='.') ) {s = 2;}

                        else if ( ((LA9_0 >= 'a' && LA9_0 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 3;}

                        else if ( ((LA9_0 >= 'A' && LA9_0 <= 'Z')) && (((!stringterm)||(stringterm)))) {s = 4;}

                        else if ( ((LA9_0 >= '0' && LA9_0 <= '9')) && (((!stringterm)||(stringterm)))) {s = 5;}

                        else if ( (LA9_0=='\"') ) {s = 6;}

                        else if ( (LA9_0=='_') && ((stringterm))) {s = 7;}

                        else if ( (LA9_0=='<') ) {s = 8;}

                        else if ( (LA9_0=='=') ) {s = 9;}

                        else if ( (LA9_0=='*') ) {s = 10;}

                        else if ( (LA9_0=='+') ) {s = 11;}

                        else if ( (LA9_0=='-') ) {s = 12;}

                        else if ( (LA9_0=='/') ) {s = 13;}

                        else if ( (LA9_0=='%') ) {s = 14;}

                        else if ( (LA9_0=='(') ) {s = 15;}

                        else if ( (LA9_0==')') ) {s = 16;}

                        else if ( (LA9_0==',') ) {s = 17;}

                        else if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {s = 18;}

                         
                        input.seek(index9_0);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA9_25 = input.LA(1);

                         
                        int index9_25 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((stringterm)) ) {s = 7;}

                        else if ( ((!stringterm)) ) {s = 32;}

                         
                        input.seek(index9_25);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA9_23 = input.LA(1);

                         
                        int index9_23 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((stringterm)) ) {s = 7;}

                        else if ( ((!stringterm)) ) {s = 31;}

                         
                        input.seek(index9_23);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA9_4 >= '0' && LA9_4 <= '9')||(LA9_4 >= 'A' && LA9_4 <= 'Z')||LA9_4=='_'||(LA9_4 >= 'a' && LA9_4 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 26;}

                        else s = 25;

                         
                        input.seek(index9_4);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA9_26 = input.LA(1);

                         
                        int index9_26 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA9_26 >= '0' && LA9_26 <= '9')||(LA9_26 >= 'A' && LA9_26 <= 'Z')||LA9_26=='_'||(LA9_26 >= 'a' && LA9_26 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 26;}

                        else s = 25;

                         
                        input.seek(index9_26);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA9_3 >= '0' && LA9_3 <= '9')||(LA9_3 >= 'A' && LA9_3 <= 'Z')||LA9_3=='_'||(LA9_3 >= 'a' && LA9_3 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 24;}

                        else s = 23;

                         
                        input.seek(index9_3);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA9_24 = input.LA(1);

                         
                        int index9_24 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA9_24 >= '0' && LA9_24 <= '9')||(LA9_24 >= 'A' && LA9_24 <= 'Z')||LA9_24=='_'||(LA9_24 >= 'a' && LA9_24 <= 'z')) && (((!stringterm)||(stringterm)))) {s = 24;}

                        else s = 23;

                         
                        input.seek(index9_24);

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}