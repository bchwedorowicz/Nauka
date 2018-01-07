package data;

import java.time.LocalDate;

public class Magazine extends Publication {

    private static final long serialVersionUID = 1L;
    private String language;

    public Magazine(LocalDate date, String title, String publisher, String language) {
	super(date, title, publisher);
	this.language = language;
    }

    public String getLanguage() {
	return language;
    }

    public void setLanguage(String language) {
	this.language = language;
    }

    @Override
    public String toString() {
	StringBuilder print = new StringBuilder(32);
	print.append(getTitle());
	print.append("; ");
	print.append(getPublisher());
	print.append("; ");
	print.append(getDate());
	print.append("; ");
	print.append(getLanguage());
	return print.toString();
    }

}
