package pl.beatka.acronyms;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public interface Acronyms {

	/**
	 * returns count of acronyms code
	 */
	int getAcronymsCount();

	/**
	 * Method which translates acronym code to it's description
	 * 
	 * @param acronym
	 *            code of acronym
	 * @return acronym description or null if acronym doesn't exist
	 */
	Collection<String> getAcronymDescriptions(String givenAcronym);

	/**
	 * returns unique words count in description
	 * 
	 * @return word's count
	 */
	int getUniqueWordsCount();

	/**
	 * Loads acronyms from given file
	 * 
	 * @param file
	 */
	void loadAcronymsFromFile(File file) throws IOException;

}
