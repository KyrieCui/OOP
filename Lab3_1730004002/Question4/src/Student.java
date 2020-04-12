
public class Student {
	private int ID;	//create student ID
	private String name; //create Student's name
	private char grade;//create Student's grade
	public Student(int ID ,String name){
		if(ID<=0) { 	//judge the ID number whether it is negative or not
			ID=0; 	//if negative,ID equal to 0
		}
		this.name=name;	//put name to the name in the class
		this.ID=ID;	//put ID to the ID in the class
		this.grade='A'; //put grade to the grade in the class
	}
	public int getID() { //create a method to get student ID
		return ID;	//return the ID
	}
	public String getName() {  //create a method to get name
		return name;
	}
	public void setName(String name) {	//create a method to set student name
		this.name=name;
	}
	public char getGrade() {	//create a method to get student's grade
		return grade;
	}
	public void setGrade(char grade) {	//create a method to change student's grade
		this.grade=grade;
	}
	public static void testStudent() {	//test the program
		Student s1=new Student(1730004002 ,"Kyrie"); //create a new object s1
		System.out.println(s1.getID()==1730004002);
		System.out.println(s1.getName()=="Kyrie");
		System.out.println(s1.getGrade()=='A');
		
		Student s2=new Student(-134234,"Kyrie");  //create a new object s2
		System.out.println(s2.getID()==0);
		System.out.println(s2.getName()=="Kyrie");
		System.out.println(s2.getGrade()=='A');
		
		s1.setName("Cui");  //change the s1 student's name
		System.out.println(s1.getName()=="Cui");
		
		s2.setName("Huang");	//change the s2 student's name
		System.out.println(s2.getName()=="Huang");
		
		s1.setGrade('B');	//change the s1 student's grade
		System.out.println(s1.getGrade()=='B');
		
		s2.setGrade('B');	//change the s2 student's grade
		System.out.println(s2.getGrade()=='B');
		
	}
	
		
}