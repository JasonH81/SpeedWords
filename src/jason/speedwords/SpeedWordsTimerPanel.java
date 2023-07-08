package jason.speedwords;

import java.awt.Font;

import jason.notimer.NoTimerPanel;

public class SpeedWordsTimerPanel extends NoTimerPanel {

	private static final long serialVersionUID = 1L;
	private static final Font FONT = new Font(Font.DIALOG,Font.BOLD,24);
	
	private SpeedWords speedWords;
	
	public SpeedWordsTimerPanel(SpeedWords speedWords, int time) {
		super(time, FONT);
		this.speedWords = speedWords;
	}

}
