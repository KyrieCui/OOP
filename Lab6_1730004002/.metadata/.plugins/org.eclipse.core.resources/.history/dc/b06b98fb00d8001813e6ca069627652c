import java.util.ArrayList;

public class ManyShapes {
	private ArrayList allShapes;
	public ManyShapes() {
		this.allShapes = new ArrayList();
	}
	public void addShape(Shape s) {
		allShapes.add(s);
	}	//add object into the arraylist
	public void listAllShapes() {
		for(int i=0;i<allShapes.size();i++) {
			Object o=allShapes.get(i);
			Shape s=(Shape) o;//up casting
		System.out.println(s.toString()+" has area "+s.area());
				}
		
	}
	//print out each element in the arraylist
	public static void testManyShapes() {
		ManyShapes m = new ManyShapes();
		m.addShape(new Circle(1.2, 3.4, 4.0)); // Upcast from Circle to Shape.
		m.addShape(new Dot(1.2, 3.4)); // Upcast from Dot to Shape.
		m.addShape(new Rectangle(1.2, 3.4, 4.0, 5.0)); // Upcast from Rectangle to Shape.
		m.addShape(new Shape(1.2, 3.4));
		m.addShape(new Square(1.2, 3.4, 5.0)); // Upcast from Square to Shape.
		m.listAllShapes();
		
	}

}
