import java.util.Scanner;

public class WhileLoopJavagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Javagram! Sign in below\n");

        while (true) {
            System.out.print("- Username: ");
            String username = scanner.nextLine();
            System.out.print("- Password: ");
            String password = scanner.nextLine();
            if (username.equals("walkersat") && (password.equals("b737"))) {
                break;
            }
            System.out.println("\nIncorrect! Please try again!");
        }

        scanner.close();
    }
}
