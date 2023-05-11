public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        // ***
        System.out.println();
        // ***

        // even numbers
        for (int i = 1; i < 21; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        // ***
        System.out.println();
        // ***

        for (int i = 1; i < 11; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // ***
        System.out.println();
        // ***
        
        for (int i = 9; i > 0; i--) {
            if (i % 2 == 0) {
                continue;
            } else if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}
