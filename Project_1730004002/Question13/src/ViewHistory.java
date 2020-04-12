import javax.swing.JPanel;

public class ViewHistory extends View<ControllerHistory> {
	public ViewHistory(ElectricityCompany m,ControllerHistory c) {
		super(m,c);
		this.setTitle("View History");	//set the title
		this.setSize(300,300);	//set the size
		HistoryPanel hp=new HistoryPanel(m);
		this.add(hp);	//add a panel
		this.setVisible(true);	//make the frame can be visible
}
	public void update() {
		repaint();
	}
}
