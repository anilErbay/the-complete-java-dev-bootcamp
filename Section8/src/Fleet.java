import java.util.Scanner;

public class Fleet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many aircraft do you have ? : ");
        int numOfPlanes = scan.nextInt();
        scan.nextLine(); // throw away

        String[] myFleet = new String[numOfPlanes];
        for (int i = 0; i < myFleet.length; i++) {
            System.out.print((i + 1) + ". ");
            myFleet[i] = scan.nextLine();
        }

        System.out.println("\n\nHere is your fleet :");
        for (String plane : myFleet) {
            System.out.println(plane);
        }

        scan.close();
    }
}
