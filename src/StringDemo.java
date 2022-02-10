
public class StringDemo {

	public static void main(String[] args) {
		String name = "AmadMartin";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		System.out.println(name.concat("Revature"));
		System.out.println(name.compareTo("Amad"));
		System.out.println(name.compareToIgnoreCase("amad"));
		System.out.println(name.substring(0,4));
		System.out.println(name.toUpperCase());
		System.out.println(name.endsWith("n"));
		System.out.println(name.startsWith("p"));
	}

}
