class OuterClass {
	int x = 10;

	class InnerClass {
		int y = 12;
	}
}

public class InnerClassTopic {

	public static void main(String[] args) {
		OuterClass outClass = new OuterClass();
		OuterClass.InnerClass myInner = outClass.new InnerClass();
		System.out.println(myInner.y + outClass.x);
	}

}
