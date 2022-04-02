package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball extends Rectangle {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Random random;
	int xVelocity;
	int yVelocity;
	int initialSpeed = 3;

	Ball(int x, int y, int height, int width) {
		super(x,y,width, height);
		random = new Random();
		int randomXDirection = random.nextInt(2);
		if (randomXDirection == 0) randomXDirection--;
		setXDirection(randomXDirection * initialSpeed);
		
		int randomYDirection = random.nextInt(2);
		if (randomYDirection == 0) randomYDirection--;
		setYDirection(randomYDirection * initialSpeed);
	}

	public void setXDirection(int randomXDirection) {
		xVelocity = randomXDirection;
	}

	public void setYDirection(int randomYdirection) {
		yVelocity = randomYdirection;
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);

	}

	public void move() {
		x += xVelocity;
		y += yVelocity;
	}
}
