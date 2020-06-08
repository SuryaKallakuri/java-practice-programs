
public class ExceptionsExample {

	public static void main(String[] args) {
		try {
			int[] numbers = { 1, 34, 56 };
			System.out.println(numbers[5]);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Something went wrong");
		}
		// finally statement lets you execute code, after try...catch, regardless of the
		// result
		finally {
			System.out.println("The 'try catch' is finished.");
		}

	}

}
