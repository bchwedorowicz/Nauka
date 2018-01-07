package pl.java.io;

import java.io.Serializable;

public class Company implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final int MAX_SIZE = 300;
	private int temp = 0;
	private Employee[] employees = new Employee[MAX_SIZE];

	public void add(Employee empl) {
		employees[temp++] = empl;
	}

	@Override
	public String toString() {
		StringBuilder sB = new StringBuilder();
		for (int i = 0; i < temp; i++) {
			Employee employee = employees[i];
			String emplObject = employee.getFirstName() + " " + employee.getLastName() + " " + employee.getSalary();
			sB.append(emplObject);
			sB.append("; ");
		}
		return sB.toString();
	}
}
