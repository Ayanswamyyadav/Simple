package methods;

import org.apache.juneau.annotation.Beanc;

public class Product {
	
	private String name;
	private String colour;
	private int price;
	private String[] sellerNames;
	
	
	@Beanc(properties = "name,colour,price,sellerNames")
	public Product(String name, String colour, int price, String[] sellerNames) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.sellerNames = sellerNames;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String[] getSellerNames() {
		return sellerNames;
	}
	public void setSellerNames(String[] sellerNames) {
		this.sellerNames = sellerNames;
	}
	

}
