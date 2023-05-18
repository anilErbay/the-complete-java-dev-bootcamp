public class EnumDemo {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.MONDAY;
        System.out.println(day);

        day = DaysOfTheWeek.THURSDAY;

        if (day == DaysOfTheWeek.THURSDAY) {
            System.out.println("yay it's almost friday!");
        }

        System.out.println(DaysOfTheWeek.values()); // array so it's a reference

        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
            System.out.println(myDay);
        }
    }
}
