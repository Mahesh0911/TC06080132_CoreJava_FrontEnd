package assignment_41;

import java.util.Scanner;

class Faculty {
    int facultyId;
    double salary;

    public Faculty(int facultyId, double salary) {
        this.facultyId = facultyId;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Salary: $" + salary);
    }
}
