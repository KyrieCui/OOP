
public class ControllerMorePower extends Controller {
	public ControllerMorePower(ElectricityCompany m) {
		super(m);
	}
	public String morePower(String name, String amount) throws Exception  {
		m.morePower(name, Integer.parseInt(amount));
		return null;
	
	}
}
