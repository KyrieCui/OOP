import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewCreate extends View<ControllerCreate>{
	private JTextField t1;
	private JTextField t2;
	private JComboBox<String> cb;
	public ViewCreate(ElectricityCompany m, ControllerCreate c) {
		super(m,c);
		this.setTitle("View Create");
		this.setSize(300,200);
		this.setLayout(new GridLayout(4,1));
		t1=new JTextField("Type a new consuemr name here");
		this.add(t1);	//add the first JTextField
		t2=new JTextField("Type an amount of power here");
		this.add(t2);	//add the second JTextField
		String[] list= {"Power Plant","House","Solar House"};
		cb=new JComboBox<String>(list);
		this.add(cb);	//add JComboBox
		JButton b=new JButton("Create");
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					if(t1.getText().equals("")) {
						
					}
					else {
						c.create(t1.getText(),t2.getText(),cb.getSelectedIndex());
					}
				}
				catch(Exception e1) {
					if(e1 instanceof NotAPowerGeneratorException) {
						JOptionPane.showMessageDialog(null, "A house cannot generate power");
					}	//if throw NotAPowerGeneratorException, return "A house cannot generate power"
					else if(e1 instanceof NumberFormatException) {
						JOptionPane.showMessageDialog(null, "For input string: "+t2.getText());
					}	//if throw NumberFormatException, return the string input
					
				}
			}
		});
		this.add(b);
		this.setVisible(true);
	}
	public void update() {
		
	}
}
