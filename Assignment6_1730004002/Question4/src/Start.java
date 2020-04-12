public class Start {
	public static void main(String[] agrs) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MyFrame();
			}
		});
	}
}