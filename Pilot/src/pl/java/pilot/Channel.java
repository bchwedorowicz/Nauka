package pl.java.pilot;

public class Channel {

	private String name;
	private int number;
	private String description;

	public Channel(String name, int number, String description) {
		this.name = name;
		this.number = number;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getDescription() {
		return description;
	}

}
