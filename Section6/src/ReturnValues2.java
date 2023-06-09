public class ReturnValues2 {
    public static void main(String[] args) {

        double area1 = calculateArea(2.3, 3.6);
        printArea(2.3, 3.6, area1);

        String englishExplanation = explainArea("English");
        System.out.println(englishExplanation);
    }

    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("INVALID DIMENSIONS");
            System.exit(0); // it'Ll terminate the runtime
        }
        double area = length * width;
        return area;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longuer * la largeur";
            case "Spanish":
                return "Area es igual a largo * ancho";
            default:
                return "Unknown";
        }
    }

    public static void printArea(double length, double width, double area) {
        System.out.println("A rectangle with a length of " + length + " and a with of " +
                width + " has an area of " + area);
    }
}
