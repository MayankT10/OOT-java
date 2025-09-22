// Superclass
class Vechile {
	String brand = "Ford";

	public void msg() {
		System.out.println("Method from Vechile class");
	}
}

// Subclass
class Car extends Vechile {
	String modelName = "Mustang";
}

public class SingleInheritance{
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.msg();
		System.out.println(myCar.brand + " " + myCar.modelName);
	}
}
