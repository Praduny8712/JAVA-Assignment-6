package Assignment6;

abstract public class GeometricShape {
	abstract void area();

	abstract void perimeter();
}

class Cricle extends GeometricShape {
	private double r;
	final double PI = 3.14;

	public Cricle(double r) {
		super();
		this.r = r;
	}

	@Override
	void area() {
		System.out.println("Area of circle= " + PI * r * r);
	}

	@Override
	void perimeter() {
		System.out.println("Perimeter of circle= " + 2 * PI * r * r);
	}
}

class Rectangle extends GeometricShape {
	private double l;
	private double b;

	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	void area() {
		System.out.println("Area of Rectangle= " + l * b);
	}

	@Override
	void perimeter() {
		System.out.println("Perimeter of Rectangle= " + 2 * l * b);
	}
}

class Triangle extends GeometricShape {
	private double a;
	private double b;
	private double h;

	public Triangle(double a, double b, double h) {
		super();
		this.a = a;
		this.b = b;
		this.h = h;
	}

	@Override
	void area() {
		System.out.println("Area of Triangle= " + 0.5 * b * h);

	}

	@Override
	void perimeter() {
		System.out.println("Perimeter of Triangle= " + a + b + h);

	}

}
