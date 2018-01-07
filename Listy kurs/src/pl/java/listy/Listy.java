package pl.java.listy;

import java.util.ArrayList;
import java.util.Scanner;

//Napisz program,kt�ry pozwoli zsumowa� dowoln� ilo�� 
//liczb od u�ytkownika.Aplikacja powinna przesta� wczytywanie 
//liczb,gdy u�ytkownik wprowadzi polecenie"exit".
//
//Po wczytaniu liczb wy�wietl je na ekranie oraz podaj wynik 
//ich sumowania w postaci"a + b + c + ... + N = wynik".
//Do wczytywania danych napisz odpowiedni� metod� rekurencyjn�.

public class Listy {

	ArrayList<String> listS = new ArrayList<>();

	public void writeToList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give number:");
		String number = sc.next();
		if (!("exit".equals(number))) {
			listS.add(number);
			writeToList();
		} else {
			System.out.println("The end");
			return;
		}
	}

	public static void main(String[] args) {
		Listy l = new Listy();

		l.writeToList();

		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for (String element : l.listS) {
			sb.append(element);
			sb.append(" + ");
			sum += Integer.parseInt(element);
		}
		String nowyString = sb.toString();
		nowyString = nowyString.substring(0, nowyString.length() - 2);
		System.out.println("ArrayList: " + nowyString + "= " + sum);

	}

}
