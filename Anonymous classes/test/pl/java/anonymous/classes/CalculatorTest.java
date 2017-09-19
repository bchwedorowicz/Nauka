package pl.java.anonymous.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calc;

	@Before
	public void prepare() {
		calc = new Calculator();
	}

	@Test
	public void shouldAdd() {
		int result = calc.calculate("2+3");
		Assert.assertEquals(5, result);
	}

	@Test
	public void shouldSubstract() {
		int result = calc.calculate("3-2");
		Assert.assertEquals(1, result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceprion() {
		calc.calculate("abc");
	}
	
	@Test
	public void shouldMultiply() {
		int result = calc.calculate("2*3");
		Assert.assertEquals(6, result);
	}
	
	@Test
	public void shouldDivide() {
		int result = calc.calculate("6/3");
		Assert.assertEquals(2, result);
	}
}
