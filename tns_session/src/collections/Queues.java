package collections;

import java.util.PriorityQueue;

public class Queues {
	
	public static void main(String[] args) {
		PriorityQueue pqueue =new PriorityQueue();
		
		System.out.println(pqueue.peek());
		
		for (int i = 0; i < 10; i++) {
			pqueue.offer(i);
		}
		
		System.out.println(pqueue);
		System.out.println(pqueue.peek());
		System.out.println(pqueue.poll());
		System.out.println(pqueue);
	}
}

/*
 * Queue Interface :
 * 		Queue is child interface of the Collections
 * 		follows FIFO.
 * 		From 1.5 version onwards LinkedList also implements Queue interface.
 * 		LinkedList based implementation of Queue always follows FIFO.
 * 
 * Priority Queue :
 * 		PQ is data structure to represent a group of individual objects prior to processing according to some priority.
 * 		Priority order can be either default natural order or customized sorting order specified by Comparator object.
 * 		For default natural order objects must be homogeneous and comparable otherwise we get ClassCastException.
 *		Duplicates are not allowed.
 *		Insertion order is not preserved but all objects will be inserted according to some priority. 
 * 		Null is not allowed even as the 1st element for empty priority queue.
 * 
 * 
 * */
