import java.util.Scanner;

public class Repel {
    Scanner stdin;

    Repel() {
        stdin = new Scanner(System.in);
    }

    void finalze() {
        System.out.println("close scanner");
        stdin.close();
    }

    String readLine(String prompt) {
        System.out.print(prompt);
        return stdin.nextLine();
    }
}
