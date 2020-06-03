import java.util.Scanner;

public class Exercise {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number: ");
		int number = scanner.nextInt();

		if (number % 5 == 0 && number % 3 == 0)
			System.out.println("FizBuzzz");
		else if (number % 5 == 0)
			System.out.println("Fizz");
		else if (number % 3 == 0)
			System.out.println("Buzz");
		else
			System.out.println(number);

		for (int i = 0; i < 6; i++) {
			System.out.println("For loop" + i);
		}

		// while loop
		Scanner scanner1 = new Scanner(System.in);
		String input = "";
		while (!input.equals("quit")) {
			System.out.println("Input: ");
			input = scanner1.next().toLowerCase();
			System.out.println(input);
		}

		// do while
		do {
			System.out.println("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		} while (!input.equals("quit"));

		// break and continue
		while (true) {
			System.out.println("Input: ");
			input = scanner.next().toLowerCase();
			if (input.equals("pass"))
				continue;
			if (input.equals("quit"))
				break;
			System.out.println(input);
		}
		// for-each loop
		String[] fruits = { "Apple", "Mango", "Orange" };

		for (String fruit : fruits) {
			System.out.println(fruit);

		}
	}
}
