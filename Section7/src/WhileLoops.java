import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        // ***
        int diceRoll = -1;
        while (diceRoll != 6) {
            diceRoll = rollDice();
            System.out.println(diceRoll);
        }

        // ***
        System.out.println();
        // ***
        int randomNumber = -1;
        while (randomNumber <= 90) {
            randomNumber = generateRandomNumber();
            System.out.println(randomNumber);
        }

        // ***
        System.out.println();
        // ***

        int number = generateRandomNumber();
        while (number <= 1000) {
            number *= 2;
            System.out.println(number);
        }

        // ***
        System.out.println();
        // ***
        Scanner scanner = new Scanner(System.in);
        String word = " ";

        while (!word.equals("stop")) {
            System.out.println(word);
            word = scanner.nextLine();
        }
        scanner.close();
    }

    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}
