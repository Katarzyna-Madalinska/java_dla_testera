package Exercise10;

public class MainAppBugPriority {
    public static void main(String[] args) {

        BugReporter bugReporter1 = new BugReporter ("Katarzyna", "Test", "kasia@email.pl");

        Bug firstBug= new Bug( "Bug description: The bug with field validation: telephonenumber", bugReporter1,-1);
        System.out.println("The priority of bug is: " + firstBug.getPriorityBug());
        firstBug.setPriorityBug(10);
    }
}
