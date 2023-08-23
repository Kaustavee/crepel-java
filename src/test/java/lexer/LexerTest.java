package lexer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import token.Token;
import token.TokenType;

class LexerTest {

    @Test
    void arithmeticOpt() {
        Lexer l = new Lexer("+-*/");

        Token[] tests = {
            new Token(TokenType.Plus, "+"),
            new Token(TokenType.Minus, "-"),
            new Token(TokenType.Asterisk, "*"),
            new Token(TokenType.Slash, "/"),
            new Token(TokenType.Eof, ""),
        };

        for (Token tt : tests) {
            Token tok = l.nextToken();
            assertEquals(tt.type, tok.type);
            assertEquals(tt.literal, tok.literal);
        }
    }
}
