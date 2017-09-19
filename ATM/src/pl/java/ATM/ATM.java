package pl.java.ATM;

public class ATM {

	private Card card;

	public void setCard(Card card) {
		this.card = card;
	}

	public void deposit(double money) {
		card.setMoneyAmount(card.getMoneyAmount() + money);
	}

	public void withdraw(double money) {
		card.setMoneyAmount(card.getMoneyAmount() - money);
	}

	public double getMoneyAmount() {
		return card.getMoneyAmount();
	}

	public boolean hasCard() {
		return card != null;
	}

}
