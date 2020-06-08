import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Benz");
		cars.add("Tesla");

		// Loop Through the ArrayList
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(i + ": " + cars.get(i));
		}

		for (String i : cars) {
			System.out.println(i);
		}
		cars.set(2, "Volvo"); // Modifying the value
		cars.remove(0); // removing an item

		cars.size();
		System.out.println(cars.get(1));
		cars.clear(); // removing all items in ArrayList
		System.out.println(cars);

		// ArrayList to store numbers (add elements of type Integer)
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(34);
		numbers.add(45);
		numbers.add(12);

		Collections.sort(numbers);

		for (int i : numbers) {
			System.out.println(i);

		}
	}

}
