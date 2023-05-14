public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10_000, 2020, "Green");
        Car dodge = new Car("Dodge", 11_000, 2019, "Blue");


        System.out.println(nissan.getMake());
        System.out.println(nissan.getColor());
        System.out.println(nissan.getPrice());

        nissan.setColor("Jet black");
        System.out.println(nissan.getColor());


    }
}
