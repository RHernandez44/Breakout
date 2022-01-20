import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	public Paddle() {
		// TODO: Set width to Settings.PADDLE_WIDTH		DONE
		// TODO: Set width to Settings.PADDLE_HEIGHT	DONE
		// TODO: Call resetPosition						DONE
		
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
		
		// TODO: Prevent the paddle from moving outside of the screen  	???
		// This can be done using two if statements (one for the left side of the screen and one for the right)

	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
		System.out.println(x);
		System.out.println(y);
	}
	
	public void setXVelocity(int vel) {
		// TODO: Set x velocity
	}
}
