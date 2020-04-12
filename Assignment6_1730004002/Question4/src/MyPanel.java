import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Timer; 

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private int x=20;
	private int y=20;
	private int radius=20;
	private int dx=10;
	private int dy=10;
	public MyPanel() {

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				x=e.getX();
				y=e.getY();	//change the value of x and y to the position the mouse clicked
				repaint();
			}
		});
		Timer t=new Timer(100, new  ActionListener()  {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(x-20<=0||y-20<=0) {
					dx=10;
					dy=10;
				}	//if the circle touch the left side or the top of the window, dx and dy are positive
			else if(x+radius>getWidth()||y+radius>getHeight()) {
					dx=-dx;	
					dy=-dy;	
			}	//if the circle touch the right side or the bottom of the window, dx and dy change the sign
				
					x=x+dx;	//increase x by dx
					y=y+dy;	//increase y by dy
				
				repaint();
			}

		});
		t.start();	//start the timer
	}
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);	//set the color is red
		g.drawOval(x-radius,y-radius, 2*radius, 2*radius);
	}
}
