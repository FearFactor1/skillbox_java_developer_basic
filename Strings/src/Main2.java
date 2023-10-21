import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {
        String name = "Дмитрий";
        String surname = "Петров";
        LocalDate birthday = LocalDate.of(1986, 4, 15);

        String personInfo = name + ' ' + surname + " - " + birthday;
        System.out.println(personInfo);
    }
}
