import java.util.Arrays;

public class Hospital {

	private Person[] employees = new Person[3];
	private int number = 0;

	public Person[] getEmployees() {
		return employees;
	}

	public void add(Person person) {
		employees[number++] = person;
	}

	@Override
	public String toString() {
		return Arrays.toString(employees);
	}

	public void printDOctors() {
		for (Person person : employees) {
			if (person instanceof Doctor) {
				person.print();
				Doctor doc = (Doctor) person;
				doc.doctorsMethod();
			}
		}

	}
}