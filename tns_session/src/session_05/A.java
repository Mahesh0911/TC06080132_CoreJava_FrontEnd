package session_05;

public class A {
	final int a; //cannot change value.
public A() {
	a=100;
	
//	System.out.println("parent class A.");

}


//public final void get() { 	//final method cannot be overridden

	public void get() {
	System.out.println("get() method of A.");
	

}
}
