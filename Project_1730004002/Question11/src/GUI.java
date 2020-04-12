
public class GUI {
	public static void main(String[] agrs) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ElectricityCompany m=new ElectricityCompany("UIC Electric");
				try {
					m.addConsumer(new House("Kyrie",1000));
					m.addConsumer(new PowerPlant("UIC PowerPlant",5000));
					m.addConsumer(new SolarHouse("Cui",2000));
				} catch (Exception e) {
					e.getMessage();
				}	//add consumers in the ArrayList
				
				ControllerSimple c=new ControllerSimple(m);
				ViewSimple v=new ViewSimple(m,c);
				ControllerGetPower c2=new ControllerGetPower(m);
				ViewGetPower v2=new ViewGetPower(m,c2);
				ControllerMorePower c3=new ControllerMorePower(m);
				ViewMorePower v3=new ViewMorePower(m,c3);
			}
		});
	}
}
