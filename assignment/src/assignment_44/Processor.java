package assignment_44;

import java.util.Scanner;

public abstract class Processor {

	public int data;
	protected Scanner scanner=new Scanner(System.in);
	
	public void showData() {
		System.out.println("Data :"+data);
	}
	
	public abstract void process();
	
}
