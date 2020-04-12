
public class Person implements Parentable {
	private String name;
	private Parentable parent;
	public Person(String name,Parentable parent) {
		this.name=name;
		this.parent=parent;
	}
	@Override
	public String getName() {
		return name;
	}	//override getName method to get person name
	public Parentable getParent() {
		return parent;
	}	//override getParent method to get parent
	public static void testPerson() {
		Parentable g=new Ghost("Whoooo");
		Parentable parent=new Person("Cui", g);
		Parentable p=new Person("Kyrie",parent);
		System.out.println(g.getName()=="Whoooo");
		System.out.println(g.getParent()==g);
		System.out.println(parent.getParent()==g);
		System.out.println(p.getParent()==parent);
		

	}

}
