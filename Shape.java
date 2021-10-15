package Practice1;

public class Shape {
	
	protected int x;
	protected int y;
	protected int[] position = {x, y};
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	protected void print() {
		System.out.println("xÁÂÇ¥: "+x+" yÁÂÇ¥: "+y);
	}
	
}
