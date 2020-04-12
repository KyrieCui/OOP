import java.io.Serializable;

public class Test implements Serializable {
	public static void main(String[] agrs) throws Exception  {
		Building.testBuilding();
		PowerPlant.testPowerPlant();
		House.testHouse();
		SolarHouse.testSolarHouse();
		ElectricityCompany.testElectricityCompany();
		
	}
}
