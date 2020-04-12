
public class Animal {
	private String name;
	private double weight;
	public Animal(String name,double weight) {
		this.name=name;
		this.weight=weight;
	}	//A constructor to create a new object with name and weight
	public String getName() {
		return name;
	}	//a method to get name
	public double getWeight() {
		return weight;
	}	//a method to get weight
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public static void testAnimal() {
		//create an animal cat
		Animal cat=new Animal("Bob",2.0);
		System.out.println(cat.getName()=="Bob");
		System.out.println(cat.getWeight()==2.0);
		cat.setWeight(3.0);
		System.out.println(cat.getWeight()==3.0);

		//create an animal dog
		Animal dog=new Animal("Ben",3.0);
		System.out.println(dog.getName()=="Ben");
		System.out.println(dog.getWeight()==3.0);
		dog.setWeight(5.0);
		System.out.println(dog.getWeight()==5.0);
		
	}
}
