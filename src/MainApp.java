public class MainApp {
    public static void main(String[] args) {

        Bug firstBug= new Bug( "Bug description: The bug with field validation: telephonenumber", "kasia@email.pl",1);
        firstBug.getAllInformationAboutBug();
        firstBug.emailPersonReportingBug();
        firstBug.statusBug();
        System.out.println("The priority of bug is: " + firstBug.getPriorityBug());

    }
}
