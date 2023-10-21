import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Main5 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.ofEpochSecond(System.currentTimeMillis() / 100, 0,
                ZoneOffset.ofHours(3));
        System.out.println(now);

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now.toEpochSecond(ZoneOffset.ofHours(3)));
    }
}
