
public enum Pizza {
	MARGHERITA("sos pomidorowy + ser"), CAPRICIOSA("sos pomidorowy + ser + pieczarki"), PROSCIUTTO("sos pomidorowy + ser + szynka");

	private String description;

	private Pizza(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return description;
		
	}

}
