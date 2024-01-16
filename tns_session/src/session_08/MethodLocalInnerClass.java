package session_08;

public class MethodLocalInnerClass {
private int i=10;

public void get() {
	class Inner {
		int no=111;
		public void get() {
			System.out.println("No :"+no);
		}
	}
	Inner i=new Inner();
	i.get();
	
}

public static void main(String[] args) {
	MethodLocalInnerClass methodLocalInnerClass=new MethodLocalInnerClass();
	methodLocalInnerClass.get();
}
}
