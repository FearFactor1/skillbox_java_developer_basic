import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();

        for (int i = 1; i <= value; i = i + 1) {
            for (int n = 1; n <= value;  n = n + 1)
                if (i * n == value) {
                    System.out.println(i + "*" + n);
                }
        }
    }
}