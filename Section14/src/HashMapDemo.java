import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> fruitPrices = new HashMap<>();
        fruitPrices.put("Melon", 1.99);
        fruitPrices.put("Mango", 0.99);
        fruitPrices.put("Peach", 1.99);
        fruitPrices.put("Lemon", 2.99);

        System.out.println("The price of Melon is: " + fruitPrices.get("Melon"));
        System.out.println("The price of Mango is: " + fruitPrices.get("Mango"));
        System.out.println("The price of Peach is: " + fruitPrices.get("Peach"));
        System.out.println("The price of Lemon is: " + fruitPrices.get("Lemon"));

        // *** ***

        Map<String, Double> inventory = new HashMap<>();
        inventory.put("Bananas", 2.99);
        inventory.put("Papaya", 5.99);
        inventory.put("Kale", 4.99);
        inventory.put("Apples", 1.99);
        inventory.put("Carrot", 1.49);

        inventory.put("Lime", 0.49);
        inventory.put("Toothpaste", 5.99);
        inventory.put("Zucchini", 5.99);

        System.out.println("\nWelcome to Java Grocers. What can we help you find?:\n");

        System.out.println("\nWhat is the price of Lime?");
        System.out.println(inventory.get("Lime"));

        System.out.println("\nWhat is the price of Zucchini?");
        System.out.println(inventory.get("Zucchini"));

        System.out.println("\nWhat is the price of Kale?");
        System.out.println(inventory.get("Kale"));


        System.out.println("\nDo you guys sell Apples?");
        boolean result = inventory.containsKey("Apples");
        String response = result ? "Yes!" : "No, sorry";
        System.out.println(response);
    }
}
