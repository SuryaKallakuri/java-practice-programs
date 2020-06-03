
public class Inheritance {

	protected String Brand = "Jeep";

	public void race() {
		System.out.println("This car is useful for racing");
	}
}

class CarBrand extends Inheritance {
	private String carName = "Royals";

	public static void main(String[] args) {

		CarBrand carB = new CarBrand();
		carB.race();

		System.out.println(carB.Brand + " " + carB.carName);

	}

}
