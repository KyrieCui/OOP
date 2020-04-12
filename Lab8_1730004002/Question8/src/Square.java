
public class Square extends Rectangle {
	public Square(double x,double y,double size) {
		super(x,y,size,size);
	}
	@Override
	public void resize(double newWidth,double newLength) throws CannotResizeException {
			if(newWidth==newLength) {
				super.resize(newWidth, newLength);
			}	//when the newWidth equal to the newLength, use the resize(newWidth,newLength) function to resize
			else {
		throw new CannotResizeException("Cannot resize a Cannot resize a square into a rectangle!");
		}
	}
	public static void testSquare() {
		Square s=new Square(1.0,3.0,3.0);	//new a square object to test
		System.out.println(s.getX()==1.0); 	//test the getX method
		System.out.println(s.getY()==3.0);  //test the getY method
		System.out.println(s.area()==9.0);  //test the area method
		s.move(4.0, 0.0); 		//move the square
		System.out.println(s.getX()==4.0); 
		System.out.println(s.getY()==0.0); 	 //test the move method
		try{
			s.resize(10.0,10.0); 	//resize the square
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage()); 	
		}	//try to resize with the same width and length
		System.out.println(s.area()==100.0); 	
	
		try {
			s.resize(4.0,7.0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage()=="Cannot resize a Cannot resize a square into a rectangle!");
		}	//try to resize with different width and length
	}
}
