package multithreading;

public class MyThread_Sync_2 extends Thread{

	Factorial factorial;
	public MyThread_Sync_2(Factorial f) {
		super();
		this.factorial=f;
	}
	
	@Override
	public void run() {
		this.factorial.fact(5);
	}
}
