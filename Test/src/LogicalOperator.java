
public class LogicalOperator {

	public static void main(String[] args) {
		int temperature = 123;
		boolean isWarm = temperature > 20 && temperature < 40;
		System.out.println(isWarm);
		
		boolean hasHighIncome = false;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = true;
		boolean isEligible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord;
		System.out.println(isEligible);
	}

}
