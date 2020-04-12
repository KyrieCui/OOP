
public class Car {
	private String name;
	private Door[] door;
	public Car(String name,int numberOfDoors) throws BadCarException {
		this.name=name;
		if(numberOfDoors<=1)
			throw new BadCarException("A car must have at least one door!");	//if the number of doors less than 1, throw the exception
		door=new Door[numberOfDoors];	
		for(int i=0;i<door.length;i++)
			door[i]=new Door();
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
		if(doorNumber==0||doorNumber>door.length)
			throw new BadDoorException("Door "+doorNumber+" does not exist!");
		else
			door[doorNumber-1].open();
	}	

	public void changeAllDoors() {
		for(Door d:door) {
			if(d.isOpen()==false)
				d.open();
			else
				d.close();
		}
	}

	public static void testCar() throws Exception  {

		try{
			Car c=new Car("Fly",0);	
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
			System.out.println(c2.door[0].isOpen()==true);
			c2.openOneDoor(2);
			System.out.println(c2.door[1].isOpen()==true);
			c2.openOneDoor(3);
			System.out.println(c2.door[2].isOpen()==true); 	
			c2.openOneDoor(4);
			System.out.println(c2.door[3].isOpen()==true);	
			//test the openOneDoor method
			
			c2.changeAllDoors();
			System.out.println(c2.door[0].isOpen()==false);
			System.out.println(c2.door[1].isOpen()==false);
			System.out.println(c2.door[2].isOpen()==false);
			System.out.println(c2.door[3].isOpen()==false); 	//test the changeAllDoors

		

	} 
}