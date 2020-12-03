public class FourthTask {

    public static void main(String[] args) {
        System.out.println("Task 3:  sort numbers in descending order");
        int[] numbers = {2, 3, 1, 4, 2 , 8, 2 ,5 ,8,9, 0,7};
        int max;

        for (int i = 0; i<numbers.length; i++) {
            max = numbers[i];
            for (int j=i+1; j<numbers.length; j++) {
                if (numbers[j] > max) {
                    max = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max;
                }
            }
        }
        for (int numb: numbers) {
            System.out.println(numb);
        }
    }
}
