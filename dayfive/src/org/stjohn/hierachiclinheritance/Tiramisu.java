//program to demonstrate on hierarchical inheritance
//Child class2
package org.stjohn.hierachiclinheritance;

public class Tiramisu extends Android {
	
	private int varsionName;
	private String modelName;
	
	
	public int getVarsionName() {
		return varsionName;
	}
	public void setVarsionName(int varsionName) {
		this.varsionName = varsionName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Tiramisu() {
		System.out.println("Default constuctor for child class2");
	}
	public Tiramisu(int varsionName, String modelName) {
		super();
		this.varsionName = varsionName;
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "Tiramisu [varsionName=" + varsionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOwnerName()=" + getOwnerName() + "]";
	}
	
	
	
	

}
