
public class TestAssertion {
	String name, age;

	public TestAssertion(String name, String age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		return this == obj;
	}

	public static void main(String[] args) {
	/*	int value = 100;
		System.out.println("start of tesing");
		assert(value>0):"value"+value;
		System.out.println("1st assert passed");
		value = -100;
		assert(value>0): "value is negetive"+value;
		System.out.println("2nd assert passed");
		System.out.println("End of main");*/
	TestAssertion test1 = new TestAssertion("n1", "23");
	TestAssertion test2 = new TestAssertion("n1", "23");
	 System.out.println(test1.equals(test2));
	 
	}

}
