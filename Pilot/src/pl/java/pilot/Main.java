package pl.java.pilot;

import java.nio.channels.Channels;
import java.util.Scanner;

// Oprogramuj pilot do telewizora, niech naci�ni�cie danego przycisku wywo�uje jak�� metod�. 
// Program po uruchomieniu ma wy�wietli� liczb� dost�pnych przycisk�w, a po naci�ni�ciu danego przycisku 
// (czyli wpisaniu jego nazwy) komunikat. Pilot niech ma przyciski numeryczne, ale maksymalna warto��, 
// jak� mo�na wpisa� to 9. Niech ma przycisk on/off, pozosta�e przyciski nie dzia�aj�, 
// kiedy TV jest wy��czony. Niech posiada regulacj� g�o�no�ci (minimum 1, maksimum 15) 
// i przycisk zmiany kana�u w g�r�, a tak�e w d�. Kana�y niech b�d� zap�tlone, 
// z kolei g�o�no�� nie. Ko�czenie pracy programu po wy��czeniu telewizora. 
// UWAGA! Przypominam, �e do por�wnywania tekstu u�ywamy metody equals.

public class Main {

	public static boolean isNumeric(String button) {
		try {
			int butt = Integer.parseInt(button);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Pilot vectra = new Pilot(false);
		Scanner scanner = new Scanner(System.in);
		
		
				
		do {
			System.out.println("Press the button");
			String button = scanner.next();
			if (button.equals("o")) {
				vectra.powerButton();
			} else if (isNumeric(button)) {
				int butt = Integer.parseInt(button);
				Channel channelName = vectra.setChannel(butt);
				System.out.println("Channel name: " + channelName.getName());
				System.out.println("Channel description: " + channelName.getDescription());
			}
			if (button.equals("c+")) {
				Channel channelName = vectra.nextChannel();
				System.out.println("Channel name: " + channelName.getName());
				System.out.println("Channel description: " + channelName.getDescription());

			}
			if (button.equals("c-")) {
				Channel channelName = vectra.previousChannel();
				System.out.println("Channel name: " + channelName.getName());
				System.out.println("Channel description: " + channelName.getDescription());
			}
			if (button.equals("v+")) {
				vectra.volumeUp();
			}
			if (button.equals("v-")) {
				vectra.volumeDown();
			}
		} while (vectra.isOn());

	}
}
