package collections;


public class Collections {

}

/*
 * Most collections are in util package;
 * Collections are growable in nature
 * Memory point of view collections are highly recommended to use.
 * Performance point of view collections are not recommended to use.
 * Collections can hold both homogeneous and heterogeneous elements.
 * collection is interface and collections is the class.
 * ready made method support is available.
 * 
 * Interfaces of collection framework :
 * Collection:
 * 	List
 * 	Set
 * 	SortedList
 * 	NavigableSet
 * 	Queue
 * 	Map
 * 	SortedMap
 * 	NavigableMap
 * 
 * 	Legacy classes :
 * 		When collection framework were added in J2SE 1.2 , the original classes were re-engineered to support 
 * 		the collection interface. These classes are known as legacy classes.
 *	Enumeration (I) - Interface
 * 	 Dictionary (AC) - Abstract class
 * 	 Vector (©)	- Class
 * 	Stack (©)	
 *	HashTable (©)
 *	Properties (©)
 *	
 *
 *
 *			
 *
 */

/*
                Collection(I, 1.2 version)
                        |
                        |
                        |
        -------------------------------------------------------------------------------------
        |                                 |                                       |
        |                                 |                                       |
        List (I)                        Set (I)                                 Queue (Interface)
        |                                 |                                             |
        |                               ------------------------------                  |
     ----------------------             |                             |                 --------------------------------------------------
     |                     |            Hashset(Class)              sortedSet(I)              |                                         |
     ArrayList(C)          Vector       |                             |                       PriorityQueue(C)                  BlockingQueue(I)
     |                     |            LinkedHashSet(C)           NavigableSet(I)                                                      |
     LinkedList(C)         Stack                                       |                                                        PriorityBlocking(C)  
                                                                    TreeSet(C)                                                          |
                                                                                                                                LinkBlocking
 */