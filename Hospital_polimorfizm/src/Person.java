
public class Person {

	private String firstName;
	private String lastName;
	private double payment;

	public Person(String firstName, String lastName, double payment) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.payment = payment;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the charge
	 */
	public double getCharge() {
		return payment;
	}

	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", payment=" + payment + "]";
	}
	
	public void print() {
		System.out.println("Jestem pracownikiem");
	}

}
