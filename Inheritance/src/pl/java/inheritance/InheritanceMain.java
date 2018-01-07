package pl.java.inheritance;

public class InheritanceMain {
	
//	Stw�rz projekt, w kt�rym wykorzystuj�c dziedziczenie stworzysz prost� hierarchi� klas odwzorowuj�cych cz�ci w hurtowni 
//	motoryzacyjnej zgodnie z poni�sz� specyfikacj�:
//
//		Ka�da cz�� w hurtowni (Part) posiada sw�j unikalny numer identyfikacyjny, przechowuje nazw� producenta, model i seri� produktu
//		Cz�ci takie jak Opony (Tire) i Felgi (Wheel) posiadaj� dodatkowo informacj� o rozmiarze i szeroko�ci
//		Cz�ci (ExhaustPart) uk�adu wydechowego posiadaj� dodatkow� informacj�, czy jest ona zgodna z europejskim standardem emisji spalin
//		Dopisz kr�tk� klas� testow�, w kt�rej utworzysz kilka obiekt�w reprezentuj�cych cz�ci i wy�wietl informacje o nich.

	public static void main(String[] args) {
		
		ExhaustPart s = new ExhaustPart(456, "Amica", "s-line", 456, true);
		
		System.out.println(s.getIdNumber() + " " + s.getModel() + " " + s.getProducer() + " " + s.getSeries() + " " + s.getClass());

	}

}
