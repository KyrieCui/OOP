
public abstract class Animal implements Flyer {
	private String name;
	public Animal(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}	//a method to get name
	public abstract int getLegs();	
	public abstract boolean canFly();
	//abstract method to get legs
	public static void testAnimal() {
		
	}
}
