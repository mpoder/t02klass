import java.lang.Math;

public class Circle {
	double a;
	public Circle(double radius) {
		if (radius <= 0) {throw new RuntimeException("Radius cannot be smaller than 0");}
		a = radius;
	}

	public double area() {
		return Math.round(3.14 * a * a);
	}

	public double circumference() {
		return Math.round(2 * 3.14 * a);
	}

	public String toString() {
		return "Circle with radius of " + a + " has the area of "
		+ area() + " and the circumference of " + circumference() + " units.";
	}

}
