import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
public class MyPanel extends JPanel {
	private Model m;
	private ControllerClicks c;
	public MyPanel(Model m, ControllerClicks c) {
		this.m = m;
		this.c = c;
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1) {
					c.mouseClicked(e.getPoint());
				}
			}
		});
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ArrayList<Point> points = m.getPoints();
		g.setColor(Color.RED);
		if(points.size() == 1) {
			Point p = points.get(0);
			g.drawRect((int)p.getX(), (int)p.getY(), 1, 1);
		} else {
			for(int i = 1; i < points.size(); i++) {
				Point start = points.get(i - 1);
				Point end = points.get(i);
				g.drawLine((int)start.getX(), (int)start.getY(),
						(int)end.getX(), (int)end.getY());
			}
		}
	}
}
