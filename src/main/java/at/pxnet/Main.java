package at.pxnet;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        var person1 = new Person("1", "Helmut", 18, new int[]{1,2,3,4,4,4,4});
        var person2 = new Person("2", "Harald", 20, new int[]{1,2,3,5,4});
        var person3 = new Person("3", "Harald", 20, new int[]{1,2,3,4});
        var person4 = new Person("4", "Harald", 20, new int[]{1,2});
//        Grading.isFailing(person1);
//        //new Grading();

        System.out.println(Grading.isFailing(new Person("1", "Helmut", 18, new int[]{1,2,3,4,4,4,4})));
        System.out.println(Arrays.toString(person1.getGrades()));

        System.out.println(Grading.isFailing(person2));
        System.out.println(Grading.isFailing(person3));
        //System.out.println(University.getStudents());
        University uni = new University();
        uni.addStudent(person1);

        //System.out.println(University.getStudents());
        System.out.println(Grading.isFailing(person4));


        // Create a class "Person" in the at.pxnet package
        // Make sure it has a constructor to take the following parameters in order:
        // * id (string)
        // * name
        // * age (int)
        // * array of grades (int)
        //
        // A grade can be any number from 1 to 5. If a number outside this range is passed as a grade, an
        // IllegalArgumentException should be thrown.
        //
        // Make sure the principles of data encapsulation are followed
        // A Person's id can never change
        // A person's age can change
        //
        // ----
        //
        // Create a class "Grading" in the at.pxnet package
        // Since it is a utility class, it should not expose any constructors
        //
        // This class provides a public method "isFailing" that takes a Person as a parameter. A person is failing if
        // they have at least one "5" or at least three "4" in their grades. If a person does not have at least two
        // grades, the method throws an IllegalStateException, regardless of the grades
        //
        // ---
        //
        // Create a class "University" in the at.pxnet package.
        // It should only have the default constructor
        // The class provides three Methods:
        // * "addStudent" takes a Person as a parameter and add them as a new student to the university
        // * "removeStudent" takes a Person as a parameter and removes them from the list
        // * "getStudents" returns a List of Persons. The list must be unmodifiable
        // * "getFailingStudents" returns a List of Persons. The list must be unmodifiable
        //
        // An additional method "getAverageAge" does not take any parameters and returns the average age of the
        // students (double). If no students are enlisted in the university, "0" is returned.
    }
}