
public abstract class Student extends Person{
	private double gpa;
	public Student(String name,double gpa) {
		super(name);
		this.gpa=gpa;
	}
	public double getGPA() {
		return gpa;
	}	//a method to return student's gpa
	public static void testStudent() {
		
	}

}
