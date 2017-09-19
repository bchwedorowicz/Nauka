package pl.java.enumeratory;

public class Koszula {
	
	private String color;
	private int size;
	private ShirtSize shirtSize;

	public Koszula(String color, int size) {
		this.color = color;
		this.size = size;
		this.shirtSize = ShirtSize.getBySize(size);
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSize() {
		return size;
	}
	
	public ShirtSize getShirtSize() {
		return shirtSize;
	}
	
	
	
}
