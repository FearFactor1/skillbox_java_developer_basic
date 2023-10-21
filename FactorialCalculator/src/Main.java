import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int value = new Scanner(System.in).nextInt();

        int factorialCalculator = 0;

        for (int i = 1; i <= value; i = i + 1) {
            if (i == 1) {
                factorialCalculator = 1;
            } else {
                factorialCalculator = factorialCalculator * i;
            }
        }
        System.out.println(factorialCalculator);
    }
}