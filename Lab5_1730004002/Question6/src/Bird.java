
public class Bird extends Animal {
	private double altitude;
	public Bird(String name,double weight,double altitude) {
		super(name,weight);
		this.altitude=altitude;
	}	//a constructor to create a new object with name weight and altitude
	public double getAltitude() {
		return altitude;
	
	}	//a method to get altitude;
	public static void testBird() {
		Bird b=new Bird("Kevin",0.5,1.0);
		System.out.println(b.getName()=="Kevin");
		System.out.println(b.getWeight()==0.5);
		System.out.println(b.getAltitude()==1.0);
	}
}
