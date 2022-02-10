package abstractexercise;

public abstract class Animal {
	String picture;
	String food;
	String hunger;
	String boundaries;
	String location;
	
	abstract void makeNoise();
	abstract void eat();
	abstract void roam();
	public void  sleep() {
		System.out.println("The animal has to sleep");
	}

}
