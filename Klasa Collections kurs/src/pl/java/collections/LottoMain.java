package pl.java.collections;

import java.util.ArrayList;
import java.util.List;

public class LottoMain {

	public static void main(String[] args) {

		List<Integer> userNumbers = new ArrayList<>();
		userNumbers.add(15);
		userNumbers.add(6);
		userNumbers.add(9);
		userNumbers.add(26);
		userNumbers.add(17);
		userNumbers.add(12);

		Lotto lotto = new Lotto();

		lotto.generate();
		long counter = 0;
		int result;
		do {
			lotto.randomize();
			result = lotto.checkResult(userNumbers);
			if (counter % 100000 == 0) {
				System.out.println(result);
			}
			counter++;
		} while (result != 6);
		System.out.println("Counter: " + counter);
	}

}
