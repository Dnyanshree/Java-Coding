
public class Point implements Drawable{
	private double x,y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public static double getDistanceFromOrigin(Point p){
		return Math.sqrt(p.getX()*p.getX() + p.getY()*p.getY());
		
	}

	@Override
	public void draw(int color) {
		
		
	}

	@Override
	public void setPosition(double x, double y) {
		
	}
}
