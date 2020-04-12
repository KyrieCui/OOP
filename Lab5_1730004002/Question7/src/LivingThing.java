
public class LivingThing {
	private String name;
	public LivingThing(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}	//a method to get name
	public static void testLivingThing() {
		LivingThing A=new LivingThing("Tom");
		System.out.println(A.getName()=="Tom");
	}
}
