// Interface
interface Language {
	public void stateLang(); // interface method (does not have a body)

	public void NationalLang(); // interface method (does not have a body)
}

// Person "implements" the Language interface
class Person implements Language {
	public void stateLang() {
		// The body of stateLang() is provided here
		System.out.println("The state lang is Janpanese");
	}

	public void NationalLang() {
		// The body of NationalLang() is provided here
		System.out.println("The nat lang is English");
	}
}

public class InterfaceClass {

	public static void main(String[] args) {
		Person per = new Person(); // create a person object
		per.stateLang();
		per.NationalLang();
	}
}
