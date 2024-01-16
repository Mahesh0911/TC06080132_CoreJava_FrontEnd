package session_08;

import session_08.Outer.Inner;

public class Outer2 {
	private int i=100;
	private static int a=1;
	
	static class Inner {
		int no=111;
		public void get() {
			System.out.println("No :"+no);
//			System.out.println("i :"+i);
			System.out.println("a :"+a);
		}
	}
	
	public static void main(String[] args) {
				
		//Inner static_inner_obj=new Inner();
		Outer2.Inner static_inner_obj=new Outer2.Inner();
 		static_inner_obj.get();
 		
 	

	}

}
