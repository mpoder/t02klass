public class circleTest {
	public static void main(String[] args) {
		Circle table1 = new Circle(145);
		Circle wheel = new Circle(40);
		Circle glass = new Circle(2.4);
		System.out.println(table1.area() + " " + table1.circumference());
		System.out.println(wheel.area());
		System.out.println(glass.area());
		System.out.println(table1);
		System.out.println(wheel.toString());
	}
}
