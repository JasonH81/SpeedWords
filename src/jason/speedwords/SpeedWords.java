package jason.speedwords;

import javax.swing.JFrame;

import jason.mycomponents.TitleLabel;

public class SpeedWords extends JFrame {
 
	private static final long serialVersionUID = 1L;
	
	public SpeedWords() {
		initGUI();
		
		setTitle("Speed Words");
		setResizable(false);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void initGUI() {
		TitleLabel titleLabel = new TitleLabel("Speed Words");
	}

	public static void main(String[] args) {
		

	}

}
