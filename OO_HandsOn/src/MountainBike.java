
public class MountainBike extends Bicycle{
	
	int seatHeight = 0;
	public MountainBike(int speed, int gear, int seat) {
		super(speed, gear);
		this.seatHeight = seat;
	}
	public int getSeatHeight() {
		return seatHeight;
	}
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	@Override
	public void speedUp() {
		this.speed = speed + 2;
	}
	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", speed=" + speed + ", gear=" + gear + "]";
	}

	
}
