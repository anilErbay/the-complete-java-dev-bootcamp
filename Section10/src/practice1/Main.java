package practice1;

public class Main {

    static Hangar hangar = new Hangar();

    public static void main(String[] args) {
        Plane[] planes = new Plane[]{
                new Plane("Cessna", "172", 2002, 3500),
                new Plane("Cessna", "182", 2000, 2200),
                new Plane("Cessna", "208", 2010, 3750),
                new Plane("Diamond", "DA42", 2002, 5188),
                new Plane("Piper", "PA34", 2002, 1560),
        };

        for (int i = 0; i < planes.length; i++) {
            hangar.setPlane(i, planes[i]);
        }

        printPlanes();
    }

    public static void printPlanes() {
        System.out.println("********** PLANES *********");
        System.out.println(hangar);
    }
}

