import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("Alex|Brian");
		Matcher matcher = pattern.matcher("Alex and Brian share a great bonding.");

		while (matcher.find()) {
			System.out.print("Start index: " + matcher.start());
			System.out.print(" End index: " + matcher.end() + " ");
 			System.out.println(" - " + matcher.group());
		}
	}

}
