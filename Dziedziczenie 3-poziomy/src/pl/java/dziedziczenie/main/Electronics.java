package pl.java.dziedziczenie.main;

public class Electronics extends Products {

	private int voltage;

	public Electronics(String name, double price, int voltage) {
		super(name, price);
		this.voltage = voltage;
	}

	public int getVoltage() {
		return voltage;
	}

	@Override
	public void printLabel() {
		super.printLabel();
		System.out.println("Voltage: " + voltage + "V");
	}
}
