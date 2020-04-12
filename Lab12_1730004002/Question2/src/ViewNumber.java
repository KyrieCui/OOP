import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewNumber extends View<Controller> {
	private JLabel label;
	public ViewNumber(Model m,Controller c) {
		super(m,c);
		this.setTitle("View Number of points");
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label=new JLabel();
		update();
		this.add(label);	//add label to the frame
		this.setVisible(true);
	}
	public void update() {
		label.setText("The number of points is: "+m.numberOfPoints());
	}	//Override the update method to show the number of Points
}
