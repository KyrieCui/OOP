public class Start {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Model m = new Model();
				ControllerClicks c1 = new ControllerClicks(m);
				MyFrame v1 = new MyFrame(m, c1);
				Controller c2 = new Controller(m);
				ViewNumber v2 = new ViewNumber(m, c2);
			}
		});
	}
}