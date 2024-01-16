package assignment_44;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your choice (factorial or circle area):");
	        String choice = scanner.nextLine();

	        Processor processor = null;

	        if (choice.equalsIgnoreCase("factorial")) {
	            processor = new Factorial();
	        } else if (choice.equalsIgnoreCase("circle area")) {
	            processor = new Circle();
	        } else {
	            System.out.println("Invalid choice. Please select 'factorial' or 'circle area'.");
	            scanner.close();
	            return;
	        }

	        System.out.println("Enter a number:");
	        int number = scanner.nextInt();

	        processor.data = number;
	        processor.showData();
	        processor.process();

	        scanner.close();

	}

}
