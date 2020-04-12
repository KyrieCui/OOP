
public class Start {
	public static void main(String[] args)  {
		Door.testDoor();
		try {
		Car.testCar();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
