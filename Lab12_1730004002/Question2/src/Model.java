import java.awt.Point;
import java.util.ArrayList;

public class Model {
	private ArrayList<Point> points;
	private ArrayList<ModelListener> listeners;
	public Model() {
		points=new ArrayList<Point>();
		listeners=new ArrayList<ModelListener>();
	}
	public void addListener(ModelListener l) {
		listeners.add(l);
	}
	public ArrayList<Point> getPoints(){
		return points;
	}	//a method to return points in the ArrayList
	
	public void addPoint(Point p) {
		points.add(p);
		notifyListeners();
	}	//a method to add point
	
	public void clearAllPoints() {
		points.clear();
		notifyListeners();
	}	//a method to clear all points in the ArrayList
	
	public void deleteLastPoint() {
		if(points.size() > 0) {
			points.remove(points.size() - 1);
			notifyListeners();
		}
	}	//a method to delete the last point
	

	private void notifyListeners() {
		for(ModelListener l:listeners) {
			l.update();	// Tell the listener that something changed
		}
	}
	
	public int numberOfPoints() {
		return points.size();
	}	//a method to return the number points in the ArrayList
	
	public static void testModel() {
		Model m=new Model();
		ArrayList points=new ArrayList();
		Point p1=new Point();
		Point p2=new Point();
		m.addPoint(p1);
		m.addPoint(p2);
		points=m.getPoints();
		System.out.println(points.size()==2);
		System.out.println(points.get(0)==p1);
		System.out.println(points.get(1)==p2);
		m.clearAllPoints();
		System.out.println(points.size()==0);
		m.addPoint(p1);
		m.addPoint(p2);
		m.deleteLastPoint();
		System.out.println(points.size()==1);
		System.out.println(points.get(0)==p1);
	}
}
