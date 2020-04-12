public class Start {
	public static void main(String[] args) {
		Student.testStudent();	
		Student s1=new Student(1730004002); //new a new object
		System.out.println(check(s1)=="need coffee");	//test the output if the student is awaking
		s1.fallAsleep(); //make the student fall asleep
		System.out.println(check(s1)=="sweet dream");	//test the output if the student is sleeping
		}
	public static String check(Student s) {
		if(s.isSleeping()==false) 
			return "need coffee";
		else 
			return "sweet dream";
		}
	

	
	
	
}
