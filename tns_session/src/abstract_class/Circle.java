package abstract_class;

public class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	double area() {
		
		return 3.14*this.radius*this.radius;
	}

}
