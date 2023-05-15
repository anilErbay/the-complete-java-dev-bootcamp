package practice1;

public class Plane {
    private String make;
    private String model;
    private int year;
    private int loggedHours;

    public Plane(String make, String model, int year, int loggedHours) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.loggedHours = loggedHours;
    }

    // copy constructor
    public Plane(Plane source) {
        this.make = source.make;
        this.model = source.model;
        this.year = source.year;
        this.loggedHours = source.loggedHours;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLoggedHours() {
        return loggedHours;
    }

    public void setLoggedHours(int loggedHours) {
        this.loggedHours = loggedHours;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "\nMake ='" + make + '\'' +
                "\nModel ='" + model + '\'' +
                "\nYear =" + year +
                "\nLoggedHours =" + loggedHours +
                '}';
    }
}
