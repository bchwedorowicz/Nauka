package pl.java.anonymous.classes;

public class Plus implements MathOperation {

	@Override
	public int calculate(int a, int b) {
		return a + b;
	}

}
