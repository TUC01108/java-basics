package day7;

public class Demo1 {

	public void add(int num1, int num2) {
		System.out.println("Adding two numbers : " + (num1 + num2));
	}

	public void add(String num1, int num2) {
		System.out.println("Adding one string and one number : " + (num1 + num2));
	}

	public void add(String firstName, String lastName) {
		System.out.println("Adding two numbers : " + (firstName + lastName));
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.add(10, 10);
		d.add("H", 90);
		d.add("Richard", "Davis");

	}

}
