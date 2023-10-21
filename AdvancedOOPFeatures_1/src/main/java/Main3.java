import java.util.List;
import java.util.stream.Stream;

public class Main3 {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        sortBySalaryAndAlphabet(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        staff.sort((e1, e2) -> {
            int comparison =
                    e1.getSalary().compareTo(e2.getSalary());
            if (comparison == 0) {
                return e1.getName().compareTo(e2.getName());
            }
            return comparison;
        });

        staff.stream().filter(e -> e.getSalary() >= 100000).forEach(System.out::println);
        Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
        numbers.filter(number -> number % 2 == 0).forEach(System.out::println);
    }
}
