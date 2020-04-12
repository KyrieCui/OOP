
public class GUI {
	public static void main(String[] agrs) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ElectricityCompany m=new ElectricityCompany("UIC Electric");
				ControllerSimple c=new ControllerSimple(m);
				ViewSimple v=new ViewSimple(m,c);
				ControllerGetPower c2=new ControllerGetPower(m);
				ViewGetPower v2=new ViewGetPower(m,c2);
				ControllerMorePower c3=new ControllerMorePower(m);
				ViewMorePower v3=new ViewMorePower(m,c3);
				ControllerCreate c4=new ControllerCreate(m);
				ViewCreate v4=new ViewCreate(m,c4);
			}
		});
	}
}
