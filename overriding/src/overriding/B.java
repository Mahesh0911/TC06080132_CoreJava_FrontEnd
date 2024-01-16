package overriding;

public class B extends A{
	
	//overridden method of A class
	@Override   //annotations 
	public void m1() {
		System.out.println("M1 of B.");
	}
	
	//method of B class
	public void m2() {
		System.out.println("M2 of B.");
		
	}
	public static void main(String[] args) {
		//object of B but reference variable is of A()
		A objA=new B(); 	
		
		//objA is reference variable of type of parent class then also it will call the overridden methods.
		objA.m1();
		
		//but it will not call the methods that are not in the child class, we have to downcast it.
		//downcasting is done to use the methods of child class.
		((B)objA).m2();
	}

}
