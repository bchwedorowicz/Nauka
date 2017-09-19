package pl.java.generic;

import org.junit.Assert;
import org.junit.Test;

public class DoubleTransformatorTest {

	@Test
	public void shouldDoubled() {
		// given
		DoubleTransformator transformator = new DoubleTransformator();
		Box<Integer> box = new Box<>();
		int integer = 5;
		// when
		box.put(integer);
		transformator.transform(box);
		Object content = box.get();
		// then
		Assert.assertEquals(10, content);
	}

}
