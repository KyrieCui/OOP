
public abstract class Building implements Consumer{
	private String name;
	private int power;
	public Building(String name, int power) {
		this.name=name;
		this.power=power;
	}
	
	public String getName() {
		return name;
	}	//Override the getName method in the interface to get name
	
	public int getPower() {
		return power;
	}	//Override the getPower method in the interface to get power
	
	protected void setPower(int power) {
		this.power=power;
	}	//a protected method to change the amount of power consumed by the building
	
	public abstract void morePower(int amount);	//override the morePower method in the interface to increase the amount of power generated or consumed by a building
	
	public static void testBuilding() {
		
	}
}
