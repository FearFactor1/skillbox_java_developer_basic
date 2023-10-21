import java.util.Comparator;
import java.util.List;

public class Main4 {

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

        staff.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        staff.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
    }
}
