package token;

public enum TokenType {
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

    Lparan, // (
    Rparan, // )
    Lbrace, // {
    Rbrace, // }

    IntKeyword,
    FloatKeyword,
    DoubleKeyword,
}
