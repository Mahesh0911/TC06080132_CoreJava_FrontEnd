package p1.p2;

public class B {
	
	private A a;  //containment
	
	public B(A temp) {
		this.a=temp;
	}

	public static void main(String[] args) {
//		A a= new A();
//		System.out.println("No : "+ a.getA());
		
		B obj=new B(new A(45));
		
		System.out.println("Containment A / value of num :" + obj.a.num);
		

	}

}
