package pl.java.university;

public class University {
//	
//	Utw�rz program sk�adaj�cy si� z dw�ch klas:
//
//		Student - pozwala przechowywa� informacj� o imieniu, nazwisku i numerze indeksu studenta
//		University - klasa z metod� main, w kt�rej utworzysz kilku (co najmniej 2 student�w)
//		W klasie Student zdefiniuj zmienn� statyczn�, kt�ra wraz z tworzeniem nowego obiektu tej 
//	    klasy b�dzie zwi�kszana, a tym samym pozwoli �ledzi� ilo�� student�w na uczelni.
//
//		Po utworzeniu co najmniej dw�ch student�w w klasie university, wy�wietl liczb� student�w na uczelni.

	public static void main(String[] args) {
		
		Student a = new Student("Adam", "Nowak", 1564);
		Student x = new Student("Anna", "Kowalska", 4789);
		Student s = new Student("ewa", "nowak", 045);
		System.out.println(Student.studentsAmount);
		

	}

}
