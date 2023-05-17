import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        List<String> citiesList = new ArrayList<>();

        citiesList.add("paris");
        citiesList.add("budapest");
        citiesList.add("cork");

        System.out.println(citiesList);
        System.out.println(citiesList.size());
        System.out.println(citiesList.get(1));

        citiesList.add("london");
        citiesList.add("istanbul");

        System.out.println(citiesList);

        citiesList.remove("paris");
        System.out.println(citiesList);
    }
}
