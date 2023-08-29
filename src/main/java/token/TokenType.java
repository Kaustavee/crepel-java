package token;

public enum TokenType {
    Illegal,
    Eof,
    Hash,   // #

    Ident,
    IntLiteral,
    FloatLiteral,
    DoubleLiteral,

    Assign,     // =
    Plus,       // +
    Minus,      // -
    Asterisk,   // *
    Slash,      // /
    Percent,    // %
    Question,   // ?
    Bang,       // !
    Tilde,      // ~
    Eq,         // ==
    NEq,        // !=
    LT,         // <
    GT,         // >
    LEq,        // <=
    GEq,        // >=

    BitOr,      // |
    BitAnd,     // &
    And,        // &&
    Or,         // ||

    Comma,      // ,
    Semicolon,  // ;
    Dot,        // .
    Colon,      // :

    Lparan, // (
    Rparan, // )
    Lbrace, // {
    Rbrace, // }

    IntKeyword,
    FloatKeyword,
    DoubleKeyword,
}
