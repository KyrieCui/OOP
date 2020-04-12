
public class Bag {
	private Mushroom mushroom;
	public Bag(Mushroom mushroom) {
		this.mushroom=mushroom;
	}
	public Mushroom getMushroom() {
		return mushroom;
	}
	public static void testBag() {
		BoletusRubroflammeus br1=new BoletusRubroflammeus();	//create a BoletusRubroflammeus object br1
		Bag bag=new Bag(br1);	//create a Bag object bag with br1
		BoletusRubroflammeus br2=(BoletusRubroflammeus) bag.getMushroom();	// Explicit downcast
		System.out.println(br1==br2);
		
	}
	
}
