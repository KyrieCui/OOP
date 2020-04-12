import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("Question4");	//set the window title
		this.setSize(400,300);	//set the window size
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// the window is closed!
		this.add(new MyPanel());
		this.setVisible(true);
	}
}
