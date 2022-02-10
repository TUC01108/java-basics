package inheritance;

abstract class HeavyVehicle {
	
}

abstract class Vehicle1 {
		int price;
		abstract void start();
		abstract void stop();
		public void applyingBrake() {
			System.out.println("Applying brakes should stop the vehicle");
		}
		
}

class Bike extends Vehicle1 {

	@Override
	void start() {
		System.out.println("Bike start by self or by kick");
	}

	@Override
	void stop() {
		System.out.println("Bike switches off by using keys");
		
	}

	
	
}

public class DemoAbstract {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();
		b.applyingBrake();
		b.stop();

	}

}
