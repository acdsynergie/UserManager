package de.tech11.UserManager.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-08-04T10:40:05.199+0200")
@StaticMetamodel(UserCredentials.class)
public class UserCredentials_ extends BaseEntity_ {
	public static volatile SingularAttribute<UserCredentials, String> username;
	public static volatile SingularAttribute<UserCredentials, String> password;
	public static volatile SingularAttribute<UserCredentials, String> secret;
}
