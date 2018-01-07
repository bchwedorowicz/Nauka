package pl.java.university;

public class University {
//	
//	Utwórz program sk³adaj¹cy siê z dwóch klas:
//
//		Student - pozwala przechowywaæ informacjê o imieniu, nazwisku i numerze indeksu studenta
//		University - klasa z metod¹ main, w której utworzysz kilku (co najmniej 2 studentów)
//		W klasie Student zdefiniuj zmienn¹ statyczn¹, która wraz z tworzeniem nowego obiektu tej 
//	    klasy bêdzie zwiêkszana, a tym samym pozwoli œledziæ iloœæ studentów na uczelni.
//
//		Po utworzeniu co najmniej dwóch studentów w klasie university, wyœwietl liczbê studentów na uczelni.

	public static void main(String[] args) {
		
		Student a = new Student("Adam", "Nowak", 1564);
		Student x = new Student("Anna", "Kowalska", 4789);
		Student s = new Student("ewa", "nowak", 045);
		System.out.println(Student.studentsAmount);
		

	}

}
