package pl.java.beatka;

public class Testowa {

	private int nr1;
	public static int nr2;

	public Testowa(int nr1, int nr2) {
		super();
		this.nr1 = nr1;
		this.nr2 = nr2;
	}

	@Override
	public String toString() {
		return "nr1 wynosi '" + nr1 + "' a nr2 wynosi '" + nr2 + "'";
	}

}
