public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculateArea(2.3, 3.5);
        double area2 = calculateArea(4.3, 1.5);

        double area3 = calculateArea(-5, 3.2);

        String englishExplanation = explainArea("English");
        String spanishExplanation = explainArea("Spanish");
        String italianExplanation = explainArea("Italian");
        System.out.println(englishExplanation);
        System.out.println(spanishExplanation);
        System.out.println(italianExplanation);
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
}
