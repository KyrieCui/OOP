
public class AmanitaPhalloides extends Mushroom{
	public AmanitaPhalloides() {
		super("green");
	}
	@Override
	public boolean isEdible() {
		return false;
	}	//the mushroom can not be eaten
	public static void testAmanitaPhalloides() {
		AmanitaPhalloides P=new AmanitaPhalloides();//create a AmanitaPhalloides object to test
		System.out.println(P.getColor()=="green");
		System.out.println(P.isEdible()==false);
	}
}
