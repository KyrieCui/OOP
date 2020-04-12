
public class Student {
	private String name;
	private Animal pet;
	public Student(String name, Animal pet) {
		this.name=name;
		this.pet=pet;
	}
	public String getName() {
		return name;
	}	//a method to get student's name
	public Animal getPet() {
		return pet;
	}	//a method to get student's pet
	public static void testStudent() {
		//create a cat object 
				Animal cat=new Cat("Bob",2.0);
				Student s=new Student("Kyrie",cat);
				System.out.println(s.getName()=="Kyrie");
				System.out.println(s.getPet()==cat);
				System.out.println(cat.getName()=="Bob");
				System.out.println(cat.getWeight()==2.0);
				//create a dog object
				
				Animal dog=new Dog("KK",5.0);
				Student s1=new Student("Kevin",dog);
				System.out.println(s1.getName()=="Kevin");
				System.out.println(s1.getPet()==dog);
				System.out.println(dog.getName()=="KK");
				System.out.println(dog.getWeight()==5.0);
	}
	
	
}
