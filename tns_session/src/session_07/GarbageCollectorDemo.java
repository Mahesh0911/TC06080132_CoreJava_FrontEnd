package session_07;

//program not working 
public class GarbageCollectorDemo {

	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Garbage Collector invoked.");
	}

	public static void main(String[] args) {
		
		GarbageCollectorDemo g1=new GarbageCollectorDemo();
		GarbageCollectorDemo g2=new GarbageCollectorDemo();
		GarbageCollectorDemo g3=new GarbageCollectorDemo();
		
		/*
		 * ....
		 * statements to be executed ...
		 * ....
		 */
		
		g1=null;
		g2=null;
		g3=null;
		
		System.gc();
		
	}
}
