import java.util.Scanner;
import java.util.Date;

public class Demo1 {
	
	public void printWelcomeMessage() {
		System.out.println("Hi , welcome to revature training");
	}
	
	public int addNumbers(int...num) {
		// enhanced for loop
		int sum=0;
		for(int i: num) {
			System.out.println(i);
			sum += i;
		}
		return sum;
	}
	
	public void printProductNames(String...productName) {
		for(String p: productName) {
			System.out.println(p);
		}
	}
	


	public static void main(String[] args) {
		System.out.println("Hello and welcome to day 2 training");
		
		Demo1 demo1 = new Demo1();
		demo1.printWelcomeMessage();
		int result = demo1.addNumbers(7,7);
		result += demo1.addNumbers(3,9,9);
		result += demo1.addNumbers(44,99,817,826);
		
		System.out.println();
		System.out.println("result is: \n" + result);
		demo1.printProductNames("Watch", "Pendrive", "Adaptor");
		System.out.println("=======================");
		
		System.out.println("\nEnter a number: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("You are " + age + " years old");
		sc.close();
		
		Date date = new Date();
		System.out.println(date);
	}

}
