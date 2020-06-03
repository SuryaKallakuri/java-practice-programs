import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> gaama = Arrays.asList("f", "g", "h", "john", "SaMs", "RIOT", "LeagUE", "LOR");
		List<String> test = new ArrayList<>();
		for (String xyz : gaama) {
			test.add(xyz.toUpperCase());
		}

		List<String> test1 = new ArrayList<String>();
		for (String ewr : gaama) {
			test1.add(ewr.toLowerCase());
		}

		System.out.println(gaama);
		System.out.println(test);

		System.out.println(test1);
		
		List<String> latestList = gaama.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(latestList);
		
		List<Integer> nums = Arrays.asList(3,8,4,6);
		List<Integer> numList = nums.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println(numList);
	}

}
