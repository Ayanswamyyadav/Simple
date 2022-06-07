package Mobile;

import org.apache.juneau.annotation.Beanc;

public class Mobiles {
	private String name;
	private String colour;
	private int storage;
	private String[] sellerNames;

	
	
	@Beanc(properties = "name,colour,storage,sellerNames")
	public Mobiles(String name, String colour, int storage, String[] sellerNames) {
		super();
		this.name = name;
		this.colour = colour;
		this.storage = storage;
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
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public String[] getSellerNames() {
		return sellerNames;
	}
	public void setSellernNames(String[] sellerNames) {
		this.sellerNames = sellerNames;
	}
	

}
