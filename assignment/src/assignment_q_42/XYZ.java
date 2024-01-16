package assignment_q_42;


public class XYZ {
    public static void main(String[] args) {
        // Create an array to store student records
        Student[] students = new Student[5];

        // Create CollegeStudent objects
        students[0] = new CollegeStudent(101, 80.5, 3);
        students[1] = new CollegeStudent(102, 70.2, 4);

        // Create SchoolStudent objects
        students[2] = new SchoolStudent(201, 95.8, "12th");
        students[3] = new SchoolStudent(202, 60.0, "10th");
        students[4] = new SchoolStudent(203, 78.9, "11th");

        // Display all records from the array
        for (Student student : students) {
            student.show();
            System.out.println();
        }

        // Search for a record based on rollno
        int searchRollNo = 102; // Change this to the roll number you want to search
        for (Student student : students) {
            if (student.rollno == searchRollNo) {
                if (student instanceof CollegeStudent) {
                    System.out.println("Found a College Student with Roll No " + searchRollNo);
                } else if (student instanceof SchoolStudent) {
                    System.out.println("Found a School Student with Roll No " + searchRollNo);
                }
                break;
            }
        }

        // Count how many students have A grade (percentage > 75)
        int countA = 0;
        for (Student student : students) {
            if (student.percentage > 75) {
                countA++;
            }
        }
        System.out.println("Number of students with A grade: " + countA);
    }
}
