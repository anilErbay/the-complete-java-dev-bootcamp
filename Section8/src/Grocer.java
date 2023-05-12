
public class Grocer {
    public static void main(String[] args) {
        System.out.println("Learn The Part >>: JavaGrocer");
        String[] products = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        System.out.println("Do yo sell coffee?");
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals("coffee")) {
                System.out.println("\nWe have that in aisle: " + i);
                break;
            }
        }
    }
}
