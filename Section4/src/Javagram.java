import java.util.Scanner;

public class Javagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pick up the first name: ");
        String fName = scanner.nextLine();

        System.out.print("Pick up the last name: ");
        String lName = scanner.nextLine();

        System.out.print("Pick up age:  ");
        int age = scanner.nextInt();

        System.out.print("Pick up Username: ");
        scanner.nextLine();
        String username = scanner.nextLine();

        System.out.println("Here is the information you entered: ");
        System.out.println("First Name: " + fName);
        System.out.println("Last  Name: " + lName);
        System.out.println("Age       : " + age);
        System.out.println("Username  : " + username);
    }
}
