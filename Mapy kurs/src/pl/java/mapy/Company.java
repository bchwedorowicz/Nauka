package pl.java.mapy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Company {

	private Map<String, Employee> employees = new HashMap<>();
	
	private Scanner sc;
	
	public Company(Scanner sc) {
		this.sc = sc;
	}

	public void addEmployee() {
			System.out.println("First name:");
			String firstName = sc.next();
			System.out.println("Last name:");
			String lastName = sc.next();
			System.out.println("Salary:");
			double salary = sc.nextDouble();
			Employee emp = new Employee(firstName, lastName, salary);
			String key = createKey(firstName, lastName);
			employees.put(key, emp);
	}

	public void searchEmployee(String firstName, String lastName) {
		System.out.println(employees.get(createKey(firstName, lastName)));
	}
	
	private String createKey(String firstName, String lastName) {
		return firstName.toLowerCase() + " " + lastName.toLowerCase();
	}

}
