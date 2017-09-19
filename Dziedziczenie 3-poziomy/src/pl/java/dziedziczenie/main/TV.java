package pl.java.dziedziczenie.main;

public class TV extends Electronics {

	private String resolution;

	public TV(String name, double price, int voltage, String resolution) {
		super(name, price, voltage);
		this.resolution = resolution;
	}

	public String getResolution() {
		return resolution;
	}

	@Override
	public void printLabel() {
		super.printLabel();
		System.out.println("Resolution: " + getResolution());
	}

}
