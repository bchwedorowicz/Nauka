package pl.java.generics;

public class Pair <T, V> {

	private T t;
	private V v;
	
	public Pair(T t, V v) {
		this.t = t;
		this.v = v;
	}

	public T getT() {
		return t;
	}

	public V getV() {
		return v;
	}

	public void setT(T t) {
		this.t = t;
	}

	public void setV(V v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "type one: " + t + " type two: " + v;
	}
	
	
	
	
	
	
	
	
	

}
