import java.util.Scanner;

public class ReadingInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte age = scanner.nextByte();
		System.out.println("age: " + age);

		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Name: ");
		String name = scanner1.nextLine().trim();
		System.out.println("You are: " + name);
	}

}
