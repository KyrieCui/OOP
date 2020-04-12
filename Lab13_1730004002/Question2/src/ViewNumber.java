import javax.swing.JLabel;
public class ViewNumber extends View<Controller> {
	private JLabel label;
	public ViewNumber(Model m, Controller c) {
		super(m, c);
		this.setTitle("View Number");
		this.setSize(150, 150);
		label = new JLabel();
		update(); // Initialize the label using the model.
		this.add(label);
		this.setVisible(true);
	}
	@Override
	public void update() {
		label.setText("Number of points is: " + m.numberOfPoints());
	}
}
