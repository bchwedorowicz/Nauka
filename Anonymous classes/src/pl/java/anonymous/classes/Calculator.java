package pl.java.anonymous.classes;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

	private Map<Character, MathOperation> map = new HashMap<>();

	public Calculator() {
		map.put('+', new Plus());
		map.put('-', new Minus());
		MathOperation multiply = new MathOperation() {

			@Override
			public int calculate(int a, int b) {
				return a * b;
			}
		};
		map.put('*', multiply);
		map.put('/', (a, b) -> a/b);
	}

	public int calculate(String s) {
		for (Character character : map.keySet()) {
			if (s.contains(character.toString())) {
				int index = s.indexOf(character);
				String a = s.substring(0, index);
				String b = s.substring(index + 1, s.length());
				MathOperation mathoperation = map.get(character);
				return mathoperation.calculate(Integer.parseInt(a), Integer.parseInt(b));
			}
		}
		throw new IllegalArgumentException("Wrong argument " + s);
	}
}
