package de.tech11.UserManager.client;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import de.tech11.UserManager.models.UserCredentials;

@Repository(forEntity = UserCredentials.class)
public interface IUserCredentialsRepository extends EntityRepository<UserCredentials, Long> {

}
