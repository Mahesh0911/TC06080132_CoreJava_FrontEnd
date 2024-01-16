public class if_else_ass {
    public static void main(String args[]) {
        //assignment : code to check the maximum numbe from 5 given numbers
        int a = 2;
        int b = 20;
        int c = 22;

        if (a > b) {
            if (a > c) {
                System.out.println("Greatest number : " + a);
            } else {
                System.out.println("Greatest number : " + c);
            }
        } else if (b > a) {
            if (b > c) {
                System.out.println("Greatest number : " + b);
            } else {
                System.out.println("Greatest number : " + c);
            }
        } else {
            System.out.println("two or more numbers are equal.");
        }
    }
}
