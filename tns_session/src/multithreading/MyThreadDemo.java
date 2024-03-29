package multithreading;

public class MyThreadDemo implements Runnable{
@Override
public void run() {
for (int i = 0; i < 5; i++) {
	System.out.println(Thread.currentThread().getName()+" "+i +" "+Thread.currentThread().getPriority());
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}	
}

public static void main(String[] args) {
	//MyThread class
	ThreadGroup pGroup=new ThreadGroup("ParentGroup");
	ThreadGroup cGroup=new ThreadGroup(pGroup,"ChildGroup");
	MyThread t1= new MyThread(pGroup,"First");
	MyThread t2= new MyThread(pGroup,"Second");
	
	t1.start();
	t2.start();
	
	System.out.println(pGroup.activeCount());//2
	System.out.println(pGroup.activeGroupCount());//1
	pGroup.list();
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(pGroup.activeCount()); // 0
	System.out.println(pGroup.activeGroupCount()); // 1
	
	pGroup.list();
	
	
}
	/*
	public static void main(String[] args) {
		
		MyThreadDemo m1=new MyThreadDemo();
		Thread t1=new Thread(m1);
		
		MyThreadDemo m2=new MyThreadDemo();
		Thread t2=new Thread(m2);
		
		MyThreadDemo m3=new MyThreadDemo();
		Thread t3=new Thread(m3);
		
		t1.setName("ONE");
		t2.setName("TWO");
		t3.setName("THREE");
		
		t1.setPriority(10);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(1);
		
		
		t1.start();
		t2.start();
		t3.start();
	}

	 */
}
/*
 *	Thread : *** Thread run at Hardware level not at software level. ***
 *		
 *		Used by thread scheduler to decide when each thread should be allowed to run.
 *		Threads of equal priority compete with for CPU.
 *		Thread scheduler picks up the highest priority thread that is currently runnable.
 *		Priority levels range from 1(MIN_PRIORITY) to 10(MAX_PRIORITY).
 *		5(NORM_PRIORITY) is the default priority level.
 * 
 * 		Thread can be executed by extending Thread class or implementing runnable interface.
 * 		As java doesn't support Multiple inheritance so extending Thread class make it unable to extend any other class,
 * 		So, we can use runnable interface if we want to extend other class also.
 *
 */
