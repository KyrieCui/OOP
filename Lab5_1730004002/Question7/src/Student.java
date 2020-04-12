
public class Student extends LivingThing {
	private Animal pet;
	public Student(String name, Animal pet) {
		super(name);
		this.pet=pet;
	}
	public Animal getPet() {
		return pet;
	}
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
		
		//create a bird object
		Animal b=new Bird("JJ",0.5,2.0);
		Student s2=new Student("Scott",b);
		System.out.println(s2.getName()=="Scott");
		System.out.println(s2.getPet()==b);
		System.out.println(b.getName()=="JJ");
		System.out.println(b.getWeight()==0.5);
		
		//create a chicken object
		Animal c=new Chicken("Alice");
		Student s3=new Student("Tracy",c);
		System.out.println(s3.getName()=="Tracy");
		System.out.println(s3.getPet()==c);
		System.out.println(c.getName()=="Alice");
		System.out.println(c.getWeight()==5.0);

	
		
	
	}
	
	
}
