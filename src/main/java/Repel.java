import java.util.Scanner;

public class Repel {
    Scanner stdin;

    Repel() {
        stdin = new Scanner(System.in);
    }

    String readLine(String prompt) {
        System.out.print(prompt);
        return stdin.nextLine();
    }

    void close() {
        stdin.close();
    }
}
