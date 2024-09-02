import java.util.*;
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    public Employee() {
        this.id = 0;
        this.name = "";
        this.department = "";
        this.salary = 0.0;
    }
public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void setDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Department: ");
        this.department = scanner.nextLine();
        System.out.print("Enter Salary: ");
        this.salary = scanner.nextDouble();
    }

    public void showDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setDetails();
        emp.showDetails();
    }
}

