import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate birthday = LocalDate.of(1987,4,25);
        System.out.println(birthday.plusYears(18));
        LocalDateTime nowNY =  LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(nowNY);

    }
}