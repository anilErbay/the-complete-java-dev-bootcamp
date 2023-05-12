public class Workbook {
    public static void main(String[] args) {
        // 1
        String[] students = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};
        System.out.println(">>: It's time to take your 5th year exams. Please, take your seats.");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ", you will take seat " + i);
        }
    }
}
