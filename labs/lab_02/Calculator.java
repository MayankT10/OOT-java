// Calculator using Method Overloading

public class Calculator {
		
		public int add(int a,int b) {
			return a + b;
		}

		public double add(double a,double b) {
			return a + b;
		}
		
		public int add(int a,int b,int c) {
			return a + b + c;
		}
		
		public static String operationType = "Arithmetic Operation";
		
		public static void displayStaticInfo() {
			System.out.println("This is a static method");
			System.out.println("Operation type: " + operationType);
		}
		
		public static void main(String[] args) {
			
			// Calling static method
			// Accessing static field directly using class name
			System.out.println("Static Member Access");
			Calculator.displayStaticInfo();
			
			System.out.println("Static field Accessed: " + Calculator.operationType);
			System.out.println();
		
			// Creating instance of the class to call overloaded methods
			Calculator calc = new Calculator();
			System.out.println("Method Overloading in Java");
			
			// Calling method with two integers
			System.out.println(" Sum of 10 and 20 : " + calc.add(10,20));
			
			// Calling overload method with two double arguments
			System.out.println("Sum of 10.5 and 20.5 : " + calc.add(10.5,20.5));
			
			// Calling overload method with three integer arguments
			System.out.println("Sum of 10,20 and 30: " + calc.add(10,20,30));
			
		
		}
	}