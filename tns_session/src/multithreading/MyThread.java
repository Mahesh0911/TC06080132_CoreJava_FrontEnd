package multithreading;

public class MyThread extends Thread{

	public MyThread(ThreadGroup g, String name) {
		super(g,name);
	}
	
	@Override
	public void run() {
	
		System.out.println("Child Thread "+Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
