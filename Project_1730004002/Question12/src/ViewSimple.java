import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewSimple extends View<Controller> implements ModelListener{
	private JLabel label;
	public ViewSimple(ElectricityCompany m,ControllerSimple c) {
		super(m,c);
		//m.addListener(this);
		this.setTitle("View Simple");
		this.setSize(300, 200);

		label=new JLabel();
		update();
		this.add(label);
		this.setVisible(true);
	}
	public void update() {
		label.setText("total power consuming: "+m.totalConsumption());
	}
}
