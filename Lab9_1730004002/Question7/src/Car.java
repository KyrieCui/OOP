
import java.util.ArrayList;
public class Car {
	private String name;
	private ArrayList<Door> door;
	public Car(String name,int numberOfDoors) throws BadCarException {
		this.name=name;
		if(numberOfDoors<=1)
			throw new BadCarException("A car must have at least one door!");	//if the number of doors less than 1, throw the exception
		door=new ArrayList<Door>();	
		for(int i=0;i<numberOfDoors;i++)
			door.add(new Door());
		//create the doors
	}
	public void listDoors() {
		for(Door d:door) {
			if(d.isOpen()==true)
				System.out.println(name+" : door is open.");	//if the door is open, return the door is open
			else
				System.out.println(name+" : door is close. ");	//if the door is close, return the door is close
		}
	}
	public int countOpenDoors() {
		int num=0;
		for(Door d:door) {

			if(d.isOpen()==true)
				num=num+1;	
		}
		return num;
	}	//a method to calculate the number of open door

	public void openOneDoor(int doorNumber) throws BadDoorException {
		for(Door d:door) {
			if(doorNumber==0||doorNumber>door.size())
				throw new BadDoorException("Door "+doorNumber+" does not exist!");
			else
				d.open();
		}

	}	

	public void changeAllDoors() {
		for(Door d:door) {

			if(d.isOpen()==false)
				d.open();
			else
				d.close();
		}
	}	//a method to change the door state

	public void replaceDoor(int doorNumber) throws BadDoorException {
		if(doorNumber==0||doorNumber>door.size())
			throw new BadDoorException("Door "+doorNumber+" does not exist!");
		else
			door.set(doorNumber-1, new Door());
		//replace new door

	}
	public void replaceAllDoors() {
		for(Door d:door) {
			int i=0;
			door.set(i, new Door());
		}	//replace all the doors
	}
	
	public void replaceManyDoors(int numOfDoorsToReplace){
		for(int i=0;i<numOfDoorsToReplace;i++) {
			door.set(i, new Door());
		}

	}	//a method to replace many doors

	public void expandCar() {
		int num=0;
		for(int i=0;i<num+2;i++)
		door.add(new Door());

	}	//a method to add two doors*/

	public static void testCar() throws Exception  {
		try{
			new Car("Fly",0);	
		}
		catch(Exception e){
			System.out.println(e.getMessage()=="A car must have at least one door!");
		}	//try to new a car object to test with 0 door


		Car c2=new Car("Fly",4);	//new a car object c2 to test
		c2.listDoors();
		System.out.println(c2.countOpenDoors()==0);	

		try {
			c2.openOneDoor(0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage().equals("Door 0 does not exist!"));
		}	//try to open the number 0 door
		try {
			c2.openOneDoor(5);
		}
		catch(Exception e) {
			System.out.println(e.getMessage().equals("Door 5 does not exist!"));
		}	//try to open the number 5 door

		c2.openOneDoor(1);
		System.out.println(c2.door.get(0).isOpen()==true);
		c2.openOneDoor(2);
		System.out.println(c2.door.get(1).isOpen()==true);
		c2.openOneDoor(3);
		System.out.println(c2.door.get(2).isOpen()==true);
		c2.openOneDoor(4);
		System.out.println(c2.door.get(3).isOpen()==true);
		//test the openOneDoor method

		c2.changeAllDoors();
		System.out.println(c2.door.get(0).isOpen()==false);
		System.out.println(c2.door.get(1).isOpen()==false);
		System.out.println(c2.door.get(2).isOpen()==false);
		System.out.println(c2.door.get(3).isOpen()==false); 	//test the changeAllDoors


		try {
			c2.replaceDoor(0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage().equals("Door 0 does not exist!"));
		}	//try to replaceDoor when the number of door is 0
		try {
			c2.replaceDoor(5);
		}
		catch(Exception e) {
			System.out.println(e.getMessage().equals("Door 5 does not exist!"));
		}	//try to replace the number 5 door

		c2.replaceDoor(1);
		System.out.println(c2.door.get(0).isOpen()==false); 
		c2.replaceDoor(2);
		System.out.println(c2.door.get(1).isOpen()==false); 
		c2.replaceDoor(3);
		System.out.println(c2.door.get(2).isOpen()==false);
		c2.replaceDoor(4);
		System.out.println(c2.door.get(3).isOpen()==false);  //test the replaceDoor method


		c2.replaceAllDoors();
		System.out.println(c2.door.get(0).isOpen()==false);
		System.out.println(c2.door.get(1).isOpen()==false);
		System.out.println(c2.door.get(2).isOpen()==false);
		System.out.println(c2.door.get(3).isOpen()==false);
		//test the replaceAllDoors method

		c2.changeAllDoors();
		c2.replaceManyDoors(2);
		System.out.println(c2.door.get(0).isOpen()==false);
		System.out.println(c2.door.get(1).isOpen()==false);
		System.out.println(c2.door.get(2).isOpen()==true);
		System.out.println(c2.door.get(3).isOpen()==true);		
		//test the replaceManyDoors method when the number of doors is less than car has
		
		c2.expandCar();
		System.out.println(c2.door.get(0).isOpen()==false);
		System.out.println(c2.door.get(1).isOpen()==false);
		System.out.println(c2.door.get(2).isOpen()==true);
		System.out.println(c2.door.get(3).isOpen()==true);
		System.out.println(c2.door.get(4).isOpen()==false);
		System.out.println(c2.door.get(5).isOpen()==false);
		//test the expandCar method

		c2.replaceManyDoors(10);
		System.out.println(c2.door.get(0).isOpen()==false);
		System.out.println(c2.door.get(1).isOpen()==false);
		System.out.println(c2.door.get(2).isOpen()==false);
		System.out.println(c2.door.get(3).isOpen()==false);	
		//test the replaceManyDoors method when the number of doors is more than car has
		
		

	} 
}