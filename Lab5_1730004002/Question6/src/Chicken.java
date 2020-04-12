
public class Chicken extends Bird{
	public Chicken(String name) {
		super(name,5.0,0.0);
		
	}
	public static void testChicken() {
		Chicken c=new Chicken("Alice");
		System.out.println(c.getName()=="Alice");
		System.out.println(c.getWeight()==5.0);
		System.out.println(c.getAltitude()==0.0);
	}
}
