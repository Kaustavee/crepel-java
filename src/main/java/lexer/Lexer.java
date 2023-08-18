package lexer;

import token.Token;

public class Lexer {

    final char nullChar = (char) 0;

    String input;
    int position;
    int readPosition;
    char ch;

    Lexer(String input) {
        this.input = input;
        this.position = 0;
        this.readPosition = 0;
        this.ch = nullChar;
    }

    // TODO: implementation
    // advances position
    void readChar() {
        throw new RuntimeException("not implemented");
    }

    // TODO: implementation
    // peak one char
    char peak() {
        throw new RuntimeException("not implemented");
    }

    // TODO: implementation
    // peak nth char
    char peak(int nth) {
        throw new RuntimeException("not implemented");
    }

    Token nextToken() {
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
