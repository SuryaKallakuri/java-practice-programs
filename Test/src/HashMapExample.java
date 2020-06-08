import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {

		// HashMap object called capitalCities that will store String keys and String
		// values
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("Kansas", "JeffersonCity");
		capitalCities.put("California", "Sacramento");

		capitalCities.get("Kansas");
		// capitalCities.remove("California");
		capitalCities.size();
		// capitalCities.clear(); //remove all items

		System.out.println(capitalCities);

		// keySet() method if you only want the keys
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}

		// values() method if you only want the values
		for (String i : capitalCities.values()) {
			System.out.println(i);
		}

		// Print keys and values
		for (String i : capitalCities.keySet()) {
			System.out.println("key: " + i + ", value: " + capitalCities.get(i));
		}

		HashMap<String, Integer> people = new HashMap<String, Integer>();
		people.put("Sam", 11);
		people.put("Kevin", 23);

		for (String i : people.keySet()) {
			System.out.println("key: " + i + ", value: " + people.get(i));
		}

	}

}
