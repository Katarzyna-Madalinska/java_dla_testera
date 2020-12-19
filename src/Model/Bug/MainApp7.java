package Model.Bug;

public class MainApp7 {
    public static void main(String[] args) {

        BugReporter bugReporter1 = new BugReporter ("Katarzyna", "Test", "kasia@email.pl");

        Bug firstBug = new Bug("Error in telephonenumber",bugReporter1 , 3 );
        System.out.println(firstBug);

        firstBug.setStatusBug(false);
        System.out.println(firstBug);

    }
}