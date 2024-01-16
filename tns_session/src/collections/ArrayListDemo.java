package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		/*
		int no=10;
		Integer number=new Integer(no); //primitive to wrapper 
		int num=number.intValue(); //wrapper class type to primitive type
		
		
		int b=11;
		Integer nInteger=b; //primitive to Wrapper
		int b =nInteger;  //Wrapper to primitve
		
		*/
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		
//		list.add("Abc");
		
		list.add(77);
		list.add(null);
		
		list.add(2,12);  //adds the element at given index
		
		System.out.println(list);
		System.out.println(list.contains(77)); //check id element is present
		
		List list2= Collections.synchronizedList(list);
		
		System.out.println(list2);
	
	}

}

/*
 * List :
 * Child of collection interface
 * Insertion order is preserved
 * Duplicates are allowed
 * Index plays important role in list
 * 
 * ArrayList :
 * best choice for retrieval operation.
 * underlying structure is resizable array.
 * 
 * */
