public class Main
{
    public static void main(String[] args){ 
    Scanner scanner = new Scanner(System.in);
     while (true) { 
            System.out.println("Enter something: ");
            String userInput = scanner.nextLine();
            
            System.out.println("You entered: " + userInput);
        }
    }
}
