package pl.java.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Person implements Comparable<Person> {

	private String firstName;
	private String lastName;
	private String pesel;

	public Person(String firstName, String lastName, String pesel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pesel = pesel;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person person = (Person) obj;
		if (!(this.firstName.equals(person.firstName) || !(this.lastName.equals(person.lastName))
				|| !(this.pesel.equals(person.pesel)))) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "First name: " + firstName + "; Last name: " + lastName + "; Pesel: " + pesel;
	}

	@Override
	public int compareTo(Person o) {
		return this.firstName.compareTo(o.firstName);

	}

	public static void main(String[] args) {
		Person p1 = new Person("zzz", null, null);
		Person p2 = new Person("aaa", null, null);

		Person[] pers = { p1, p2 };

		Arrays.sort(pers, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.compareTo(o2);
			}
		});
	}

}
