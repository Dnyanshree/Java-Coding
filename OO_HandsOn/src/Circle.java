
public class Circle extends GraphicObject{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void resize(double factorX, double factorY) {
		this.x = this.x * factorX;
		this.y = this.y * factorY;
		
	}

}
