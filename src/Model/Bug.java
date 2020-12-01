package Model;

public class Bug {
    private String bugDescription;
    private String emailPersonReportingBug;
    private int priorityBug;
    private boolean statusBug;

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() <= 10) {
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public String getEmailPersonReportingBug() {
        return emailPersonReportingBug;
    }

    public void setEmailPersonReportingBug(String emailPersonReportingBug) {
        if (emailPersonReportingBug.contains("@")) {
            this.emailPersonReportingBug = emailPersonReportingBug;
        } else {
            System.out.println("Incorect e-mail adrress, missing '@'");
        }
    }

    public void setPriorityBug(int priorityBug) {
        if (priorityBug >= 1 && priorityBug <= 5) {
            this.priorityBug = priorityBug;
        } else {
            System.out.println("Invalid value priority field ");
        }
    }

    public boolean isStatusBug() {
        return statusBug;
    }

    public void setStatusBug(boolean statusBug) {
        this.statusBug = statusBug;
    }

    public Bug(String bugDescription, String emailPersonReportingBug, int priorityBug) {
        this.bugDescription = bugDescription;
        this.emailPersonReportingBug = emailPersonReportingBug;
        this.priorityBug = priorityBug;
        this.statusBug = statusOffBug();
    }

    public boolean statusOffBug() {
        return true;
    }

    public String convertStatusOffBug() {
        if (statusOffBug() == true) {
            return "opened";
        } else {
            return "closed";
        }
    }

    public void showAllInformationAboutBug() {
        System.out.println("All information about bug: " + bugDescription + " " + emailPersonReportingBug + " "
                + priorityBug + " " + statusBug + ".");
    }

    public void showEmailPersonReportingBug() {
        System.out.println("The e-mail address of person that reporting bug is " + emailPersonReportingBug + ".");
    }

    public void showStatusBug() {
        System.out.println("The status of bug is " + convertStatusOffBug());
    }

    public int getPriorityBug() {
        return priorityBug;
    }
}
