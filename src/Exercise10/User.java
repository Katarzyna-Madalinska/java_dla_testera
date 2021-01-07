package Exercise10;

import java.util.Objects;

public class User implements Comparable<User> {

    //    zrobienie metody prywatnej z publicznej: public static int userCounter = 0;
    private static int userCounter = 0;

    // 1. POLA OBIEKTU - opisuja z czego bedzie sie składał dany obiekt
    private String firstName; //null
    private String lastName;
    private String email;
    private int age; // 0
    private boolean isAdult; //false
    private Gender gender;

    //2 KONSTRUKTOR - domyslny  Model.Collection.User () {    };

    public User(String firstName, String lastName, String email, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
        // System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
        userCounter++;
        this.gender = gender;
    }

    // 3. METODY - opisują co dany obiekt będzie mógł zrobić
    // zwracany typ + nazwa metody


    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.endsWith("ru")) {
            System.out.println("Ru email are not allowed");
        } else {
            this.email = email;
        }
    };

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }


    void getFullName() {
        //ciało metody
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static int getUserCounter() {
        return userCounter;
    }
    // Przeciążanie metod - ta sama nazwa ale rozne parametry
    void greetings(String name, int age) {
        System.out.println("Hi " + name + " you are " + age);
    }

    void greetings(String firstName, String kastName) {
        System.out.println("Hi " + firstName + " " + lastName);
    }

    int yourAgePlus10(int userAge) {
        return userAge + 10;
    }

    // nadpisanie 3 metod:


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                isAdult == user.isAdult &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email) &&
                gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, isAdult, gender);
    }

    @Override
    public int compareTo(User user) {
        int compareResult = this.getFirstName().compareTo(user.getFirstName());
        if(compareResult ==0) {
            compareResult=this.getLastName().compareTo(user.getLastName());
        }
        return compareResult;
    }




// MAIN AP
    // KLASA
    //Tup nazwa = nowy obiekt
/*

        Model.Collection.User bartek = new Model.Collection.User("Bartek", "Testowy","bartek@email.pl", 17, false ); // wywolanie konstruktora

        Model.Collection.User ala = new Model.Collection.User("Ala", "Makota", "A@test.pl", 29, true);
        System.out.println("Ala ma na imie: " + ala.firstName);
        String  bartekName =   bartek.firstName = "Bartek";
        bartek.getAllInfo();

        System.out.println(bartek.getUserAge());
        int userAge = bartek.getUserAge();
        System.out.println(userAge);

        boolean userAdult = bartek.isUserAdult();
        System.out.println(bartekName + " jest dorosly: " + userAdult);

        bartek.greetings("Asiaaa", 16);
        bartek.greetings(bartekName, bartek.lastName);

        int bartekAgePlus10 = bartek.yourAgePlus10(23);
        System.out.println(bartekAgePlus10);

        System.out.println(bartek.yourAgePlus10(bartek.age));
*/

}
