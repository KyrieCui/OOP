
public class BoletusRubroflammeus extends Boletus {
	public BoletusRubroflammeus() {
		super("red",0);
	}	//constructor with red color and 0 price
	@Override
	public boolean isEdible() {
		return false;
	}	//the mushroom can not be eaten
	public static void testBoletusRubroflammeus() {
		BoletusRubroflammeus r=new BoletusRubroflammeus();	//create a BoletusRubroflammeus object to test
		System.out.println(r.getColor()=="red");
		System.out.println(r.getPrice()==0);
		System.out.println(r.isEdible()==false);
	}
}
