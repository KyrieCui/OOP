
public class Ghost implements Parentable{
	private String name;
	
	public Ghost(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}	//override getName method to get ghost name
	public Ghost getParent() {
		return this;
	}	//override getParent method to get ghost
	public static void testGhost() {
		Ghost g = new Ghost("Whoooo");
		System.out.println(g.getName() == "Whoooo");
		// The parent of the ghost is the ghost himself:
		System.out.println(g.getParent() == g);


	}
}
