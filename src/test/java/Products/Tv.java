package Products;

import org.apache.juneau.annotation.Beanc;


//convert to POJO to JSON/XML we have to create class
//this is my POJO : PALIN OLD OBJECT
public class Tv {
	private String name;
	//every property will have going to  define some private properties
	private String colour;
	private String price;
	private String[] types;
	private String[] distributers;
	
	
	//lets going create a getters and setters and quickly to create a constructor also
	
	
	@Beanc(properties = "name,colour,price,types,distributers")
	// and we need to add the Beanc annotation it is from juneau and we can fine some properties what we have to use in this
	public Tv(String name, String colour, String price, String[] types, String[] distributers) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.types = types;
		this.distributers = distributers;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String[] getTypes() {
		return types;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}
	public String[] getDistributers() {
		return distributers;
	}
	public void setDistributers(String[] distributers) {
		this.distributers = distributers;
	}

}
