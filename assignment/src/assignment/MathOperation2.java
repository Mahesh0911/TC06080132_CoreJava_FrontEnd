package assignment;

public class MathOperation2 {
    
    // Method to calculate the multiplication of two integers
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Method to calculate the multiplication of three floats
    public float multiply(float a, float b, float c) {
        return a * b * c;
    }
    
    // Method to calculate the multiplication of all elements in an array of integers
    public int multiply(int[] array) {
        int result = 1;
        for (int num : array) {
            result *= num;
        }
        return result;
    }
    
    // Method to calculate the multiplication of one double and one integer
    public double multiply(double a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperation2 mathOp = new MathOperation2();

        int result1 = mathOp.multiply(5, 7);
        System.out.println("Multiplication of two integers: " + result1);

        float result2 = mathOp.multiply(3.5f, 2.0f, 1.5f);
        System.out.println("Multiplication of three floats: " + result2);

        int[] intArray = {2, 3, 4};
        int result3 = mathOp.multiply(intArray);
        System.out.println("Multiplication of array elements: " + result3);

        double result4 = mathOp.multiply(3.5, 2);
        System.out.println("Multiplication of double and integer: " + result4);
    }
}
