package collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet treeSet=new TreeSet();
		
		treeSet.add(new StringBuffer( "A"));
		treeSet.add(new StringBuffer("D"));
		treeSet.add(new StringBuffer("C"));
		treeSet.add(new StringBuffer("B"));
		treeSet.add(new StringBuffer("D"));
		treeSet.add(new StringBuffer("aa"));
	
//		treeSet.add(12);   //ClassCast Exception (Adding integer to the string set)
//		treeSet.add(null); 	//NullPointerException
		
		System.out.println(treeSet);
//		treeSet.add(new StringBuilder("A"));
//		treeSet.add(new StringBuilder("a"));
//		treeSet.add(new StringBuilder("B"));
//		treeSet.add(new StringBuilder("10"));
	
	}

}
