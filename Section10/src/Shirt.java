public class Shirt {

    String brand;
    double price;
    String size;


    public Shirt(String brand, double price, String size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    // copy constuctor
    public Shirt(Shirt source) {
        this.brand = source.brand;
        this.price = source.price;
        this.size = source.size;
    }
}