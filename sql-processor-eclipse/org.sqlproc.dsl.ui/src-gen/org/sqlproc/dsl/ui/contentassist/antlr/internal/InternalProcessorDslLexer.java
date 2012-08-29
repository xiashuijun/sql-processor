package org.sqlproc.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProcessorDslLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_SEMICOLON=36;
    public static final int RULE_PERCENT=27;
    public static final int RULE_OR=29;
    public static final int RULE_OPTION_TYPE=34;
    public static final int RULE_AND=28;
    public static final int RULE_IDENT_TYPE=37;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int RULE_NOT=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_REST=4;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_NUMBER=7;
    public static final int RULE_LPAREN=13;
    public static final int T__59=59;
    public static final int RULE_LBRACE=15;
    public static final int RULE_BOR=20;
    public static final int RULE_IDENT_DOT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int RULE_BAND=19;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_RBRACE=16;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_CARET=23;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_MORE_THAN=26;
    public static final int RULE_PLUS=12;
    public static final int RULE_STATEMEN_TYPE=32;
    public static final int RULE_COMMA=10;
    public static final int RULE_HASH=21;
    public static final int RULE_QUESTI=17;
    public static final int RULE_SL_COMMENT=39;
    public static final int RULE_ML_COMMENT=38;
    public static final int RULE_ON_OFF=31;
    public static final int RULE_COLON=8;
    public static final int RULE_MINUS=11;
    public static final int RULE_STRING=9;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_ESC_CHAR=30;
    public static final int RULE_IDENT=6;
    public static final int RULE_EQUALS=24;
    public static final int RULE_RPAREN=14;
    public static final int RULE_LESS_THAN=25;
    public static final int RULE_WS=35;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_MAPPING_TYPE=33;
    public static final int RULE_AT=22;

    // delegates
    // delegators

    public InternalProcessorDslLexer() {;} 
    public InternalProcessorDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalProcessorDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g"; }

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:11:7: ( '_char' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:11:9: '_char'
            {
            match("_char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:12:7: ( '_byte' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:12:9: '_byte'
            {
            match("_byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:13:7: ( '_short' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:13:9: '_short'
            {
            match("_short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14:7: ( '_int' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14:9: '_int'
            {
            match("_int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15:7: ( '_long' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15:9: '_long'
            {
            match("_long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16:7: ( '_float' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16:9: '_float'
            {
            match("_float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:17:7: ( '_double' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:17:9: '_double'
            {
            match("_double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:18:7: ( '_boolean' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:18:9: '_boolean'
            {
            match("_boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:19:7: ( 'pojo' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:19:9: 'pojo'
            {
            match("pojo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:20:7: ( 'col' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:20:9: 'col'
            {
            match("col"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:21:7: ( 'ident' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:21:9: 'ident'
            {
            match("ident"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:22:7: ( 'const' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:22:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:23:7: ( 'out' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:23:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24:7: ( 'colx' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24:9: 'colx'
            {
            match("colx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:25:7: ( 'identx' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:25:9: 'identx'
            {
            match("identx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:26:7: ( 'constx' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:26:9: 'constx'
            {
            match("constx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:27:7: ( 'outx' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:27:9: 'outx'
            {
            match("outx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:28:7: ( 'table' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:28:9: 'table'
            {
            match("table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:29:7: ( 'dbcol' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:29:9: 'dbcol'
            {
            match("dbcol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:30:7: ( 'prefix' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:30:9: 'prefix'
            {
            match("prefix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:31:7: ( 'database type' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:31:9: 'database type'
            {
            match("database type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:32:7: ( 'package' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:32:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:33:7: ( 'import' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:33:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:34:7: ( 'extends' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:34:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:35:7: ( '.*' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:35:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:36:7: ( 'resolve references' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:36:9: 'resolve references'
            {
            match("resolve references"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:37:7: ( 'database online' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:37:9: 'database online'
            {
            match("database online"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:38:7: ( 'database url' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:38:9: 'database url'
            {
            match("database url"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:39:7: ( 'database username' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:39:9: 'database username'
            {
            match("database username"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:40:7: ( 'database password' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:40:9: 'database password'
            {
            match("database password"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:41:7: ( 'database schema' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:41:9: 'database schema'
            {
            match("database schema"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:42:7: ( 'database driver' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:42:9: 'database driver'
            {
            match("database driver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:43:7: ( '[]' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:43:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:44:7: ( 'abstract' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:44:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:45:7: ( 'required' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:45:9: 'required'
            {
            match("required"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "RULE_ON_OFF"
    public final void mRULE_ON_OFF() throws RecognitionException {
        try {
            int _type = RULE_ON_OFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16791:13: ( ( 'ON' | 'OFF' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16791:15: ( 'ON' | 'OFF' )
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16791:15: ( 'ON' | 'OFF' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='O') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='N') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='F') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16791:16: 'ON'
                    {
                    match("ON"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16791:21: 'OFF'
                    {
                    match("OFF"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ON_OFF"

    // $ANTLR start "RULE_STATEMEN_TYPE"
    public final void mRULE_STATEMEN_TYPE() throws RecognitionException {
        try {
            int _type = RULE_STATEMEN_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16793:20: ( ( 'QRY' | 'CRUD' | 'CALL' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16793:22: ( 'QRY' | 'CRUD' | 'CALL' )
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16793:22: ( 'QRY' | 'CRUD' | 'CALL' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='Q') ) {
                alt2=1;
            }
            else if ( (LA2_0=='C') ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='R') ) {
                    alt2=2;
                }
                else if ( (LA2_2=='A') ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16793:23: 'QRY'
                    {
                    match("QRY"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16793:29: 'CRUD'
                    {
                    match("CRUD"); 


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16793:36: 'CALL'
                    {
                    match("CALL"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATEMEN_TYPE"

    // $ANTLR start "RULE_MAPPING_TYPE"
    public final void mRULE_MAPPING_TYPE() throws RecognitionException {
        try {
            int _type = RULE_MAPPING_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16795:19: ( 'OUT' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16795:21: 'OUT'
            {
            match("OUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAPPING_TYPE"

    // $ANTLR start "RULE_OPTION_TYPE"
    public final void mRULE_OPTION_TYPE() throws RecognitionException {
        try {
            int _type = RULE_OPTION_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16797:18: ( ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16797:20: ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' )
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16797:20: ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 'O':
                {
                alt3=1;
                }
                break;
            case 'L':
                {
                alt3=2;
                }
                break;
            case 'I':
                {
                alt3=3;
                }
                break;
            case 'S':
                {
                alt3=4;
                }
                break;
            case 'B':
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16797:21: 'OPT'
                    {
                    match("OPT"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16797:27: 'LOPT'
                    {
                    match("LOPT"); 


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16797:34: 'IOPT'
                    {
                    match("IOPT"); 


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16797:41: 'SOPT'
                    {
                    match("SOPT"); 


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16797:48: 'BOPT'
                    {
                    match("BOPT"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPTION_TYPE"

    // $ANTLR start "RULE_IDENT_TYPE"
    public final void mRULE_IDENT_TYPE() throws RecognitionException {
        try {
            int _type = RULE_IDENT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16799:17: ( RULE_IDENT RULE_LPAREN RULE_NUMBER ( RULE_COMMA RULE_NUMBER )? RULE_RPAREN )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16799:19: RULE_IDENT RULE_LPAREN RULE_NUMBER ( RULE_COMMA RULE_NUMBER )? RULE_RPAREN
            {
            mRULE_IDENT(); 
            mRULE_LPAREN(); 
            mRULE_NUMBER(); 
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16799:54: ( RULE_COMMA RULE_NUMBER )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==',') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16799:55: RULE_COMMA RULE_NUMBER
                    {
                    mRULE_COMMA(); 
                    mRULE_NUMBER(); 

                    }
                    break;

            }

            mRULE_RPAREN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT_TYPE"

    // $ANTLR start "RULE_IDENT_DOT"
    public final void mRULE_IDENT_DOT() throws RecognitionException {
        try {
            int _type = RULE_IDENT_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16801:16: ( RULE_IDENT ( '.' RULE_IDENT )+ )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16801:18: RULE_IDENT ( '.' RULE_IDENT )+
            {
            mRULE_IDENT(); 
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16801:29: ( '.' RULE_IDENT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='.') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16801:30: '.' RULE_IDENT
            	    {
            	    match('.'); 
            	    mRULE_IDENT(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT_DOT"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16803:12: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )* )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16803:14: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16803:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||LA6_0=='='||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='='||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16805:13: ( ( '0' .. '9' )+ )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16805:15: ( '0' .. '9' )+
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16805:15: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16805:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_ESC_CHAR"
    public final void mRULE_ESC_CHAR() throws RecognitionException {
        try {
            int _type = RULE_ESC_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16807:15: ( '\\\\' ( RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_LBRACE | RULE_RBRACE | RULE_BOR | RULE_HASH | RULE_AT | RULE_PERCENT | '/' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16807:17: '\\\\' ( RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_LBRACE | RULE_RBRACE | RULE_BOR | RULE_HASH | RULE_AT | RULE_PERCENT | '/' )
            {
            match('\\'); 
            if ( (input.LA(1)>='#' && input.LA(1)<='%')||input.LA(1)=='/'||(input.LA(1)>=':' && input.LA(1)<=';')||input.LA(1)=='@'||(input.LA(1)>='{' && input.LA(1)<='}') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESC_CHAR"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16809:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16809:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16809:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16809:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16811:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16811:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16811:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16811:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16811:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16811:41: ( '\\r' )? '\\n'
                    {
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16811:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16811:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16813:9: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16813:11: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16813:11: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16815:10: ( '&' '&' '&' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16815:12: '&' '&' '&'
            {
            match('&'); 
            match('&'); 
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16817:9: ( '|' '|' '|' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16817:11: '|' '|' '|'
            {
            match('|'); 
            match('|'); 
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16819:12: ( ':' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16819:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16821:16: ( ';' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16821:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16823:13: ( '$' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16823:15: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16825:12: ( ',' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16825:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16827:12: ( '-' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16827:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16829:11: ( '+' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16829:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16831:13: ( '(' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16831:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16833:13: ( ')' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16833:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_LBRACE"
    public final void mRULE_LBRACE() throws RecognitionException {
        try {
            int _type = RULE_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16835:13: ( '{' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16835:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACE"

    // $ANTLR start "RULE_RBRACE"
    public final void mRULE_RBRACE() throws RecognitionException {
        try {
            int _type = RULE_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16837:13: ( '}' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16837:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACE"

    // $ANTLR start "RULE_QUESTI"
    public final void mRULE_QUESTI() throws RecognitionException {
        try {
            int _type = RULE_QUESTI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16839:13: ( '?' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16839:15: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUESTI"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16841:10: ( '!' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16841:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_BAND"
    public final void mRULE_BAND() throws RecognitionException {
        try {
            int _type = RULE_BAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16843:11: ( '&' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16843:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BAND"

    // $ANTLR start "RULE_BOR"
    public final void mRULE_BOR() throws RecognitionException {
        try {
            int _type = RULE_BOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16845:10: ( '|' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16845:12: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOR"

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16847:11: ( '#' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16847:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16849:9: ( '@' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16849:11: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_CARET"
    public final void mRULE_CARET() throws RecognitionException {
        try {
            int _type = RULE_CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16851:12: ( '^' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16851:14: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CARET"

    // $ANTLR start "RULE_EQUALS"
    public final void mRULE_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16853:13: ( '=' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16853:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS"

    // $ANTLR start "RULE_LESS_THAN"
    public final void mRULE_LESS_THAN() throws RecognitionException {
        try {
            int _type = RULE_LESS_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16855:16: ( '<' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16855:18: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESS_THAN"

    // $ANTLR start "RULE_MORE_THAN"
    public final void mRULE_MORE_THAN() throws RecognitionException {
        try {
            int _type = RULE_MORE_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16857:16: ( '>' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16857:18: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MORE_THAN"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16859:14: ( '%' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16859:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_REST"
    public final void mRULE_REST() throws RecognitionException {
        try {
            int _type = RULE_REST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16861:11: (~ ( RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16861:13: ~ ( RULE_SEMICOLON )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<=':')||(input.LA(1)>='<' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REST"

    public void mTokens() throws RecognitionException {
        // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:8: ( T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | RULE_ON_OFF | RULE_STATEMEN_TYPE | RULE_MAPPING_TYPE | RULE_OPTION_TYPE | RULE_IDENT_TYPE | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_ESC_CHAR | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_AND | RULE_OR | RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_REST )
        int alt13=71;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:10: T__40
                {
                mT__40(); 

                }
                break;
            case 2 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:16: T__41
                {
                mT__41(); 

                }
                break;
            case 3 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:22: T__42
                {
                mT__42(); 

                }
                break;
            case 4 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:28: T__43
                {
                mT__43(); 

                }
                break;
            case 5 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:34: T__44
                {
                mT__44(); 

                }
                break;
            case 6 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:40: T__45
                {
                mT__45(); 

                }
                break;
            case 7 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:46: T__46
                {
                mT__46(); 

                }
                break;
            case 8 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:52: T__47
                {
                mT__47(); 

                }
                break;
            case 9 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:58: T__48
                {
                mT__48(); 

                }
                break;
            case 10 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:64: T__49
                {
                mT__49(); 

                }
                break;
            case 11 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:70: T__50
                {
                mT__50(); 

                }
                break;
            case 12 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:76: T__51
                {
                mT__51(); 

                }
                break;
            case 13 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:82: T__52
                {
                mT__52(); 

                }
                break;
            case 14 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:88: T__53
                {
                mT__53(); 

                }
                break;
            case 15 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:94: T__54
                {
                mT__54(); 

                }
                break;
            case 16 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:100: T__55
                {
                mT__55(); 

                }
                break;
            case 17 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:106: T__56
                {
                mT__56(); 

                }
                break;
            case 18 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:112: T__57
                {
                mT__57(); 

                }
                break;
            case 19 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:118: T__58
                {
                mT__58(); 

                }
                break;
            case 20 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:124: T__59
                {
                mT__59(); 

                }
                break;
            case 21 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:130: T__60
                {
                mT__60(); 

                }
                break;
            case 22 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:136: T__61
                {
                mT__61(); 

                }
                break;
            case 23 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:142: T__62
                {
                mT__62(); 

                }
                break;
            case 24 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:148: T__63
                {
                mT__63(); 

                }
                break;
            case 25 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:154: T__64
                {
                mT__64(); 

                }
                break;
            case 26 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:160: T__65
                {
                mT__65(); 

                }
                break;
            case 27 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:166: T__66
                {
                mT__66(); 

                }
                break;
            case 28 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:172: T__67
                {
                mT__67(); 

                }
                break;
            case 29 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:178: T__68
                {
                mT__68(); 

                }
                break;
            case 30 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:184: T__69
                {
                mT__69(); 

                }
                break;
            case 31 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:190: T__70
                {
                mT__70(); 

                }
                break;
            case 32 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:196: T__71
                {
                mT__71(); 

                }
                break;
            case 33 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:202: T__72
                {
                mT__72(); 

                }
                break;
            case 34 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:208: T__73
                {
                mT__73(); 

                }
                break;
            case 35 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:214: T__74
                {
                mT__74(); 

                }
                break;
            case 36 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:220: RULE_ON_OFF
                {
                mRULE_ON_OFF(); 

                }
                break;
            case 37 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:232: RULE_STATEMEN_TYPE
                {
                mRULE_STATEMEN_TYPE(); 

                }
                break;
            case 38 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:251: RULE_MAPPING_TYPE
                {
                mRULE_MAPPING_TYPE(); 

                }
                break;
            case 39 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:269: RULE_OPTION_TYPE
                {
                mRULE_OPTION_TYPE(); 

                }
                break;
            case 40 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:286: RULE_IDENT_TYPE
                {
                mRULE_IDENT_TYPE(); 

                }
                break;
            case 41 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:302: RULE_IDENT_DOT
                {
                mRULE_IDENT_DOT(); 

                }
                break;
            case 42 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:317: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 43 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:328: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 44 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:340: RULE_ESC_CHAR
                {
                mRULE_ESC_CHAR(); 

                }
                break;
            case 45 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:354: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:370: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:386: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 48 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:394: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 49 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:403: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 50 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:411: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 51 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:422: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 52 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:437: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:449: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 54 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:460: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 55 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:471: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 56 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:481: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 57 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:493: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 58 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:505: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 59 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:517: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 60 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:529: RULE_QUESTI
                {
                mRULE_QUESTI(); 

                }
                break;
            case 61 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:541: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 62 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:550: RULE_BAND
                {
                mRULE_BAND(); 

                }
                break;
            case 63 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:560: RULE_BOR
                {
                mRULE_BOR(); 

                }
                break;
            case 64 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:569: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 65 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:579: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 66 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:587: RULE_CARET
                {
                mRULE_CARET(); 

                }
                break;
            case 67 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:598: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 68 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:610: RULE_LESS_THAN
                {
                mRULE_LESS_THAN(); 

                }
                break;
            case 69 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:625: RULE_MORE_THAN
                {
                mRULE_MORE_THAN(); 

                }
                break;
            case 70 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:640: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 71 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:653: RULE_REST
                {
                mRULE_REST(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\56\7\72\1\56\1\72\1\56\11\72\1\uffff\2\56\1\uffff\1\132"+
        "\1\134\33\uffff\4\72\3\uffff\10\72\1\uffff\1\72\1\uffff\1\72\1\u0080"+
        "\12\72\35\uffff\3\72\1\u008f\3\72\1\u0094\7\72\1\uffff\1\u0080\1"+
        "\u009c\1\u009d\1\u009e\6\72\1\u00a5\2\72\1\u00a8\1\uffff\3\72\1"+
        "\u00ac\1\uffff\7\72\3\uffff\2\u009e\4\u009d\1\uffff\2\72\1\uffff"+
        "\1\u00b7\1\u00b9\1\72\1\uffff\1\u00bb\1\u00bc\5\72\1\u00c2\1\72"+
        "\1\u00c4\1\uffff\1\u00c5\1\uffff\1\u00c6\2\uffff\5\72\1\uffff\1"+
        "\u00cc\3\uffff\1\72\1\u00ce\3\72\1\uffff\1\72\2\uffff\1\u00d3\1"+
        "\u00d4\13\uffff";
    static final String DFA13_eofS =
        "\u00dd\uffff";
    static final String DFA13_minS =
        "\1\0\1\142\7\50\1\52\1\50\1\135\11\50\1\uffff\1\43\1\52\1\uffff"+
        "\1\46\1\174\25\uffff\1\157\5\uffff\4\50\3\uffff\10\50\1\uffff\1"+
        "\50\1\uffff\14\50\35\uffff\17\50\1\uffff\16\50\1\uffff\4\50\1\uffff"+
        "\7\50\3\uffff\6\50\1\uffff\2\50\1\uffff\3\50\1\uffff\12\50\1\uffff"+
        "\1\50\1\uffff\1\50\2\uffff\5\50\1\uffff\1\50\3\uffff\2\50\1\40\2"+
        "\50\1\uffff\1\40\2\uffff\2\50\1\144\4\uffff\1\162\5\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\163\7\172\1\52\1\172\1\135\11\172\1\uffff\1\175\1\57"+
        "\1\uffff\1\46\1\174\25\uffff\1\171\5\uffff\4\172\3\uffff\10\172"+
        "\1\uffff\1\172\1\uffff\14\172\35\uffff\17\172\1\uffff\16\172\1\uffff"+
        "\4\172\1\uffff\7\172\3\uffff\6\172\1\uffff\2\172\1\uffff\3\172\1"+
        "\uffff\12\172\1\uffff\1\172\1\uffff\1\172\2\uffff\5\172\1\uffff"+
        "\1\172\3\uffff\5\172\1\uffff\1\172\2\uffff\2\172\1\165\4\uffff\1"+
        "\163\5\uffff";
    static final String DFA13_acceptS =
        "\25\uffff\1\53\2\uffff\1\57\2\uffff\1\62\1\63\1\64\1\65\1\66\1\67"+
        "\1\70\1\71\1\72\1\73\1\74\1\75\1\100\1\101\1\102\1\103\1\104\1\105"+
        "\1\106\1\107\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\4\uffff\1\52\1\51\1"+
        "\50\10\uffff\1\31\1\uffff\1\41\14\uffff\1\53\1\54\1\55\1\56\1\57"+
        "\1\60\1\76\1\61\1\77\1\62\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
        "\1\74\1\75\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\2\1\10\17"+
        "\uffff\1\44\16\uffff\1\12\4\uffff\1\15\7\uffff\1\46\1\47\1\45\6"+
        "\uffff\1\11\2\uffff\1\16\3\uffff\1\21\12\uffff\1\14\1\uffff\1\13"+
        "\1\uffff\1\22\1\23\5\uffff\1\24\1\uffff\1\20\1\17\1\27\5\uffff\1"+
        "\26\1\uffff\1\30\1\32\3\uffff\1\43\1\42\1\25\1\33\1\uffff\1\36\1"+
        "\37\1\40\1\34\1\35";
    static final String DFA13_specialS =
        "\1\0\u00dc\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\56\2\30\2\56\1\30\22\56\1\30\1\46\1\56\1\47\1\35\1\55\1"+
            "\31\1\56\1\41\1\42\1\56\1\40\1\36\1\37\1\11\1\27\12\25\1\33"+
            "\1\34\1\53\1\52\1\54\1\45\1\50\1\24\1\23\1\17\5\24\1\21\2\24"+
            "\1\20\2\24\1\15\1\24\1\16\1\24\1\22\7\24\1\13\1\26\1\56\1\51"+
            "\1\1\1\56\1\14\1\24\1\3\1\7\1\10\3\24\1\4\5\24\1\5\1\2\1\24"+
            "\1\12\1\24\1\6\6\24\1\43\1\32\1\44\uff82\56",
            "\1\60\1\57\1\65\1\uffff\1\64\2\uffff\1\62\2\uffff\1\63\6\uffff"+
            "\1\61",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\1\70\15\71\1\66\2\71\1\67\10\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\16\71\1\75\13\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\3\71\1\76\10\71\1\77\15\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\24\71\1\100\5\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\1\101\31\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\1\103\1\102\30\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\27\71\1\104\2\71",
            "\1\105",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\4\71\1\106\25\71",
            "\1\107",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\1\71\1\110\30\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\5\71"+
            "\1\112\7\71\1\111\1\71\1\114\4\71\1\113\5\71\4\uffff\1\71\1"+
            "\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\21\71"+
            "\1\115\10\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\1\117"+
            "\20\71\1\116\10\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\16\71"+
            "\1\120\13\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\16\71"+
            "\1\121\13\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\16\71"+
            "\1\122\13\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\16\71"+
            "\1\123\13\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "",
            "\3\125\11\uffff\1\125\12\uffff\2\125\4\uffff\1\125\72\uffff"+
            "\3\125",
            "\1\126\4\uffff\1\127",
            "",
            "\1\131",
            "\1\133",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\160\11\uffff\1\157",
            "",
            "",
            "",
            "",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\11\71\1\161\20\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\4\71\1\162\25\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\2\71\1\163\27\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\13\71\1\164\1\71\1\165\14\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\4\71\1\166\25\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\17\71\1\167\12\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\23\71\1\170\6\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\1\71\1\171\30\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\2\71\1\172\27\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\23\71\1\173\6\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\23\71\1\174\6\71",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\20\71\1\176\1\71\1\175\7\71",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\22\71\1\177\7\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\5\71"+
            "\1\u0081\24\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\23\71"+
            "\1\u0082\6\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\23\71"+
            "\1\u0083\6\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\30\71"+
            "\1\u0084\1\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\24\71"+
            "\1\u0085\5\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\13\71"+
            "\1\u0086\16\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\17\71"+
            "\1\u0087\12\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\17\71"+
            "\1\u0088\12\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\17\71"+
            "\1\u0089\12\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\17\71"+
            "\1\u008a\12\71\4\uffff\1\71\1\uffff\32\71",
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
            "",
            "",
            "",
            "",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\16\71\1\u008b\13\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\5\71\1\u008c\24\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\12\71\1\u008d\17\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\27\71\1\u008e\2\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\22\71\1\u0090\7\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\15\71\1\u0091\14\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\16\71\1\u0092\13\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\27\71\1\u0093\2\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\13\71\1\u0095\16\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\16\71\1\u0096\13\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\1\u0097\31\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\4\71\1\u0098\25\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\16\71\1\u0099\13\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\24\71\1\u009a\5\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\23\71\1\u009b\6\71",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\3\71"+
            "\1\u009f\26\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\13\71"+
            "\1\u00a0\16\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\23\71"+
            "\1\u00a1\6\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\23\71"+
            "\1\u00a2\6\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\23\71"+
            "\1\u00a3\6\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\23\71"+
            "\1\u00a4\6\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\10\71\1\u00a6\21\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\1\u00a7\31\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\23\71\1\u00a9\6\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\23\71\1\u00aa\6\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\21\71\1\u00ab\10\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\4\71\1\u00ad\25\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\13\71\1\u00ae\16\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\1\71\1\u00af\30\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\15\71\1\u00b0\14\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\13\71\1\u00b1\16\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\10\71\1\u00b2\21\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\21\71\1\u00b3\10\71",
            "",
            "",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\27\71\1\u00b4\2\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\6\71\1\u00b5\23\71",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\27\71\1\u00b6\2\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\27\71\1\u00b8\2\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\23\71\1\u00ba\6\71",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\1\u00bd\31\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\3\71\1\u00be\26\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\25\71\1\u00bf\4\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\21\71\1\u00c0\10\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\1\u00c1\31\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\4\71\1\u00c3\25\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\22\71\1\u00c7\7\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\22\71\1\u00c8\7\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\4\71\1\u00c9\25\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\4\71\1\u00ca\25\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\2\71\1\u00cb\27\71",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\4\71\1\u00cd\25\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\u00cf\7\uffff\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1"+
            "\71\3\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\3\71\1\u00d0\26\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\23\71\1\u00d1\6\71",
            "",
            "\1\u00d2\7\uffff\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1"+
            "\71\3\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\74\5\uffff\1\73\1\uffff\12\71\3\uffff\1\71\3\uffff\32\71"+
            "\4\uffff\1\71\1\uffff\32\71",
            "\1\u00da\12\uffff\1\u00d6\1\u00d8\2\uffff\1\u00d9\1\u00d5\1"+
            "\u00d7",
            "",
            "",
            "",
            "",
            "\1\u00db\1\u00dc",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | RULE_ON_OFF | RULE_STATEMEN_TYPE | RULE_MAPPING_TYPE | RULE_OPTION_TYPE | RULE_IDENT_TYPE | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_ESC_CHAR | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_AND | RULE_OR | RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_REST );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='_') ) {s = 1;}

                        else if ( (LA13_0=='p') ) {s = 2;}

                        else if ( (LA13_0=='c') ) {s = 3;}

                        else if ( (LA13_0=='i') ) {s = 4;}

                        else if ( (LA13_0=='o') ) {s = 5;}

                        else if ( (LA13_0=='t') ) {s = 6;}

                        else if ( (LA13_0=='d') ) {s = 7;}

                        else if ( (LA13_0=='e') ) {s = 8;}

                        else if ( (LA13_0=='.') ) {s = 9;}

                        else if ( (LA13_0=='r') ) {s = 10;}

                        else if ( (LA13_0=='[') ) {s = 11;}

                        else if ( (LA13_0=='a') ) {s = 12;}

                        else if ( (LA13_0=='O') ) {s = 13;}

                        else if ( (LA13_0=='Q') ) {s = 14;}

                        else if ( (LA13_0=='C') ) {s = 15;}

                        else if ( (LA13_0=='L') ) {s = 16;}

                        else if ( (LA13_0=='I') ) {s = 17;}

                        else if ( (LA13_0=='S') ) {s = 18;}

                        else if ( (LA13_0=='B') ) {s = 19;}

                        else if ( (LA13_0=='A'||(LA13_0>='D' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='K')||(LA13_0>='M' && LA13_0<='N')||LA13_0=='P'||LA13_0=='R'||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='b'||(LA13_0>='f' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='n')||LA13_0=='q'||LA13_0=='s'||(LA13_0>='u' && LA13_0<='z')) ) {s = 20;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 21;}

                        else if ( (LA13_0=='\\') ) {s = 22;}

                        else if ( (LA13_0=='/') ) {s = 23;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 24;}

                        else if ( (LA13_0=='&') ) {s = 25;}

                        else if ( (LA13_0=='|') ) {s = 26;}

                        else if ( (LA13_0==':') ) {s = 27;}

                        else if ( (LA13_0==';') ) {s = 28;}

                        else if ( (LA13_0=='$') ) {s = 29;}

                        else if ( (LA13_0==',') ) {s = 30;}

                        else if ( (LA13_0=='-') ) {s = 31;}

                        else if ( (LA13_0=='+') ) {s = 32;}

                        else if ( (LA13_0=='(') ) {s = 33;}

                        else if ( (LA13_0==')') ) {s = 34;}

                        else if ( (LA13_0=='{') ) {s = 35;}

                        else if ( (LA13_0=='}') ) {s = 36;}

                        else if ( (LA13_0=='?') ) {s = 37;}

                        else if ( (LA13_0=='!') ) {s = 38;}

                        else if ( (LA13_0=='#') ) {s = 39;}

                        else if ( (LA13_0=='@') ) {s = 40;}

                        else if ( (LA13_0=='^') ) {s = 41;}

                        else if ( (LA13_0=='=') ) {s = 42;}

                        else if ( (LA13_0=='<') ) {s = 43;}

                        else if ( (LA13_0=='>') ) {s = 44;}

                        else if ( (LA13_0=='%') ) {s = 45;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='\"'||LA13_0=='\''||LA13_0=='*'||LA13_0==']'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}