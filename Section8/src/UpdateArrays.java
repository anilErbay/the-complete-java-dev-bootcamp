import java.util.Arrays;

public class UpdateArrays {
    public static void main(String[] args) {
        String[] flavours = {"Sweet", "Sour", "Bitter"};
        System.out.println(flavours[2]);
        flavours[2] = "Salty";
        System.out.println(flavours[2]);

        // ***
        // JAVA CAFE
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
        // printing array
        // java has function called toString(array)
        // String menuString = Arrays.toString(menu);
        // System.out.println(menuString);
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }

        // change the array length ?
        // you cannot change the length of an array!

        String[] newMenu = new String[5];
        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }

        System.out.println(Arrays.toString(newMenu));
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
        

    }
}
