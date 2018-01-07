package pl.java.referencje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Referencje {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Ania");
		names.add("Kasia");
		names.add("Basia");
		names.add("Ala");
		names.add("Zbyszek");
		
		Collections.sort(names, Referencje::sortNames);
		
		Collections.sort(names, String::compareToIgnoreCase);
		print(names, System.out::println);
		
		
	}

	public static int sortNames(String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
	}
	
	public static void print(List<String> arr, Consumer<String> con) {
		for (String name : arr) {
			con.accept(name);
			
		}
	}
	
}
