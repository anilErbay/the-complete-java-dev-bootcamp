package staticFinalLesson;

public class Employee {
    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 65;

    private String name;
    private int age;

    public Employee(String name, int age) {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("INVALID NAME");
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < MIN_AGE || age > MAX_AGE) throw new IllegalArgumentException("INVALID AGE");
        this.age = age;
    }

}