import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
        staff.sort((e1, e2) -> {
            int comparison =
                    e1.getSalary().compareTo(e2.getSalary());
            if (comparison == 0) {
                return e1.getName().compareTo(e2.getName());
            }
            return comparison;
        });
//        Collections.sort(staff, (o1, o2) -> o1.getName().compareTo(o2.getName()));
//        Collections.sort(staff, (o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
        for (Employee employee : staff) {
            System.out.println(employee);
        }

        Collections.sort(staff, Comparator.comparing(Employee::getSalary));
    }
}