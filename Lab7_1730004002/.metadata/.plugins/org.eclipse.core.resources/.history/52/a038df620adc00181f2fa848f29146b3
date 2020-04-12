public class Start {
	public static void main(String[] args) {
		Animal.testAnimal();
		Dog.testDog();
		Bird.testBird();
		Magpie.testMagpie();
		Ostrich.testOstrich();
		Pegasus.testPegasus();
		Airplane.testAirplane();
		//use interface f to create a magpie object to test
		Flyer f=new Magpie("a");
		System.out.println(f.getName()=="a");
		System.out.println(f.canFly()==true);
		//use interface f to create a ostrich object to test
		f=new Ostrich("b");
		System.out.println(f.getName()=="b");
		System.out.println(f.canFly()==false);
		//use interface f to create a pegasus object to test
		f=new Pegasus("c");
		System.out.println(f.getName()=="c");
		System.out.println(f.canFly()==true);
		//use interface f to create a airplane object to test
		f=new Airplane("China");
		System.out.println(f.getName()=="China");
		System.out.println(f.canFly()==true);
	}
}