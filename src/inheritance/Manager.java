package inheritance;

public class Manager extends Employee {
	String departmentName;
	int salary=18000;
	
	public Manager() {
		System.out.println("Manager default cons called");
	}

	public Manager(String departmentName) {
		super();
		this.departmentName = departmentName;
		System.out.println("Manager params cons called");
	}

	public Manager(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		System.out.println("Manager params super called");
	}
	
	public void displayManagerDetails() {
		int salary=25000;
		System.out.println("ManagerId : "+employeeId);
		System.out.println("ManagerName : "+employeeName);
		System.out.println("DepartmentName : "+departmentName);
		System.out.println("Local Salary : "+salary);
		System.out.println("Manager Salary : "+this.salary);
		System.out.println("Employee Salary : "+super.salary);
	}
	
	

}
