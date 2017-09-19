package pl.java.enumeratory;

public enum ShirtSize {
	S("small"), M("medium"), L("large");

	private String nazwa;

	private ShirtSize(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getNazwa() {
		return nazwa;
	}
	
	public static ShirtSize getBySize(int size) {
		if (size < 38) {
			return ShirtSize.S;
		} else if (size >= 38 && size < 40) {
			return ShirtSize.M;
		} else {
			return ShirtSize.L;
		}
	}

}
