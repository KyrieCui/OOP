
public class ControllerGetPower extends Controller{
	public ControllerGetPower(ElectricityCompany m) {
		super(m);
	}
	public String getPower(String name) throws UnknownConsumerException  {
			String msg = ""+m.getPower(name);	//transfer int to string
			return msg;
	}	//a method to return msg
}
