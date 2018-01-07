package pl.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {

	private List<Integer> list = new ArrayList<>();

		public void generate() {
			for (int i = 1; i < 50; i++) {
				list.add(i);
			}
		}

		public void randomize() {
			Collections.shuffle(list);
		}

		public int checkResult(List<Integer> numbers) {
			List<Integer> listNumbers = new ArrayList<>();
			for (int i = 0; i < 6; i++) {
				listNumbers.add(list.get(i));
			}

			int goals = 0;
			for (Integer integer : listNumbers) {
				if (numbers.contains(integer)) {
					goals++;					
				}
			}
			return goals;

		}

}
