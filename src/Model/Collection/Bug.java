package Model.Collection;

import Model.Bug.ConsoleNotification;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug>{

    private String bugDescription;
    private BugReporter2 bugReporter2;
    private int priorityBug;
    private boolean statusBug;


    public Bug(String bugDescription, BugReporter2 bugReporter2, int priorityBug) {
        this.bugDescription = bugDescription;
        this.bugReporter2 = bugReporter2;
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

     public BugReporter2 getBugReporter() {
         return bugReporter2;
     }

     public void setBugReporter(BugReporter2 bugReporter) {
         this.bugReporter2 = bugReporter;
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
        System.out.println("All information about bug: " + bugDescription + " " + bugReporter2 + " "
                + priorityBug + " " + statusBug + ".");
    }

    public void showEmailPersonReportingBug() {
    }

    public void showStatusBug() {
        System.out.println("The status of bug is " + convertStatusOffBug());
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugReporter=" + bugReporter2 +
                ", priorityBug=" + priorityBug +
                ", statusBug=" + statusBug +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return priorityBug == bug.priorityBug &&
                statusBug == bug.statusBug &&
                Objects.equals(bugDescription, bug.bugDescription) &&
                Objects.equals(bugReporter2, bug.bugReporter2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bugDescription, bugReporter2, priorityBug, statusBug);
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("Bug status has changed!");
    }

    @Override
    public int compareTo(Bug bug) {
        int compareBug = this.getBugDescription().compareTo(bug.getBugDescription());
        return compareBug;
    }

}
