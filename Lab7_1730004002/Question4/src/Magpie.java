
public class Magpie extends Bird{
	public Magpie(String name) {
		super(name,6);
	}
	@Override
	public boolean canFly() {
		return true;
	}	//override canFly method that magpie can fly
	public static void testMagpie() {
		//create a magpie object to test
		Magpie m=new Magpie("kk");
		System.out.println(m.getName()=="kk");
		System.out.println(m.getLegs()==2);
		System.out.println(m.canFly()==true);
		System.out.println(m.getNumOfEggs()==6);
	}
}
