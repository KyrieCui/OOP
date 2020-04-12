
public class Circle extends Shape {
	private double radius;
	public Circle(double x,double y,double radius) throws BadRadiusException {
		super(x,y);
		if(radius>0) {
		this.radius=radius;
		}	//if new radius is positive,this.radius equal to radius
		else  {
			throw new BadRadiusException("Radius must be positive!");
		}
	}
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}	//Override the area method to get the circle area
	public void resize(double newRadius) throws BadRadiusException{
		if(newRadius>0) {
		radius=newRadius;
		}	//if new radius is positive,resize the radius
		else  {
			throw new BadRadiusException("Radius must be positive!");
		}
	}	//Override the resize method to change tHe radius of circle
	public static void testCircle() {
		try {
			Circle c1=new Circle(0.0,0.0,2.0);	//new a circle object to test
			System.out.println(c1.getX()==0.0);	//test the getX method
			System.out.println(c1.getY()==0.0);	//test the getY method
			System.out.println(c1.radius==2.0); 
			System.out.println(c1.area()==Math.PI*4.0);	//test the area method
			c1.move(1.0, 2.0); 	//move the circle c1
			System.out.println(c1.getX()==1.0);
			System.out.println(c1.getY()==2.0); //test the move method
			try{
				c1.resize(5.0);	//change the positive radius 
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(c1.radius==5.0); 	//test the resize method
			System.out.println(c1.area()==Math.PI*25.0);	//test the resize method
			try {
				c1.resize(0.0); //resize the radius is 0
			}
			catch(Exception e) {
				System.out.println(e.getMessage()=="Radius must be positive!");
			}	
			System.out.println(c1.radius==5.0); 	//test the resize method
			System.out.println(c1.area()==Math.PI*25.0);	//test the resize method
			//test the resize when radius is 0
			try {
				c1.resize(-2.0); 	//resize the radius is negative
			}
			catch(Exception e){
				System.out.println(e.getMessage()=="Radius must be positive!");
			}
			System.out.println(c1.radius==5.0); 	//test the resize method
			System.out.println(c1.area()==Math.PI*25.0);	//test the resize method
			//test the resize when radius is negative
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}	//test the constructor when radius is positive
		
		try {
			Circle c2=new Circle(1.0,2.0,0.0);
			System.out.println(c2.getX()==1.0);
			System.out.println(c2.getY()==2.0);	//Because radius is 0,so it will jump and ignore the test of getX and getY
		}
		catch(Exception e) {
			System.out.println(e.getMessage()=="Radius must be positive!");
		}	//test new a circle with 0 radius
		try {
			Circle c3=new Circle(1.0,2.0,-5.9);
			System.out.println(c3.getX()==1.0);
			System.out.println(c3.getY()==2.0);	//Because radius is negative,so it will jump and ignore the test of getX and getY
		}
		catch(Exception e) {
			System.out.println(e.getMessage()=="Radius must be positive!");
		}
		//test new circle with negative radius
	
		
	}
	
}