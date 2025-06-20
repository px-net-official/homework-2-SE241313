package at.pxnet;

public class Grading {
    // Create a class "Grading" in the at.pxnet package
    // Since it is a utility class, it should not expose any constructors
    //
    // This class provides a public method "isFailing" that takes a Person as a parameter. A person is failing if
    // they have at least one "5" or at least three "4" in their grades. If a person does not have at least two
    // grades, the method throws an IllegalStateException, regardless of the grades
    //
    // ---

    private Grading() {
    }



    public static boolean isFailing(Person person) {
        int[] Noten = person.getGrades();
        int Note4 = 0;
        if (Noten.length < 2) {
            throw new IllegalStateException("Zu wenige Noten zum Beurteilen");
        }
        for (int i = 0; i < Noten.length; i++) {
            if (Noten[i] == 4) {
                Note4++;
            }
            if (Noten[i] == 5 || Note4 >= 3) {
                return true;
            }
        }
        return false;
    }


}
