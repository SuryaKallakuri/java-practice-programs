
class MyMainClass {

	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Pig extends MyMainClass {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Tiger extends MyMainClass {
	public void animalSound() {
		System.out.println("The Tiger says: bow wow");
	}
}

class Polymorphism {
	public static void main(String[] args) {
		MyMainClass myAnimal = new MyMainClass(); // Create a Animal object
		MyMainClass myPig = new Pig(); // Create a Pig object
		MyMainClass myDog = new Tiger(); // Create a Dog object
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}
