import java.util.Scanner;

public class JavaGuess2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("* Guess the number *");
        int number = generateNumber();
        while (true) {
            int guess = scanner.nextInt();
            if (guess == number) {
                break;
            }
            System.out.print("Guess again: ");
        }
    }

    public static int generateNumber() {
        return (int) (Math.random() * 5) + 1;
    }
}
