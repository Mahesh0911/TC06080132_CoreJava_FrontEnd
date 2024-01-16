package collections;

import java.io.Serializable;

public class Student implements Serializable,Cloneable {

	private int rollNo;
	private String name;
	private transient float fees;
	public Student() {
	}
	public Student(int rollNo, String name, float fees) {
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+rollNo+" "+name+" "+fees; 
	}
	
	public static void main(String[] args)throws CloneNotSupportedException {
Student s=new Student(22,"Mahesh",12.12f);
		
		Student s2=(Student)s.clone();
		System.out.println(s2);	
	}
	

}

/*
 * transient keyword - used to not persist the state;
 */