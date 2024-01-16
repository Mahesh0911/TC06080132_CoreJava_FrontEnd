package assignment_41;

import java.util.Scanner;

class PartTimeFaculty extends Faculty {
    int hours;
    double rate;

    public PartTimeFaculty(int facultyId, int hours, double rate) {
        super(facultyId, 0); // Salary will be calculated, so initialize with 0
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Part Time Faculty Details:");
        System.out.println("Hours: " + hours);
        System.out.println("Rate: $" + rate);
    }

    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Hours Worked: ");
        hours = scanner.nextInt();
        System.out.print("Enter Hourly Rate: $");
        rate = scanner.nextDouble();
        salary = hours * rate; // Calculate salary
    }
}
