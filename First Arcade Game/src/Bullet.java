import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Bullet extends GameObject{

	private Handler handler;
	
	public Bullet(int x, int y, ID id, Handler handler, int mx, int my) {
		super(x, y, id);
		this.handler = handler;
		
		velX = (mx - x) / 20;
		velY = (my - y) / 20;
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x, y, 10, 10);
		
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle(x, y, 10, 10);
	}

}
