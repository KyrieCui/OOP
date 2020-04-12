import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);	//set the rectangle color
		g.drawRect(20, 30, 75,75);	//set the first square location and length,width
		g.drawRect(40, 10, 75, 75);	//set the first square location and length,width
		g.drawLine(20, 30, 40, 10);	//draw the first line to connect two square
		g.drawLine(95, 105, 115, 85);
		g.drawLine(115, 10, 95, 30);
		g.drawLine(20, 105, 40, 85);
		//draw a cube
		g.setColor(Color.BLUE); 	//set the color blue
		g.drawOval(200,10,70,25);	//draw the first oval
		g.drawOval(200, 100, 70, 25);	//draw the second oval
		g.drawLine(200, 25, 200, 115);	
		g.drawLine(270,25, 270,115 );
		//draw a cylinder
	}
}
