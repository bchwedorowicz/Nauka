package pl.java.ATM;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	// klasy:
	// - przygotuj klase reprezentujaca karte do bankomatu ktora ma swoj nr i stan
	// konta
	// - przygotuj klase reprezentujaca bankomat ktory pozwala na wplacanie i
	// wyplacanie pieniedzy oraz na wyswietlenie aktualnego stanu karty
	// program:
	// - stworz pare przykladowych kart
	// - popros uzytkownika o podanie numeru karty;
	// - jezeli taka karta nie istnieje wyswietl komunikat i popros o nr jeszcze raz
	// - jezeli karta istnieje 'wloz' ja do bankomatu i pozwol uzytkownikowi wybrac
	// operacje wplaty lub wyplaty a nastepnie niech poda kwote
	// - jezeli uzytkownik zakonczy moze wyciagnac karte z bankomatu i wsadzic inna

	// wyciagn¹æ karte i wsadzic nowa karte.

	public static void main(String[] args) {

		Card[] cards = { new Card(111), new Card(222), new Card(333) };
		Random generator = new Random();

		for (Card card : cards) {
			double moneyAmount = (100 + (1000 - 100) * generator.nextDouble());
			double moneyAmountRound = Math.round(moneyAmount * 100.0) / 100.0;
			card.setMoneyAmount(moneyAmountRound);
		}

		ATM atm = new ATM();

		Scanner scanner = new Scanner(System.in);
		// boolean cardExists = false;
		boolean ATMisOn = true;

		while (ATMisOn) {
			while (!atm.hasCard()) {
				System.out.println("Please insert your card and get card number.");
				int cardNr = scanner.nextInt();
				for (Card card : cards) {
					int cardNumber = card.getNumber();
					if (cardNr == cardNumber) {
						atm.setCard(card);
						System.out.println("Your money amount " + card.getMoneyAmount());
						// cardExists = true;
						break;
					}
					if (cardNr == 0) {
						return;
					}

				}
			}
			System.out.println("Get type of transaction: `deposit` or `withdraw`.");
			System.out.println("To remove your card press: 'end'.");
			String transaction = scanner.next();
			if (transaction.equals("deposit")) {
				System.out.println("Set deposit amount.");
				Double money = scanner.nextDouble();
				atm.deposit(money);
				System.out.println("Your current money amount: " + atm.getMoneyAmount());
			} else if (transaction.equals("withdraw")) {
				System.out.println("Set withdraw amount.");
				Double money = scanner.nextDouble();
				atm.withdraw(money);
				System.out.println("Your current money amount: " + atm.getMoneyAmount());
			}
			if (transaction.equals("end")) {
				System.out.println("Remove your card");
				atm.setCard(null);

				// cardExists = false;
			}
		}
	}
}
