package exceptionHandling;

public class MyExceptionDemo {

	public static double div(double a,int b) {
		return a/b;
	}
	
	
	public static void main(String[] args) {
		
		double d =div(10,11);
		
		if(d<1) {
			try {
				throw new UserDefinedException();
			} catch (UserDefinedException e) {
				System.out.println(e);
			}
		}else {
			System.out.println("Division :"+d);
		}
	}
}
