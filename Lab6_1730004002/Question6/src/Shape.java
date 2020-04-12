
public class Shape {
	private double x;
	private double y;
	static String s1;
	//x and y instance variables store the position of the central point of the shape
	public Shape(double x ,double y) {
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double area() {
		s1="An unknown shape has an unknown area!";
		System.out.println(s1);
		return -1.0;
	}
	public static void testShape() {
		Shape s=new Shape(1.0,3.0);
		System.out.println(s.getX()==1.0);
		System.out.println(s.getY()==3.0);
		System.out.println(s.area()==-1.0);
		System.out.println(s1.equals("An unknown shape has an unknown area!"));
		//create a new shape object to test each method
	}
}