import java.util.Scanner;

public class upperCase {

	public static void main(String[] args) {
		String sl = "practice";
		System.out.println("This is just for upper/lower case: " + sl.toUpperCase());
		readUserInputAndPrintInUpperCase();
	}
	public static void readUserInputAndPrintInUpperCase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write input String and press Enter:");
		String str = sc.nextLine();
		System.out.println("Input String in Upper Case = " + str.toUpperCase());
		sc.close();
}
}
