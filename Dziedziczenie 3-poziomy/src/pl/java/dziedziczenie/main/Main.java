package pl.java.dziedziczenie.main;

public class Main {
	//-TV: samsung, 1300zl, 230v, full hd
	//-TV: sony, 1000zl, 110v, 4k
	//-Elektronika: budzik, 20zl, 5V


	public static void main(String[] args) {
		
		TV plazma = new TV("samsung", 1300, 230, "full hd");
		TV led = new TV("sony", 1000, 110, "4k");
		Electronics zegar = new Electronics("budzik", 20, 5);
		
		plazma.printLabel();
		led.printLabel();
		zegar.printLabel();
		
		Products tv = new TV("test",100,10,"hd");
		tv.printLabel();
		
		
		
		
		
		
		
		
		
		

	}

}
