import java.io.Serializable;

public class ControllerMorePower extends Controller implements Serializable{
	public ControllerMorePower(ElectricityCompany m) {
		super(m);
	}
	public String morePower(String name, String amount) throws Exception  {
		m.morePower(name, Integer.parseInt(amount));
		return null;
	
	}
}
