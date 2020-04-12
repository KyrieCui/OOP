import javax.swing.JFrame;
public class MyThreadCode implements Runnable{
	@Override
	public void run() {
		new MyFrame();
		//new MyFrame(); if new a new Frame ,it will appear two windows and the windows will be closed at the same time
	}

}
