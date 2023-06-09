package org.tnsif.annotations;

//parent class
class Car {

	public void speed(int speed)
	{
		System.out.println("Speed is: "+speed+"km/hr");
	}
	
}
//child class
	//child class is inheriting the properties of parent method
class Lamborghini extends Car {
	/*below annotations ensures that child class method
	 */
	@Override
	//it should be speed(int speed
	//if we do Speed(int speed), then we will get an error

	public void speed (int speed)
	{
		System.out.println("Speed is: "+speed+"km/hr");
	}
}
 public class OverirdeAnnotationExample {


		public static void main(String[] args)  {
		
		Lamborghini l=new Lamborghini();
				l.speed(90);

	}

}


