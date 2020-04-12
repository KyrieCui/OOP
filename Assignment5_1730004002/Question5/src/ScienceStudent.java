
public class ScienceStudent extends Student{
	public ScienceStudent(String name) {
		super(name,4.0);
	}
	@Override
	public boolean canProgram() {
		return true;
	}	//Override the canProgram that science student can program
	public static void testScienceStudent() {
		ScienceStudent s1=new ScienceStudent("Kyrie");	//new a science student to test
		System.out.println(s1.getName()=="Kyrie");	//test the getName method
		System.out.println(s1.getGPA()==4.0);	//test the getGPA method
		System.out.println(s1.canProgram()==true); 	//test the canProgram that science student can program
	}
}
