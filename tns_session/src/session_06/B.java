package session_06;

public class B {

	//covarient return types 
	//this is also overridding of get() method with return type is subtype of declared type.
	B get() { 	
		return this;
	}
	
	void msg() {
		System.out.println("Hello world !!");
	}
	
	
	public static void main(String[] args) {
		new B().get().msg();
	}

}
