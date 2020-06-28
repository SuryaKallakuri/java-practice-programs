package javaExamples1;

public class testClasss1 {

	protected void testMethod1() {
		System.out.println("testing protected acess modifier");
	}
	
	public void testMethod2() {
		System.out.println("testing public access modifier");
	}
	
	void testMethod3() {
		System.out.println("testing default access modifier");
	}
	
	@SuppressWarnings("unused")
	private void testMethod4() {
		System.out.println("testing private access modifer");
	}
}
