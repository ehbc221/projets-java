package point;

public class Point {
	
	private int x;
	private int y;

	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void deplace(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public void affiche(String point) {
		System.out.println("Point " + point + " : x=" + this.getX() + " et y=" + this.getX();
	}

}