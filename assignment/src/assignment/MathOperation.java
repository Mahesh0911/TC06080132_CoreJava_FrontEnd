package assignment;

import java.util.Scanner;

public class MathOperation {
    private double x;
    private double y;
    private double R;

    public void init() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = input.nextDouble();
        System.out.print("Enter the value of y: ");
        y = input.nextDouble();
    }

    public void add() {
        R = x + y;
    }

    public void multiply() {
        R = x * y;
    }

    public void power() {
        R = Math.pow(x, y);
    }

    public void display() {
        System.out.println("Result (R): " + R);
    }

    public static void main(String[] args) {
        MathOperation mathOp = new MathOperation();
        mathOp.init();
        mathOp.add();
        mathOp.display();

        mathOp.multiply();
        mathOp.display();

        mathOp.power();
        mathOp.display();
    }
}
