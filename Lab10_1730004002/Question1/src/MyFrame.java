import javax.swing.JFrame;
public class MyFrame extends JFrame{
	public MyFrame() {
		this.setTitle("abc");	//set the Title "abc"
		this.setSize(400,300);	//set the Frame Size
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	// Closing the window terminates the program. Do not forget
		// this otherwise the program might keep running even after the window is closed!
		this.setLocationRelativeTo(null);
		this.setVisible(true);		// Make the window visible to the user.

	}
}
