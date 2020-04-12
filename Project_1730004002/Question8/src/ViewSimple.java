import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewSimple extends JFrame implements ModelListener{
	private ElectricityCompany m;
	private ControllerSimple c;
	private JLabel label;
	public ViewSimple(ElectricityCompany m,ControllerSimple c) {
		this.m=m;
		this.c=c;
		m.addListener(this);
		this.setTitle("View Simple");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label=new JLabel();
		update();
		this.add(label);
		this.setVisible(true);
	}
	public void update() {
		label.setText("total power consuming: "+m.totalConsumption());
	}
}
