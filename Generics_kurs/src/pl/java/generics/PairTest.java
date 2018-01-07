package pl.java.generics;

public class PairTest {

	public static void main(String[] args) {
		Pair<String, Integer> i = new Pair<>("bla", 5);
		Pair<String, Double> d = new Pair<>("ble", 5.0);
		Pair<String, Character> c = new Pair<>("bly", 'c');
		
		printObject(d);
		

	}
	
	public static <T, V> void printObject(Pair <T, V> pair) {
		System.out.println(pair);
	}
	
	

}
