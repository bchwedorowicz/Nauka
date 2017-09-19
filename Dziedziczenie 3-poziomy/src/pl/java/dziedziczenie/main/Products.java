package pl.java.dziedziczenie.main;

public class Products {

	private String name;
	private double price;

	public Products(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void printLabel() {
		System.out.println("Name: " + name);
		System.out.println("Price: " + price + "zl");
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
