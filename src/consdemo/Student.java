package consdemo;

public class Student {
	
	int studentId;
	String studentName;
	int marks;
	int grade;
	
	public Student() {
		studentId = 0;
		studentName = "NotAvailable";
		marks = -1;
		grade = -1;
	}
	
	
	
	public Student(int studentId, String studentName, int marks, int grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.grade = grade;
	}
	
	



	public Student(int studentId, String studentName) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
	}



	public void printStudentDetails() {
		System.out.println("Student ID : "+studentId);
		System.out.println("Student Name : "+studentName);
		System.out.println("Marks : "+marks);
		System.out.println("Grade : "+grade);
	}
	
	public static void main(String[] args) {
		new Student().printStudentDetails();
		
		System.out.println("==================");
		Student student1 = new Student(1, "John", 76, 92);
		student1.printStudentDetails();
		
		System.out.println("==================");
		Student student2 = new Student(3, "Steven");
		student2.printStudentDetails();
	}

}
