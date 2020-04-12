
public class Ghost {
	private String name;
	
	public Ghost(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}	//a method to get name
	public Ghost getParent() {
		return this;
	}	//a method to get ghost
	public static void testGhost() {

		Ghost g = new Ghost("Whoooo");
		System.out.println(g.getName() == "Whoooo");
		// The parent of the ghost is the ghost himself:
		System.out.println(g.getParent() == g);


	}
}
