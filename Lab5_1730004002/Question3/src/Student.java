
public class Student {
	private String name;
	private Cat pet;
	public Student(String name, Cat pet) {
		this.name=name;
		this.pet=pet;
	}
	public String getName() {
		return name;
	}	//a method to get student's name
	public Cat getPet() {
		return pet;
	}	//a method to get student's pet
	public static void testStudent() {
		Cat pet=new Cat("Bob",2.0);
		Student s=new Student("Kyrie",pet);
		System.out.println(s.getName()=="Kyrie");
		System.out.println(s.getPet()==pet);
	}
	
	
}
