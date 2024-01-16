// import java.util.*;

import java.util.Scanner;

class temp {
    public static void main(String[] args) {
        System.out.println("Hello World");

        /*
         * 
         * int id=1001;
         * String name = "Pooja";
         * float marks = 89;
         * System.out.println(id + " " + name + " " + marks);
         */

        // create scanenr for taking input at runtime from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter id :");
        int id = sc.nextInt();
        System.out.print("Enter name :");
        String name = sc.next();

        // to access the character
        // char ch = sc.next().charAt(0);

        float hindi, english, math, sst, total, perc;
        System.out.print("Enter marks of hindi :");
        hindi = sc.nextFloat();
        System.out.print("Enter marks of english:");
        english = sc.nextFloat();
        System.out.print("Enter marks of math :");
        math = sc.nextFloat();
        System.out.print("Enter marks of sst :");
        sst = sc.nextFloat();

        total = hindi + english + math + sst;
        perc = (total / 200) * 100; // marks out of 50

        System.out.println("id Entered :" + id);
        System.out.println("name Entered :" + name);
        System.out.println("marks of hindi :" + hindi);
        System.out.println("marks of english :" + english);
        System.out.println("marks of math:" + math);
        System.out.println("marks of sst :" + sst);
        System.out.println("total of marks :" + total);
        System.out.println("total of perc :" + perc);
        if (perc >= 35) {
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }
        // ass 01 - id name city salary
        //
        sc.close();
    }
}