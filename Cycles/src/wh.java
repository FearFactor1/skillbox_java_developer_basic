import java.util.Scanner;

public class wh {

    public static void main(String[] args) {
        int sum = 0;
        int value = -1;

        while (value != 0) {
            value = new Scanner(System.in).nextInt();
            sum = sum + value;
        }

        System.out.println("Сумма введённых чисел " + sum);
    }
}
