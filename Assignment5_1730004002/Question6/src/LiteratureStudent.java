
public class LiteratureStudent extends Student {
	public LiteratureStudent(String name) {
		super(name,3.98);
	}
	@Override
	public boolean canProgram() {
		return false;
	}	//override canProgram method that Literature Student can not program
	public static void testLiteratureStudent() {
		LiteratureStudent s2=new LiteratureStudent("Scott");	//new a Literature Student to test
		System.out.println(s2.getName()=="Scott");	//test the getName method
		System.out.println(s2.getGPA()==3.98);	//test the getGPA method
		System.out.println(s2.canProgram()==false); 	//test the canProgram that Literature student can not program

	}
}
