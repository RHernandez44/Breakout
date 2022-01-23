import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class Breakout extends JFrame{
  
	// Constant variables
	private final static Color BACKGROUND_COLOUR = Color.WHITE;
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {

		setBackground(BACKGROUND_COLOUR);
		setTitle(Settings.WINDOW_NAME); // Title bar text
		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
        panel = new BreakoutPanel(this);
        add(panel);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	        	 new Breakout();	
	         }
		});

	}
}
