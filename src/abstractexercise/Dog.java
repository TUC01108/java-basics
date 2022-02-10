package abstractexercise;

public class Dog extends Canine {

	@Override
	void makeNoise() {
		System.out.println("The dog barks");

	}

	@Override
	void eat() {
		System.out.println("The dog eats dog food");

	}

}
