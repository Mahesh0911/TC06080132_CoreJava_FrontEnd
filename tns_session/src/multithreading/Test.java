package multithreading;

public class Test {
	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName()); //main
		System.out.println(Thread.currentThread().getThreadGroup().getName()); //main
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); //system

		ThreadGroup grp1 =new ThreadGroup("FirstGroup"); //default group belong to main thread group
		System.out.println(grp1.getParent().getName());

		ThreadGroup grp2 =new ThreadGroup(grp1,"SecondGroup"); //grp1 making as parent threadgroup for grp2
		System.out.println(grp2.getParent().getName());
		
	}

}



/* 	ThreadGroup :
 * 		It would be useful to categorize them by functionality, so that you can work simultaneously with number of threads.
 * 		Class ThreadGroup contains methods for creating and manipulating group of threads.
 * 		ThreadGroup(ThreadGroup parent,String name)
 *
 *		main function run as thread name - "main"
 *		main thread belong to threadgroup - "main"
 *		main threadgroup belong to the "system" parent threadgroup.
 */