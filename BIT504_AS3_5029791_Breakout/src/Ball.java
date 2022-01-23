import java.awt.Graphics;

public class Ball extends Sprite {

	private int xVelocity = 1, yVelocity = -1;
	
	// Constructor
	public Ball() {
		
		setWidth(Settings.BALL_WIDTH);
		setHeight(Settings.BALL_HEIGHT);
		resetPosition();
	}
	
	/**
	 * Resets the ball to the initial position
	 * Uses Settings.INITIAL_BALL_X/Y to set the position of the ball
	 */
	public void resetPosition() {
		setX(Settings.INITIAL_BALL_X);
		setY(Settings.INITIAL_BALL_Y);
	}
	
	public void update() {
		x += xVelocity;
		y += yVelocity;
		
		// Bounce off left side of screen
		if(x <= 0) {
			x = 0;
			xVelocity = -xVelocity;
		}
		
		// Bounce off right side of screen
		if(x >= Settings.WINDOW_WIDTH - (Settings.BALL_WIDTH + 10)) {
			x = Settings.WINDOW_WIDTH - (Settings.BALL_WIDTH + 10);
			xVelocity = -xVelocity;
		}
		
		// Bounce off top of screen
		if(y <= 0) {
			y = 0;
			yVelocity = -yVelocity;
		}
		
	}
	
	public void setXVelocity(int x) {
		// TODO: Set the x velocity						DONE
		this.xVelocity = x;
	}
	public void setYVelocity(int y) {
		// TODO: Set the y velocity						DONE
		this.yVelocity = y;
	}
	
	public int getXVelocity() {
		return x;	// TODO: Return the x velocity		DONE
	}
	public int getYVelocity() {
		return y;	// TODO: Return the y velocity		DONE
	}
	
	public void paint(Graphics g) {
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
