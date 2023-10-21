import java.util.Arrays;

public class Main7 {

    public static void main(String[] args) {
        Integer[] digits = {1,2,3,4,5,6,7,8,9};
        Arrays.stream(digits).map(String::valueOf).reduce((s1, s2) -> s1 + s2).ifPresent(System.out::println);
    }
}
