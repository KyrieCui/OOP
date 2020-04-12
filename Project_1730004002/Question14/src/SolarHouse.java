import java.io.Serializable;

public class SolarHouse extends House implements Serializable{
	public SolarHouse(String name,int power) throws NotAPowerGeneratorException  {
		super(name,power);
	}
	@Override
	public void morePower(int amount) {
		setPower(getPower()+amount);
	}	//Override the morePower method that the amount of power consumed by the house can become negative without throwing any exception
	public static void testSolarHouse() throws Exception {
		SolarHouse s=new SolarHouse("Bob",1000);	//new a SolarHouse object to test
		System.out.println(s.getName()=="Bob");	//test the getName method
		System.out.println(s.getPower()==1000);	//test the getPower method
		s.setPower(2000);
		System.out.println(s.getPower()==2000);	//test the setPower method
		s.morePower(500);
		System.out.println(s.getPower()==2500);	//test the morePower method with a positive argument
		s.morePower(-3000);
		System.out.println(s.getPower()==-500); //test the morePower with a negative argument
	}
}
