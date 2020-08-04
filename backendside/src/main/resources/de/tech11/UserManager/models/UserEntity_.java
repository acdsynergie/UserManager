package de.tech11.UserManager.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-08-04T10:40:05.206+0200")
@StaticMetamodel(UserEntity.class)
public class UserEntity_ extends BaseEntity_ {
	public static volatile SingularAttribute<UserEntity, String> firstname;
	public static volatile SingularAttribute<UserEntity, String> lastname;
	public static volatile SingularAttribute<UserEntity, String> email;
	public static volatile SingularAttribute<UserEntity, Date> birthday;
}
