package pl.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CompanyApp {

	// Napisz aplikacj�, kt�ra
	// b�dzie pozwala�a
	// wczyta� informacje
	// o pracownikach firmy,
	// albo pobieraj�c
	// je od u�ytkownika,
	// albo wczytuj�c
	// je z
	// dysku.Dane pobrane
	// od u�ytkownika
	// powinny nadpisywa�
	// poprzednio zapisane informacje.
	//
	// Klasy,
	// kt�re powinna
	// posiada� aplikacja:
	//
	// Person-klasa reprezentuj�ca osob� (imi� nazwisko)
	// Employee - klasa reprezentuj�ca pracownika (imi�, nazwisko, wyp�ata) -
	// rozszerza klas� Person
	// Company - klasa przechowuj�ca tablic� pracownik�w, powinna m�c przechowywa�
	// informacje o 3 pracownikach
	// CompanyApp - klasa, kt�ra pozwala wczytywa� dane od u�ytkownika i zapisa� je
	// na dysku lub odczyta� dane z dysku i wy�wietli� je na ekranie.
	// Wykorzystaj mechanizm serializacji.

	private static final String FILE_NAME = "employee.obj";
	private static final int READ = 1;
	private static final int WRITE = 2;

	public static void main(String[] args) {

		Company company = new Company();

		company.add(new Employee("Adam", "Nowak", 1500));
		company.add(new Employee("Anna", "Nowak", 2000));
		company.add(new Employee("Julia", "Mowak", 3000));
		
		

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			os.writeObject(company);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Zapisano obiekt do pliku");

		Scanner sc = new Scanner(System.in);
		int button = -1;

		while (button != 0) {

			System.out.println("Read file - press 1");
			System.out.println("Write file - press 2");
			System.out.println("Exit - press 0");

			button = sc.nextInt();

			switch (button) {
			case READ:
				Company comp1;
				try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
					comp1 = (Company) oos.readObject();
					System.out.println(comp1);
				} catch (IOException | ClassNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case WRITE:
				System.out.println("First name:");
				String fN = sc.next();
				System.out.println("Last name:");
				String lN = sc.next();
				System.out.println("Salary:");
				int sal = sc.nextInt();
				Employee emp = new Employee(fN, lN, sal);
				company.add(emp);
				try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
					oos.writeObject(company);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("The end");
			}

		}

	}
}
