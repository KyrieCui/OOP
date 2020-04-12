import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private int x=20;
	private int y=20;
	private int radius=20;
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);	//set the color is red
		g.drawOval(x-radius,y-radius, 2*radius, 2*radius);
}
}
