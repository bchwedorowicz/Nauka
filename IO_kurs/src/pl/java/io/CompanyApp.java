package pl.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CompanyApp {

	// Napisz aplikacjê, która
	// bêdzie pozwala³a
	// wczytaæ informacje
	// o pracownikach firmy,
	// albo pobieraj¹c
	// je od u¿ytkownika,
	// albo wczytuj¹c
	// je z
	// dysku.Dane pobrane
	// od u¿ytkownika
	// powinny nadpisywaæ
	// poprzednio zapisane informacje.
	//
	// Klasy,
	// które powinna
	// posiadaæ aplikacja:
	//
	// Person-klasa reprezentuj¹ca osobê (imiê nazwisko)
	// Employee - klasa reprezentuj¹ca pracownika (imiê, nazwisko, wyp³ata) -
	// rozszerza klasê Person
	// Company - klasa przechowuj¹ca tablicê pracowników, powinna móc przechowywaæ
	// informacje o 3 pracownikach
	// CompanyApp - klasa, która pozwala wczytywaæ dane od u¿ytkownika i zapisaæ je
	// na dysku lub odczytaæ dane z dysku i wyœwietliæ je na ekranie.
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
