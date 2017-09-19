package pl.java.debt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class SerializeFileStorage implements FileStorage, Serializable {

	private static final File DATA_BIN = new File("data.bin");

	@Override
	public List<Debtor> readFromFile() throws IOException {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream(DATA_BIN));
			return (List<Debtor>) in.readObject();
		} catch (ClassNotFoundException e) {
			throw new IOException(e);
		} finally {
			in.close();
		}
	}

	@Override
	public void writeToFile(List<Debtor> debtor) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_BIN))) {
			out.writeObject(debtor);
		}
	}

}
