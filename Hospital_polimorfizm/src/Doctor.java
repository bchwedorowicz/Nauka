
public class Doctor extends Person {

	private double bonus;

	public Doctor(String firstName, String lastName, double payment, double bonus) {
		super(firstName, lastName, payment);
		this.bonus = bonus;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	@Override
	public String toString() {
		return "Doctor [" + super.toString() + "bonus=" + bonus + "]";
	}

	@Override
	public void print() {
		System.out.println("Jestem lekarzem");
	}

	public void doctorsMethod() {
		System.out.println("Strictly doctors method");
	}

}
