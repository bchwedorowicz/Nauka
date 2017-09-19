package pl.beatka.acronyms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public abstract class AbstractAcronymCollection implements Acronyms {
	
	protected abstract void clear();
	protected abstract void add(Acronym acronym);
	
	@Override
	public void loadAcronymsFromFile(File file) throws IOException {
		clear();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				Acronym acronym = Acronym.praseLine(line);
				add(acronym);
			}
		}	
	}

}
