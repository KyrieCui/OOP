
public class Student {
	private int ID;
	private boolean sleeping;	//instance variable
	public Student(int ID) {
		this.ID=ID;
		sleeping=false;
	} 	//When a student is created, it is initially awake 
	public int getID() {
		return ID;
	}	//return the student's ID
	public boolean isSleeping() {
		return sleeping;
	}	//return the student's whether he is sleeping or not
	public void fallAsleep() {
		sleeping=true;
	}
	public void wakeUp() {
		sleeping=false;
	}
	public static void testStudent() {
		Student s = new Student(1234567890);
		System.out.println(s.getID() == 1234567890);
		System.out.println(s.isSleeping() == false);
		s.fallAsleep();
		System.out.println(s.isSleeping() == true);
		s.fallAsleep(); // should do nothing because the student is already sleeping
		System.out.println(s.isSleeping() == true);
		s.wakeUp();
		System.out.println(s.isSleeping() == false);
		s.wakeUp(); // should do nothing because the student is already awake
		System.out.println(s.isSleeping() == false);
		}

}
