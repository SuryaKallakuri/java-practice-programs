// Polymorphism applies to overriding

// Overriding is a run-time concept

class Animal {
	public void bark() {
		System.out.println("Boww");
	}

	public void bark(int num) { // Overloading
								// they have different method signature (method name and method
								// parameter list).
		for (int i = 0; i < num; i++) {
			System.out.println("Boww");
		}

	}

	class Hound extends Animal {
		public void snuff() {
			System.out.println("Snuff");
		}

		public void bark() {
			System.out.println("Errrrr");
		}
	}

	public class OverRidingTest {

		public void main(String[] args) {

			Animal animal = new Hound(); // At run-time, a Hound is created and assigned to animal
											// The JVM knows that animal is referring to the object of Hound, so it
											// calls the bark() method of Hound. -> Dynamic Polymorphism
			animal.bark();

		}

	}
}
