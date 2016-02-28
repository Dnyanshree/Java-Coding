
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bike = new Bicycle(100,3);
		
		System.out.println(bike.toString());
		
		
		Double dist = Point.getDistanceFromOrigin(new Point(2,0));
		System.out.println(dist);
		
		MountainBike mbike = new MountainBike(100, 3, 2);
		mbike.speedUp();
		System.out.println(mbike.toString());
		
		Bicycle bike1 = mbike;
		
		mbike.getSeatHeight();
	}

}
