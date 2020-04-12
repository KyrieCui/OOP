
public class Cat extends Animal {
	public Cat(String name, double weight) {
		super(name, weight);
		
	}

	public void feed() {
		double weight;
		weight=super.getWeight();
		weight=weight+1.0;
		super.setWeight(weight);
	}
	//a cat add 1.0 to its weight after feeding
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
