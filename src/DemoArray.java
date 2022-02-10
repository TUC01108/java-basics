import java.util.Scanner;

public class DemoArray {
	
	public static void main(String[] args) {
		int marks[] = {87,65,98,70,65};
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("Printing all the marks using enhanced for loop");
		for(int i:marks)
		{
			System.out.println(i);
		}
		
		// Use case : Accept five numbers from user and print the sum
		
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Please enter 5 numbers : ");
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		System.out.println("The sum of all the entered numbers is " + sum);
	}

}
