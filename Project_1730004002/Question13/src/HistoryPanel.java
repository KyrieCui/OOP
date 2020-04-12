import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JPanel;

public class HistoryPanel extends JPanel {
	private ElectricityCompany m;
	public HistoryPanel(ElectricityCompany m) {
		this.m=m;
	}
	private int historyMax(ArrayList<Integer> a1) {
		return Collections.max(a1);
	}	//return the max number in the ArrayList

	private int historyMin(ArrayList<Integer> a2) {
		return Collections.min(a2);
	}	//return the Min number in the ArrayList

	private int historyRange(ArrayList<Integer> a3) {
		int difference=historyMax(a3)-historyMin(a3);
		if(difference<200){
			return 200;
		}
		else {
			return difference;
		}

	}	//return the difference between the max and min

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ArrayList<Integer> history=m.getHistory();
		int min=historyMin(history);
		int range=historyRange(history);
		int maxX=getWidth()-1;
		int maxY=getHeight()-1;
		int zero=maxX+min*maxY/range;
		g.setColor(Color.BLUE);	//set the color to blue
		g.drawLine(0, zero, maxX, zero);	
		g.setColor(Color.RED);	//set the color to red
		if(history.size()==1) {
			g.drawRect(0, zero-history.get(0)*maxY/range, 1, 1);	//if only one value in the ArrayList, draw a rectangle
		}
		else {
			for(int i=1;i<history.size();i++) {
				int x=10*i;
				int v=history.get(i);
				int y=zero-v*maxY/range;
				g.drawLine(10*(i-1), zero-(history.get(i-1))*maxY/range, x, y);		//draw the line between each point
			}
		}
	}

}
