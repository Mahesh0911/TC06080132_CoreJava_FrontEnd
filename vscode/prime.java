import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        // check if the number is prime or not
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter the number :");
        number = sc.nextInt();

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                System.out.println("The number is Not Prime :" + number);
                sc.close();
                return;
            }
        }

        System.out.println("The number is Prime :" + number);
        sc.close();
    }
}
