
public abstract class Animal {
	private String name;
	public Animal(String name) {
		this.name=name;
	}
	public String getNane() {
		return name;
	}	//a method to get name
	public abstract int getLegs();	
	public abstract boolean canFly();
	//abstract method to get legs
	public static void testAnimal() {
		
	}
}
