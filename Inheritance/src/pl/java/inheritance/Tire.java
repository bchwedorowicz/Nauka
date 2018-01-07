package pl.java.inheritance;

public class Tire extends Part {

	private int size;
	private int width;

	public Tire(int idNumber, String producer, String model, int series, int size, int width) {
		super(idNumber, producer, model, series);
		this.size = size;
		this.width = width;
	}

	public int getSize() {
		return size;
	}

	public int getWidth() {
		return width;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
