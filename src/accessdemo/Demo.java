package accessdemo;

class Employee {
	int salary = 98000;

	public void display() {
		System.out.println(salary);
	}
}

class Manager extends Employee {
	public void display() {
		Employee e = new Employee();
		System.out.println(e.salary);
		System.out.println(salary);
	}
}

class Clerk extends Employee {
	public void display() {
		Employee e = new Employee();
		System.out.println(e.salary);
		System.out.println(salary);
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
