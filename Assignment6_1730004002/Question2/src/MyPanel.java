import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private int x=20;
	private int y=20;
	private int radius=20;
	public MyPanel() {
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				x=e.getX();
				y=e.getY();	//change the value of x and y to the position the mouse clicked
				repaint();
			}
		});
	}
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);	//set the color is red
		g.drawOval(x-radius,y-radius, 2*radius, 2*radius);
}
}
