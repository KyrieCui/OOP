import java.io.Serializable;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewSimple extends View<Controller> implements ModelListener,Serializable{
	private JLabel label;
	public ViewSimple(ElectricityCompany m,ControllerSimple c) {
		super(m,c);
		//m.addListener(this);
		this.setTitle("View Simple");	//set the frame title
		this.setSize(300, 200);			//set the size

		label=new JLabel();
		update();
		this.add(label);	//add a label
		this.setVisible(true);
	}
	public void update() {
		label.setText("total power consuming: "+m.totalConsumption());
	}
}
