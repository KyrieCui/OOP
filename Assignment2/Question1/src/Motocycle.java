
public class Motocycle {
	private String color;
	private int gasoline;
	private static Wheel frontWheel;
	private static Wheel backWheel;
	public Motocycle(String color,int gasoline) {
		frontWheel=new Wheel();
		backWheel=new Wheel();
		this.color=color;
		this.gasoline=gasoline;
	}	//a constructor
	public String getColor() {
		return color;
	}	//a method to get the Motocycle color
	public int getGasoline() {
		return gasoline;
	}	//a method to get the number of gasoline
	public boolean addGasoline(int gasoline) {
		if(gasoline>0) {
			this.gasoline=this.gasoline+gasoline;
			return true;
		}	//if the argument of gasoline is negative,add gasoline and return true
		else
			return false;
			//if the argument is 0 or negative,return false
	}
	public void drive() {
		if(gasoline>=2) {
			gasoline=gasoline-2;
			if(gasoline<2)
				gasoline=0;
		}
		
	}	//if gasoline more than 2 liters,the motorcycle consumes two liters of gasoline each time
	public void accident(){
		frontWheel.setFlat();
	}	//if happen to accident, the front wheel become flat
	public void repair() {
		frontWheel=new Wheel();
	}	//change new front wheel after repairing
	public int getMaxSpeed() {
		int speed = 0 ;
		if (gasoline==0) {
			speed=0;
		}
		
		else {
			if(frontWheel.isFlat()==true||backWheel.isFlat()==true) {
				speed=10;
		}
			else if(frontWheel.isFlat()==false&&backWheel.isFlat()==false) {
				speed=100;
			}
			
		}
		return speed;
 }
	// get the max speed of the moto
	public static void testMotocycle() {
		Motocycle m1=new Motocycle("red",5);
		System.out.println(m1.getColor()=="red");
		System.out.println(m1.getGasoline()==5);
		System.out.println(frontWheel.isFlat()==false);
		System.out.println(backWheel.isFlat()==false);
		//test the color gasoline and wheel when a new object is created
		System.out.println(m1.addGasoline(10)==true);
		System.out.println(m1.addGasoline(0)==false);
		//check the method of addGasoline
		m1.drive();
		System.out.println(m1.getGasoline()==13);
		//test the gasoline after driving a time
		m1.accident();
		System.out.println(frontWheel.isFlat()==true);
		//test the wheel is flat or not after an accident
		m1.repair();
		System.out.println(frontWheel.isFlat()==false);
		//test the wheel is flat or not after repairing
		System.out.println(m1.getMaxSpeed()==100);
		//test the speed if the wheel is not flat and there are enough gasoline
		m1.accident();
		System.out.println(m1.getMaxSpeed()==10);
		//test the speed if the wheel is flat
		m1.repair();
		for(int i=0;i<=6;i++) {
			m1.drive();
		}
		System.out.println(m1.getMaxSpeed()==0);
		//test the speed if there are not enough gasoline
		
	
	}
}