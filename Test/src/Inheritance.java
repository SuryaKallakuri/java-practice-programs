
class carBrand {

	protected String Brand = "Jeep";

	public void race() {
		System.out.println("This car is useful for racing");
	}
}

class Inheritance extends carBrand {
	private String carName = "Royals";

	public static void main(String[] args) {

		Inheritance carB = new Inheritance();
		carB.race();

		System.out.println(carB.Brand + " " + carB.carName);

	}

}
