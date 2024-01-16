package collections;

import java.util.TreeSet;

public class TreeSetDemoAssignment {

	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<String>(new MyComparator2());
	
		//MyComparator2 compares the elements such that to make them in reverse order.
	
		treeSet.add("Ab");
		treeSet.add("bc");
		treeSet.add("Bb");
		treeSet.add("Ab");
		treeSet.add("A");
		
		System.out.println(treeSet);
	}

}