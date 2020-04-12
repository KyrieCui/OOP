
public class BoletusEdulis extends Boletus{
	public BoletusEdulis(String color,int price) {
		super(color,price);
	}	//first constructor
	public BoletusEdulis(String color) {
		super(color,100);
	}	//the second constructor with the price is always 100
	public static void testBoletusEdulis() {
		BoletusEdulis b1=new BoletusEdulis("red",50); //create a BoletusEdulis object b1 to test
		System.out.println(b1.getColor()=="red");
		System.out.println(b1.getPrice()==50);
		System.out.println(b1.isEdible()==true);
		
		BoletusEdulis b2=new BoletusEdulis("white");	//create a BoletusEdulis object b2 to test
		System.out.println(b2.getColor()=="white");
		System.out.println(b2.getPrice()==100);
		System.out.println(b2.isEdible()==true);
		
	}
}
