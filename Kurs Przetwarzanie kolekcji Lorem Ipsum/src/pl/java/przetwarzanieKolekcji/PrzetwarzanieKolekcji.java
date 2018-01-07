package pl.java.przetwarzanieKolekcji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrzetwarzanieKolekcji {

    public static void main(String[] args) throws MalformedURLException {

	URL url = new URL("https://javastart.pl/pluginfile.php/270/mod_assign/intro/loremipsum.txt");
	try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
	    List<String> words = br.lines()
		    .map(x -> x.split(" "))
		    .flatMap(x -> Arrays.stream(x))
		    .collect(Collectors.toList());

	    long wordsNumber = words.stream()
		    .filter(e -> !e.isEmpty())
		    .map(y -> {
			char lastChar = y.charAt(y.length()-1);
			if (lastChar == ',' || lastChar == '.') {
			    return y.substring(0, y.length()-1);
			} else {
			    return y;
			}
		    })
		    .filter(z -> z.charAt(0) == 's')
		    .filter(q -> q.length() == 5)
		    .count();
	    System.out.println("Words number: " + wordsNumber);

	} catch (IOException e) {
	    System.err.println("error");
	}

    }

}
