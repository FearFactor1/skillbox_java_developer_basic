import java.util.List;

public class Main6 {

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

        LRUCache<Employee> cache = new LRUCache<>(5);
        for (Employee employee : staff) {
            cache.addElement(employee);
        }
        cache.getAllElements().forEach(System.out::println);
    }
}
