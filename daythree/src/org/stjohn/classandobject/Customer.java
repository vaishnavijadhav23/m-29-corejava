package org.stjohn.classandobject;

public class Customer {
   private int customerId;
   private String customerName;
   private String city;
   
   // constructor does not have any return type
   //it is same as class name followed by '()'
   //default constructor
   public Customer() {
   	 super();
   	
   }
   
   //parameterized constructor
   public Customer(int customerId, String customerName, String city) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.city = city;
   }
   //to access allthe  private data members into another class
   //then use getters and setters
   //setters and getters methods
 
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCustomerId() {
		   return customerId;
	 }

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", city=" + city + "]";
	}
}