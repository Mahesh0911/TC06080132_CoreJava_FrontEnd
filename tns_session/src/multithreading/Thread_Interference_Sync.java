package multithreading;

public class Thread_Interference_Sync {

	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		
		MyThread_Sync_1 thread_Sync_1=new MyThread_Sync_1(factorial);
		MyThread_Sync_2 thread_Sync_2=new MyThread_Sync_2(factorial);
		
		thread_Sync_1.start();
		thread_Sync_2.start();
	}

}

/*
 * Thread Interference :
 * 	Common data can be accessed by various threads at the same time.
 * 	Threads are made up of multiple operations.
 * 	Two set of instructions can overlap on a common data item and manipulate it.
 * 	Leads to data corruption issues.
 * 
 * 	Thread Synchronization :
 * 		Key to synchronization is the concept of the monitor/ mutex. 
 * 		A monitor is an object that is used as a mutually exclusive lock.
 * 		Only one thread can own a monitor at a given time.
 * 		When a thread acquires a lock it is said to have entered the monitor.
 * 		All other threads attempting to enter the locked monitor will be suspended until the first thread exits the monitor.
 * 
 * 
 * 
 * 
 */
