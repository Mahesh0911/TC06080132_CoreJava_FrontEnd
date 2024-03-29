package collections;

import java.awt.RenderingHints.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps {

	public static void main(String[] args) {
/*
//		Hashtable Demo
		Hashtable hashtable=new Hashtable();
		
//		Key of type HashTableDemo with having String type value.
		hashtable.put(new HashTableDemo(5), "A");
		hashtable.put(new HashTableDemo(2), "B");
		hashtable.put(new HashTableDemo(6), "X");
		hashtable.put(new HashTableDemo(8), "S");
		hashtable.put(new HashTableDemo(1), "C");
		
		System.out.println(hashtable.size());
		System.out.println(hashtable);
		
*/
		
//		HashMaps Demo
		HashMap hashMap=new HashMap();
		
		hashMap.put(5, "A");
		hashMap.put(3, "F");
		hashMap.put(1, "E");
		hashMap.put(6, "C");
		hashMap.put(2, "D");
		hashMap.put(4, null);
		
		System.out.println(hashMap);
		
		//trying to add duplicate key- it return the old value and update the value
		System.out.println(hashMap.put(4, "G")); 
		System.out.println(hashMap);
		
		//get the set of the keys
		Set s=hashMap.keySet();
		
		System.out.println("Keys in hashmap : "+s);
		
		//getting the values only of the hashmap
		Collection c=hashMap.values();
		System.out.println("Values of the hashmap : "+c);
		
		//converted the hashmap to the set
		Set set=hashMap.entrySet();
		System.out.println(set);
		
		//applying iterator to set type
		Iterator itr=set.iterator();
		
		while (itr.hasNext()) {
			
			Map.Entry m1 = (Map.Entry) itr.next();
			
			//updating the value in the set also updates the hashmap
			if(m1.getKey()==(Object)3) {
				m1.setValue("M");
			}
			
			System.out.println(m1.getKey() + " "+m1.getValue());
		}
		System.out.println(hashMap);
	}

}

/*
 * 	Map Interface :
 * 		If we want to represent group of objects as key-value pairs.
 * 		No duplicate keys , but values can be duplicate.
 * 		Each key-value pair is one entry.
 * 		Map interface is not child interface of Collection and hence we can't apply Collection interface methods here.
 *  
 *	HashMap : 
 *		Underlying data structure is Hashtable.
 *		Stores in pairs of key-values.
 *		Duplicates keys not allowed.
 * 		Insertion order is not preserved , it is based on Hash Keys.
 *		null key not allowed.
 *		
 * 	HashTable :
 * 		Same properties as above for HashMap.
 * 		Heterogeneous objects are allowed both keys and values.
 * 		Every method present inside Hashtable is synchronized and hence Hashtable is thread safe. 
 * 		Present in the legacy classes.
 * 
 * 
 * 
 * 
 */
