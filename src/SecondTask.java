public class SecondTask {
    public static void main(String[] args) {


     //zad 2 - ile liczb parzystych/nieparzystych
        System.out.println("Task 2:  calculate how many is the odd and even numbers ");
      int[] numbers = {1, 2, 2, 3, 4, 6, 7, 7, 7, 8, 2};

         int even = 0;
        int odd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                even = even + 1;
            } else {
                odd += 1;
            }
        }
        System.out.println("The even number is: " + even);
        System.out.println("The odd number is: " + odd);
    }
}
