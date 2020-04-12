public class Start {
	public static void main(String[] args) {
		Chicken.testChicken();
		Chicken c1=new Chicken(5.0);	//new a new object
		System.out.println(check(c1)=="sweet dream");	//test the output if the chicken is sleeping
		c1.wakeUp();	//wake up the chicken
		System.out.println(check(c1)=="need coffee");	//test the output if the chicken is waking
	}
	public static String check(Chicken c) {
		if(c.isSleeping()==false)
			return "need coffee";
		else
			return "sweet dream";
	}
}
