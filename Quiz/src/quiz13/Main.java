package quiz13;

public class Main {

	public static void main(String[] args) {
		
		Marine m = new Marine();
		Tank t = new Tank();
		m.move(11, 22);
		// TODO Auto-generated method stub
		
		dropShip u = new dropShip();
		u.Ride(m);
		u.Ride(m);
		u.Ride(m);
		u.Ride(t);
		
		m.hold();
	}

}
