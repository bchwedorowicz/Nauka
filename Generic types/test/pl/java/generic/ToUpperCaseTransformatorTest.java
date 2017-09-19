package pl.java.generic;

import org.junit.Assert;
import org.junit.Test;

public class ToUpperCaseTransformatorTest {
	
	@Test
	public void shouldTransform() {
		//given
		ToUpperCaseTransformator transformator = new ToUpperCaseTransformator();
		Box<String> box = new Box<>();
		String string = "abc";
		//when
		box.put(string);
		transformator.transform(box);
		Object content = box.get();
		//then
		Assert.assertEquals("ABC", content);
	}
	

}
