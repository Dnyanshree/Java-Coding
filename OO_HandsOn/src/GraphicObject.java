
public abstract class GraphicObject {
	
	double x, y;
	public void moveTo(double newX, double newY){
		this.x = newX;
		this.y = newY;
	}
	
	abstract void draw();
	abstract void resize(double factorX, double factorY);
}
