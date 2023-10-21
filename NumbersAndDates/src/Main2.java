import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main2 {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
                .localizedBy(new Locale("us"));
        LocalDateTime now = LocalDateTime.now();
        System.out.println(formatter.format(now));
    }
}
