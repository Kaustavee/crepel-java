import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        // logo
        System.out.println("crepel-java v0.1.1-prebulid");

        Repel repel = new Repel();

        while (true) {
            try {
                System.out.println(repel.readLine("> "));

            } catch (NoSuchElementException e) {
                System.out.println("EOF");
                break;

            } finally {
                repel.close();
            }
        }
    }
}
