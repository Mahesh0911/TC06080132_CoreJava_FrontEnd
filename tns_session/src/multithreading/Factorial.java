package multithreading;

public class Factorial {
	public synchronized void fact(int n) {
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact*=i;
			System.out.println("Fact : "+fact);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
 * Thread Synchronization :
 * 		Key to synchronization is the concept of the monitor/ mutex. 
 * 		A monitor is an object that is used as a mutually exclusive lock.
 * 		Only one thread can own a monitor at a given time.
 * 		When a thread acquires a lock it is said to have entered the monitor.
 * 		All other threads attempting to enter the locked monitor will be suspended until the first thread exits the monitor.
 * 
 */
