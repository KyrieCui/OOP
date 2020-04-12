
public class Student {
	private int ID;	//create student ID
	public Student(int ID){
		if(ID<=0) { //judge the ID number whether it is negative or not
			this.ID=0; //if negative,ID equal to 0
		}
		else{
			this.ID=ID;
		}
	}
	public int getID() { //create a method
		return ID;	//return the ID
	}
	public static void testStudent() {	//test the program
		Student s1=new Student(1730004002);	//create a new object s1
		System.out.println(s1.getID()==1730004002);
		
		Student s2=new Student(-134234);	//create a new object s2
		System.out.println(s2.getID()==0);

	}
	
		
}