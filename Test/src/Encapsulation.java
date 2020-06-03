
public class Encapsulation {

	private String name;

	public String getName() {
		return name;

	}

	public void setName(String newName) {
		this.name = newName; // this keyword is used to refer current object
	}

	public static void main(String[] args) {

		Encapsulation encap = new Encapsulation();
		encap.setName("Surya");
		System.out.println(encap.getName());
	}

}
