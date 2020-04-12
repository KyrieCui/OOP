
public class Teacher extends Person{
	public Teacher(String name) {
		super(name);
	}
	@Override
	public boolean canProgram() {
		return true;
	}	//Override the canProgram method that teacher know how to program
	public static void testTeacher() {
		Teacher t=new Teacher("Tom");	//new a teacher object to test
		System.out.println(t.getName()=="Tom");	//test the getName method
		System.out.println(t.canProgram()==true);	//test the canProgram method that teacher know how to program
	}
	
}
