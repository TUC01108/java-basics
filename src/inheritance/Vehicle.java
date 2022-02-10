package inheritance;

class Truck  extends Vehicle {
	String color = "silver";
	int numberOfWheels = 8;
	String model = "Ford";
	public void start() {
		System.out.println("The truck is starting");
	}
	public void checkingTires() {
		System.out.println("The trucker is checking his "+numberOfWheels+" tires");
	}
}

class Bus extends Vehicle {
	String color = "yellow";
	int numberOfWheels = 4;
	String model = "Mercedes";
	public void start() {
		System.out.println("The bus is starting");
	}
	public void closeDoors() {
		System.out.println("The bus driver closes all the doors");
	}
}

class Car extends Vehicle {
	String color = "red";
	int numberOfWheels = 4;
	String model = "Toyota";
	public void start() {
		System.out.println("The car is starting");
	}
	
	
}

class Road {
	Truck t = new Truck();
	Bus b = new Bus();
	Car c = new Car();
}

public class Vehicle {
	
	public Vehicle() {
		String color = "black";
		int numberOfWheels = 0;
		String model = "Model type not available";
	}
	
	public void start() {
		System.out.println("The vehicle starts");
	}

	public static void main(String[] args) {
		
		Truck t = new Truck();
		t.checkingTires();
		t.start();
		Road r = new Road();
		r.c.start();

		
		Road b = new Road();
		r.b.start();
		r.b.closeDoors();

	}

}
