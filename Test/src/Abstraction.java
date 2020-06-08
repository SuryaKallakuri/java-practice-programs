
// Abstract class
abstract class testClass13 {
	// Abstract method (does not have a body)
	public abstract void sleep();

	// Regular method
	public void normalMethod() {
		System.out.println("Printing normal method");
	}

}

//Subclass (inherit from testClass13)
class Abstraction1 extends testClass13 {

	// The body of sleep() is provided here
	public void sleep() {

		// Abstraction1 ad = new Abstraction1(); Cannot instantiate the type Abstraction
		System.out.println("test");

	}
}

class Abstraction {

	public static void main(String[] args) {

		Abstraction1 newAB = new Abstraction1(); // Create a Abstraction1 object

		newAB.sleep();
		newAB.normalMethod();

	}
}
