import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class MyFrame extends JFrame{
	public MyFrame() {
		this.setTitle("abc");	//set the Title "abc"
		this.setSize(400,300);	//set the Frame Size
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	// Closing the window terminates the program. Do not forget
		// this otherwise the program might keep running even after the window is closed!
		this.setLocationRelativeTo(null);

		FlowLayout f1=new FlowLayout(10,20,40);	// Set the layout manager for the frame
		this.setLayout(f1);
		
		JButton b1=new JButton("Hello");	// Create a button with the text "hello".
		this.add(b1);	// Add the button to the frame.
		JButton b2=new JButton("Hi");	// Create a button with the text "Hi".
		this.add(b2);	// Add the button to the frame.
		
		JLabel l = new JLabel("Enter your name: ");
		this.add(l);
		JTextField tx = new JTextField("Type Text Here");
		this.add(tx);
		JCheckBox cb = new JCheckBox("I agree");
		this.add(cb);
		JRadioButton rb = new JRadioButton("Yes");
		this.add(rb);
		JComboBox<String> cb1 = new JComboBox<String>(new String[]{"Red", "Green", "Blue"});
		this.add(cb1);
		JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[]{2, 7, -3, 24});
		this.add(cb2);
		
		this.setVisible(true);		// Make the window visible to the user.

	}
}
