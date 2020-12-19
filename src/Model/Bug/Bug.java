package Model.Bug;

 class Bug implements ConsoleNotification{

    private String bugDescription;
    private BugReporter bugReporter;
    private int priorityBug;
    private boolean statusBug;


    public Bug(String bugDescription, BugReporter bugReporter, int priorityBug) {
        this.bugDescription = bugDescription;
        this.bugReporter = bugReporter;
        this.priorityBug = priorityBug;
        this.statusBug = statusOffBug();
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Incorrect bug description");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public int getPriorityBug() {
        return priorityBug;
    }

    public void setPriorityBug(int priorityBug) {
        if (priorityBug >= 1 && priorityBug <= 5) {
            this.priorityBug = priorityBug;
        } else {
            System.out.println("Invalid value priority field ");
        }
    }

     public BugReporter getBugReporter() {
         return bugReporter;
     }

     public void setBugReporter(BugReporter bugReporter) {
         this.bugReporter = bugReporter;
     }

     public boolean isStatusBug() {
        return statusBug;
    }

    public void setStatusBug(boolean statusBug) {
        notifyStatusChange();
        this.statusBug = statusBug;
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
        System.out.println("All information about bug: " + bugDescription + " " + bugReporter + " "
                + priorityBug + " " + statusBug + ".");
    }

    public void showEmailPersonReportingBug() {
        System.out.println("The e-mail address of person that reporting bug is " + bugReporter + ".");
    }

    public void showStatusBug() {
        System.out.println("The status of bug is " + convertStatusOffBug());
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugReporter=" + bugReporter +
                ", priorityBug=" + priorityBug +
                ", statusBug=" + statusBug +
                '}';
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("Bug status has changed!");


    }
}
