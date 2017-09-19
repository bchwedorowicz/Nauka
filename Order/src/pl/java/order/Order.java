package pl.java.order;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Order {
	private int positionsAmount;
	private int editedQuantity = 0;
	private double editedPrice;
	private String editedProductName;
	private Position[] positions;

	public Order() {
		this(10);
	}

	public Order(int maxPositionsAmount) {
		this.positions = new Position[maxPositionsAmount];
	}

	public void addPosition(Position p) {
		for (int i = 0; i < positionsAmount; i++) {
			if (positions[i].getProductName().equals(p.getProductName())) {
				int totalQuantity = positions[i].getQuantity();
				totalQuantity += p.getQuantity();
				positions[i].setQuantity(totalQuantity);
				return;
			}
		}
		positions[positionsAmount] = p;
		positionsAmount++;
	}

	public void deletePosition(int indeks) {
		positions[indeks] = null;
	}

	public void editPosition(int indeks) {

	}

	public double calculateValue() {
		double totalOrderValue = 0;
		for (int i = 0; i < positionsAmount; i++) {
			totalOrderValue += positions[i].calculateValue();
		}
		return totalOrderValue;
	}

	public String toString() {
		String abc = "Your order:" + '\n';
		for (int i = 0; i < positionsAmount; i++) {
			abc += positions[i].toString() + '\n';
		}
		return abc + "Order value: " + calculateValue();

	}
}
