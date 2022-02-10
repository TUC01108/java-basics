package consdemo;

public class Product {
	
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	int star=5;
	//constructor - used to initialize
	public Product() {
		productId=-1;
		productName="NotAvailable";
		quantityOnHand=-1;
		price=-1;
		star=-1;
		System.out.println("PRODUCT CONSTRUCTOR CALLED");
	}
	
	
	
	public Product(int productId, String productName, int quantityOnHand, int price, int star) {
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
		this.star = star;
	}
	
	



	public Product(int productId, String productName, int quantityOnHand) {
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
	}
	
	



	public Product(int productId, int price, int star) {
		this();
		this.productId = productId;
		this.price = price;
		this.star = star;
	}



	public void printProductDetails() {
		int star=4;
		System.out.println("Product Id : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Quantity On Hand : "+quantityOnHand);
		System.out.println("Price : "+price);
		System.out.println("Star :"+star);
		System.out.println("Instance star :"+this.star);
		
	}

	public static void main(String[] args) {
		Product product1 = new Product();
		System.out.println("Printing the details about product1");
		product1.printProductDetails();
		
		System.out.println("\nPrinting the details about product2");
		Product product2 = new Product();
		product2.printProductDetails();
		
		System.out.println("\nInitializing object with constructor");
		new Product().printProductDetails();;
		
		Product product3 = new Product(2, "Aroma",12,99,3);
		product3.printProductDetails();
		
		Product product4 = new Product(768,"Pendrive",99);
		product4.printProductDetails();
		
		Product product5 = new Product(500, 89, 3);
		product5.printProductDetails();
	}

}
