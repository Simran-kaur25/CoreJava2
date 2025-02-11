package work;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;


class Employee {
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFirstName() {
        return fullName.split(" ")[0];
    }
}

public class Ques4 {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);


        List<Employee> employees = Arrays.asList(
                new Employee("Amit Kumar Sharma", 4000L, "Delhi"),
                new Employee("Rahul Singh", 6000L, "Mumbai"),
                new Employee("Simran Kaur", 3000L, "Delhi"),
                new Employee("Annie Chugh", 4500L, "Delhi"),
                new Employee("Dilpreet Singh", 3500L, "Delhi")
        );


        List<String> uniqueFirstNames = employees.stream()
                .filter(emp -> emp.salary < 5000 && emp.city.equalsIgnoreCase("Delhi"))
                .map(Employee::getFirstName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique First Names: " + uniqueFirstNames);
    }
}
