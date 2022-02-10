package abstractexercise;

public class Cat extends Feline {

	@Override
	void makeNoise() {
		System.out.println("The cat purrs");

	}

	@Override
	void eat() {
		System.out.println("The cat eats catnip");

	}

}
