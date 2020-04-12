import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewGetPower extends View<ControllerGetPower> {
	private JTextField t;
	public ViewGetPower(ElectricityCompany m, ControllerGetPower c) {
		super(m,c);
		this.setTitle("Message");
		this.setSize(300, 200);
		this.setLayout(new GridLayout(2,1));
		t=new JTextField("Type a consumer name here: ");	//add a JTextField
		this.add(t);
		JButton b=new JButton("Tell me the power");	//add a button
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					JOptionPane.showMessageDialog(null,c.getPower(t.getText()));
				} 
				catch (UnknownConsumerException e1) {
					JOptionPane.showMessageDialog(null,"Consumer "+t.getText()+" unknown");
				}
			}
		});	//add ActionListener 
		this.add(b);
		this.setVisible(true);
	}
	public void update() {
		
	}
}
