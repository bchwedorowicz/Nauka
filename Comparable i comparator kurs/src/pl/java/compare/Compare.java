package pl.java.compare;

import java.util.Arrays;
import java.util.Comparator;

//Napisz program, w którym utworzysz tablicê 20 dowolnych liczb ca³kowitych, a nastêpnie posortujesz 
//tablicê w porz¹dku rosn¹cym i malej¹cym, za ka¿dym razem wyœwietlaj¹c wynik posortowania na ekranie. 
//Wykorzystaj interfejs Comparator i anonimowe klasy wewnêtrzne.

public class Compare {

	public static void main(String[] args) {

		Integer[] arr = { 5, 45, 8, 1, 8, 4, 6, 75, 89, 4, 2, 45, 5, 74, 23, 82, 65, 456, 9, 0, 6 };

		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				if (x<y) {
					return -1;
				}
				if (x==y) {
					return 0;
				}
				else {
					return 1;
				}
			}
			
		});

		System.out.println("low to high: " + Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				if (x<y) {
					return 1;
				}
				if (x==y) {
					return 0;
				}
				else {
					return -1;
				}
			}
			
		});
		
		System.out.println("high to low: " + Arrays.toString(arr));

	}
}
