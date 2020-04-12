
public class Circle extends Shape {
	private double radius;
	public Circle(double x,double y,double radius) {
		super(x,y);
		this.radius=radius;
	}
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}	//Override the area method to get the circle area
	public void resize(double newRadius) {
		radius=newRadius;
	}	//Override the resize method to change tHe radius of circle
	public static void testCircle() {
		Circle c=new Circle(0.0,0.0,2.0);	//new a circle object to test the method in the circle class
		System.out.println(c.getX()==0.0);	//test the getX method
		System.out.println(c.getY()==0.0);	//test the getY method
		System.out.println(c.radius==2.0);
		System.out.println(c.area()==Math.PI*4.0);	//test the area method
		c.move(1.0, 2.0); //move the circle
		System.out.println(c.getX()==1.0);
		System.out.println(c.getY()==2.0); //test the move method
		c.resize(5.0);	//change the radius
		System.out.println(c.radius==5.0); 	//test the resize method
		System.out.println(c.area()==Math.PI*25.0);	//test the resize method
	}
}
