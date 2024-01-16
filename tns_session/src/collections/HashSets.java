package collections;

import java.util.HashSet;

public class HashSets {

	public static void main(String[] args) {
		HashSet hashSet=new HashSet();
		
		hashSet.add(10);
		hashSet.add("A");
		hashSet.add(2);
		hashSet.add(3.2f);
		hashSet.add(null);
		
		System.out.println(hashSet.add(10));  //adding duplicate elements returns false
		System.out.println(hashSet);
	}

}


/*
 *HashSet :
 *	underlying data structure is Hashtable.
 *	Order is not preserved and it is based on the hash code of the objects.
 *	Duplicates not allowed.
 *	If we try to add the duplicate elements we won't get compile time or run time error,
 *	in that case add() method returns false.
 *	Heterogeneous objects not allowed.
 *	Null insertion is possible only once.
 *	Implements Serializable and cloneable interfaces but not RandomAccess.
 *	HashSet is best suitable, if our frequent operation is "Search".
 * 		
 * 
 */