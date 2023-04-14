package org.stjohn.singleinheitance;

public class Student extends Citizen
{
	private String college;
	private int rollno;
	
	
	//default
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized
	public Student(String name, String aadharNo, String city, long contactNo, String college, int rollno) {
		super(name, aadharNo, city, contactNo);
		this.college = college;
		this.rollno = rollno;
	}
	
	//getters and setters
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
	@Override
	public String toString() {
		return "Student [college=" + college + ", rollno=" + rollno + ", getName()=" + getName() + ", getAdharNo()="
				+ getAdharNo() + ", getCity()=" + getCity() + ", getContactNo()=" + getContactNo() + "]";
	}
}
