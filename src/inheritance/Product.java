package inheritance;

import java.util.Objects;

public class Product {
	private int productId;
	private String productName;
	private int quantityOnHand;
	private int price;
	private int star;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int quantityOnHand, int price) {
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
				+ ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, productId, productName, quantityOnHand, star);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return price == other.price && productId == other.productId && Objects.equals(productName, other.productName)
				&& quantityOnHand == other.quantityOnHand && star == other.star;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public Product(int productId, String productName, int quantityOnHand, int price, int star) {
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
		this.star = star;
	}

	
	
	
	
	

}
