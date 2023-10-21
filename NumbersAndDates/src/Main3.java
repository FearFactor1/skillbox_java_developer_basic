import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main3 {

    public static void main(String[] args) {
        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = time1.minusDays(2);
        System.out.println(time1.until(time2, ChronoUnit.HOURS));
    }
}
