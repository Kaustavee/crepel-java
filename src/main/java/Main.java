import java.util.NoSuchElementException;
import lexer.Lexer;
import token.Token;
import token.TokenType;

public class Main {

    public static void main(String[] args) {

        // logo
        System.out.println("crepel-java v0.1.1-prebulid");

        Repel repel = new Repel();

        while (true) {
            try {
                String input = repel.readLine("> ");
                Lexer l = new Lexer(input);
                Token t = l.nextToken();

                while (t.type != TokenType.Eof) {
                    System.out.println("Token( " + t.type + ", " + t.value + "  )");
                    t = l.nextToken();
                }

            } catch (NoSuchElementException e) {
                System.out.println("EOF");
                break;
            }
        }

        repel.close();
    }
}
