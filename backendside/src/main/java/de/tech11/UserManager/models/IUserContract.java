package de.tech11.UserManager.models;

import java.util.Date;

import javax.persistence.OneToOne;

public interface IUserContract {

	long getId();

	String getFirstname();

	void setFirstname(String firstname);

	String getLastname();

	void setLastname(String lastname);

	String getEmail();

	void setEmail(String email);

	Date getBirthday();

	void setBirthday(Date birthday);

	UserCredentials getCredentials();

	void setCredentials(UserCredentials credentials);
}