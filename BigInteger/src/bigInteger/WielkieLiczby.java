package bigInteger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

public class WielkieLiczby {

	public static final String FILE_PATH = "C:\\Users\\beata\\Desktop\\wielkie_liczby.txt";

	public static void main(String[] args) {
		WielkieLiczby wL = new WielkieLiczby();
		String[] ar = wL.readFromFile();
		System.out.println(Arrays.toString(ar));
		int one = Integer.parseInt(ar[0]);
		int two = Integer.parseInt(ar[1]);
		int three = Integer.parseInt(ar[2]);
		
		System.out.println("Suma trzech pierwszych liczb: " + (one + two + three));
		
		BigInteger big1 = new BigInteger(ar[3]);
		BigInteger big2 = new BigInteger(ar[4]);
		
		System.out.println("Suma dwóch ostatnich liczb: " + big1.add(big2));
	}

	public String[] readFromFile() {
		String[] liczby = new String[5];
		int indexNr = 0;
		try (BufferedReader bR = new BufferedReader(new FileReader(new File(FILE_PATH)))) {
			String linia;
			while ((linia = bR.readLine()) != null) {
				liczby[indexNr++] = linia;
			}
		} catch (IOException e) {
			System.err.println("Wyst¹pi³ wyj¹tek: ");
			e.printStackTrace();
		}
		return liczby;
	}
}
