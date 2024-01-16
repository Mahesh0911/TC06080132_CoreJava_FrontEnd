package assignment_37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentScoreGrouping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        // Accepting 10 student records
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Roll No: ");
            String rollNo = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Score: ");
            double score = scanner.nextDouble();

            students.add(new Student(name, rollNo, age, score));
        }

        // Arrange students based on score groups
        Map<String, List<Student>> scoreGroups = new HashMap<>();
        scoreGroups.put("0-50", new ArrayList<>());
        scoreGroups.put("50-65", new ArrayList<>());
        scoreGroups.put("65-80", new ArrayList<>());
        scoreGroups.put("80-100", new ArrayList<>());

        for (Student student : students) {
            if (student.score <= 50) {
                scoreGroups.get("0-50").add(student);
            } else if (student.score <= 65) {
                scoreGroups.get("50-65").add(student);
            } else if (student.score <= 80) {
                scoreGroups.get("65-80").add(student);
            } else {
                scoreGroups.get("80-100").add(student);
            }
        }

        // Print students in each score group
        for (Map.Entry<String, List<Student>> entry : scoreGroups.entrySet()) {
            String group = entry.getKey();
            List<Student> studentsInGroup = entry.getValue();

            System.out.println("Score Group " + group + ":");
            for (Student student : studentsInGroup) {
                System.out.println(student);
            }
            System.out.println();
        }
    }
}
