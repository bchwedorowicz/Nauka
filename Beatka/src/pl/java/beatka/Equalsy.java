package pl.java.beatka;

public class Equalsy {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = s2;

		System.out.println(s3 == s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

}
