import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	public Paddle() {
		// TODO: Set width to Settings.PADDLE_WIDTH							DONE
		// TODO: Set width to Settings.PADDLE_HEIGHT						DONE
		// TODO: Call resetPosition											DONE
		
		setWidth(Settings.PADDLE_WIDTH);
		setHeight(Settings.PADDLE_HEIGHT);
		resetPosition();
	}
	
	public void resetPosition() {
		// TODO: Set initial position x and y (use INITIAL_PADDLE_X/Y)		DONE
		// Note: Check Ball.java for a hint
		
		setX(Settings.INITIAL_PADDLE_X);
		setY(Settings.INITIAL_PADDLE_Y);
	}
	
	public void update() {
		x += xVelocity;
				
		if (getX() < 0) { // prevents paddle going off left side of screen
			setX(0);
		}
		else if (getX() >= Settings.WINDOW_WIDTH - (Settings.PADDLE_WIDTH + 10)) { // prevents paddle going off right side of screen
			setX(Settings.WINDOW_WIDTH - (Settings.PADDLE_WIDTH + 10));
		}
	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	
	public void setXVelocity(int vel) {
		// TODO: Set x velocity											DONE
		this.xVelocity = vel;
	}
}
