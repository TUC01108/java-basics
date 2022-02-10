package inheritance;

public class SBDemo {

	public static void main(String[] args) {
		StringBuffer data = new StringBuffer("Mohammad");

		System.out.println("Length : " + data.length());
		System.out.println("Capacity : " + data.capacity());

		data.append("hhhhhhhhhhhhhhhh");
		System.out.println("Length : " + data.length());
		System.out.println("Capacity : " + data.capacity());
		data.append("hh");
		System.out.println("Length : " + data.length());
		System.out.println("Capacity : " + data.capacity());
		String s = "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
		System.out.println("adding this many characters : " + s.length());
		data.append("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		System.out.println("Length : " + data.length());
		System.out.println("Capacity : " + data.capacity());
		
		System.out.println("with stringBuilder-------------");
		StringBuilder data1 = new StringBuilder("Mohammad");

		System.out.println("Length : " + data1.length());
		System.out.println("Capacity : " + data1.capacity());

		data1.append("hhhhhhhhhhhhhhhh");
		System.out.println("Length : " + data1.length());
		System.out.println("Capacity : " + data1.capacity());
		data1.append("hh");
		System.out.println("Length : " + data1.length());
		System.out.println("Capacity : " + data1.capacity());
		String s1 = "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
		System.out.println("adding this many characters : " + s1.length());
		data1.append("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		System.out.println("Length : " + data1.length());
		System.out.println("Capacity : " + data1.capacity());

	}

}
