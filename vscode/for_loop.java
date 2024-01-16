public class for_loop {
    public static void main(String args[]) {

        // factorial of a number
        int limit = 5;
        int fact = 1;
        for (int i = 1; i <= limit; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + limit + " :" + fact);
    }
}
