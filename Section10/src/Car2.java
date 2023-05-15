import java.util.Arrays;

public class Car2 {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car2(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    // copy constructor
    public Car2(Car2 source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    // drive method
    public void drive() {
        System.out.println("\nYou bought the beautiful " + this.year + " " + this.color +
                " " + this.make + " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.");
    }

    @Override
    public String toString() {
        return "Make='" + this.make + '\'' +
                "Price=" + this.price +
                "Year=" + this.year +
                "Color='" + this.color + '\'' +
                "Parts=" + Arrays.toString(parts) +
                '}' + "\n";
    }
}
