import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
public class MyFrame extends View<ControllerClicks> {
	public MyFrame(Model m, ControllerClicks c) {
		super(m, c);
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		MyPanel centerPanel = new MyPanel(m, c);
		this.add(centerPanel, BorderLayout.CENTER);
		JPanel topPanel = new JPanel();
		this.add(topPanel, BorderLayout.PAGE_START);
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c.resetClicked();
			}
		});
		topPanel.add(resetButton);
		JButton undoButton = new JButton("Undo");
		undoButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c.undoClicked();
			}
		});
		topPanel.add(undoButton);
		this.setVisible(true);
	}
	@Override
	public void update() {
		repaint(); // Makes Swing call MyPanel's paintComponent method.
	}
}
