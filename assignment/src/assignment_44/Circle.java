package assignment_44;

public class Circle extends Processor{


	@Override
	public void process() {
		System.out.print("Enter number :");
		int d=scanner.nextInt();
		double area=3.14*d*d;
		System.out.println("Area of Circle :"+ area);
	}

}
