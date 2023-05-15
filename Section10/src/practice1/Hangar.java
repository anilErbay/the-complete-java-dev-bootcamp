package practice1;


import challenge.Movie;

public class Hangar {
    private Plane[] planes;

    public Hangar() {
        this.planes = new Plane[5];
    }

    public Plane getPlane(int index) {
        return new Plane(this.planes[index]);
    }

    public void setPlane(int index, Plane plane) {
        this.planes[index] = new Plane(plane);
    }

    public String toString() {
        String temp = "";
        for (Plane plane : planes) {
            temp += plane.toString() + "\n";
        }
        return temp;
    }

}
