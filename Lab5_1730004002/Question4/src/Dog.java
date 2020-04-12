
public class Dog extends Animal {
	public Dog(String name, double weight) {
		super(name, weight);
	}

	public void feed() {
			double weight;
			weight=super.getWeight();
			weight=weight+2.0;
			super.setWeight(weight);
	}
	//the object's weight add 2.0 after feeding
	public static void testDog() {
		Dog d = new Dog("Woof", 2.0);
		System.out.println(d.getName() == "Woof");
		System.out.println(d.getWeight() == 2.0);
		d.feed();
		// The name is still the same but the weight increased by 2.0:
		System.out.println(d.getName() == "Woof");
		System.out.println(d.getWeight() == 4.0);
		}


}
