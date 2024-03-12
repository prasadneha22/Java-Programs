package Day06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class StreamEx {
    public static void main(String[] args) {
        // Creating Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Neha", 500000));
        employees.add(new Employee(2, "Nidhi", 350000));
        employees.add(new Employee(3, "Viraj", 450000));
        employees.add(new Employee(4, "Vickt", 380000));

        // Displaying employees with salary greater than 400000
        System.out.println("Employees with salary greater than 400000:");
        employees.stream()
                .filter(emp -> emp.getSalary() > 400000)
                .forEach(emp -> System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName() + ", Salary: " + emp.getSalary()));

        // Updating employee salaries by 25%
        employees.forEach(emp -> emp.setSalary(emp.getSalary() * 1.25));

        // Displaying updated employee salaries
        System.out.println("\nEmployee salaries after updating by 25%:");
        employees.forEach(emp -> System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName() + ", Salary: " + emp.getSalary()));

        // Converting names of employees to uppercase and storing in another list
        List<String> empNames = employees.stream()
                .map(Employee::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Displaying employee names in uppercase
        System.out.println("\nEmployee names in uppercase:");
        empNames.forEach(System.out::println);
    }
}
