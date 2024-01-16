package session_08;

public class Anonymous_2 extends Outer {
	
	/*
	as this class extends Outer class so another (abstract) class - object of Anonymous class cann't be created
	in this class but by using Anonymous class it can be done.
	*/
	
	public static void main(String[] args) {
		Anonymous personAnonymous=new Anonymous() {
			
			//abstract method of the abstract Anonymous class.
			@Override
			public void task() {
				System.out.println("mission 01 started.");
			}
		};
		
		personAnonymous.task();
	}
	

}
