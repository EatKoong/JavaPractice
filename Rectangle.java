package Practice1;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return width*height;
	}
	public void draw() {
		System.out.println("("+x+","+y+") 위치에 가로: "+width+" 세로:"+height);
	}	
	//protected void print(){...}
}
