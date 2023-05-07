import javax.swing.JFrame;

public class GF extends JFrame{

	private static final long serialVersionUID = 1L;

	GF() {
		GP panel = new GP();
		this.add(panel);
		this.setTitle("snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}