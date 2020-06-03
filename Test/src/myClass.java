
/**
 * @author surya.kallakuri
 *
 */

public class myClass {

	int x = 56;
	String fName = "Surya";
	final String lName = "Kallakuri";

	static void myMethod() {
		System.out.println("This is a static method");
	}

	public void testMethod() {
		System.out.println("This is non-static method");
	}

	public void carCompany() {
		System.out.println("manufactures all types of cars");
	}

	public void carSpeed(int speed) {
		System.out.println("Car speed is: " + speed);
	}

	public static void main(String[] args) {

		myClass newObj = new myClass();
		myClass newObj1 = new myClass();
		newObj.x = 68; // over-riding the value
		System.out.println("newObj value: " + newObj.x);
		System.out.println("newObj1 value: " + newObj1.x);
		System.out.println("final value: " + newObj.lName);

		myMethod(); // calling static method

		newObj.testMethod(); // calling non-static method

		newObj.carCompany();
		newObj1.carSpeed(230);
	}

}
