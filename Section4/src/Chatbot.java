import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Learn The Part >>: java Chatbot");
        System.out.println("Hello. What is your name?");
        String name = scanner.nextLine();

        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        String country = scanner.nextLine();

        System.out.println("\nI hear it's beautiful at " + country + "! I'm from a place called Oracle \nHow old are you?");
        int age = scanner.nextInt();

        System.out.println("\nSo you are " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400 / age) + " times older than you.");
        System.out.println("Enough about me. What's your favorite language? (just don't say Python)");
        scanner.nextLine();
        String language = scanner.nextLine();

        System.out.println("\n" + language + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya! ");
        System.out.println("Learn The Part >>: ");

    }
}
