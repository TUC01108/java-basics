package consdemo;

public class ShoppingApp {

	public static void main(String[] args) {
		Review review1 = new Review(10182,"Daniel",5);
		review1.reviewCount++;
		
		Review review2 = new Review(10185,"Richard",4);
		review2.reviewCount++;
		
		System.out.println(review1.reviewCount);
		System.out.println(review2.reviewCount);
		
		Review review3 = new Review();
		review3.reviewCount++;
		System.out.println(Review.reviewCount);
	}

}
