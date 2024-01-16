package first_project;
//import p1.p2.*;

//import static p1.p2.*; //all the static members will be imported.

import static p1.p2.A.*;

import p1.p2.A;

public class Student {

//	float in java must be defined as "123.45f" otherwise it will consider as double.
	
	private int rollno;
	private String name;
	private static int count;
	
	public Student() {
//		count=0;
	}
	public Student(int roll,String name) {
		this(); //this() method will run the constructor of type this() ;
		this.rollno=roll;
		this.name=name;
		count++;
	}
	
	public static int getCount() 
	{
		return count;
	}
	
	static //static block which will be invoked before the main method
	{ 
		System.out.println("This will be invoked before the main method.");
	}
	public static void main(String[] args) {
		
//		Student s1=new Student(1,"abc");
//		Student s2=new Student(2,"xyz");
//		Student s3=new Student(3,"pqr");
//		
//		A a=new A();
//		System.out.println("Number : "+a.getA());
//		a.setA(50);
//		System.out.println("Number : "+a.getA());
		System.out.println("Static Number : "+A.static_num);
		
//		System.out.println("Count of the student is : "+Student.getCount());

	}

}
