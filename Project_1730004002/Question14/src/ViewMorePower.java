import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewMorePower extends View<ControllerMorePower> implements Serializable {
	private JTextField t1;
	private JTextField t2;
	public ViewMorePower(ElectricityCompany m, ControllerMorePower c) {
		super(m,c);
		this.setTitle("View More Power");	//set the title
		this.setSize(300,200);	//set the size
		this.setLayout(new GridLayout(3,1));	//add a GridLayout
		t1=new JTextField("Type a consuemr name here ");	//add the first JTextField to enter name
		t2=new JTextField("Type an amount of power here ");	//add the second JTextField to enter power
		this.add(t1);
		this.add(t2);
		JButton b=new JButton("More Power");	//add a button
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(t1.getText().equals("")) {
	
					}	//if type nothing, nothing happen
					else {
						 c.morePower(t1.getText(), t2.getText());
					}
				}
				catch(Exception e1) {
					if(e1 instanceof UnknownConsumerException) {
						JOptionPane.showMessageDialog(null, "Consumer "+t1.getText()+" unknown");
					}	//if throw UnknownConsumerException, tell the user consumer unknown
					else if(e1 instanceof NotAPowerGeneratorException) {
						JOptionPane.showMessageDialog(null, "A house cannot generate "+e1.getMessage()+" watts of power");
					}	//if throw NotAPowerGeneratorException, tell the user the power of power is too negative
					else if(e1 instanceof NumberFormatException ) {
						JOptionPane.showMessageDialog(null, "For input string: "+t2.getText());
					}	//if throw NumberFormatException, tell the user you input string
				}
			}
		});
		this.add(b);
		this.setVisible(true);
	}
	public void update() {

	}
}
