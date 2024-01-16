package collections;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerations {


	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		//method capacity is 10 initially
		System.out.println("Capacity :"+vector.capacity());
		
		for (int i = 0; i < 11; i++) {
			vector.addElement(i);
		}
		System.out.println(vector);
		
		Enumeration<Integer> enumeration=vector.elements();
		
		while (enumeration.hasMoreElements()) {
			Integer integer = (Integer) enumeration.nextElement();
			
			if(integer%2==0) {
				System.out.println(integer);
			}			
		}
	}

}

/*
 * Enumeration - performs only read operation not updation.
 * It can operate in single direction only
 * 
 */
