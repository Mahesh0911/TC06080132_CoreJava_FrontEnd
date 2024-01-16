package assignment_44;

public class Factorial extends Processor {

	@Override
	public void process() {
		//to print factorial of a number
		int fact=1;
		System.out.print("Enter number :");
		
		int d=scanner.nextInt();
		
		for(int i=1;i<=d;i++) {
			fact*=i;
		}
		
		System.out.println("Factorial is :"+fact);
		
	}

}
