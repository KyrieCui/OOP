import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;

import javax.swing.JFrame;

public abstract class View<T extends Controller> extends JFrame implements ModelListener,Serializable{
	protected ElectricityCompany m;
	protected T c;
	public View(ElectricityCompany m, T c) {
		this.m=m;
		this.c=c;
		m.addListener(this);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				c.showdown();	//controller decides meaning
			}
		});
	}
	public abstract void update();
}