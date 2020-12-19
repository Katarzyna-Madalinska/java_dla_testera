package Model.Bug;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void shouldNotAllowIncorrectEmail() {
        BugReporter firstBugReporter = new BugReporter("Katarzyna", "Test", "kasia@gmail.pl");
        firstBugReporter.setEmail("kasia@gmail.pl");
        String creatorEmail = firstBugReporter.getEmail();
        assertEquals("kasia@gmail.pl", creatorEmail);
    }

    @Test
    void shouldNotAllowNegativePriority() {
        BugReporter firstBugReporter = new BugReporter("Katarzyna", "Test", "kasia@gmail.pl");
        Bug bug = new Bug("description", firstBugReporter, 1);
        bug.setPriorityBug(1);
        int priorityBug = bug.getPriorityBug();
        assertEquals(1, priorityBug);
        System.out.println(priorityBug);
    }

    @Test
    void shouldstatusBugBeFalse() {
        BugReporter firstBugReporter = new BugReporter("Katarzyna", "Test", "kasia@gmail.pl");
        Bug bug = new Bug("description", firstBugReporter, 1);
        bug.setStatusBug(false);
        boolean isStatusBugFalse = bug.isStatusBug();
        assertEquals(false, isStatusBugFalse);
    }

    @Test
    void shouldstatusBugBeTrue() {
        BugReporter firstBugReporter = new BugReporter("Katarzyna", "Test", "kasia@gmail.pl");
        Bug bug = new Bug("description", firstBugReporter, 1);
        bug.setStatusBug(true);
        boolean isStatusBufTrue = bug.isStatusBug();
        assertEquals(true, isStatusBufTrue);
    }
}