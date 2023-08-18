package token;

public enum TokenType {
    illegal,
    eof,

    identifier,
    intLiteral,

    assign,

    semicolon,

    intKeyword,
}

// target input: 
//
// int x = 12;
//
//
//
// expected output:
//
// (intKeyword, "int")
// (identifier, "x")
// (assign, "=")
// (intLiteral, "12")
// (semicolon, ";")
// (eof, "")
