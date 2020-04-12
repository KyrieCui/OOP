
public class Person {
	private String name;
	private static BankAccount B;
	private static Motocycle M;
	public Person(String name, int money, Motocycle motocycle) {
		this.name=name;
		B=new BankAccount(money);
		M=motocycle;
	}
	public String getDescr() {
		String s1="Mr." +name+" has "+ B.getMoney()+" and"+M.getColor()+" motocycle"+" with "+M.getGasoline()+" liters of gasoline";
		return s1;
	}
	public void changeMotocycle(Motocycle motocycle) {
		M=motocycle;
	}
	public void buyGasoline(int money) {
		if(money<=B.getMoney()) {
			B.setMoney(B.getMoney()-money);
			M.addGasoline(money/8);
		}
	}	//if the money in the account is enough, buy gasoline
	public static void testPerson() {
		Motocycle M1=new Motocycle("red",10);
		Person P=new Person("Kyrie",100,M1);
		System.out.println(M.getColor()=="red");
		System.out.println(M.getGasoline()==10);
		System.out.println(B.getMoney()==100);
		//test the personal bank account money and his motocycle's color and gasoline
		
		//System.out.println(P.getDescr());
		System.out.println(P.getDescr().equals("Mr.Kyrie has 100 andred motocycle with 10 liters of gasoline"));
		//test the method of getDescr
		
		Motocycle M2=new Motocycle("blue",6);
		P.changeMotocycle(M2);
		System.out.println(M.getColor()=="blue");
		System.out.println(M.getGasoline()==6);
		//test the motocycle color and gasoline after change the Motoycle
		
		P.buyGasoline(20);
		System.out.println(B.getMoney()==80);
		System.out.println(M.getGasoline()==8);
		//test the money and gasoline after buy gasoline
		
	}
}
