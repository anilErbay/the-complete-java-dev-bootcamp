public class RandomNumbers {
    public static void main(String[] args) {
        int[][] array = new int[100][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; i++) {
                array[i][j] = randomNumber();
            }
        }

        print2DArray(array);
    }

    // random number between 0 - 99
    public static int randomNumber() {
        double randomNumber = Math.random() * 100;
        return (int) randomNumber;
    }

    // print 2D Array
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
