package inheritance;

public class ProductApp {
	
	

	public static void main(String[] args) {
		Product product1 = new Product(1, "Lakme", 199, 99);
		product1.setProductName("Aroma");
		System.out.println(product1);
		Product product2 = new Product(1, "Aroma", 199, 99);
		Product product3 = product1;
		System.out.println(product1.equals(product2));
		System.out.println(product1 == product2);
		System.out.println();
		System.out.println(product1.equals(product3));
		System.out.println(product1 == product3);
		
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
		System.out.println(product3.hashCode());

	}

}
