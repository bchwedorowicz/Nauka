package pl.java.generic;

public class ToUpperCaseTransformator implements Transformator<String> {

	@Override
	public void transform(Box<String> content) {
		String string = content.get();
		content.put(string.toUpperCase());
	}
	
	
}
