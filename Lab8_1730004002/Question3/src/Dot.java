
public class Dot extends Shape {
	public Dot(double x,double y) {
		super(x,y);
	}
	@Override
	public double area() {
		return 0.0;
	}	//Override the area method
	public void resize(double newRadius) throws Exception {
		throw new Exception("Cannot resize a dot!");
	}	//Override the resize method
	public static void testDot() {
		Dot d=new Dot(3.0,4.0);	//new a dot object to test
		System.out.println(d.getX()==3.0);	//test the getX method
		System.out.println(d.getY()==4.0);	//test the getY method
		System.out.println(d.area()==0.0); 	//test the area method
		try {
			d.resize(2.0);	// May throw an exception, which we need to catch.
		}
		catch(Exception e) {	// Catch all exceptions!
			System.out.println(e.getMessage()=="Cannot resize a dot!");	
		}
	}
}
