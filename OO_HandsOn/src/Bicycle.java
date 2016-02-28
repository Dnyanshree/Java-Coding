
public class Bicycle {
	int speed = 0, gear = 1;

	public Bicycle(int speed, int gear) {
		super();
		this.speed = speed;
		this.gear = gear;
	}

	@Override
	public String toString() {
		return "Bicycle [speed=" + speed + ", gear=" + gear + "]";
	}
	
	public void speedUp(){
		this.speed = speed +1;
	}
	
	public void speedUp(int increment){
		this.speed = speed + increment;
	}
	
	public void speedUp(int increment, int decrement){
		this.speed = speed +increment - decrement;
	}
}
