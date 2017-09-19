package pl.java.pilot;

import java.util.Scanner;

public class Pilot {

	private boolean on;
	private int currentChannel;
	private int currentVolume = 7;
	// private String tab[] = new String[10];
	private Channel[] channels = new Channel[10];

	public Pilot(boolean on) {
		this.on = on;
//		tab[0] = "tvp";
//		tab[1] = "tvp1";
//		tab[2] = "tvp2";
//		tab[3] = "tvp3";
//		tab[4] = "tvn";
//		tab[5] = "polsat";
//		tab[6] = "ttv";
//		tab[7] = "viva";
//		tab[8] = "sport";
//		tab[9] = "info";
		
		channels[0] = new Channel("tvp", 0, "telewizja publiczna");
		channels[1] = new Channel("tvp1", 1, "telewizja publiczna 1");
		channels[2] = new Channel("tvp2", 2, "telewizja publiczna 2");
		channels[3] = new Channel("tvp3", 3, "telewizja publiczna 3");
		channels[4] = new Channel("tvn", 4, "telewizja prywatna");
		channels[5] = new Channel("polsat", 5, "swiat wg kiepskich i in.");
		channels[6] = new Channel("ttv", 6, "damy i wiesniaczki, usterka i in.");
		channels[7] = new Channel("viva", 7, "kana³ muzyczny");
		channels[8] = new Channel("sport", 8, "kana³ sportowy");
		channels[9] = new Channel("info", 9, "kana³ informacyjny");
		
	}

	public boolean isOn() {
		return on;
	}

	public void powerButton() {
		if (!isOn()) {
			on = true;
			System.out.println("Tv is on");
		} else {
			on = false;
			System.out.println("Tv is off");
		}
	}

	public Channel setChannel(int channel) {
		if (channel >= 0 && channel <= 9) {
			currentChannel = channel;
			System.out.println("Your channel: " + channel);
		}
		// return tab[currentChannel];
		return channels[currentChannel];
	}

	public Channel nextChannel() {
		if (currentChannel < 9) {
			return setChannel(currentChannel + 1);
			// currentChannel++;
		} else {
			return setChannel(0);
			// currentChannel = 0;
		}
		// System.out.println("Your current channel: " + currentChannel);
		// return tab[currentChannel];
	}

	public Channel previousChannel() {
		if (currentChannel > 0) {
			return setChannel(currentChannel - 1);
			// currentChannel--;
		} else {
			return setChannel(9);
			// currentChannel = 9;
		}
		// System.out.println("Your current channel: " + currentChannel);
		// return tab[currentChannel];
	}

	public void volumeUp() {
		if (currentVolume < 15) {
			currentVolume++;
			System.out.println("Your volume: " + currentVolume);
		} else {
			System.out.println("Max volume");
		}
	}

	public void volumeDown() {
		
		if (currentVolume > 0) {
			currentVolume--;
		}
		if (currentVolume >= 1) {
			System.out.println("Your volume: " + currentVolume);
		} else {
			System.out.println("Mute");
		}

	}
	
	public int getCurrentChannel() {
		return currentChannel;
	}
}
