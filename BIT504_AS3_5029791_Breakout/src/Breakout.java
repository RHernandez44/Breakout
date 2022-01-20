import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	// Constant variables
	private final static Color BACKGROUND_COLOUR = Color.WHITE;
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		// TODO: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT) 	DONE
		// TODO: Set the title													DONE
		// TODO: Set resizable to false											DONE
		// TODO: Set visible to true											DONE
		// TODO: Set the background colour to white								DONE

		setBackground(BACKGROUND_COLOUR);
		setTitle(Settings.WINDOW_NAME); // Title bar text
		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
		setResizable(false); // Allows minimise & maximise window
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Can use HIDE_ON_CLOSE
		
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
