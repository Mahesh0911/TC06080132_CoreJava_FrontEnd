package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {

		/*
		 * Compile time error - Syntax Error
		 *Runtime errors - Run time error that are logical error or Data errors
		 * Mechanism to handle run time errors so that the normal flow of application can be maintained.
		 * throwable - super class
		 * exceptions : checked and unchecked(inside JVM) exception
		 * checked exception : due to Resource Problem(system setting),classes that extend throwable class .
		 * checked exception : FileNotFound ,IOException,  SQLException
		 * Uncheced Exception : Classes that are extended Runtime Exceptionare un checked Exception.
		 * Unchecked Exception : NullPointerException, NumberFormatException
		 * 
		 * 
		 * Example :
		 * int a=10/0; -----> Exception Object ---> < Is Handled? >
		 * 													|			
		 * 													|			
		 * 													|			
		 * 										--------------------------
		 * 										|						  |			
		 * 									   JVM						Rest of Code
		 * 
		 * 
		 * Runtime Stack Mechanism : ************
		 * At every method to a stack frame (one activation record ) is created.
		 * and is deleted after the method completion.
		 * 
		 * Default exception handling in java :
		 * the default exception handler prints information on the console in their way.
		 * 
		 * for user defined exception - class must extend Exception class
		 * ***********************
		 * try catch
		 * try -> multiple catch block
		 * try then finally
		 * ***********************
		 * 
		 * 
		 * clone method(),serialization,multithreading,file handling,collection,jdbc
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
