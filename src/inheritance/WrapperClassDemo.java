package inheritance;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println(sum);
		
		long salary1 = 91716;
		Long salary2 = 91716l;
		
		// Boxing
		int marks=100;
		Integer newMarks = new Integer(marks);
		Integer newMarks2 = marks;
		
		Double budget = 19272.87;
		double budget1 = Double.valueOf(budget);
		double budget2 = budget;
	}

}
