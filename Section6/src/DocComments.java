public class DocComments {
    public static void main(String[] args) {

    }


    // Doc Comments

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     *
     * @param fahrenheit (double)
     * @return celsius (double)
     * <p>
     * Inside the function:
     * 1. return the temperature in celcius. C = (F - 32) * 5/9.
     */

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Another Doc Comment

    /**
     * Function name: greet
     * <p>
     * Inside the function:
     * 1. prints: "Hi!"
     */
    public static void greet() {
        System.out.println("Hi!");
    }


    //***

    /**
     * Function name: printText
     *
     * @param name (String)
     * @param age  (String)
     *             <p>
     *             Inside the function:
     *             1. prints the name and age as part of a text
     */
    public static void printText(String name, String age) {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    // ***


    /**
     * Function name: calculateArea
     *
     * @param length (double)
     * @param width  (double)
     * @return (double)
     * <p>
     * Inside the function:
     * 1.This function calculates the area and returns it
     */
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }

}
