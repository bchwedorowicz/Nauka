package pl.java.generic;

import org.junit.Assert;
import org.junit.Test;

public class BoxTest {

	@Test
	public void shouldWork() {
		Object object = new Object();
		Box<Object> box = new Box<>();
		box.put(object);
		Object object2 = box.get();
		Assert.assertSame(object, object2);
	}

	@Test
	public void shouldWorkWithTwoPuts() {
		// given
		String obj1 = "abc";
		String obj2 = "123";
		Box<String> box = new Box<>();
		// when
		box.put(obj1);
		box.put(obj2);
		// then
		String result = box.get();
		Assert.assertEquals("123", result);
	}

}
