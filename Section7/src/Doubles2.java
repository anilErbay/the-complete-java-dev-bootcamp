public class Doubles2 {
    public static void main(String[] args) {

        while (true) {
            int dice1 = rollDice();
            int dice2 = rollDice();

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2 + "\n");

            if (dice1 == dice2) {
                System.out.println("You rolled doubles!");
                break;
            }
        }
    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }
}
