package pl.java.io;

public class Employee extends Person {

	private static final long serialVersionUID = 1L;
	private double salary;

	public Employee(String firstName, String lastName, double salary) {
		super(firstName, lastName);
		this.setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	

}
