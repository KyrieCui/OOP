
public abstract class Person implements Named {
	private String name;
	public Person(String name) {
		this.name=name;
	}
	@Override
	public String getName() {
		return name;
	}	//Override the getName method to return name
	public abstract boolean canProgram() ;
	public static void testPerson() {
		
	}
	
}
