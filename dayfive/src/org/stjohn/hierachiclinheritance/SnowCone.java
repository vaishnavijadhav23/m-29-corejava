//program to demonstrate on hierarchical inheritance
//Child class1
package org.stjohn.hierachiclinheritance;

public class SnowCone extends Android {
	
	private int varsionName;
	private String modelName;
	
//getters and setters
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
	
//	default constructor
	public SnowCone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SnowCone(int varsionName, String modelName) {
		super();
		this.varsionName = varsionName;
		this.modelName = modelName;
	}
	
//	tostring
	@Override
	public String toString() {
		return "SnowCone [varsionName=" + varsionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOwnerName()=" + getOwnerName() + "]";
	}
	
	
	
	
	
	
	
		
		
	
	
	

}
	