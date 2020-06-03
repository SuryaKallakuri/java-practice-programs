
public class Arrays {

	public static void main(String[] args) {
		String[] cars = {"Honda", "Benz", "Hyundai", "Audi"};
		cars[2] = "Jeep";
		System.out.println(cars[2]);
		System.out.println(cars.length);

		for(String temp:cars){
			System.out.println(temp);
		}
	}

}
 