package pl.java.generic;

public class Box<T> {

	private T content;
	
	public void put(T object) {
		content = object;
	}

	public T get() {
		return content;
	}

	
	
	
	
	

}
