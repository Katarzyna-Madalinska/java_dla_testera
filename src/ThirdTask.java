public class ThirdTask {

    public static void main(String[] args) {
        System.out.println("Task 3:  sort numbers in ascending order");
        int[] numbers = {2, 3, 1, 4, 2 , 8, 2 ,5 ,8,9, 0,7};
        int min;

        for (int i = 0; i<numbers.length; i++) {
            min = numbers[i];
            for (int j=i+1; j<numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }
        for (int numb: numbers) {
            System.out.println(numb);
        }
    }


}
