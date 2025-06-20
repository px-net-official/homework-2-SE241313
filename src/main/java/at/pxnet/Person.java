package at.pxnet;

public class Person {
    private final String id;
    private String name;
    private int age;
    private int grades[];

    public Person(String id, String name, int age, int[] grades) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grades = grades;
        // A grade can be any number from 1 to 5. If a number outside this range is passed as a grade, an
        // IllegalArgumentException should be thrown.
        for (int grade : grades) {
            if (grade < 1 || grade > 5) {
                throw new IllegalArgumentException("Note außerhalb der Vorgabe");
            }
        }


    }
    public int[] getGrades() {
        return grades;
    }
    public double getAge() {
        return age;
    }
}
