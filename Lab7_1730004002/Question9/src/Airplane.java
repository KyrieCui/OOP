
public class Airplane implements Flyer {
	private String name;
	public Airplane(String name) {
		this.name=name;
	}
	@Override
	public String getName() {
		return name;
	}	//override getName method to get name
	@Override
	public boolean canFly() {
		return true;
	}	//override canFly method that airplane can fly
	@Override
	public boolean  isDangerous() {
		return false;
	}	//override is Dangerous method that airplane is not dangerous
	public static void testAirplane() {
		//new a airplane object to test
		Airplane a=new Airplane("England");
		System.out.println(a.canFly()==true);
		System.out.println(a.getName()=="England");
		System.out.println(a.isDangerous()==false);
		Flyer F=a;//use interface to test it
		System.out.println(F.canFly()==true);
		System.out.println(F.getName()=="England");
		System.out.println(F.isDangerous()==false);
	}
	
}
