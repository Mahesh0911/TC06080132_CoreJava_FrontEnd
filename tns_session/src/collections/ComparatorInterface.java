package collections;

import java.util.TreeSet;

public class ComparatorInterface {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet= new TreeSet<Integer>(new MyComparator());
		
		treeSet.add(10);
		treeSet.add(1);
		treeSet.add(4);
		treeSet.add(7);
		treeSet.add(12);
		
		//compare method of the customized comparator (MyComparator) provides the logic of adding the elements.
		System.out.println(treeSet);  
		
		
	}

}


/*
 *	Comparator Interface :
 *		Comparator interface present in "java.util" package.
 *	  	This interface defines the 2 methods :
 *			1)	public int compare(Object o1,Object o2);
 *			2)	public boolean equals(Object obj);
 *
 *		Whenever we are implementing Comparator interface we have to provide implementation for compare() method.
 *		implementing equals() method is optional because it is already available from Object class through inheritance
 *
 *		Note :
 *			Whenever we are defining our own customized sorting by Comparator then the objects 
 *			need not be Comparable.
 *	
 *	Question :
 *		Write program to insert the String objects into the TreeSet where the sorting order is alphabetical.
 *		and, also another to reverse the alphabetical order.
 *
 */