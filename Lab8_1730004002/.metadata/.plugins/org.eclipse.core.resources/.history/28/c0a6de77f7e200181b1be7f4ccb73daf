
public class Square extends Rectangle {
	public Square(double x,double y,double size) {
		super(x,y,size,size);
	}
	public static void testSquare() {
		Square s=new Square(1.0,3.0,3.0);	//new a square object to test
		System.out.println(s.getX()==1.0); 	//test the getX method
		System.out.println(s.getY()==3.0);  //test the getY method
		System.out.println(s.area()==9.0);  //test the area method
		s.move(4.0, 0.0); 		//move the square
		System.out.println(s.getX()==4.0); 
		System.out.println(s.getY()==0.0); 	 //test the move method
		s.resize(10.0); 	//resize the square
		System.out.println(s.area()==100.0); 	//test the resize method
	}
}
