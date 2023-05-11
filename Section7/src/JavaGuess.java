import java.util.Scanner;

public class JavaGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = 4;
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int guess = scan.nextInt();

        while (guess != number) {
            System.out.print("Guess again: ");
            guess = scan.nextInt();
        }

        System.out.println("You got it!");
        scan.close();

    }
}

