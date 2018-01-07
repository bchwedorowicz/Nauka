package pl.java.notebook_shop;

import java.sql.DatabaseMetaData;

import javax.security.auth.callback.ChoiceCallback;

public class NotebookShop {

	public static void main(String[] args) {
		Computer c1 = new Computer("Asus", 5);
		Computer c2 = new Computer("hp", 4);
		Computer c3 = new Computer("Lenovo", 3);
		Computer c4 = new Computer("Dell", 1);
		Computer c5 = new Computer("Dell", 1);
		
		DataStore dataStore = new DataStore();
		
		dataStore.add(c1);
		dataStore.add(c2);
		dataStore.add(c3);
		dataStore.add(c4);
		dataStore.add(c5);
		
		
		System.out.println("Availability c5: " + dataStore.checkAvailability(c5));
		System.out.println("All available notebooks: " + dataStore);

	}

}
