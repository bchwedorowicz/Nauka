package pl.java.inheritance;

public class ExhaustPart extends Part {

	private boolean meetsStandards;

	public ExhaustPart(int idNumber, String producer, String model, int series, boolean meetsStandards) {
		super(idNumber, producer, model, series);
		this.meetsStandards = meetsStandards;
	}

	public boolean isMeetsStandards() {
		return meetsStandards;
	}

	public void setMeetsStandards(boolean meetsStandards) {
		this.meetsStandards = meetsStandards;
	}

}
