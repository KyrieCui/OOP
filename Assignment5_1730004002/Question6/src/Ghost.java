
public class Ghost implements Named{
	public Ghost() {
		
	}
	public String getName() throws NoNameException{
		throw new NoNameException("A ghost has no name!");
	}	//ghost hasn't name so throw the exception
	public static void testGhost() {
		Ghost g=new Ghost();
		try{
			g.getName();
		}
		catch(Exception e) {
			System.out.println(e.getMessage()=="A ghost has no name!");
		}	//try to get the ghost name
	}
}
