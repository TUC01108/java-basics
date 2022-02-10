/*
 * Put your class in files
 * Put your methods in classes
 * Put your statements inside methods
 */

public class Monitor {
	
	int num = 900;
	
	{
		System.out.println("3. \tInitialization block");
	}
	
	static {
		System.out.println("1. \tStatic initialization block");
	}
	
	public Monitor() {
		System.out.println("4. \tConstructor");
	}
	
	void display() {
		System.out.println("5. \tMethod");
	}
	
	public static void main(String[] args) {
		System.out.println("2. \tMain");
		Monitor m = new Monitor();
		m.display();
		Monitor m2 = new Monitor();
	}

}
