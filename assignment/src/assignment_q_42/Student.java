package assignment_q_42;
import java.util.Scanner;

class Student {
    int rollno;
    double percentage;

    // Default constructor
    public Student() {
        rollno = 0;
        percentage = 0.0;
    }

    // Parameterized constructor
    public Student(int rollno, double percentage) {
        this.rollno = rollno;
        this.percentage = percentage;
    }

    // Method to display information
    public void show() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Percentage: " + percentage);
    }
}

