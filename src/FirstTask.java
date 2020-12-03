public class FirstTask {

    public static void main(String[] args) {

        // zadanie 1 - zamień 1 z 5
        System.out.println("Task 1:  change the position number one with last ");
        int[] numbers1 = {1, 2, 3, 4, 5};

        // use 2 variables
        System.out.println("Solution with used 2 variables: ");
        int first1 = numbers1[0];
        int last = numbers1[numbers1.length - 1];
        numbers1[0] = last;
        numbers1[numbers1.length - 1] = first1;
        for (int number : numbers1) {
            System.out.println(number);
        }

        // use 1 variable
        System.out.println("Solution with used only 1 variables:");
        int[] numbers2 = {1, 2, 3, 4, 5};
        int first2 = numbers2[0];
        numbers2[0] = numbers2[numbers2.length - 1];
        numbers2[numbers2.length - 1] = first2;
        for (int number2 : numbers2) {
            System.out.println(number2);
        }

//        // without variable
        System.out.println("Solution without variables:");
        int[] numbers3 = {1, 2, 3, 4, 5};
        numbers3[numbers3.length - 1] = numbers3[numbers3.length - 1] + numbers3[0];
        numbers3[0] = numbers3[numbers3.length - 1] - numbers3[0];
        numbers3[numbers3.length - 1] = numbers3[numbers3.length - 1] - numbers3[0];

        for (int number3 : numbers3) {
            System.out.println(number3);
        }
    }
}


