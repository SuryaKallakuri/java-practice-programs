import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Practice {

	static void myMethod(String fname, int age) {
		System.out.println(fname + " Refsnes" + " age is: " + age);
	}

	static int numMethod(int x, int y) {
		return x - y;
	}

	static void checkAge(int age) {

		if (age < 18) {
			System.out.println("Access denied - You are not old enough");
		} else {
			System.out.println("Access granted");
		}
	}

	static void checkAge(int age, int Hno) {
		if (age == Hno) {
			System.out.println("Yay! you are lucky");
		} else {
			System.out.println("Better luck");
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a name: ");
		String name = scanner.nextLine().trim();
		if (name.startsWith("S"))
			System.out.println("Good");
		else
			System.out.println("Bad");
		// System.out.println("You are: " + name);

		myMethod("Kevin", 34);
		myMethod("John", 56);
		myMethod("Sam", 21);

		int d = numMethod(3, 4);
		System.out.println(d);

		checkAge(24);
		checkAge(23, 23);
		
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		 LocalDateTime now = LocalDateTime.now();
		 System.out.println(dtf.format(now));
	}
}
