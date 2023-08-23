package token;

public class Token {
    public TokenType type;
    public String literal;

    public Token(TokenType type, String literal) {
        this.type = type;
        this.literal = literal;
    }
}
