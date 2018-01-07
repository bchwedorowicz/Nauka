package pl.java.zbiory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Zbiory {

	public Set<String> readFromFile() {
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.equals(o2)) {
					return 0;
				}
				return o2.compareTo(o1);
			}
		};
		Set<String> set = new TreeSet<>(comp);
		try (BufferedReader br = new BufferedReader(
				new FileReader(new File("C:\\Users\\beata\\Desktop\\namespl.txt")))) {
			String str;
			while ((str = br.readLine()) != null) {
				set.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return set;
	}

	public static void main(String[] args) {
		Zbiory names = new Zbiory();
		Set<String> imiona = names.readFromFile();
		System.out.println("Names amount: " + imiona.size());
		System.out.println(imiona);
		
		Iterator<String> iter = imiona.iterator();
		String first = iter.next();
		String last = "";
		while (iter.hasNext()){
			last = iter.next();
		}
		System.out.println("First name: " + first + " ; " + "Last name: " + last);
	}

}
