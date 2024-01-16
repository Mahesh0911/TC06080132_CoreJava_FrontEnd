package assignment_41;

import java.util.Scanner;

class FullTimeFaculty extends Faculty {
    double basic;
    double allowance;

    public FullTimeFaculty(int facultyId, double basic, double allowance) {
        super(facultyId, 0); // Salary will be calculated, so initialize with 0
        this.basic = basic;
        this.allowance = allowance;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Full Time Faculty Details:");
        System.out.println("Basic: $" + basic);
        System.out.println("Allowance: $" + allowance);
    }

    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Basic Salary: $");
        basic = scanner.nextDouble();
        System.out.print("Enter Allowance: $");
        allowance = scanner.nextDouble();
        salary = basic + allowance; // Calculate salary
    }
}
