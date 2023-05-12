import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {

        //
        int[][] integers = new int[3][4];
        System.out.println(Arrays.toString(integers[0]));
        System.out.println(Arrays.toString(integers[1]));
        System.out.println(Arrays.toString(integers[2]));
        // ***
        int[] harryGrades = {72, 74, 78, 76};
        int[] ronrades = {65, 64, 61, 67};
        int[] hermioneGades = {95, 98, 99, 100};

        // let's create one 2D array instead of 3 different arrays

        int[][] grades = {{72, 74, 78, 76},
                {65, 64, 61, 67},
                {95, 98, 99, 100}};
        System.out.println(Arrays.toString(grades[0]));


    }
}
