// Output created by jacc on Tue Apr 09 12:44:30 EDT 2024


import java.io.*;
import java.nio.charset.*;
import java.util.*;

class Parser implements ParserTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private ParserVal[] yysv;
    private ParserVal yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new ParserVal[yyss];
        yytok = (token
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    switch (yytok) {
                        case VOID:
                        case INT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 264;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 134:
                    switch (yytok) {
                        case INT:
                            yyn = 9;
                            continue;
                        case VOID:
                            yyn = 10;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    switch (yytok) {
                        case VOID:
                        case INT:
                        case ENDINPUT:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    switch (yytok) {
                        case INT:
                            yyn = 9;
                            continue;
                        case VOID:
                            yyn = 10;
                            continue;
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    switch (yytok) {
                        case VOID:
                        case INT:
                        case ENDINPUT:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 13;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 14;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    switch (yytok) {
                        case VOID:
                        case INT:
                        case ENDINPUT:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    switch (yytok) {
                        case VOID:
                        case INT:
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    switch (yytok) {
                        case LBRACE:
                            yyn = yyr22();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    switch (yytok) {
                        case INT:
                            yyn = 9;
                            continue;
                        case VOID:
                            yyn = 21;
                            continue;
                        case RPAREN:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    switch (yytok) {
                        case LBRACK:
                            yyn = 22;
                            continue;
                        case SEMI:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    switch (yytok) {
                        case VOID:
                        case INT:
                        case ENDINPUT:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    switch (yytok) {
                        case LBRACE:
                            yyn = 24;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    switch (yytok) {
                        case RPAREN:
                        case COMMA:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 150:
                    switch (yytok) {
                        case COMMA:
                            yyn = 25;
                            continue;
                        case RPAREN:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 26;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 152:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 27;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 153:
                    switch (yytok) {
                        case RPAREN:
                            yyn = yyr15();
                            continue;
                        case IDENTIFIER:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    switch (yytok) {
                        case NUMBER:
                            yyn = 28;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 155:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 156:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 157:
                    switch (yytok) {
                        case INT:
                            yyn = 9;
                            continue;
                        case VOID:
                            yyn = 10;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 158:
                    switch (yytok) {
                        case LBRACE:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 159:
                    switch (yytok) {
                        case LBRACK:
                            yyn = 31;
                            continue;
                        case RPAREN:
                        case COMMA:
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 160:
                    switch (yytok) {
                        case RBRACK:
                            yyn = 32;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 161:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 162:
                    switch (yytok) {
                        case RPAREN:
                        case COMMA:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 163:
                    switch (yytok) {
                        case RBRACK:
                            yyn = 36;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 164:
                    switch (yytok) {
                        case SEMI:
                            yyn = 37;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 165:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 166:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 59;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 167:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 168:
                    switch (yytok) {
                        case RPAREN:
                        case COMMA:
                            yyn = yyr20();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 169:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 170:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 171:
                    switch (yytok) {
                        case LBRACK:
                            yyn = 60;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 172:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 173:
                    switch (yytok) {
                        case SEMI:
                            yyn = 61;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 174:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 175:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 176:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 177:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 178:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 179:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 62;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 180:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 181:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 182:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 183:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 184:
                    switch (yytok) {
                        case ASSIGN:
                            yyn = 63;
                            continue;
                        case LPAREN:
                            yyn = 64;
                            continue;
                        case LBRACK:
                            yyn = yyr49();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 185:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 65;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 186:
                    switch (yytok) {
                        case LPAREN:
                            yyn = yyr57();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 187:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 188:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 73;
                            continue;
                        case LPAREN:
                            yyn = 74;
                            continue;
                        case NUMBER:
                            yyn = 75;
                            continue;
                        case SEMI:
                            yyn = 76;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 189:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 190:
                    switch (yytok) {
                        case LPAREN:
                            yyn = yyr54();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 191:
                    switch (yytok) {
                        case LBRACK:
                            yyn = 22;
                            continue;
                        case SEMI:
                            yyn = 23;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 192:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 73;
                            continue;
                        case LPAREN:
                            yyn = 74;
                            continue;
                        case NUMBER:
                            yyn = 75;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 193:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 194:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 73;
                            continue;
                        case LPAREN:
                            yyn = 74;
                            continue;
                        case NUMBER:
                            yyn = 75;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 195:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 73;
                            continue;
                        case LPAREN:
                            yyn = 74;
                            continue;
                        case NUMBER:
                            yyn = 75;
                            continue;
                        case INPUT:
                            yyn = 81;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 196:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 73;
                            continue;
                        case LPAREN:
                            yyn = 74;
                            continue;
                        case NUMBER:
                            yyn = 75;
                            continue;
                        case RPAREN:
                            yyn = yyr80();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 197:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 73;
                            continue;
                        case LPAREN:
                            yyn = 74;
                            continue;
                        case NUMBER:
                            yyn = 75;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 198:
                    yyn = yys66();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 199:
                    switch (yytok) {
                        case LBRACK:
                            yyn = 86;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 200:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 201:
                    switch (yytok) {
                        case SEMI:
                            yyn = 87;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 202:
                    yyn = yys70();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 203:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 204:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 205:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 206:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 73;
                            continue;
                        case LPAREN:
                            yyn = 74;
                            continue;
                        case NUMBER:
                            yyn = 75;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 207:
                    yyn = yys75();
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 208:
                    yyn = yys76();
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 209:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 102;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 210:
                    switch (yytok) {
                        case RBRACK:
                            yyn = 103;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 211:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 104;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 212:
                    switch (yytok) {
                        case SEMI:
                            yyn = 105;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 213:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 106;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 214:
                    switch (yytok) {
                        case COMMA:
                            yyn = 107;
                            continue;
                        case RPAREN:
                            yyn = yyr79();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 215:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 108;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 216:
                    switch (yytok) {
                        case RPAREN:
                        case COMMA:
                            yyn = yyr82();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 217:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 109;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 218:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 73;
                            continue;
                        case LPAREN:
                            yyn = 74;
                            continue;
                        case NUMBER:
                            yyn = 75;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 219:
                    yyn = yys87();
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 220:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 73;
                            continue;
                        case LPAREN:
                            yyn = 74;
                            continue;
                        case NUMBER:
                            yyn = 75;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 221:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 73;
                            continue;
                        case LPAREN:
                            yyn = 74;
                            continue;
                        case NUMBER:
                            yyn = 75;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 222:
                    switch (yytok) {
                        case LPAREN:
                        case NUMBER:
                        case IDENTIFIER:
                            yyn = yyr65();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 223:
                    switch (yytok) {
                        case LPAREN:
                        case NUMBER:
                        case IDENTIFIER:
                            yyn = yyr43();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 224:
                    switch (yytok) {
                        case LPAREN:
                        case NUMBER:
                        case IDENTIFIER:
                            yyn = yyr41();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 225:
                    switch (yytok) {
                        case LPAREN:
                        case NUMBER:
                        case IDENTIFIER:
                            yyn = yyr42();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 226:
                    switch (yytok) {
                        case LPAREN:
                        case NUMBER:
                        case IDENTIFIER:
                            yyn = yyr40();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 227:
                    switch (yytok) {
                        case LPAREN:
                        case NUMBER:
                        case IDENTIFIER:
                            yyn = yyr39();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 228:
                    switch (yytok) {
                        case LPAREN:
                        case NUMBER:
                        case IDENTIFIER:
                            yyn = yyr44();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 229:
                    switch (yytok) {
                        case LPAREN:
                        case NUMBER:
                        case IDENTIFIER:
                            yyn = yyr66();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 230:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 73;
                            continue;
                        case LPAREN:
                            yyn = 74;
                            continue;
                        case NUMBER:
                            yyn = 75;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 231:
                    switch (yytok) {
                        case LPAREN:
                        case NUMBER:
                        case IDENTIFIER:
                            yyn = yyr70();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 232:
                    switch (yytok) {
                        case LPAREN:
                        case NUMBER:
                        case IDENTIFIER:
                            yyn = yyr69();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 233:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 114;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 234:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 73;
                            continue;
                        case LPAREN:
                            yyn = 74;
                            continue;
                        case NUMBER:
                            yyn = 75;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 235:
                    switch (yytok) {
                        case ASSIGN:
                            yyn = 116;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 236:
                    switch (yytok) {
                        case SEMI:
                            yyn = 117;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 237:
                    yyn = yys105();
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 238:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 118;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 239:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 73;
                            continue;
                        case LPAREN:
                            yyn = 74;
                            continue;
                        case NUMBER:
                            yyn = 75;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 240:
                    yyn = yys108();
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 241:
                    yyn = yys109();
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 242:
                    switch (yytok) {
                        case RBRACK:
                            yyn = 121;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 243:
                    yyn = yys111();
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 244:
                    yyn = yys112();
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 245:
                    yyn = yys113();
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 246:
                    yyn = yys114();
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 247:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 122;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 248:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 73;
                            continue;
                        case LPAREN:
                            yyn = 74;
                            continue;
                        case NUMBER:
                            yyn = 75;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 249:
                    yyn = yys117();
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 250:
                    switch (yytok) {
                        case SEMI:
                            yyn = 124;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 251:
                    switch (yytok) {
                        case RPAREN:
                        case COMMA:
                            yyn = yyr81();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 252:
                    yyn = yys120();
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 253:
                    yyn = yys121();
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 254:
                    yyn = yys122();
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 255:
                    switch (yytok) {
                        case SEMI:
                            yyn = 127;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 256:
                    yyn = yys124();
                    continue;

                case 125:
                    yyst[yysp] = 125;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 257:
                    switch (yytok) {
                        case ELSE:
                            yyn = yyr52();
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 258:
                    yyn = yys126();
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 259:
                    yyn = yys127();
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 260:
                    switch (yytok) {
                        case ELSE:
                            yyn = 130;
                            continue;
                    }
                    yyn = 267;
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 261:
                    yyn = yys129();
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 262:
                    yyn = yys130();
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 263:
                    yyn = yys131();
                    continue;

                case 264:
                    return true;
                case 265:
                    yyerror("stack overflow");
                case 266:
                    return false;
                case 267:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        ParserVal[] newyysv = new ParserVal[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys23() {
        switch (yytok) {
            case WHILE:
            case VOID:
            case SEMI:
            case LBRACE:
            case RETURN:
            case INT:
            case RBRACE:
            case PRINT:
            case IF:
            case IDENTIFIER:
            case ENDINPUT:
                return yyr7();
        }
        return 267;
    }

    private int yys24() {
        switch (yytok) {
            case WHILE:
            case VOID:
            case SEMI:
            case LBRACE:
            case RETURN:
            case INT:
            case RBRACE:
            case PRINT:
            case IF:
            case IDENTIFIER:
                return yyr24();
        }
        return 267;
    }

    private int yys29() {
        switch (yytok) {
            case INT:
                return 9;
            case VOID:
                return 10;
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case IDENTIFIER:
                return yyr26();
        }
        return 267;
    }

    private int yys33() {
        switch (yytok) {
            case IDENTIFIER:
                return 52;
            case IF:
                return 53;
            case PRINT:
                return 54;
            case RBRACE:
                return 55;
            case RETURN:
                return 56;
            case SEMI:
                return 57;
            case WHILE:
                return 58;
            case LBRACE:
                return yyr22();
        }
        return 267;
    }

    private int yys35() {
        switch (yytok) {
            case WHILE:
            case VOID:
            case SEMI:
            case LBRACE:
            case RETURN:
            case INT:
            case RBRACE:
            case PRINT:
            case IF:
            case IDENTIFIER:
                return yyr23();
        }
        return 267;
    }

    private int yys37() {
        switch (yytok) {
            case WHILE:
            case VOID:
            case SEMI:
            case LBRACE:
            case RETURN:
            case INT:
            case RBRACE:
            case PRINT:
            case IF:
            case IDENTIFIER:
            case ENDINPUT:
                return yyr8();
        }
        return 267;
    }

    private int yys38() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr38();
        }
        return 267;
    }

    private int yys40() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr27();
        }
        return 267;
    }

    private int yys42() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr34();
        }
        return 267;
    }

    private int yys43() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr28();
        }
        return 267;
    }

    private int yys44() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr33();
        }
        return 267;
    }

    private int yys45() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr30();
        }
        return 267;
    }

    private int yys46() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr32();
        }
        return 267;
    }

    private int yys48() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr31();
        }
        return 267;
    }

    private int yys49() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr29();
        }
        return 267;
    }

    private int yys50() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case IDENTIFIER:
                return yyr25();
        }
        return 267;
    }

    private int yys51() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr37();
        }
        return 267;
    }

    private int yys55() {
        switch (yytok) {
            case WHILE:
            case VOID:
            case SEMI:
            case LBRACE:
            case RETURN:
            case INT:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
            case ENDINPUT:
                return yyr21();
        }
        return 267;
    }

    private int yys57() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr35();
        }
        return 267;
    }

    private int yys61() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr36();
        }
        return 267;
    }

    private int yys66() {
        switch (yytok) {
            case GT:
            case SEMI:
            case RPAREN:
            case EQ:
            case COMMA:
            case RBRACK:
            case NOTEQ:
            case SUBOP:
            case MULOP:
            case LTE:
            case LT:
            case GTE:
            case DIVOP:
            case ADDOP:
                return yyr73();
        }
        return 267;
    }

    private int yys68() {
        switch (yytok) {
            case GT:
            case SEMI:
            case RPAREN:
            case EQ:
            case COMMA:
            case RBRACK:
            case NOTEQ:
            case SUBOP:
            case MULOP:
            case LTE:
            case LT:
            case GTE:
            case DIVOP:
            case ADDOP:
                return yyr74();
        }
        return 267;
    }

    private int yys70() {
        switch (yytok) {
            case GT:
            case SEMI:
            case RPAREN:
            case EQ:
            case COMMA:
            case RBRACK:
            case NOTEQ:
            case SUBOP:
            case MULOP:
            case LTE:
            case LT:
            case GTE:
            case DIVOP:
            case ADDOP:
                return yyr68();
        }
        return 267;
    }

    private int yys71() {
        switch (yytok) {
            case ADDOP:
                return 90;
            case EQ:
                return 91;
            case GT:
                return 92;
            case GTE:
                return 93;
            case LT:
                return 94;
            case LTE:
                return 95;
            case NOTEQ:
                return 96;
            case SUBOP:
                return 97;
            case SEMI:
            case RPAREN:
            case COMMA:
            case RBRACK:
                return yyr62();
        }
        return 267;
    }

    private int yys72() {
        switch (yytok) {
            case DIVOP:
                return 99;
            case MULOP:
                return 100;
            case GT:
            case SEMI:
            case RPAREN:
            case EQ:
            case COMMA:
            case SUBOP:
            case RBRACK:
            case NOTEQ:
            case LTE:
            case LT:
            case GTE:
            case ADDOP:
                return yyr46();
        }
        return 267;
    }

    private int yys73() {
        switch (yytok) {
            case LPAREN:
                return 64;
            case LBRACK:
                return yyr77();
            case GT:
            case SEMI:
            case RPAREN:
            case EQ:
            case COMMA:
            case RBRACK:
            case NOTEQ:
            case SUBOP:
            case MULOP:
            case LTE:
            case LT:
            case GTE:
            case DIVOP:
            case ADDOP:
                return yyr72();
        }
        return 267;
    }

    private int yys75() {
        switch (yytok) {
            case GT:
            case SEMI:
            case RPAREN:
            case EQ:
            case COMMA:
            case RBRACK:
            case NOTEQ:
            case SUBOP:
            case MULOP:
            case LTE:
            case LT:
            case GTE:
            case DIVOP:
            case ADDOP:
                return yyr75();
        }
        return 267;
    }

    private int yys76() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr59();
        }
        return 267;
    }

    private int yys87() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr60();
        }
        return 267;
    }

    private int yys105() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr47();
        }
        return 267;
    }

    private int yys108() {
        switch (yytok) {
            case GT:
            case SEMI:
            case RPAREN:
            case EQ:
            case COMMA:
            case RBRACK:
            case NOTEQ:
            case SUBOP:
            case MULOP:
            case LTE:
            case LT:
            case GTE:
            case DIVOP:
            case ADDOP:
                return yyr78();
        }
        return 267;
    }

    private int yys109() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case PRINT:
            case IF:
            case IDENTIFIER:
                return yyr51();
        }
        return 267;
    }

    private int yys111() {
        switch (yytok) {
            case DIVOP:
                return 99;
            case MULOP:
                return 100;
            case GT:
            case SEMI:
            case RPAREN:
            case EQ:
            case COMMA:
            case SUBOP:
            case RBRACK:
            case NOTEQ:
            case LTE:
            case LT:
            case GTE:
            case ADDOP:
                return yyr45();
        }
        return 267;
    }

    private int yys112() {
        switch (yytok) {
            case ADDOP:
                return 90;
            case SUBOP:
                return 97;
            case SEMI:
            case RPAREN:
            case COMMA:
            case RBRACK:
                return yyr61();
        }
        return 267;
    }

    private int yys113() {
        switch (yytok) {
            case GT:
            case SEMI:
            case RPAREN:
            case EQ:
            case COMMA:
            case RBRACK:
            case NOTEQ:
            case SUBOP:
            case MULOP:
            case LTE:
            case LT:
            case GTE:
            case DIVOP:
            case ADDOP:
                return yyr67();
        }
        return 267;
    }

    private int yys114() {
        switch (yytok) {
            case GT:
            case SEMI:
            case RPAREN:
            case EQ:
            case COMMA:
            case RBRACK:
            case NOTEQ:
            case SUBOP:
            case MULOP:
            case LTE:
            case LT:
            case GTE:
            case DIVOP:
            case ADDOP:
                return yyr71();
        }
        return 267;
    }

    private int yys117() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr56();
        }
        return 267;
    }

    private int yys120() {
        switch (yytok) {
            case IDENTIFIER:
                return 52;
            case IF:
                return 53;
            case PRINT:
                return 54;
            case RETURN:
                return 56;
            case SEMI:
                return 57;
            case WHILE:
                return 58;
            case LBRACE:
                return yyr22();
        }
        return 267;
    }

    private int yys121() {
        switch (yytok) {
            case GT:
            case SEMI:
            case RPAREN:
            case EQ:
            case COMMA:
            case RBRACK:
            case NOTEQ:
            case SUBOP:
            case MULOP:
            case LTE:
            case LT:
            case GTE:
            case DIVOP:
            case ADDOP:
                return yyr76();
        }
        return 267;
    }

    private int yys122() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case PRINT:
            case IF:
            case IDENTIFIER:
                return yyr55();
        }
        return 267;
    }

    private int yys124() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr58();
        }
        return 267;
    }

    private int yys126() {
        switch (yytok) {
            case IDENTIFIER:
                return 52;
            case IF:
                return 53;
            case PRINT:
                return 54;
            case RETURN:
                return 56;
            case SEMI:
                return 57;
            case WHILE:
                return 58;
            case LBRACE:
                return yyr22();
        }
        return 267;
    }

    private int yys127() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr48();
        }
        return 267;
    }

    private int yys129() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr53();
        }
        return 267;
    }

    private int yys130() {
        switch (yytok) {
            case IDENTIFIER:
                return 52;
            case IF:
                return 53;
            case PRINT:
                return 54;
            case RETURN:
                return 56;
            case SEMI:
                return 57;
            case WHILE:
                return 58;
            case LBRACE:
                return yyr22();
        }
        return 267;
    }

    private int yys131() {
        switch (yytok) {
            case WHILE:
            case SEMI:
            case LBRACE:
            case RETURN:
            case RBRACE:
            case PRINT:
            case IF:
            case ELSE:
            case IDENTIFIER:
                return yyr50();
        }
        return 267;
    }

    private int yyr1() { // program : program_start declaration_list
        {
                        // CODEGEN if input instruction, generate read code
                        // CODEGEN generate the class constructor
                        // CODEGEN generate the epilog
                        // SYMTAB exit scope
                        // SEMANTIC if no main function, report semantic error 
                }
        yysv[yysp-=2] = yyrv;
        return 1;
    }

    private int yyr65() { // addop : ADDOP
        yysp -= 1;
        return 88;
    }

    private int yyr66() { // addop : SUBOP
        yysp -= 1;
        return 88;
    }

    private int yyr81() { // arg_list : arg_list COMMA expression
        yysp -= 3;
        return 82;
    }

    private int yyr82() { // arg_list : expression
        yysp -= 1;
        return 82;
    }

    private int yyr79() { // args : arg_list
        yysp -= 1;
        return 83;
    }

    private int yyr80() { // args : /* empty */
        return 83;
    }

    private int yyr48() { // arr_assign_stmt : arr_assign_stmt_name LBRACK expression RBRACK ASSIGN expression SEMI
        {
                        // CODEGEN generate IA store
                }
        yysv[yysp-=7] = yyrv;
        return 38;
    }

    private int yyr49() { // arr_assign_stmt_name : IDENTIFIER
        {
                        // SYMTAB get name from item 1 in rule

                        // SYMTAB get the record from the symbol table
                        // SYMTAB if not found (null), semantic error, undeclared
                        
                        // SYMTAB else if it isn't an array variable, semantic error
                        
                        // CODEGEN else ok, generate load array address
                }
        yysv[yysp-=1] = yyrv;
        return 39;
    }

    private int yyr76() { // arr_factor : arr_factor_name LBRACK expression RBRACK
        {
                        // CODEGEN generate IA load
                }
        yysv[yysp-=4] = yyrv;
        return 66;
    }

    private int yyr77() { // arr_factor_name : IDENTIFIER
        {
                        // SYMTAB get name from item 1 of rule

                        // SYMTAB get the record from the symbol table
                        // SYMTAB if not found (null), semantic error, undeclared
                        
                        // SYMTAB else if it isn't an array variable, semantic error
                        
                        // CODEGEN else ok, generate load array address
                }
        yysv[yysp-=1] = yyrv;
        return 67;
    }

    private int yyr37() { // assign_stmt : var_assign_stmt
        yysp -= 1;
        return 40;
    }

    private int yyr38() { // assign_stmt : arr_assign_stmt
        yysp -= 1;
        return 40;
    }

    private int yyr78() { // call : IDENTIFIER LPAREN args RPAREN
        {
                        // SYMTAB get name from item 1 of rule
                        
                        // SYMTAB get the record from the symbol table
                        // SYMTAB if not found (null), semantic error, undeclared
                        
                        // SYMTAB else if it isn't a function, semantic error
                        
                        // CODEGEN else ok, generate function call
                }
        yysv[yysp-=4] = yyrv;
        switch (yyst[yysp-1]) {
            case 130: return 41;
            case 126: return 41;
            case 120: return 41;
            case 33: return 41;
            default: return 68;
        }
    }

    private int yyr36() { // call_stmt : call SEMI
        yysp -= 2;
        return 42;
    }

    private int yyr21() { // compound_stmt : compound_stmt_start LBRACE local_declarations statement_list RBRACE
        {
                        // SYMTAB exit scope
                }
        yysv[yysp-=5] = yyrv;
        switch (yyst[yysp-1]) {
            case 12: return 15;
            default: return 43;
        }
    }

    private int yyr22() { // compound_stmt_start : /* empty */
        {
                        // special handling when part of a fun_decl
                        if (firstTime)
                        {
                                // reset to false here to clear for next time needed
                                firstTime = false;
                        }
                        else
                        {
                                // SYMTAB enter scope
                        }
                }
        yysv[yysp-=0] = yyrv;
        return 16;
    }

    private int yyr5() { // declaration : var_declaration
        yysp -= 1;
        return yypdeclaration();
    }

    private int yyr6() { // declaration : fun_declaration
        yysp -= 1;
        return yypdeclaration();
    }

    private int yypdeclaration() {
        switch (yyst[yysp-1]) {
            case 2: return 3;
            default: return 11;
        }
    }

    private int yyr3() { // declaration_list : declaration_list declaration
        yysp -= 2;
        return 4;
    }

    private int yyr4() { // declaration_list : declaration
        yysp -= 1;
        return 4;
    }

    private int yyr61() { // expression : additive_expression relop additive_expression
        {
                        // CODEGEN get value of relational op from item 2 of rule

                        // CODEGEN generate relational oper
                }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr62() { // expression : additive_expression
        yysp -= 1;
        return yypexpression();
    }

    private int yypexpression() {
        switch (yyst[yysp-1]) {
            case 107: return 119;
            case 102: return 115;
            case 86: return 110;
            case 74: return 101;
            case 65: return 85;
            case 64: return 84;
            case 63: return 80;
            case 62: return 79;
            case 60: return 78;
            case 56: return 69;
            default: return 123;
        }
    }

    private int yyr71() { // factor : LPAREN expression RPAREN
        yysp -= 3;
        return yypfactor();
    }

    private int yyr72() { // factor : IDENTIFIER
        {
                        // SYMTAB get name from item 1 of rule

                        // SYMTAB get the record from the symbol table
                        // SYMTAB if not found (null), semantic error, undeclared
                        
                        // SYMTAB else if it isn't a regular variable or an array variable, semantic error, undeclared

                        // CODEGEN else if it IS a regular variable, generate load var

                        // CODEGEN else (it's an array variable), generate load array address
                }
        yysv[yysp-=1] = yyrv;
        return yypfactor();
    }

    private int yyr73() { // factor : arr_factor
        yysp -= 1;
        return yypfactor();
    }

    private int yyr74() { // factor : call
        yysp -= 1;
        return yypfactor();
    }

    private int yyr75() { // factor : NUMBER
        {
                        // CODEGEN generate load constant
                }
        yysv[yysp-=1] = yyrv;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 98: return 113;
            default: return 70;
        }
    }

    private int yyr11() { // fun_declaration : fun_name fun_params compound_stmt
        {
                        firstTime = true; // first time we're generating function end
                        
                        // CODEGEN generate function end
                }
        yysv[yysp-=3] = yyrv;
        return 5;
    }

    private int yyr12() { // fun_name : type_specifier IDENTIFIER
        {
                        // Get the return type and name of function
                        int rettype = yysv[yysp-2].ival;
                        String name = yysv[yysp-1].sval;
                        
                        // Remember return type and name for use later
                        returnTypes.push(rettype);
                        functionNames.push(name);

                        // SYMTAB create a function record

                        // SYMTAB lookup function name in symbol table
                        // SEMANTIC if name already in table, redeclaration error
                        
                        // SEMANTIC else if we haven't yet seen a main function
                        // SEMANTIC then add it to the symbol table, set its jvm number to 0 (for new function)
                        // SEMANTIC and if it is "main" the remember it (seenMain) and set
                        // SEMANTIC its jvm number to 1 (for main)

                        // SEMANTIC else the function is declared after main, error

                        // Remember the function record for later use
                        symTabRecs.push(rec);

                        // SYMTAB enter scope (for both params and compound_stmt coming next)
                        symtab.enterScope();
                }
        yysv[yysp-=2] = yyrv;
        return 6;
    }

    private int yyr13() { // fun_params : LPAREN params RPAREN
        {
                        // Get the return type and function name we saved
                        int rettype = returnTypes.pop();
                        String name = functionNames.pop();

                        // Get parameter list (from 2nd item in grammar rule)
                        @SuppressWarnings("unchecked")
                        List<SymTabRec> paramList = (List<SymTabRec>)yysv[yysp-2].obj;
                        
                        // Get the function record we remembered
                        FunRec rec = (FunRec)symTabRecs.pop();
                        
                        // Set its parameter list
                        rec.setParams(paramList);
                        
                        // Perform some semantic checks on the function
                        // SEMANTIC if name is "main"
                        // SEMANTIC and its return type is not VOID, has to be void
                        // SEMANTIC if its parameter list is null, can't be empty

                        // CODEGEN generate function beginning
                }
        yysv[yysp-=3] = yyrv;
        return 12;
    }

    private int yyr51() { // go_to_else : /* empty */
        {
                        // Create and remember else part label and write goto after condition
                        String label = "IfFirst" + GenCode.getLabel();
                        firstSelectionLabels.push(label);
                        
                        // CODEGEN generate fgoto label
                }
        yysv[yysp-=0] = yyrv;
        return 120;
    }

    private int yyr52() { // go_to_end_else : /* empty */
        {
                        // Create and remember end label, write go to
                        String label = "IfLast" + GenCode.getLabel();
                        lastSelectionLabels.push(label);
                        
                        // CODGEN generate goto label
                        
                        // Get the else part label and write before else part
                        label = firstSelectionLabels.pop();
                        
                        // CODEGEN generate label
                }
        yysv[yysp-=0] = yyrv;
        return 128;
    }

    private int yyr55() { // goto_end : /* empty */
        {
                        // Create and remember end label, write fgoto end
                        String label = "WhileLast" + GenCode.getLabel();
                        lastIterationLabels.push(label);
                        
                        // CODEGEN generate fgoto label
                }
        yysv[yysp-=0] = yyrv;
        return 126;
    }

    private int yyr58() { // input_stmt : IDENTIFIER ASSIGN INPUT LPAREN RPAREN SEMI
        {
                        // SYMTAB get name from item 1 of grammar rule

                        // SYMTAB get the record from the symbol table
                        // SYMTAB if not found (null), semantic error, undeclared
                        
                        // SYMTAB else if it isn't a regular variable, semantic error
                        
                        // CODEGEN else ok, set "usesRead" to true, generate read
                }
        yysv[yysp-=6] = yyrv;
        return 44;
    }

    private int yyr53() { // iteration_stmt : WHILE top_label LPAREN expression RPAREN goto_end statement
        {                       
                        // Get and write the goto top
                        String label = firstIterationLabels.pop();
                        
                        // CODEGEN generate goto label
                
                        // Get the end label and write at end of while statement
                        label = lastIterationLabels.pop();
                        
                        // CODEGEN generate label
                }
        yysv[yysp-=7] = yyrv;
        return 45;
    }

    private int yyr23() { // local_declarations : local_declarations var_declaration
        yysp -= 2;
        return 29;
    }

    private int yyr24() { // local_declarations : /* empty */
        return 29;
    }

    private int yyr69() { // mulop : MULOP
        yysp -= 1;
        return 98;
    }

    private int yyr70() { // mulop : DIVOP
        yysp -= 1;
        return 98;
    }

    private int yyr19() { // param : type_specifier IDENTIFIER
        {
                        // SYMTAB get the type and name

                        // SYMTAB create a VarRec

                        // SYMTAB lookup the name in the symbol table
                        // SYMTAB if already in table, redeclaration error

                        // SYMTAB else insert it into the symbol table
                        
                        // SYMTAB return it as a ParserVal via yyrv return value
                }
        yysv[yysp-=2] = yyrv;
        return yypparam();
    }

    private int yyr20() { // param : type_specifier IDENTIFIER LBRACK RBRACK
        {
                        // SYMTAB get the type and name

                        // SYMTAB create a VarRec (with -1 size as placeholder)

                        // SYMTAB lookup in symbol table
                        // SYMTAB if already in table, redeclaration error
                        
                        // SYMTAB else insert it into the table
                        
                        // SYMTAB return it as a ParserVal via yyrv return value
                }
        yysv[yysp-=4] = yyrv;
        return yypparam();
    }

    private int yypparam() {
        switch (yyst[yysp-1]) {
            case 13: return 17;
            default: return 30;
        }
    }

    private int yyr17() { // param_list : param_list COMMA param
        {
                        // Get the parameter list from item 1 in grammar rule
                        @SuppressWarnings("unchecked")
                        // SYMTAB yysv[yysp-3] has the object that is a List<SymTabRec>
                        
                        // Get the parameter from item 3 in the grammar rule
                        // SYMTAB yysv[yysp-1] has the object that is a SymTabRec
                        
                        // Add the parameter to the parameter list
                        // SYMTAB add the param to the param_list (variable)
                        
                        // Return the value
                        // SYMTAB return the param_list as a ParserVal to return value yyrv
                }
        yysv[yysp-=3] = yyrv;
        return 18;
    }

    private int yyr18() { // param_list : param
        {
                        // SYMTAB create an empty List<SymTabRec>
                        // SYMTAB get yysv[yysp-1] object as a SymTabRec
                        // SYMTAB add the param rec to the list
                        // SYMTAB return the list as a ParserVal to return value yyrv
                }
        yysv[yysp-=1] = yyrv;
        return 18;
    }

    private int yyr14() { // params : param_list
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 19;
    }

    private int yyr15() { // params : VOID
        { yyrv = new ParserVal(null); }
        yysv[yysp-=1] = yyrv;
        return 19;
    }

    private int yyr16() { // params : /* empty */
        { yyrv = new ParserVal(null); }
        yysv[yysp-=0] = yyrv;
        return 19;
    }

    private int yyr56() { // print_stmt : print_stmt_start LPAREN expression RPAREN SEMI
        {
                        // CODEGEN generate end print
                }
        yysv[yysp-=5] = yyrv;
        return 46;
    }

    private int yyr57() { // print_stmt_start : PRINT
        {
                        // CODEGEN generate begin print
                }
        yysv[yysp-=1] = yyrv;
        return 47;
    }

    private int yyr45() { // additive_expression : additive_expression addop term
        yysp -= 3;
        return yypadditive_expression();
    }

    private int yyr46() { // additive_expression : term
        yysp -= 1;
        return yypadditive_expression();
    }

    private int yyr63() { // additive_expression : additive_expression addop term
        {
                        // CODEGEN generate arithmetic oper
                }
        yysv[yysp-=3] = yyrv;
        return yypadditive_expression();
    }

    private int yyr64() { // additive_expression : term
        yysp -= 1;
        return yypadditive_expression();
    }

    private int yypadditive_expression() {
        switch (yyst[yysp-1]) {
            case 89: return 112;
            default: return 71;
        }
    }

    private int yyr2() { // program_start : /* empty */
        {
                        // SYMTAB enter scope
                        // CODEGEN generate prolog
                }
        yysv[yysp-=0] = yyrv;
        return 2;
    }

    private int yyr39() { // relop : LTE
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 89;
    }

    private int yyr40() { // relop : LT
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 89;
    }

    private int yyr41() { // relop : GT
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 89;
    }

    private int yyr42() { // relop : GTE
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 89;
    }

    private int yyr43() { // relop : EQ
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 89;
    }

    private int yyr44() { // relop : NOTEQ
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 89;
    }

    private int yyr59() { // return_stmt : RETURN SEMI
        {
                        // CODEGEN generate return
                }
        yysv[yysp-=2] = yyrv;
        return 48;
    }

    private int yyr60() { // return_stmt : RETURN expression SEMI
        {
                        // CODEGEN generate I return
                }
        yysv[yysp-=3] = yyrv;
        return 48;
    }

    private int yyr50() { // selection_stmt : IF LPAREN expression RPAREN go_to_else statement go_to_end_else ELSE statement
        {
                        // Get the end label and write at end of if statement
                        String label = lastSelectionLabels.pop();
                        
                        // CODEGEN generate label
                }
        yysv[yysp-=9] = yyrv;
        return 49;
    }

    private int yyr27() { // statement : assign_stmt
        yysp -= 1;
        return yypstatement();
    }

    private int yyr28() { // statement : compound_stmt
        yysp -= 1;
        return yypstatement();
    }

    private int yyr29() { // statement : selection_stmt
        yysp -= 1;
        return yypstatement();
    }

    private int yyr30() { // statement : iteration_stmt
        yysp -= 1;
        return yypstatement();
    }

    private int yyr31() { // statement : return_stmt
        yysp -= 1;
        return yypstatement();
    }

    private int yyr32() { // statement : print_stmt
        yysp -= 1;
        return yypstatement();
    }

    private int yyr33() { // statement : input_stmt
        yysp -= 1;
        return yypstatement();
    }

    private int yyr34() { // statement : call_stmt
        yysp -= 1;
        return yypstatement();
    }

    private int yyr35() { // statement : SEMI
        yysp -= 1;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 126: return 129;
            case 120: return 125;
            case 33: return 50;
            default: return 131;
        }
    }

    private int yyr25() { // statement_list : statement_list statement
        yysp -= 2;
        return 33;
    }

    private int yyr26() { // statement_list : /* empty */
        return 33;
    }

    private int yyr67() { // term : term mulop factor
        {
                        // CODEGEN generate aritmetic oper
                }
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yyr68() { // term : factor
        yysp -= 1;
        return yypterm();
    }

    private int yypterm() {
        switch (yyst[yysp-1]) {
            case 88: return 111;
            default: return 72;
        }
    }

    private int yyr54() { // top_label : /* empty */
        {
                        // Create and remember top label and write at top of while loop
                        String label = "WhileFirst" + GenCode.getLabel();
                        firstIterationLabels.push(label);
                        
                        // CODEGEN generate label
                }
        yysv[yysp-=0] = yyrv;
        return 77;
    }

    private int yyr9() { // type_specifier : INT
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yyptype_specifier();
    }

    private int yyr10() { // type_specifier : VOID
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yyptype_specifier();
    }

    private int yyptype_specifier() {
        switch (yyst[yysp-1]) {
            case 29: return 34;
            case 4: return 7;
            case 2: return 7;
            default: return 20;
        }
    }

    private int yyr47() { // var_assign_stmt : IDENTIFIER ASSIGN expression SEMI
        {
                        // SYMTAB get identifier name from item 1 in grammar rule
                        
                        // SYMTAB get the record from the symbol table
                        // SYMTAB if not found (null), semantic error, undeclared
                        
                        // SYMTAB else if it isn't a regular variable, semantic error
                        
                        // CODEGEN else ok, generate store
                }
        yysv[yysp-=4] = yyrv;
        return 51;
    }

    private int yyr7() { // var_declaration : type_specifier IDENTIFIER SEMI
        {
                        // SYMTAB get type and name
                        
                        // SYMTAB lookup name in table, semantic error if already present, redeclaration
                        
                        // SEMANTIC else if type is void, semantic error, invalid type
                        
                        // SYMTAB got here, so ok, create variable record, insert in symbol table
                        // CODEGEN and also generate static variable declaration of scope is global (0)
                }
        yysv[yysp-=3] = yyrv;
        return yypvar_declaration();
    }

    private int yyr8() { // var_declaration : type_specifier IDENTIFIER LBRACK NUMBER RBRACK SEMI
        {
                        // SYMTAB get type, name, array length
                        
                        // SYMTAB lookup name in table, semantic error if already present, redeclaration
                        
                        // SEMANTIC else if type is void, semantic error, invalid type
                        
                        // SYMTAB got here, so ok, create variable record, insert in symbol table
                        // CODEGEN and also generate static variable declaration of scope is global (0)
                        // CODEGEN or if not global, generate array init for local variable
                }
        yysv[yysp-=6] = yyrv;
        return yypvar_declaration();
    }

    private int yypvar_declaration() {
        switch (yyst[yysp-1]) {
            case 29: return 35;
            default: return 8;
        }
    }

    protected String[] yyerrmsgs = {
    };


private String program;
private String name;

Stack<String> firstSelectionLabels = new Stack<String>();
Stack<String> lastSelectionLabels = new Stack<String>();
Stack<String> firstIterationLabels = new Stack<String>();
Stack<String> lastIterationLabels = new Stack<String>();

Stack<String> functionNames = new Stack<String>();
Stack<Integer> returnTypes = new Stack<Integer>();

/* reference to a temporary SymTabRec */
Stack<SymTabRec> symTabRecs = new Stack<SymTabRec>();

/* reference to the lexer object */
private static Yylex lexer;

ParserVal yylval; // current token value
int token;  // current token

/* The symbol table */
public final SymTab<SymTabRec> symtab = new SymTab<SymTabRec>();

/* To check if main has been encountered and is the last declaration */
private boolean seenMain = false;

/* To take care of nuance associated with params and decls in compound stmt */
private boolean firstTime = true;

/* To gen boilerplate code for read only if input was encountered  */
private boolean usesRead = false;

/* Interface to the lexer */
private int yylex()
{
    int retVal = -1;
    try
        {
                retVal = lexer.yylex();
    }
        catch (IOException e)
        {
                System.err.println("IO Error:" + e);
    }
    return retVal;
}
        
/* syntax errors */
public void yyerror (String error)
{
    System.err.println("Parse Error : " + error);
}

/* semantic errors */
public void semerror (String error)
{
        if (ParseMain.SYMBOL_TABLE_OUTPUT)
        {
        System.err.println("Semantic Error : " + error);
        }
}

/* constructor taking a Reader object */
public Parser (Reader r)
{
        lexer = new Yylex(r, this);
}

/* constructor taking a String */
public Parser(String name, String program)
{
        this.name = name;
        this.program = program;
        InputStream lineStream = new ByteArrayInputStream(program.getBytes((Charset.forName("UTF-8"))));
        InputStreamReader r = new InputStreamReader(lineStream);
        lexer = new Yylex(r, this);
        token = yylex(); // prime the pump
}

}
