// Creating a class with the name Car
class Car {
	
	// Creating Instance variables
	String make;
	String model;
	int year;
	
	// Creating a Default Constructor
	public Car(String make, String model, int year) {
		
		this.make = make;
		this.model = model;
		this.year = year;
		
		System.out.println("A new car object has been created.");
	}
	
	// Method which would be printing the details of the car
	public void displaycar() {
		System.out.println("Car Details: " + this.year + " " + this.make + " " + this.model); 
	}
	
}


// Creating a class with the Name
// This is where our program starts running 
public class Main {
		public static void main(String[] args) {
			Car car1 = new Car("Toyota" , "Camary", 2005);
			
			car1.displaycar();
		}
}