package consdemo;

public class CodeShare {
	
	static String string1 = "The quick brown fox jumps over the lazy dog";

	public static void main(String[] args) {
		
		System.out.println("1. "+string1.charAt(12));
		
		System.out.println("2. "+string1.contains("is"));
		string1 = string1.concat(" and killed it");
		
		System.out.print("4. ");
		System.out.println(string1.endsWith("dogs"));
		
		System.out.print("5. ");
		System.out.println(string1.equals("The quick brown Fox jumps over the lazy Dog"));
		
		System.out.print("6. ");
		System.out.println(string1.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		
		System.out.print("7. ");
		System.out.println(string1.length());
		
		System.out.print("8. ");
		System.out.println(string1.matches("The quick brown Fox jumps over the lazy Dog"));
		string1.replace("The", "A");
		
		System.out.print("10. "+"\t");
		String s2 = string1.substring(0, 30);
		String s1 = string1.substring(31, 57);
		System.out.println(s2);
		System.out.print("\t");
		System.out.println(s1);
		
		System.out.print("11. ");
		String fox = string1.substring(16,20);
		System.out.println("\t"+fox);
		System.out.print("\t");
		String dog = string1.substring(40,43);
		System.out.println(dog);
		
		System.out.print("12. ");
		System.out.println(string1.toLowerCase());
		
		System.out.print("13. ");
		System.out.println(string1.toUpperCase());
		
		System.out.print("14. ");
		System.out.println(string1.indexOf("a"));
		
		System.out.print("15. ");
		System.out.println(string1.lastIndexOf("e"));
	}

}
