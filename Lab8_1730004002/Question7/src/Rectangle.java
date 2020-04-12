
public class Rectangle extends Shape{
	private double width;
	private double length;
	public Rectangle(double x,double y,double width,double length) {
		super(x,y);
		this.width=width;
		this.length=length;
	}
	@Override
	public double area() {
		return width*length;
	}	//a method to calculate the area and return it
	@Override
	public void resize(double newSize) throws Exception {
		
	}
	public void resize(double newWidth,double newLength) throws CannotResizeException {
		width=newWidth;
		length=newLength;
		throw new CannotResizeException("true");
	}	//a method the resize width and length
	public static void testRectangle() {
		Rectangle r=new Rectangle(0.0,0.0,3.0,4.0);	//new a Rectangle object to test
		System.out.println(r.getX()==0.0); 			//test the getX method
		System.out.println(r.getY()==0.0);   		//test the getY method
		r.move(2.0, 1.0); 	//move the Rectangle
		System.out.println(r.getX()==2.0);
		System.out.println(r.getY()==1.0);	//test the move method
		System.out.println(r.area()==12.0); //test the area method
		try{
			r.resize(5.0,4.0); //resize the Rectangle
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}	//try to resize the rectangle
		System.out.println(r.width==5.0);
		System.out.println(r.length==4.0); 	//test the resize method
		System.out.println(r.area()==20.0); 	//test the resize method
	}
	
	
	
}