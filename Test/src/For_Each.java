
public class For_Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=3; i<10; i++) {
			System.out.println("i: " + i);
		}
		
		int[] numbers = {34, 65, 23, 56, 89};
		for (int num: numbers) {
			System.out.println("Number: " + num);
		}
	}

}
