package exceptionHandling;

public class Demo {

	public static void main(String[] args) {
		
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			
			int c=a/b;
			System.out.println("Division :"+ c);
		}
		catch (ArithmeticException e) {
			System.out.println("Denominator should not be zero.");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter atleast two parametrs.");
		}catch (NumberFormatException e) {
			System.out.println("Enter only integer data.");
		}
		catch (Exception e) {
			System.out.println("Exception Occured :"+e.getMessage());
			/*
			instead of multiple catch blocks using if-else ladder to check the class(instance of) exception
			if(e instanceof ArithmeticException) {
				System.out.println("Denominator should not be zero.");
			}else if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Enter atleast two parametrs.");				
			}else if (e instanceof NumberFormatException) {
				System.out.println("Enter only integer data.");
			}
			*/
			
		}
	}

}
