package session_05;

public class D extends C{
	public D() {
		super();
		System.out.println("dafault constructor of child class .");
	}

	public D(int a) {
		super(a);
		System.out.println("parameterized constructor of child class .");
	}
	
	
	public static void main(String[] args) {	
		D obj=new D(10);
		
	}

}
