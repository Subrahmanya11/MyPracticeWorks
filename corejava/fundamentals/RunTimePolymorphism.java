package corejava.fundamentals;

class Plane {
	public void takeoff() {
		System.out.println("Taking off");
	}

	public void fly() {
		System.out.println("flying");
	}

	public void land() {
		System.out.println("Landing");
	}
}

class CargoPlane extends Plane {
	public void fly() {
		System.out.println("flying at low height");
	}
}

class PassangerPlane extends Plane {
	public void fly() {
		System.out.println("flying at medium height");
	}
}

class FighterPlane extends Plane {
	public void fly() {
		System.out.println("flying at high height");
	}
	public void swing() {
		System.out.println("FighterPlane Swings");
	}
}

class Airport {
	public void permit(Plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
		((FighterPlane) ref).swing();// Throws Exception cp & pp are not downcasting
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Airport ar = new Airport();
		CargoPlane cp = new CargoPlane();
		PassangerPlane pp = new PassangerPlane();
		FighterPlane fp = new FighterPlane();

		ar.permit(cp);
		ar.permit(pp);
		ar.permit(fp);
	}

}
