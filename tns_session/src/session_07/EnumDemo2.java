package session_07;

public class EnumDemo2 {
	
	public enum Coffee{
		SMALL(30),MEDIUM(50),LARGE(100);

		int price;
	
	Coffee(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	};
	
	public static void main(String[] args) {
		Coffee coffee =Coffee.MEDIUM;
		System.out.println("Rs. "+coffee.getPrice());
	}
	
	
};
