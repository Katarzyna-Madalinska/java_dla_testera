import Model.Bug;

public class MainApp {
    public static void main(String[] args) {

        Bug firstBug= new Bug( "The bug with field validation: telephonenumber", "kasia@email.pl",1);
        //  firstBug.showAllInformationAboutBug();

        //Bug Description
        System.out.println(firstBug.getBugDescription());
        firstBug.setBugDescription("Error");
        System.out.println(firstBug.getBugDescription());

        firstBug.setBugDescription("Error telephonenumber");
        System.out.println(firstBug.getBugDescription());

        // e-mail
        System.out.println(firstBug.getEmailPersonReportingBug());
        firstBug.setEmailPersonReportingBug("kasiaAtasia.pl");
        System.out.println(firstBug.getEmailPersonReportingBug());

        //priority Bug
        System.out.println(firstBug.getPriorityBug());
        firstBug.setPriorityBug(0);
        System.out.println(firstBug.getPriorityBug());

        firstBug.setPriorityBug(-6);
        System.out.println(firstBug.getPriorityBug());

        firstBug.setPriorityBug(3);
        System.out.println(firstBug.getPriorityBug());
    }
}