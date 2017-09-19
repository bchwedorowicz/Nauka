package pl.java.beatka;

public class Main {
	public static void main(String[] args) {
		Testowa o1 = new Testowa(1, 1);
		Testowa o2 = new Testowa(2, 2);

		System.out.println(o1);
		System.out.println(o2);

		System.out.println("---------------");
		Testowa.nr2 = 3;
		
		System.out.println(o1);
		System.out.println(o2);
	}
}
