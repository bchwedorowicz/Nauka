package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import data.Library;

public class FileManager {

    public static final String FILE_NAME = "Library.o";

    public void writeLibraryToFile(Library lib) throws IOException {
	File file = new File(FILE_NAME);
	if (!file.exists()) {
	    file.createNewFile();
	}
	try (FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);) {

	    oos.writeObject(lib);

	} catch (FileNotFoundException e) {
	    System.err.println("Nie odnaleziono pliku " + FILE_NAME);
	} catch (IOException e) {
	    System.err.println("B³¹d podczas zapisu danych do pliku " + FILE_NAME);
	}
    }

    public Library readLibraryFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
	File file = new File(FILE_NAME);
	if (!file.exists()) {
	    return null;
	}
	Library library = null;
	try (FileInputStream fis = new FileInputStream(FILE_NAME);
		ObjectInputStream ois = new ObjectInputStream(fis);) {

	    library = (Library) ois.readObject();

	} catch (FileNotFoundException e) {
	    System.err.println("Nie odnaleziono pliku " + FILE_NAME);
	    throw e;
	} catch (IOException e) {
	    System.err.println("B³¹d podczas zapisu danych do pliku " + FILE_NAME);
	    throw e;
	} catch (ClassNotFoundException e) {
	    System.err.println("Nieprawid³owy format pliku");
	    throw e;
	}

	return library;
    }

}
