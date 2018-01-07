package data;

import java.io.Serializable;
import java.time.LocalDate;

public class Publication implements Serializable, Comparable<Publication> {

    private static final long serialVersionUID = 1L;
    private LocalDate date;
    private String title;
    private String publisher;

    protected Publication(LocalDate year, String title, String publisher) {
	this.date = year;
	this.title = title;
	this.publisher = publisher;
    }

    public LocalDate getDate() {
	return date;
    }

    public void setDate(LocalDate year) {
	this.date = year;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getPublisher() {
	return publisher;
    }

    public void setPublisher(String publisher) {
	this.publisher = publisher;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	result = prime * result + ((date == null) ? 0 : date.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Publication other = (Publication) obj;
	if (publisher == null) {
	    if (other.publisher != null)
		return false;
	} else if (!publisher.equals(other.publisher))
	    return false;
	if (title == null) {
	    if (other.title != null)
		return false;
	} else if (!title.equals(other.title))
	    return false;
	if (date != other.date)
	    return false;
	return true;
    }

    @Override
    public int compareTo(Publication o) {
	return title.compareTo(o.getTitle());
    }

}
