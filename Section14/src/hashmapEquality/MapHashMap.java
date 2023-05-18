package hashmapEquality;

import java.util.HashMap;

public class MapHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> empIDs = new HashMap<>();
        empIDs.put("John", 12345);
        empIDs.put("Carl", 54321);
        empIDs.put("Jerry", 87654);

        System.out.println(empIDs);
        System.out.println(empIDs.get("John"));

        System.out.println(empIDs.containsKey("Jerry"));

        System.out.println(empIDs.containsValue(12345));
        System.out.println(empIDs.containsValue(6));

        empIDs.put("John", 98765); // it will override current value
        System.out.println(empIDs);

        empIDs.replace("John", 12345);
        System.out.println(empIDs);

        empIDs.putIfAbsent("John", 222);
        System.out.println(empIDs);

        empIDs.remove("Jerry");
        System.out.println(empIDs);
    }
}
