public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10_000, 2020, "Green");
        Car dodge = new Car("Dodge", 11_000, 2019, "Blue");


        System.out.println(nissan.getMake());
        System.out.println(nissan.getColor());
        System.out.println(nissan.getPrice());

        nissan.setColor("Jet black");
        System.out.println(nissan.getColor());
        nissan.setColor("Yellow");

        // ****
        // copying objects in correct way (with copy constuctor)
        Car nissan2 = new Car(nissan);
        nissan2.setColor("Purple");
        System.out.println(nissan.getColor());
        System.out.println(nissan2.getColor());

        nissan.drive();
        nissan2.drive();

    }
}
