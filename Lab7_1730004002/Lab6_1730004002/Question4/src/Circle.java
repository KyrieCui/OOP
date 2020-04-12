
public class Circle extends Shape {
	private double radius;
	public Circle(double x, double y,double radius) {
		super(x,y);
		this.radius=radius;
	}
	public double area() {
		double area;
		area=Math.PI*radius*radius;
		return area;
	}
	public static void testCircle() {
		//create a circle object to test the area method
		Circle c=new Circle(0.0,0.0,5);
		System.out.println(c.area()==Math.PI*25);
		System.out.println(c.getX()==0.0);
		System.out.println(c.getY()==0.0);
	}
}
