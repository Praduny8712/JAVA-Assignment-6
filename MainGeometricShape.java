package Assignment6;

public class MainGeometricShape {

	public static void main(String[] args) {
		Cricle cricle = new Cricle(5);
		cricle.area();
		cricle.perimeter();
		System.out.println("=====================================");
		Rectangle rectangle = new Rectangle(3, 5);
		rectangle.area();
		rectangle.perimeter();
		System.out.println("=====================================");
		Triangle triangle = new Triangle(9, 7, 8);
		triangle.area();
		triangle.perimeter();

	}

}
