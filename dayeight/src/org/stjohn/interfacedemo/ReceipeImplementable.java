package org.stjohn.interfacedemo;

public class ReceipeImplementable implements Receipe{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String displayName() {
		return "welcome to "+name;
	}
	

}
