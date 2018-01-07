package pl.java.iterator;

public class IteratorData {

	private String firstName;
	private String lastName;
	private int age;

	public IteratorData(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " - " + age;
	}

}
