package data;

import java.util.ArrayList;
import java.util.List;

public class LibraryUser extends User {

    private static final long serialVersionUID = -7975708105221971370L;

    private List<Publication> publicationHistory;
    private List<Publication> borrowedPublications;

    public LibraryUser(String firstName, String lastName, String pesel) {
	super(firstName, lastName, pesel);
	publicationHistory = new ArrayList<>();
	borrowedPublications = new ArrayList<>();
    }

    public List<Publication> getPublicationHistory() {
	return publicationHistory;
    }

    public List<Publication> getBorrowedPublications() {
	return borrowedPublications;
    }

    private void addPublicationToHistory(Publication pub) {
	publicationHistory.add(pub);
    }

    public void borrowPublication(Publication pub) {
	borrowedPublications.add(pub);
    }

    public boolean returnPublication(Publication pub) {
	boolean result = false;
	if (borrowedPublications.remove(pub)) {
	    result = true;
	    addPublicationToHistory(pub);
	}
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (obj == null) {
	    return false;
	}
	if ((this.getClass() != obj.getClass())) {
	    return false;
	}
	LibraryUser libUser = (LibraryUser) obj;
	if (!(this.publicationHistory.equals(libUser.publicationHistory))
		|| !(this.borrowedPublications.equals(libUser.borrowedPublications))) {
	    return false;
	}
	return true;
    }

}
