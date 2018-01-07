package pl.java.arrays;

import java.util.Arrays;

public class PersonDatabase {

	private int index = 0;
	private Person[] persons = new Person[1];

	public void add(Person p) {
		if (persons.length == index) {
			persons = Arrays.copyOf(persons, persons.length * 2);
		}
		persons[index++] = p;
	}

	public void remove(Person p) {
		for (int i = 0; i < persons.length; i++) {
			if (p.equals(persons[i])) {
				for (int j = i; j < persons.length - 1; j++) {
					persons[j] = persons[j + 1];
					index--;
				}
				break;
			}
		}
	}

	public Person get(int index) {
		return persons[index];
	}

	@Override
	public String toString() {
		return Arrays.toString(persons);
	}

}