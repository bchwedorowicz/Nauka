package pl.java.lambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {

	public static void main(String[] args) {

		Random r = new Random();
		Supplier<Integer> sup = () -> r.nextInt(100);

		Consumer<String> con = s -> System.out.println(s);
		
		Predicate<Integer> pre = a -> a%2 == 0;
		
		

		LambdaManager lm = new LambdaManager(sup, con);
		lm.removeInt(pre);

	}

}
