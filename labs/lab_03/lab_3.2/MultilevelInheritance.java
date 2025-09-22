// Superclass
class Vehicle {
	String brand = "Ford";
	public void msg() {
		System.out.println("Method from a Vehicle class");
	}
}

// Subclass of Vehicle
class Car extends Vehicle {
	String model = "Mustang";
	public void drive() {
		System.out.println("The car is driving");
	}
}

// Subclass of Car
class SportsCar extends Car {
	int maxSpeed = 300;
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		SportsCar mySportsCar = new SportsCar();

		// Accessing members from all the classes/levels
		mySportsCar.msg();
		mySportsCar.drive();
		System.out.println(mySportsCar.brand + "" + mySportsCar.model + " " + mySportsCar.maxSpeed);
	}
}
