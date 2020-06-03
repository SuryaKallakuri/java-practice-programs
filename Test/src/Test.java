
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Continue");
		
		int i=0;
		for(int j=0;j<10;j++) {
			if(j%2==0) {
				continue;
			}
			System.out.println("after"+j);
		}
		
	}

}
