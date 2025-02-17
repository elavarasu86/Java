package elaJavaProgram;

class Vehicle {
	protected String brand = "Ford";

	public void honk() {
		System.out.println("Tuut, tuut!");
	}
}
// Car class inherits vehicle classes attributes and methods. 
public class Car extends Vehicle {
	private String modelName = "Mustang";

	public static void main(String[] args) {
		Car myFastCar = new Car();
		//Car class does not have Honk function as it inherit Vehicle class Honk function is available to Car class.
		myFastCar.honk();
		System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	}
}
