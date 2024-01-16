package collections;

import java.util.Vector;

public class Vectors {

	public Vectors() {
	}
	
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		//method capacity is 10 initially
		System.out.println("Capacity :"+vector.capacity());
		
		for (int i = 0; i < 11; i++) {
			vector.addElement(i);
		}
		
		System.out.println(vector);
		
		System.out.println("Size :"+vector.size());
		System.out.println("Capacity:"+vector.capacity());
	}

}

/*
 * 
 * Main difference between the ArrayList and Vector :
 * Every present in vector is synchronized and hence vector is thread safe.
 */