package pl.java.rower.pakiet;

public class Bike {

	private Handlebar handlebar;
	private Pedal pedal;
	private Saddle saddle;
	private Wheel frontWheel;
	private Wheel rearWheel;

	public Bike() {
		handlebar = new Handlebar(true, "dzyn");
		pedal = new Pedal();
		saddle = new Saddle("leather", 24);
		frontWheel = new Wheel();
		frontWheel.setSpins(false);
		frontWheel.setSpokesAmount(50);
		frontWheel.setTyreSize(30);
		rearWheel = new Wheel();
		rearWheel.setSpins(false);
		rearWheel.setSpokesAmount(45);
		rearWheel.setTyreSize(30);

	}

	public void go() {
		if (!frontWheel.isSpins() && !rearWheel.isSpins()) {
			System.out.println("Uwaga! Ruszam.");
			handlebar.ringBell();
			frontWheel.setSpins(true);
			rearWheel.setSpins(true);
		}
	}

	public void stop() {
		if (frontWheel.isSpins() && rearWheel.isSpins()) {
			if (handlebar.isHasBreaks()) {
				frontWheel.setSpins(false);
				rearWheel.setSpins(false);
				System.out.println("Stoje");
			} else {
				handlebar.ringBell();
				System.out.println("Uwagaaaa!");
			}
		}

	}
}
