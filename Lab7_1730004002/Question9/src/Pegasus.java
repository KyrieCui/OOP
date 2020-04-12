
public class Pegasus extends Bird {
	public Pegasus(String name) {
		super(name,0);
	}
	@Override
	public int getLegs() {
		return 4;
	}	//override getLegs method that Pegasus has 4 legs
	@Override
	public boolean canFly() {
		return true;
	}	//override canFly method that Pegasus can fly
	@Override
	public int getNumOfEggs() {
		System.out.println("Pegasus do not lay eggs!");
		return 0;
	}	//override getNumOfEggs that Pegasus do not lay eggs
	@Override
	public boolean  isDangerous() {
		return false;
	}	//override is Dangerous method that pegasus is not dangerous
	public static void testPegasus() {
		//create a Pegasus object to test
		Pegasus p=new Pegasus("Cici");
		System.out.println(p.getName()=="Cici");
		System.out.println(p.getLegs()==4);
		System.out.println(p.getNumOfEggs()==0);
		System.out.println(p.canFly()==true);
		System.out.println(p.isDangerous()==false);
	}
}
