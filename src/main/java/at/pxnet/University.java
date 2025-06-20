package at.pxnet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class University {
    // Create a class "University" in the at.pxnet package.
    // It should only have the default constructor
    // The class provides three Methods:
    // * "addStudent" takes a Person as a parameter and add them as a new student to the university
    // * "removeStudent" takes a Person as a parameter and removes them from the list
    // * "getStudents" returns a List of Persons. The list must be unmodifiable
    // * "getFailingStudents" returns a List of Persons. The list must be unmodifiable


    private final List<Person> personSet = new ArrayList<>();

    public void addStudent(Person newPerson) {
        personSet.add(newPerson);
    }

    public void removeStudent(Person removePerson) {
        personSet.remove(removePerson);
    }

//    public static List<Person> getPersonSet() {
//        return personSet;
//    }

    public double getAverageAge() {
        double index = 0;
        double b = 0;
        for (Person Student : personSet) {
            double a = Student.getAge();
            index++;
            b = a+b;
        }
        if (personSet.isEmpty()) {
            return 0;
        }
        return b/index;
    }

    public List<Person> getStudents() {
        return Collections.unmodifiableList(personSet);
    }

    public List<Person> getFailingStudents() {
        List<Person> failingSet = new ArrayList<>();
        for (Person Student : personSet) {
            if (Grading.isFailing(Student)) {
                failingSet.add(Student);
            }
        }
        return Collections.unmodifiableList(failingSet);
    }

}

