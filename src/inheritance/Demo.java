package inheritance;

interface Beverages
{
	int cost=5;
	void prepareTea();
	default void mix() {
		System.out.println("Mix the beverages properly");
	}
	static void ratings() {
		System.out.println("ratings for beverages");
	}
}

interface Games
{
	void play();
	void pause();
}
interface modernGames extends Games
{
	void graphics();
	void animation();
}


abstract class Animal {
	int age;
	public abstract void eat();

	public void sleep() {
		System.out.println("Animal should sleep");
	}
}

class Men extends Animal implements Beverages,modernGames
{

	@Override
	public void play() {
		System.out.println("The man plays piano");
		
	}

	@Override
	public void pause() {
		System.out.println("The man pauses");
		
	}

	@Override
	public void prepareTea() {
		System.out.println("The man prepares Tea");
		
	}

	@Override
	public void eat() {
		System.out.println("The man eats spagetti");
		
	}

	@Override
	public void graphics() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void animation() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mix() {
		System.out.println("Man mixes yummy old fashioned");
	}
	//@Override
	static void ratings() {
		System.out.println("Man rates the beverages");
	}
	
}

// concrete class
class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("The cat eats fish");
		
	}
		
	}



public class Demo {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		
		Men m = new Men();
		m.play();
		m.pause();
		m.eat();
		m.mix();
		Beverages.ratings();
	}

}
