import java.util.Scanner;

public class DiceJack2 {
    public static int num1;
    public static int num2;
    public static int num3;

    public static void main(String[] args) {
        welcome();

        // roll 3 times
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        // input 3 numbers
        enter3Numbers();

        // sum
        int sumNumbers = sumNumbers(num1, num2, num3);
        int sumDice = sumDiceRolls(roll1, roll2, roll3);
        // check invalid numbers ,and can play or not
        if (!isLessThan1(num1, num2, num3) || !isHigherThan6(num1, num2, num3)) {

            if (userWon(sumNumbers, sumDice)) {
                System.out.println("Your Sum: " + sumNumbers + "\nDice Sum: " + sumDice);
                System.out.println("\nCongrats! You won!");
            } else {
                System.out.println("\nBetter luck next time!");
            }

        } else {
            System.out.println("You entered invalid numbers.");
            System.exit(0);
        }


    }

    // welcome message
    public static void welcome() {
        System.out.println("JAVA >> DICE ROLLING GAME >> : ");
    }

    // Roll The Dice
    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        return (int) randomNumber + 1;  // 1-6
    }

    // input 3 numbers
    public static void enter3Numbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 numbers between 1-6: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        scanner.close();
    }

    // sum of the dice rolls
    public static int sumDiceRolls(int roll1, int roll2, int roll3) {
        return roll1 + roll2 + roll3;
    }

    // sum of the input numbers
    public static int sumNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // check if less than 1
    public static boolean isLessThan1(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    // check if higher than 6
    public static boolean isHigherThan6(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    // check if user win
    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 3);
    }

}
