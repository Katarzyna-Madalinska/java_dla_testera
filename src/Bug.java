public class Bug {
    String bugDescription;
    String emailPersonReportingBug;
    int priorityBug;
    boolean statusBug;

    Bug(String bugDescription, String emailPersonReportingBug, int priorityBug) {
        this.bugDescription = bugDescription;
        this.emailPersonReportingBug = emailPersonReportingBug;
        this.priorityBug = priorityBug;
        this.statusBug = statusOffBug();
    }

    boolean statusOffBug() {
        return true;
    }

    String convertStatusOffBug() {
        if (statusOffBug() == true) {
            return "opened";
        } else {
            return "closed";
        }
    }

    void showAllInformationAboutBug() {
        System.out.println("All information about bug: " + bugDescription + " " + emailPersonReportingBug + " "
                + priorityBug + " " + statusBug + ".");
    }

    void showEmailPersonReportingBug() {
        System.out.println("The e-mail address of person that reporting bug is " + emailPersonReportingBug + ".");
    }

    void showStatusBug() {
        System.out.println("The status of bug is " + convertStatusOffBug());
    }

    int getPriorityBug() {
        return priorityBug;
    }
}
