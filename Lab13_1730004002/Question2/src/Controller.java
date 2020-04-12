public class Controller {
	protected Model m;
	public Controller(Model m) {
		this.m = m;
	}
	protected void shutdown() {
		m.saveData();	//save the data	
		System.exit(0);	//normal exit
	}
}
