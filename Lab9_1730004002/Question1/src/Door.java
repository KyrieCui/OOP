
public class Door {
	private boolean isOpen;
	public Door() {
		isOpen=false;
	}
	public boolean isOpen() {
		return isOpen;
	}	//a method to return the isOpen
	public void open() {
		isOpen=true;
	}	//make the door open
	public void close() {
		isOpen=false;
	}	//close the door
	public static void testDoor() {
		Door d=new Door();	//new a door object to test
		System.out.println(d.isOpen()==false); //test the door whether is close when it is created
		d.open();	//open the door
		System.out.println(d.isOpen()==true);	//test the open method
		d.close(); 	//close the door
		System.out.println(d.isOpen()==false); //test the close method
	}
	
}
