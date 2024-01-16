package collections;

public class ComparableInterface {

	public static void main(String[] args) {
		
	}
	

}

/*
 *Comparable Interface :
 *	Comparable Interface present into the "java.lang" package.
 *	It contain only one method "int compareTo(Object o)" method.
 *	
 *	If we are depending on default natural sorting order compulsory the objects should be homogeneous and comparable otherwise we will get ClassCastException.
 *	Object is Comparable iff the corresponding class implements Comparable  interface.
 *
 *	Note :
 *	** String class and all wrapper classes implements Comparable interface but StringBuffer
 *	   class doesn't implements comparable interface (So we get ClassCastException).
 *
 *
 *
 **	 obj1.compareTo(obj1);  ---> (method call)
  *  |
  *  |
  *  |
  *  |--> return (-ve) : iff obj1 has to come before obj2. (obj1 < obj2)
  *  |
  *  |
  *  |--> return (+ve) : iff obj1 has to come after obj2. (obj1 > obj2)
  *  |
  *  |
  *  |
  *  |--> return (0) : iff obj1 and obj2 are equal. (obj1 == obj2)
 **
 * 
 * 
 */
