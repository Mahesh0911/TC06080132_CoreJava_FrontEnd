package arrays;
import java.util.Scanner;

public class Student {
    private int rollNo;
    private String name;
    private double m1;
    private double m2;
    private double m3;

    public Student() {
        // Default constructor
    }

    public Student(int rollNo, String name, double m1, double m2, double m3) {
        this.rollNo = rollNo;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks (Subject 1): " + m1);
        System.out.println("Marks (Subject 2): " + m2);
        System.out.println("Marks (Subject 3): " + m3);
        System.out.println();
    }
    

    public void getDetails() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Enter Name: ");
        name = input.nextLine();

        System.out.print("Enter Marks for Subject 1: ");
        m1 = input.nextDouble();
        System.out.print("Enter Marks for Subject 2: ");
        m2 = input.nextDouble();
        System.out.print("Enter Marks for Subject 3: ");
        m3 = input.nextDouble();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        input.nextLine(); // Consume the newline character

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].getDetails();
        }

        System.out.println("Student Details:");
        for (Student student : students) {
            student.display();
        }
        
        input.close();    
        
    }
    
}