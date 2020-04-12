
public class Dot extends Shape{
	public Dot(double x,double y) {
		super(x,y);
	}
	@Override
	public double area() {
		return 0.0;
	}
	public String toString() {
		return "Dot";
	}
	public static void testDot() {
		//create a dot object to test
		Dot d=new Dot(3.0,2.0);
		System.out.println(d.getX()==3.0);
		System.out.println(d.getY()==2.0);
		System.out.println(d.area()==0.0);
		
	}
}