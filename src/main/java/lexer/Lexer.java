package lexer;

import token.*;
 
public class Lexer {

    final char nullChar = (char) 0;

    String input;
    int position;
    int readPosition;
    char ch;

    public Lexer(String input) {
        this.input = input;
        this.position = 0;
        this.readPosition = 0;
        this.ch = nullChar;

        readChar();
   }


    public Token nextToken() {
        return switch(ch) {
            case '#' -> char1(TokenType.Hash);

            case '+' -> char1(TokenType.Plus);
            case '-' -> char1(TokenType.Minus);
            case '*' -> char1(TokenType.Asterisk);
            case '/' -> char1(TokenType.Slash);

            case '%' -> char1(TokenType.Percent);
            case '?' -> char1(TokenType.Question);
            case '!' -> char1(TokenType.Bang);
            case '~' -> char1(TokenType.Tilde);

            case '|' -> char1(TokenType.BitOr);
            case '&' -> char1(TokenType.BitAnd);

            case '.' -> char1(TokenType.Dot);
            case ':' -> char1(TokenType.Colon);

            case ',' -> char1(TokenType.Comma);
            case ';' -> char1(TokenType.Semicolon);

            case '>' -> char1(TokenType.GT);
            case '<' -> char1(TokenType.LT);

            case '(' -> char1(TokenType.Lparan);
            case ')' -> char1(TokenType.Rparan);
            case '{' -> char1(TokenType.Lbrace);
            case '}' -> char1(TokenType.Rbrace);

            case nullChar -> char0(TokenType.Eof);

            default -> char1(TokenType.Illegal);
        };
    }

    // advances position
    // updates ch
    void readChar() {
        if (readPosition < input.length()) {
            position = readPosition;
            ch = input.charAt(position);
        } else {
            position = input.length();
            ch = nullChar;
        }

        readPosition++;
    }

    Token char1(TokenType tk) {
        Token tok = new Token(tk, input.substring(position, position + 1));
        readChar();
        return tok;
    }

    Token char0(TokenType tk) {
        return new Token(tk, "");
    }

    // TODO: implementation
    // peek one char
    char peek() {
        throw new RuntimeException("not implemented");
    }

    // TODO: implementation
    // peek nth char
    char peek(int nth) {
        throw new RuntimeException("not implemented");
    }


    // checking functions

    public static boolean isAlphabet(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }

    public static boolean isAlphabet(byte ch) {
        return isAlphabet((char) ch);
    }

    // TODO: implementation
    public static boolean isDigit(char ch) {
        throw new RuntimeException("not implemented");
    }

    public static boolean isDigit(byte ch) {
        return isDigit((char) ch);
    }
}
