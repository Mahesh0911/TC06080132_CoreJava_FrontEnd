package exceptionHandling;

public class UserDefinedException extends Exception {

	@Override
	public String toString() {
		return "! MyException Occured.";
	}
	
}
