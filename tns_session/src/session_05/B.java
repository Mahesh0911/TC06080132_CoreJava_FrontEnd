package session_05;

public class B extends A{
	public void get() {
		System.out.println("get() of class B - child");
	}
	
	public static void main(String[] args) {
		B obj=new B();
		
		obj.get();
		
		System.out.println("instanceof return boolean value (obj instanceof class :means a is child of b):"+(obj instanceof A));
	}

}
