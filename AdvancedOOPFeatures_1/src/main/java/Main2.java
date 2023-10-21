import java.util.List;

public class Main2 {

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
        System.out.println("Old salaries");
        staff.forEach(System.out::println);

        int salaryIncrease = 10000;
        staff.forEach(e -> e.setSalary(e.getSalary() + salaryIncrease));

        System.out.println("\nNew salaries");
        staff.forEach(System.out::println);
    }
}
