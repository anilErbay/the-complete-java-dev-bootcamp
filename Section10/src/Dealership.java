
public class Dealership {
    private Car2[] cars;

    public Dealership(Car2[] cars) {
        this.cars = new Car2[cars.length];
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car2(cars[i]);
        }
    }

    // deep copying
    public Car2 getCars(int index) {
        Car2 copy = new Car2(this.cars[index]);
        return copy;
    }

    public void setCars(int index, Car2 newCar) {
        Car2 copy = new Car2(newCar);
        this.cars[index] = copy;
    }

    // sell
    public void sell(int index) {
        this.cars[index].drive();
    }


    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }


}
