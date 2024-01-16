package collections;

import java.util.ListIterator;

public class ListIterators {


	public static void main(String[] args) {
		
java.util.LinkedList li=new java.util.LinkedList();
		
		li.add("xyz");
		li.add("abc");
		li.add("pqr");
		li.add("lmn");
		
		System.out.println(li);

		ListIterator<String> litr =li.listIterator();
		while (litr.hasNext()) {
			String str= (String) litr.next();
			if(str.equals("abc")) {
				litr.set("mahesh");
			}
			
			if(str.equals("pqr")) {
				litr.add("abcde");
			}
			
		}
		System.out.println(li);
		
		while (litr.hasPrevious()) {
			String str= (String) litr.previous();
			
			System.out.println(str);
			
		}
	}

}
