package org.tnsif.creationalpatterns;

public class Laptop implements Computer {
	
	public String ram;
	public String hdd;
	public String cpu;
	public boolean isGraphicsEnabled;
	public boolean isBluetoothEnabled;

	public Laptop(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	@Override
	public String ram() {
		
		return this.ram;
	}

	@Override
	public String hdd() {
	
		return this.hdd;
	}

	@Override
	public String cpu() {
		
		return this.cpu;
	}

	@Override
	public boolean isGraphicsEnabled() {
	
		return this.isGraphicsEnabled;
	}

	@Override
	public boolean isBluetoothEnabled() {
		
		return this.isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled=" + isGraphicsEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
	
	

}
