package abstract_class;

import java.util.function.IntBinaryOperator;

import session_06.Calculation;

public class Test {
	
	public static void main(String[] args) {
		
		///////////////////////////////////////////
		
//		BOI boi=new BOI();
//		
//		float rate=boi.getROI();
//		System.out.println("Rate of interest :"+rate);
		
		////////////////////////////////////////////
//		Shape figShape = new Rectangle(3, 5);
//		System.out.println("Area of the Rectangle : "+ figShape.area());
//		
//		Shape fig1=new Circle(4);
//		System.out.println("Area of circle is :"+fig1.area());
//		
		////////////////////////////////////////////
		
		Calculation interfaceCalculation=new Calculation();
		System.out.println("Addition :"+interfaceCalculation.add(3, 4));
		System.out.println("Subtraction :"+interfaceCalculation.sub(3, 4));
		System.out.println("Average :"+interfaceCalculation.avg(3, 4));
		System.out.println("Factorial :"+interfaceCalculation.fact(4));
		System.out.println("Minimum :"+interfaceCalculation.min(3, 4));
		System.out.println("Maximum :"+interfaceCalculation.max(3, 4));
		
	/*
	
		int a=5;
		int b=2;
		float ans=a/b;
		System.out.println("division :"+ ans); 		//data loss
	
	*/
	}
	
}
