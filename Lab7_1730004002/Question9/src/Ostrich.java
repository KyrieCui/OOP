
public class Ostrich extends Bird{
	public Ostrich(String name) {
		super(name,10);
	}
	@Override
	public boolean canFly() {
		return false;
	}	//override canFly method that Ostrich can not fly
	@Override
	public boolean  isDangerous() {
		return true;
	}	//override is Dangerous method that ostrich is dangerous
	public static void testOstrich() {
		//create a Ostrich object to test
		Ostrich o=new Ostrich("Kyrie");
		System.out.println(o.getName()=="Kyrie");
		System.out.println(o.getLegs()==2);
		System.out.println(o.getNumOfEggs()==10);
		System.out.println(o.canFly()==false);
		System.out.println(o.isDangerous()==true);
	}
}
