//program to demonstrating on single inheritance
//parent class
package org.stjohn.singleinheitance;
public class Citizen 
	{
	private String name;
	private String aadharNo;
	private String city;
	private long contactNo;
	
//	default constructor
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	parameterized constructor
public Citizen(String name, String aadharNo, String city, long contactNo) {
	super();
	this.name = name;
	this.aadharNo = aadharNo;
	this.city = city;
	this.contactNo = contactNo;
}

//	getters and setters
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAdharNo() {
	return aadharNo;
}

public void setAdharNo(String adharNo) {
	this.aadharNo = adharNo;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public long getContactNo() {
	return contactNo;
}

public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}
//	when you print object,it class to toString() method

@Override
public String toString() {
	return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", city=" + city + ", contactNo=" + contactNo + "]";
}

}
