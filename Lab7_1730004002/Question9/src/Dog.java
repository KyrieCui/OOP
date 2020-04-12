
public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	@Override
	public int getLegs() {
		return 4;
	}	//override getLegs method to return 4 legs
	public boolean canFly() {
		return false;
	}	//override canFly method indicate dog can not fly
	@Override
	public boolean  isDangerous() {
		return false;
	}	//override is Dangerous method that dog is not dangerous
	public static void testDog() {
		//create a dog object to test
		Dog d=new Dog("Scott");
		System.out.println(d.getName()=="Scott");
		System.out.println(d.getLegs()==4);
		System.out.println(d.canFly()==false);
		System.out.println(d.isDangerous()==false);
		//use interface to create a new dog object to test
		Flyer f=new Dog("k");
		System.out.println(f.getName()=="k");
		System.out.println(f.canFly()==false);
		System.out.println(f.isDangerous()==false);
		
			
	}
}
