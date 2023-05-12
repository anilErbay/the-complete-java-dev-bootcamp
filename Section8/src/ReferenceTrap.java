import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[] numbers2 = numbers;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

        numbers2[2] = 5;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

        // better solution -> Arrays.copyOf

        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, 3);
        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
