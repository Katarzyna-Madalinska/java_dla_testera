public class Exercise1 {
    public static void main(String[] args) {
        int num1 = 543;
        int num2 = 54;
        int num3 = 654;
        int num4 = 45;

        int suma1 = num1 + num2;
        System.out.println(suma1);

        int suma2 = num2 + num3;
        System.out.println(suma2);

        if (suma1 % 2 == 0 && suma2 % 2 == 0) {
            System.out.println("Wszystkie liczby są parzyste");
        } else {
            System.out.println("Nie wszystkie liczby są parzyste");
        }
    }
}
