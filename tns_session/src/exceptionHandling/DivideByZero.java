package exceptionHandling;

public class DivideByZero {
	public static void getMsg() {
		msg();
	}

	//gives divide by zero error at runtime
	private static float msg() {
		return (10/0);							
	}

	public static void main(String[] args) {
		getMsg();

	}

}
