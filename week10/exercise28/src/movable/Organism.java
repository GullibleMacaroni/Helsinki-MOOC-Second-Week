package movable;

public class Organism implements Movable {

	private int x;
	private int y;

	public Organism(int x, int y) {

		this.x = x;
		this.y = y;
		// TODO Auto-generated constructor stub
	}

	public String toString() {

		return "x: " + this.x + "; y: " + this.y;
	}

	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub

		this.x += dx;
		this.y += dy;
	}

}
