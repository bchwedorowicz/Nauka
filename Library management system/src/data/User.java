package data;

import java.io.Serializable;

public abstract class User implements Serializable {

    private static final long serialVersionUID = 4801832859746685927L;
    private String firstName;
    private String lastName;
    private String pesel;

    public User(String firstName, String lastName, String pesel) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.pesel = pesel;
    }

    public String getFirstName() {
	return firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public String getPesel() {
	return pesel;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public void setPesel(String pesel) {
	this.pesel = pesel;
    }

    @Override
    public boolean equals(Object obj) {
	if (obj == null) {
	    return false;
	}
	if (obj instanceof User) {
	    return false;
	}
	User user = (User) obj;
	if (!(this.firstName.equals(user.firstName)) || !(this.lastName.equals(user.lastName))
		|| !(this.pesel.equals(user.pesel))) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return firstName + " " + lastName + " - " + pesel;
    }

}
