
public class Person {
	private String name;
	private Person parent;
	public Person(String name,Person parent) {
		this.name=name;
		this.parent=parent;
	}
	public String getName() {
		return name;
	}	//a method to get name
	public Person getParent() {
		return parent;
	} 	//a method to get parent
	public static void testPerson() {
	
	}
	
}
