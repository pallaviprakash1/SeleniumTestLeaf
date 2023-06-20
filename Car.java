package week1.day1;

public class Car {
	public void driveCar () {
		System.out.println("I am driving car");
	} 
	
	public void applyBrake () {
		System.out.println("Apply breaks while driving");
	}
	public void soundHorn () {
		System.out.println("Do not honk while driving");
	}
	
	public void Ispuncture () {
		System.out.println("Check for punture before driving keep spare tyre");
	} 
	
public static void main (String[] args) {
	Car cr=new Car();
	cr.driveCar();
	cr.applyBrake();
	cr.soundHorn();
	cr.Ispuncture();
}
}

