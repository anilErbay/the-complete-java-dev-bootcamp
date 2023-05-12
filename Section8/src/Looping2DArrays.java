public class Looping2DArrays {
    public static void main(String[] args) {
        int[][] grades = {{72, 74, 78, 76},
                {65, 64, 61, 67},
                {95, 98, 99, 100}};

        for (int j = 0; j < grades[0].length; j++) {
            System.out.print(grades[0][j] + " ");
        }
        System.out.println();
        for (int j = 0; j < grades[1].length; j++) {
            System.out.print(grades[1][j] + " ");
        }
        System.out.println();
        for (int j = 0; j < grades[2].length; j++) {
            System.out.print(grades[2][j] + " ");
        }

        // ***
        System.out.println("\n");
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
