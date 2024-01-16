package assignment_46;

import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter employee information for Employee #" + (i + 1));
            System.out.print("Empid: ");
            int empid = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline

            Employee newEmployee = new Employee(empid, name, salary);
            // Check if the empid already exists
            boolean empidExists = false;
            for (Employee existingEmployee : employees) {
                if (existingEmployee != null && existingEmployee.equals(newEmployee)) {
                    empidExists = true;
                    break;
                }
            }

            if (empidExists) {
                System.out.println("Employee with the same empid already exists. Try again.");
                i--; // Decrement the index to re-enter information for this employee.
            } else {
                employees[i] = newEmployee;
            }
        }

        System.out.println("Employee Information:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }

        scanner.close();
    }
}
