import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestStringMethods {
	String name, age;

	public TestStringMethods(String name, String age) {
		this.name = name;
		this.age = age;
	}

	@Test
	@Ignore
	
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testStringMethods(){
		String msg = new String("Hello Worlds");
		String msg1 = "Hello Worlds";
		String msg2 = "Hello Worlds";
		
		Assert.assertSame(msg,msg2);
		msg=null;
		Assert.assertTrue(msg.length()>0);
//		Assert.assertSa
		
	}
	

}
