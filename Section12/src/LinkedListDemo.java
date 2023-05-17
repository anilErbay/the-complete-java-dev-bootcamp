import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        // similar with Arraylist , it's dynamically sized but it's differ in how to store data
        // retrieving data from linkedList is very slow
        // linkedList is chain of nodes
        // each node is linked to the previous and next node

        List<String> cities = new LinkedList<>();
        cities.add("paris");
        cities.add("london");
        cities.add("istanbul");
        cities.add("budapest");

        System.out.println(cities);
        System.out.println(cities.size());
        System.out.println(cities.get(3));
    }
}
