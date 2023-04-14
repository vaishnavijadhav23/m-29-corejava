//program to demonstrate on hierarchical inheritance
package org.stjohn.hierachiclinheritance;

public class Android {
	
	//private data members
	private String brand;
	private String ownerName;
	
	//getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Android() {
		System.out.println("Default constructor for parent");
		brand="Realme";
		ownerName="Li BingZhong";
	}
	public Android(String brand, String ownerName) {
		super();
		this.brand = brand;
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", ownerName=" + ownerName + "]";
	}
	
	
	
	
	
	

}
