package pl.java.notebook_shop;

import java.util.Arrays;

public class DataStore {

	Computer[] comps = new Computer[0];

	public void add(Computer comp) {
		// Computer[] comps2 = new Computer[comps.length+1];
		// for (int i = 0; i<comps.length; i++) {
		// comps2[i] = comps[i];
		// }
		// comps2[comps2.length-1] = comp;
		// comps = comps2;
		comps = Arrays.copyOf(comps, comps.length + 1);
		comps[comps.length - 1] = comp;
	}

	@Override
	public String toString() {
		StringBuilder sB = new StringBuilder();
		for (Computer computer : comps) {
			sB.append(computer);
			sB.append("; ");
		}
		return sB.toString();
	}

	public int checkAvailability(Computer c1) {
		int theSameComputersAmount = 0;
		for (Computer computer : comps) {
			if (computer.equals(c1)) {
				theSameComputersAmount++;
			}
		}
		return theSameComputersAmount;
	}

}
