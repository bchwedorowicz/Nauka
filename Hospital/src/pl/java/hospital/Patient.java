package pl.java.hospital;

public class Patient {
	
	private String firstName;
	private String lastName;
	private long pesel;

	public Patient(String firstName, String lastName, long pesel2) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.pesel = pesel2;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public long getPesel() {
		return pesel;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPesel(long pesel) {
		this.pesel = pesel;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " " + pesel;
	}
	
	
}
