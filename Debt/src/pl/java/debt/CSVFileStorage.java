package pl.java.debt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CSVFileStorage implements FileStorage {

	@Override
	public List<Debtor> readFromFile() throws IOException {
		BufferedReader br = null;
		List<Debtor> debtors = new LinkedList<>();
		try {
			br = new BufferedReader(new FileReader("data.csv"));
			String line = br.readLine();
			while (line != null) {
				String[] b = line.split(";");
				double c = Double.parseDouble(b[2]);
				Debtor d = new Debtor(b[0], b[1], c);
				debtors.add(d);
				line = br.readLine();
			}
		} finally {
			if (br != null) {
				br.close();
			}
		}
		return debtors;
	}

	@Override
	public void writeToFile(List<Debtor> debtors) throws IOException {
		File file = new File("data.csv");
		FileWriter os = new FileWriter(file);
		try {

			for (Debtor debtor2 : debtors) {
				String stringCsv = debtor2.getFirstName() + ";" + debtor2.getLastName() + ";" + debtor2.getDebt()
						+ "\n";
				os.write(stringCsv);
			}
		} finally {
			os.close();
		}

	}

}
