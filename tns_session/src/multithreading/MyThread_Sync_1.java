package multithreading;

public class MyThread_Sync_1 extends Thread {
	Factorial factorial;
	public MyThread_Sync_1(Factorial f) {
		super();
		this.factorial=f;
	}
	
	@Override
	public void run() {
		this.factorial.fact(10);
	}
}
