package session_08;

import session_08.Outer2.Inner;

public class Outer {
	
	private int no=100;
	
	protected class Inner{
		int no=1000;
		
		public void getNo() {
			int no=10;
			System.out.println("No :"+ no);		//local no variable
			System.out.println("No :"+ this.no);		//variable no of the Inner class
			System.out.println("No :"+ Outer.this.no);		//variable no of the Outer class
		}
	}
	
	public void get() {
		Inner inner=new Inner();
		inner.getNo();
	}
	
	
	public static void main(String[] args) {
		
		Outer o =new Outer();
		Inner i = o.new Inner();
		o.get();
		
		/////////////////////////////////////////
 		// 		another way
 		Inner inner=new Outer().new Inner();
 		i.getNo();
	
	}

}
