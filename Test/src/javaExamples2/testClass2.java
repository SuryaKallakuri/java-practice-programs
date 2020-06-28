package javaExamples2;

import javaExamples1.*;

public class testClass2 extends testClasss1 {

	public static void main(String[] args) {

		testClass2 obj = new testClass2();
		obj.testMethod1();
		obj.testMethod2();
		// obj.testMethod3(); // default method not accessible
		// obj.testMethod4(); // private method not accessible
	}

}
