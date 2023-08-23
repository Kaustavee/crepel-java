package token;

public enum Type {
    Illegal,
    Eof,

    Ident,
    IntLiteral,
    FloatLiteral,
    DoubleLiteral,

    Assign,     // =
    Plus,       // +
    Minus,      // -
    Asterisk,   // *
    Slash,      // /
    Bang,       // !
    Eq,         // ==
    NEq,        // !=
    LT,         // <
    GT,         // >
    LEq,        // <=
    GEq,        // >=

    Comma,      // ,
    Semicolon,  // ;

    IntKeyword,
    FloatKeyword,
    DoubleKeyword,
}
