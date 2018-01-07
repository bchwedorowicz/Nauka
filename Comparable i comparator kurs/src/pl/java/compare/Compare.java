package pl.java.compare;

import java.util.Arrays;
import java.util.Comparator;

//Napisz program, w kt�rym utworzysz tablic� 20 dowolnych liczb ca�kowitych, a nast�pnie posortujesz 
//tablic� w porz�dku rosn�cym i malej�cym, za ka�dym razem wy�wietlaj�c wynik posortowania na ekranie. 
//Wykorzystaj interfejs Comparator i anonimowe klasy wewn�trzne.

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
