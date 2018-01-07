package pl.java.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaManager {

	List<Integer> ints = new ArrayList<>();

	Consumer<String> con;

	public LambdaManager(Supplier<Integer> sup, Consumer<String> con) {
		generate(sup);
		this.con = con;
	}

	public void generate(Supplier<Integer> sup) {
		for (int i = 0; i < 10; i++) {
			ints.add(sup.get());
		}
		printList();
	}

	public void removeInt(Predicate<Integer> pre) {
		Iterator<Integer> iter = ints.iterator();
		while (iter.hasNext()) {
			Integer next = iter.next();
			boolean test = pre.test(next);
			if (test) {
				iter.remove();				
			}
		}
		printList();

	}

	public void printList() {
		con.accept(ints.toString());
	}

}
