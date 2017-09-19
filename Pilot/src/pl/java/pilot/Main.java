package pl.java.pilot;

import java.nio.channels.Channels;
import java.util.Scanner;

// Oprogramuj pilot do telewizora, niech naciœniêcie danego przycisku wywo³uje jak¹œ metodê. 
// Program po uruchomieniu ma wyœwietliæ liczbê dostêpnych przycisków, a po naciœniêciu danego przycisku 
// (czyli wpisaniu jego nazwy) komunikat. Pilot niech ma przyciski numeryczne, ale maksymalna wartoœæ, 
// jak¹ mo¿na wpisaæ to 9. Niech ma przycisk on/off, pozosta³e przyciski nie dzia³aj¹, 
// kiedy TV jest wy³¹czony. Niech posiada regulacjê g³oœnoœci (minimum 1, maksimum 15) 
// i przycisk zmiany kana³u w górê, a tak¿e w dó³. Kana³y niech bêd¹ zapêtlone, 
// z kolei g³oœnoœæ nie. Koñczenie pracy programu po wy³¹czeniu telewizora. 
// UWAGA! Przypominam, ¿e do porównywania tekstu u¿ywamy metody equals.

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
