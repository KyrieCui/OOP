import java.io.Serializable;

public class Controller implements Serializable {
	protected ElectricityCompany m;
	public Controller(ElectricityCompany m) {
		this.m=m;
	}
	protected void showdown() {
		m.savedate();
		System.exit(0);
	}
}
