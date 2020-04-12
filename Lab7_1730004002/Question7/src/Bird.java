
public abstract class Bird extends Animal implements Flyer {
	private int numOfEggs;
	public Bird(String name,int numOfEggs) {
		super(name);
		this.numOfEggs=numOfEggs;
	}
	public int getNumOfEggs() {
		return numOfEggs;
	}	//a method to get the bird's number of eggs
	@Override
	public int getLegs() {
		return 2;
	}	//override getLegs method to return 2 legs
	public static void testBird() {
		
	}
	
	
	
	
}
