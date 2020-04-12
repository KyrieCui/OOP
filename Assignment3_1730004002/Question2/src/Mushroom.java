
public class Mushroom {
	private String color;
	public Mushroom(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}	//method to get color
	public boolean isEdible() {
		System.out.println("Do not eat this!" );
		return false;
	}
	public static void testMushroom() {
		Mushroom m=new Mushroom("white");	//create a new mushroom object m to test
		System.out.println(m.getColor()=="white");
		System.out.println(m.isEdible()==false);
	}
}
