package arrays;

public class DateSwap {
	private int d;
	private int m;
	private int y;
	
	public DateSwap() {}
	
	public DateSwap(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}


	public String toString() {
		return "DateSwap [d=" + d + ", m=" + m + ", y=" + y + "]";
	}


	public static void swap(DateSwap d1,DateSwap d2) {
//		This will not swap the dates in main method.
		DateSwap  temp;
		temp=d1;
		d1=d2;
		d2=temp;
		
		
	}
	public static void main(String[] args) {
		DateSwap d1=new DateSwap(10,10,2023);
		DateSwap d2=new DateSwap(10,11,2020);
		
		System.out.println("Before swap function call : ");
		System.out.println("d1 :"+d1);
		System.out.println("d2 :"+d2);

		DateSwap.swap(d1,d2);
		
		System.out.println("After swap function call : ");
		System.out.println("d1 :"+d1);
		System.out.println("d2 :"+d2);
		
		
	}

}
