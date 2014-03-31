package core;

public class Dot {
	
	public Dot(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	private int x;
	private int y;
	public int w = 1;
	public int h = 1;
}
