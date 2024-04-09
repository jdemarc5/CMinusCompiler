/* cminus.flex - scanner for C-Minus programming language. */
/* Author: Your Name */
/* Date: the date */

%%

%unicode
%line
%column
%standalone
%implements ParserTokens

/* uncomment %debug to see verbose scanner output */
//%debug

%{
	// Store a reference to the parser object. Needed to reference yylval.
	private Parser yyparser;

	// constructor taking an additional parser
	public Yylex(java.io.Reader r, Parser yyparser)
	{
		this(r);	
		this.yyparser = yyparser;
	}
	
	// Returns current line number
	public int getLine()
	{
		return yyline;
	}

	// Returns current column number
	public int getCol()
	{
		return yycolumn;
	}
	
	public int value;

%}

digit = [0-9]
letter = [A-Za-z]

// integer is either 0 or any number
// of digits starting with 1-9
integer = "0"|[1-9]{digit}*

// identifier sequence of letters, digits, 
// and underscores, starting with a letter
identifier = ({letter})({letter}|{digit}|"_")*

newline = \r|\n|\r\n
whitespace     = [\s]+

// There are two forms of comments: 
// One starts with /*, ends with */, 
blockcomment = "/*"( (\*+[^/*]) | ([^*]) )*\**"*/"
// another begins with // and goes to the end of the line.
linecomment = "//".*{newline}

%%


"else"				{ return ELSE; }
"if"				{ return IF; }
"int"				{ yyparser.yylval = new ParserVal(INT); return INT; }
"return" 			{ return RETURN; }
"void"				{ yyparser.yylval = new ParserVal(VOID); return VOID; }
"while"				{ return WHILE; }
"print"				{ return PRINT; }
"input"				{ return INPUT; }

"<"					{ yyparser.yylval = new ParserVal(LT); return LT; }
"<="				{ yyparser.yylval = new ParserVal(LTE); return LTE; }
">"					{ yyparser.yylval = new ParserVal(GT); return GT; }
">="				{ yyparser.yylval = new ParserVal(GTE); return GTE; }
"=="				{ yyparser.yylval = new ParserVal(EQ); return EQ; }
"!="				{ yyparser.yylval = new ParserVal(NOTEQ); return NOTEQ; }

"+"					{ yyparser.yylval = new ParserVal(ADDOP); return ADDOP; }
"-"					{ yyparser.yylval = new ParserVal(SUBOP); return SUBOP; }
"*"					{ yyparser.yylval = new ParserVal(MULOP); return MULOP; }
"/"					{ yyparser.yylval = new ParserVal(DIVOP); return DIVOP; }

"="					{ return ASSIGN; }
","					{ return COMMA; }
";"					{ return SEMI; }

"("					{ return LPAREN; }
")"					{ return RPAREN; }
"["					{ return LBRACK; }
"]"					{ return RBRACK; }
"{"					{ return LBRACE; }
"}"					{ return RBRACE; }

{identifier}		{ String identifier = yytext();
					  yyparser.yylval = new ParserVal(identifier);
					  return IDENTIFIER; }

{whitespace}		{/* ignore */}

{blockcomment} 		{ /* ignore */ }
{linecomment} 		{ /* ignore */ }

<<EOF>>				{ return ENDINPUT; }
.					{ return UNKNOWN; }
