
public class Student {
	private int ID;	//create student ID
	public Student(int ID){	
		this.ID=ID;	//put ID to the ID in the class
	}
	public int getID() { //create a method
		return ID;	//return the ID
	}
	public static void testStudent() {	//test the program
		Student s1=new Student(1730004002);
		System.out.println(s1.getID()==1730004002);
	}
	
		
}
