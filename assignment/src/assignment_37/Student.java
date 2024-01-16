package assignment_37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Student {
    String name;
    String rollNo;
    int age;
    double score;

    public Student(String name, String rollNo, int age, double score) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Age: " + age + ", Score: " + score;
    }
}
