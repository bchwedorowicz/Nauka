package pl.java.debt;

import java.io.IOException;
import java.util.List;

public interface FileStorage {

	List <Debtor> readFromFile() throws IOException;

	void writeToFile(List<Debtor> debtors) throws IOException;

}
