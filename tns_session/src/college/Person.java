package college;

import java.util.Scanner;

public class Person {
	int id;
	String name;
protected  Scanner scanner=new Scanner(System.in);

public Person() {
}

public Person(int id,String name) {
	super();  //constructor of object class.
	this.id=id;
	this.name=name;
	}


public void getData() {
	
	System.out.println("Id :"+ this.id);
	System.out.println("name :"+ this.name);
}
}
