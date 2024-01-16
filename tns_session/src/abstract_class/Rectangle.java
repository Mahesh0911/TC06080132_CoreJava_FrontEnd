package abstract_class;

public class Rectangle extends Shape{
	private double l,b;
	
	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}
	



	@Override
	double area() {
		return l*b;
	}

}
