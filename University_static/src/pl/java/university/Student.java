package pl.java.university;

public class Student {

	private String firstName;
	private String lastName;
	private int indexNumber;
	public static int studentsAmount = 0;

	public Student(String firstName, String lastName, int indexNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.indexNumber = indexNumber;
		studentsAmount++;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getIndexNumber() {
		return indexNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setIndexNumber(int indexNumber) {
		this.indexNumber = indexNumber;
	}

}
