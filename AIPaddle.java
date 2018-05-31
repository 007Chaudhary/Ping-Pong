package PongV2;

import java.awt.Color;
import java.awt.Graphics;

public class AIPaddle implements Paddle{
	double y, yVel;
	boolean upAccel, downAccel;
	int player, x;
	Ball b1;
	
	public AIPaddle(int player, Ball b) {
		upAccel = false; downAccel = false;
		b1 = b;
		y = 210; yVel = 0;
		if(player == 1)
			x = 20;
		else
			x = 660;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect(x, (int)y, 20, 80);
	}

	public void move() {
		y = b1.getY() - 40;

		
		if(y < 0)
			y=8;
		else if(y>420)
			y=412;
	}
	

	
	public int getY() {
		return (int)y;
	}

}
