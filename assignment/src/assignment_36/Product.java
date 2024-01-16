package assignment_36;

public class Product {
	private int pid;
		private int price;
		private int quantity;
		
		public Product() {}
		public Product(int pid, int price, int quantity) {
			super();
			this.pid = pid;
			this.price = price;
			this.quantity = quantity;
		}
		
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		
}
