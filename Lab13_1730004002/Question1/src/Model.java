import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Model {
	private File file;
	private ArrayList<Point> points;
	private ArrayList<ModelListener> listeners;
	int x;	//the coordinate x of the point 
	int y;	//the coordinate y of the point
	public Model() {
		points = new ArrayList<Point>();
		listeners = new ArrayList<ModelListener>();
		file=new File("points.txt");
		if(file.exists()) {
			try {
				Scanner s=new Scanner(file);
				while(s.hasNext()) {
					x=s.nextInt();
					y=s.nextInt();
					Point p=new Point(x,y);
					points.add(p);
				}
				s.close();
			}
			catch(FileNotFoundException ex) {
				System.err.println(ex.getMessage());
				System.exit(1);	//end
			}
		}

	}
	public void addListener(ModelListener l) {
		listeners.add(l);
	}
	public ArrayList<Point> getPoints() {
		return points;
	}
	public void addPoint(Point p) {
		points.add(p);
		notifyListeners(); // points changed so notify the listeners.
	}
	public void clearAllPoints() {
		points.clear();
		notifyListeners(); // points changed so notify the listeners.
	}
	public void deleteLastPoint() {
		if(points.size() > 0) {
			points.remove(points.size() - 1);
			notifyListeners(); // points changed so notify the listeners.
		}
	}
	private void notifyListeners() {
		for(ModelListener l: listeners) {
			l.update(); // Tell the listener that something changed.
		}
	}
	public int numberOfPoints() {
		return points.size();
	}
	public void saveData() {
		try {
			PrintWriter out=new PrintWriter(file);
			for(int i=0;i<points.size();i++) {
				Point p=points.get(i);
				out.println((int)p.getX()+" " +" "+(int)p.getY());
			}

			out.close();
		}
		catch(FileNotFoundException e) {
			System.err.println(e.getMessage());
			System.exit(1); // End immediately.
		}
	}
	public static void testModel() {
		Model m = new Model();
		m.addListener(new ModelListener() {
			@Override
			public void update() {
				System.out.println(true + " (listener)");
			}
		});
		System.out.println(m.getPoints() == m.points);
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 4);
		m.addPoint(p1); // Listener called.
		m.addPoint(p2); // Listener called.
		System.out.println(m.numberOfPoints() == 2);
		System.out.println(m.points.get(0) == p1);
		System.out.println(m.points.get(1) == p2);
		m.deleteLastPoint(); // Listener called.
		System.out.println(m.numberOfPoints() == 1);
		System.out.println(m.points.get(0) == p1);
		m.clearAllPoints(); // Listener called.
		System.out.println(m.numberOfPoints() == 0);
		m.notifyListeners(); // Listener called.
	}
}

