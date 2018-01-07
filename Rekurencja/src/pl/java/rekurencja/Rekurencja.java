package pl.java.rekurencja;

public class Rekurencja {

	public static void main(String[] args) {
		Rekurencja r = new Rekurencja();
		System.out.println(r.rek(4));
		
	}
	
	public int rek(int number) {
		return number>1? number * rek(number-1): number;
	}

}
