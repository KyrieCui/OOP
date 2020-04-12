
public class Boletus extends Mushroom{
	private int price;
	public Boletus(String color,int price) {
		super(color);
		this.price=price;
	}
	public int getPrice() {
		return price;
	}	//method to get price
	@Override
	public boolean isEdible() {
		return true;
	}	//the mushroom can  be eaten
	public static void testBoletus() {
		 Boletus b=new  Boletus("blue",10); //create a  Boletus object to test
		 System.out.println(b.getColor()=="blue");
		 System.out.println(b.getPrice()==10);
		 System.out.println(b.isEdible()==true);
	}
}
