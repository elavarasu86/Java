package elaJavaProgram;

class Vehicle {
	protected String brand = "Ford";

	public void honk() {
		System.out.println("Tuut, tuut!");
	}
}
// Car class inherits vehicle class All the attributes and methods of Vehicle class will be available to Car class. 
public class Car extends Vehicle {
	private String modelName = "Mustang";

	public static void main(String[] args) {
		Car myFastCar = new Car();
		myFastCar.honk();
		System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	}
}
