package Model.Collection;


import java.util.*;


public class MainApp8 {
    public static void main(String[] args) {

        BugReporter2 bugReporter2 = new BugReporter2("Katarzyna", "Test", "kasia@email.pl");

        Bug bug1 = new Bug("Incorrect address e-mail", bugReporter2, 3);
        Bug bug2 = new Bug("Error in telephonenumber", bugReporter2, 4);
        Bug bug3 = new Bug("Incorrect validation in field: Button name", bugReporter2, 1);
        Bug bug4 = new Bug("Error in sending form ", bugReporter2, 2);
        Bug bug5 = new Bug("Bug in form ", bugReporter2, 2);
        Bug bug6 = new Bug("Error in telephonenumber", bugReporter2, 4);
        //    System.out.println(bug1);

        List<Bug> bugList = new ArrayList<>();
        bugList.add(bug1);
        bugList.add(bug2);
        bugList.add(bug3);
        bugList.add(bug4);
        bugList.add(bug5);
        bugList.add(bug6);
        System.out.println("**Bug list: " + bugList.size());

/*        for (Bug bug : bugList) {
            System.out.println(bug.getBugDescription());
        }*/

        //Only unique values

        Set<Bug> uniqueListBug = new HashSet<>(bugList);
        System.out.println("**Set list: " + uniqueListBug.size());
   /*     for (Bug bug : uniqueListBug) {
            System.out.println(bug);
        }*/

        Set<Bug> sortedBugsList = new TreeSet<>(uniqueListBug);
        System.out.println("**Sorted unique list:");
        for (Bug bug : sortedBugsList) {
            System.out.println(bug.getBugDescription());
        }
    }
}

