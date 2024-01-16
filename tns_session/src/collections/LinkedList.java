package collections;

import java.io.Serializable;
import java.util.RandomAccess;

public class LinkedList {

	public static void main(String[] args) {
		java.util.LinkedList li=new java.util.LinkedList();
		
		li.add(12);
		li.add("Mahesh");
		li.add(40);
		li.add(9);
		li.add(null);
		
		System.out.println(li);
		
		li.set(0,"mahesh");
		
		System.out.println(li);
		
		li.remove(3);

		li.removeLast();
		
		System.out.println(li);
		
		System.out.println(li instanceof Serializable);
		System.out.println(li instanceof Cloneable);
		System.out.println(li instanceof RandomAccess);
		
	
	}

}


/*
 *	deletion and insertion in the middle is easy .
 *	duplicates allowed.
 *	Implements serializable and clonable interface.
 * 
 * *** persisting the state of an object is known as serialization.
 * *** 
 * 
 * 
 *
 */