import java.text.NumberFormat;

public class numberFormatting {

	public static void main(String[] args) {
		NumberFormat number = NumberFormat.getCurrencyInstance();
		String result = number.format(23865421);
		System.out.println(result);
		 
		String result1 = NumberFormat.getPercentInstance().format(0.1);
		System.out.println(result1);

	}

}
