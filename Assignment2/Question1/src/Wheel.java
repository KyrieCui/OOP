
public class Wheel {
	private boolean flat;
	public Wheel() {
		flat=false;
	}	//when a new object is created, the wheel is not flat
	public boolean isFlat() {
		return flat;
	}	//method to indicate the wheel is flat or not
	public void setFlat() {
		flat=true;
	}	//make the wheel flat
	public static void testWheel() {
		Wheel w=new Wheel();
		System.out.println(w.isFlat()==false);
		//test the wheel is not flat when a object is created
		w.setFlat();	//make the wheel flat
		System.out.println(w.isFlat()==true);
	}
	
}
