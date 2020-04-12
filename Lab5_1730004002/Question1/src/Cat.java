
public class Cat {
	private String name;
	private double weight;
	public Cat(String name,double weight) {
		this.name=name;
		this.weight=weight;
	}	//A constructor to create a new object with name and weight
	public String getName() {
		return name;
	}	//a method to get name
	public double getWeight() {
		return weight;
	}	//a method to get weight
	public void feed() {
		weight=weight+1.0;
	}	//a cat add 1.0 to its weight after feeding
	public static void testCat() {
		Cat c=new Cat("Meow",2.0);
		//new a object
		System.out.println(c.getName()=="Meow");
		System.out.println(c.getWeight()==2.0);
		c.feed();
		// The name is still the same but the weight increased by 1.0:
		System.out.println(c.getName()=="Meow");
		System.out.println(c.getWeight()==3.0);
	}
}
