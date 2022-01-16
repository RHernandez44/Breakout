import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	// Constant variables
		private final static String WINDOW_TITLE = "Pong";
	    private final static int WINDOW_WIDTH = 800;
	    private final static int WINDOW_HEIGHT = 600;
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		// TODO: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)
		// TODO: Set the title
		// TODO: Set the background colour to white
		// TODO: Set resizable to false
		
		setTitle(WINDOW_TITLE); // Title bar text
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setResizable(false); // Allows minimise & maximise window
		add(new PongPanel());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Can use HIDE_ON_CLOSE
		
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new BreakoutPanel(this);
        add(panel);
		// TODO: Set visible to true
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	        	 new Breakout();	
	         }
		});

	}
}
