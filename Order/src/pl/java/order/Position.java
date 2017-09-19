package pl.java.order;

public class Position {

	private String productName;
	private int quantity;
	private double price;

	public Position(String productName, int quantity, double price) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public double calculateValue() {
		return quantity * price;
	}

	public int productNameSigns() {
		int signs = 20 - productName.length();
		String space = " ";
		int spaceInt = Integer.parseInt(space);
		return signs * spaceInt;
	}

	public String toString() {
		return productName + " " + quantity + "szt." + " " + price + "z³" + " " + calculateValue() + "z³";
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
