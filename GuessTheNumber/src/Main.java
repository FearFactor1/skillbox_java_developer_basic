import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        //int value = 7;

        while (true) {
            int attempt = new Scanner(System.in).nextInt();

            if (attempt == value) {
                System.out.println("«Вы угадали!»");
                break;
            } else {

                if (attempt > value) {
                    System.out.println("Загадочное число больше");
                }

                if (attempt < value) {
                    System.out.println("Загадочное число меньше");
                }
            }
        }
    }
}