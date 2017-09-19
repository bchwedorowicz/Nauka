package pl.java.rower.pakiet;

public class Handlebar {
	
	private boolean hasBreaks;
	private String bellSound;
	
	public Handlebar(boolean hasBreaks, String bellSound) {
		this.hasBreaks = hasBreaks;
		this.bellSound = bellSound;
	}
	
	public void ringBell() {
		System.out.println(bellSound);
	}
	
	public boolean isHasBreaks() {
		return hasBreaks;
	}

}
