
public abstract class Shape {
	private double x;
	private double y;
	public Shape(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return x;
	}	//getX method to return x
	public double getY() {
		return y;
	}	//getY method to return y
	public void move(double dx,double dy) {
		x=dx;
		y=dy;
	}	//The move method moves the central point of the shape by the amounts dx and dy
	public abstract double area();
	public abstract void resize(double newSize);
	public static void testShape() {
		
	}
}
	