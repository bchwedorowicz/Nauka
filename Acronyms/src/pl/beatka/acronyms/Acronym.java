package pl.beatka.acronyms;

public class Acronym {

	private String acronym;
	private String description;

	public Acronym(String acronym, String description) {
		this.acronym = acronym;
		this.description = description;
	}
	public String getAcronym() {
		return acronym;
	}
	public String getDescription() {
		return description;
	}
	
	public static Acronym praseLine(String line) {
		String a = "";
		String b = "";
		for (int i = 0; i < line.length(); i++) {
			if (Character.isWhitespace(line.charAt(i))) {
				a = line.substring(0, i);
				b = line.substring(i + 1, line.length());
				break;
			}
		}
		return new Acronym(a, b);

	}
}