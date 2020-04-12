
public class House extends Building {
	public House(String name,int power) throws NotAPowerGeneratorException {
		super(name,power);
		if(power<0)
			throw new NotAPowerGeneratorException("A new house cannot generate power");
	}	//if the value of the power less than 0,throw a exception
	
	@Override
	public void morePower(int amount) throws NotAPowerGeneratorException {
		if(amount<-getPower())
			throw new NotAPowerGeneratorException("A house cannot generate "+(-getPower()-amount)+ " watts of power");
		//if the amount is too negative, throws a Exception
		else 
		setPower(getPower()+amount);
		
	}	//increases the amount of power consumed by the house by the amount of power given as argument to the method
	
	public static void testHouse() throws Exception {
		try {
			House h1=new House("Bob",-500);
		}
		catch(Exception e) {
			System.out.println(e.getMessage()=="A new house cannot generate power");
		}	//try to new a House object with the power value is negative
		
		House h2=new House("Kyrie",2000); //new a House object to test
		System.out.println(h2.getName()=="Kyrie");	//test the getName method
		System.out.println(h2.getPower()==2000);	//test the getPower method
		h2.setPower(1000);	
		System.out.println(h2.getPower()==1000);	//test the setPower method
		h2.morePower(200);
		System.out.println(h2.getPower()==1200);	//test the morePower method with positive argument
		h2.morePower(-200);
		System.out.println(h2.getPower()==1000);		//test the morePower method with a small negative argument
		try{
			h2.morePower(-1200);
		}
		catch(Exception e) {
			System.out.println(e.getMessage().equals("A house cannot generate 200 watts of power"));
		}	//try to morePower method with a too negative argument*/
		
		
		
	}
}
