package Exercise10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainAppEnum {
    public static void main(String[] args) {

// ENUM - USER
        List<User> users = new ArrayList<>();
        users.add(new User("Bartek", "Biały", "kasia@test.pl", 22, Gender.MALE));
        users.add(new User("Ala", "Amarantowa", "kasia@test.pl", 40, Gender.FEMALE));
        users.add(new User("Tomek", "Testowy", "kasia@test.pl", 10, Gender.MALE));
        users.add(new User("Zosia", "Czerwona", "kasia@test.pl", 35, Gender.FEMALE));
        users.add(new User("Kasia", "Rozowa", "kasia@test.pl", 30, Gender.FEMALE));
        users.add(new User("Tomek", "Szary", "kasia@test.pl", 120, Gender.MALE));

        List<User> womenList = users.stream()
                .sorted(Comparator.comparing(User::getGender))
                .filter(user -> user.getGender().equals(Gender.FEMALE))
                        //.equals("F")))
                .collect(Collectors.toList());
        for (User user : womenList) {
            System.out.println(user.getFirstName() + " " + user.getGender());
        }
    }

}
