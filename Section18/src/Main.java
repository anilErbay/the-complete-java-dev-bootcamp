import product.Pants;
import product.Product;
import product.Shirt;

public class Main {
    public static void main(String[] args) {

        Shirt shirt = new Shirt();
        shirt.setSize(Shirt.Size.LARGE);
        shirt.setBrand("Nike");
        shirt.setPrice(49.99);
        shirt.setColor("BLUE");

        shirt.fold();
        productStore(shirt);

        Pants pant = new Pants();
        pant.setBrand("LEVI'S");
        pant.setPrice(79.99);
        pant.setColor("BLACK");
        pant.fold();
        productStore(pant);
    }

    public static void productStore(Product product) {
        System.out.println("Thank you for purchasing " + product.getBrand() + " " +
                product.getClass().getSimpleName().toLowerCase() + ". " +
                "Your total comes to " + product.getPrice());
    }
}
