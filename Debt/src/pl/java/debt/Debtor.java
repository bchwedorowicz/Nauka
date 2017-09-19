package pl.java.debt;

import java.io.Serializable;

public class Debtor implements Serializable {

	private String firstName;
	private String lastName;
	private double debt;

	public Debtor(String firstName, String lastName, double debt) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.debt = debt;
	}

	public double getDebt() {
		return debt;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	@Override
	public String toString() {
		String debtString = Double.toString(debt);
		return firstName + " " + lastName + " " + debtString + " z³";
	}

}
