package session_05;

//final public class C {	//if class is final then it cannot be inherited.
public class C {
	protected int a=100;
	public int b=100;
	public C() {
		System.out.println("default constructor of parent .");
		
	}
	public C(int a) {
		System.out.println("parameterized of parent.");
	}

}
