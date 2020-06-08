import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateClass {

	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("Local date and time is " + datetime);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");

		String formattedDate = datetime.format(dtf);
		System.out.println("After formatting: " + formattedDate);
	}

}
