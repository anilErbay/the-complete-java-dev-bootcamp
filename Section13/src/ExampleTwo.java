import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        try {
            readFile("/Users/anilerbay/Desktop/JavaDevBootcamp/Section13/src/greetings.txt");
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("/Users/anilerbay/Desktop/JavaDevBootcamp/Section13/src/greetings.txt");
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}
