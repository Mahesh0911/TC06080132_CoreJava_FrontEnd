package assignment_36;

import java.util.Scanner;

public class XYZ extends Product{

	public static int totalSpent(Product[] arr) {
		int n=arr.length;
		int spent=0;
		for(int i=0;i<n;i++) {
			spent+=arr[i].getPrice()*arr[i].getQuantity();
		}
		return spent;
	}
	public static int getMax(Product[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int max=0;
		int maxId=0;
		for (int i=0;i<n;i++) {
			if(arr[max].getPrice() < arr[i].getPrice()) {
				maxId=arr[i].getPid();
			}
			
		}
		return maxId;

	}
	public static Product[] storeIntoArray(Scanner sc,Product[] arr) {
		
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Product[] arr=new Product[5];
		
		int pid;
		int price;
		int quantity;

		for(int i=0;i<5;i++) {
			System.out.print("Enter Pid :");
			pid=sc.nextInt();
			System.out.print("Enter Price:");
			price=sc.nextInt();
			System.out.print("Enter Quantity:");
			quantity=sc.nextInt();
			arr[i]= new Product(pid,price,quantity);
		}
		
		System.out.println("ID for Max Price :"+getMax(arr));
		System.out.println("Total Spent:"+totalSpent(arr));
		
		
	}

}
