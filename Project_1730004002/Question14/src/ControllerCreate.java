import java.io.Serializable;

public class ControllerCreate extends Controller implements Serializable{
	public ControllerCreate(ElectricityCompany m) {
		super(m);
	}
	public String create(String name, String amount, int type) throws Exception {
		if(type==0) {
			m.addConsumer(new PowerPlant(name,Integer.parseInt(amount)));
		}	//if select PowerPlant, add PowerPlant consumer
		else if(type ==1) {
			m.addConsumer(new House(name,Integer.parseInt(amount)));
		}	//if select House, add House consumer
		else if (type==2) {
			m.addConsumer(new SolarHouse(name,Integer.parseInt(amount)));
		}	//if select SolarHouse, add SolarHouse consumer
		return null;
	}
}
