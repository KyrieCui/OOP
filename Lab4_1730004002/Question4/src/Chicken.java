
public class Chicken {
	private double weight;
	private boolean sleeping;
	public Chicken(double weight) {
		this.weight=weight;
		sleeping=true;
	}	//a constructor to give chicken a weight and sleeping when a object created
	public double getWeight() {
		return weight;
	}	//return the chicken weight
	public boolean isSleeping() {
		return sleeping;
	}	//return the chicken whether it sleep or not
	public void fallAsleep() {
		sleeping=true;
	}	//make the chicken fall asleep
	public void wakeUp() {
		sleeping=false;
	}	//make the chicken wake
	public static void testChicken() {
		Chicken c = new Chicken(2.3);
		System.out.println(c.getWeight() == 2.3);
		System.out.println(c.isSleeping() == true);
		c.wakeUp();
		System.out.println(c.isSleeping() == false);
		c.wakeUp(); // should do nothing because the chicken is already awake
		System.out.println(c.isSleeping() == false);
		c.fallAsleep();
		System.out.println(c.isSleeping() == true);
		c.fallAsleep(); // should do nothing because the chicken is already sleeping
		System.out.println(c.isSleeping() == true);
	}


}
