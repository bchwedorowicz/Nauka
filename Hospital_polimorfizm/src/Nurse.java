
public class Nurse extends Person {

	private int overtime;

	public Nurse(String firstName, String lastName, double payment, int overtime) {
		super(firstName, lastName, payment);
		this.overtime = overtime;
	}

	public int getOvertime() {
		return overtime;
	}

	@Override
	public String toString() {
		return "Nurse [" + super.toString() + "overtime=" + overtime + "]";
	}
	
	@Override
	public void print() {
		System.out.println("Jestem pielêgniark¹");
	}
	
	

}
