package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(2);
		list.add(12);
		list.add(23);
		list.add(21);
		list.add(62);
		list.add(72);
		list.add(73);
		
		Iterator<Integer>itr =list.iterator();
		
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			if(integer%2==0) {
				System.out.println(integer);
			}else {
				itr.remove();  //we can remove the element from the list using iterator.
			}
		}
		
		System.out.println(list);
		
	}

}


/*
 * Iterator - used for single direction iteration.
 * elements can be removed only.
 */

