package pl.java.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Util {

	public static <T> List<T> addList(List<T> list1, List<T> list2) {
		List<T> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		return list3;
	}

	public static String joinStrings(String... strings) {
		//return String.join(" ", strings);
//		String string = "";
//		for (int i = 0; i < strings.length; i++) {
//			string += strings[i] + " ";
//		}
//		String substring = string.substring(0, string.length()-1);
//		return substring;
		StringBuilder sB = new StringBuilder();
		for (String string2 : strings) {
			sB.append(string2);
			sB.append(" ");
		}
		String substring = sB.substring(0, sB.length()-1);
		return substring;
	}

}
