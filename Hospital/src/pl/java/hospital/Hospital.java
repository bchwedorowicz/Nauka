package pl.java.hospital;

import java.io.Closeable;
import java.util.Scanner;

public class Hospital  {

	private Patient[] patientsArray = new Patient[10];
	private int arrayElements = 0;
	private Scanner sc;
	
	public Hospital(Scanner sc) {
		this.sc = sc;
	}

	public void readPatient() {
		if (arrayElements == patientsArray.length) {
			System.out.println("Limit exceeded");
			return;
		}
		System.out.println("First name:");
		String firstName = sc.next();
		System.out.println("Last name:");
		String lastName = sc.next();
		System.out.println("Pesel:");
		long pesel = sc.nextLong();

		Patient newPatient = new Patient(firstName, lastName, pesel);
		patientsArray[arrayElements] = newPatient;
		arrayElements++;
		
	}

	public void printPatientsList() {
		System.out.println("List of patients:");
		for (int i = 0; i < arrayElements; i++) {
			Patient currentPatient = patientsArray[i];
			System.out.println(currentPatient);
		}
	}


}
