package consdemo;

/*
 *  By defualt, java provides default constructor
 *  but if you create a parameterized constructor the default constructor will not be available
 */

public class Employee {
	
	private String employeeName;
	int wage;
	String title;
	
	
	

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Employee() {
	}

	public Employee(String employeeName, int wage, String title) {
		this.employeeName = employeeName;
		this.wage = wage;
		this.title = title;
	}
	
	public void printEmployeeDetails() {
		System.out.println("Name is : "+employeeName);
		System.out.println("Wage is : "+wage);
		System.out.println("Title is : "+title);
	}




	public static void main(String[] args) {
		Employee e1 = new Employee("John", 4, "HOD");
		Employee e2 = new Employee();
		e1.printEmployeeDetails();
		System.out.println("=================================\n");
		e2.printEmployeeDetails();
		System.out.println("\n=================================\nEmployee 2 is named : "+e2.employeeName);
		
	}

}
