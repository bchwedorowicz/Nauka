
public class GroceryShop_Main {

	// Napisz prosty program, w kt�rym stworzysz prost� hierarchi� klas
	// reprezentuj�cych owoce w sklepie. Powinny istnie� co najmniej dwie klasy:
	//
	// Fruit (klasa nadrz�dna) posiadaj�ca konstruktor domy�lny oraz metod�
	// printInfo(), kt�ra wy�wietli informacj� o kategorii produktu, czyli "Owoc"
	// Apple (klasa reprezentuj�ca jab�ko, dziedzicz�ca po klasie Fruit). Posiada
	// pole przechowuj�ce informacj� o odmianie, konstruktor z jednym parametrem
	// pozwalaj�cy zainicjowa� to pole oraz przes�oni�t� metod� printInfo(), kt�ra
	// wy�wietla informacj� z nadklasy, a tak�e o tym, �e jest jab�kiem konkretnej
	// odmiany. Wykorzystaj w tej klasie co najmniej raz instrukcj� super.
	// W klasie GroceryShop (sklep spo�ywczy) utw�rz obiekt klasy Apple i wy�wietl
	// informacje o nim za pomoc� metody printInfo().
	//
	// Przyk�adowe wyj�cie programu:
	//
	// "Owoc: Jab�ko Szampion"

	public static void main(String[] args) {
		Apple jon = new Apple("Jonagold");
		jon.printInfo();

	}

}
