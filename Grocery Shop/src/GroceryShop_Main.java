
public class GroceryShop_Main {

	// Napisz prosty program, w którym stworzysz prost¹ hierarchiê klas
	// reprezentuj¹cych owoce w sklepie. Powinny istnieæ co najmniej dwie klasy:
	//
	// Fruit (klasa nadrzêdna) posiadaj¹ca konstruktor domyœlny oraz metodê
	// printInfo(), która wyœwietli informacjê o kategorii produktu, czyli "Owoc"
	// Apple (klasa reprezentuj¹ca jab³ko, dziedzicz¹ca po klasie Fruit). Posiada
	// pole przechowuj¹ce informacjê o odmianie, konstruktor z jednym parametrem
	// pozwalaj¹cy zainicjowaæ to pole oraz przes³oniêt¹ metodê printInfo(), która
	// wyœwietla informacjê z nadklasy, a tak¿e o tym, ¿e jest jab³kiem konkretnej
	// odmiany. Wykorzystaj w tej klasie co najmniej raz instrukcjê super.
	// W klasie GroceryShop (sklep spo¿ywczy) utwórz obiekt klasy Apple i wyœwietl
	// informacje o nim za pomoc¹ metody printInfo().
	//
	// Przyk³adowe wyjœcie programu:
	//
	// "Owoc: Jab³ko Szampion"

	public static void main(String[] args) {
		Apple jon = new Apple("Jonagold");
		jon.printInfo();

	}

}
