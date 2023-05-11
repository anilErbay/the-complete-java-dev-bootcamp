import java.util.Scanner;

public class Workbook {
    public static void main(String[] args) {
        // Task1
        for (int i = 0; i < 10; i++) {
            System.out.println(">>: If Java was easy, they would call it Python!");
        }

        // Task2
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". If Java was easy, they would call it Python!");
        }

        System.out.println();

        // Task3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi Bart! I can write lines for you.");
        System.out.println("What do you want me to write? \n");
        String message = scanner.nextLine();

        for (int i = 1; i < 100; i++) {
            System.out.println(i + "." + message);
        }

        System.out.println();
        // Task4
        System.out.print("Hi Timmy! Choose a number to count to: ");
        int num = scanner.nextInt();
        System.out.println("Great! Here's how it's done");
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}
