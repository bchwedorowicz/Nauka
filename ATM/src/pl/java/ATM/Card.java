package pl.java.ATM;

public class Card {

	private int number;
	private double moneyAmount;

	public Card(int number) {
		this.number = number;
	}

	public void setMoneyAmount(double moneyAmount) {
		this.moneyAmount = moneyAmount;
	}

	public double getMoneyAmount() {
		return moneyAmount;
	}
	
	public int getNumber() {
		return number;
	}

}
