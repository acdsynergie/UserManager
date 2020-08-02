package de.tech11.UserManager.client;

import org.apache.deltaspike.data.api.Repository;
import de.tech11.UserManager.models.IUserContract;

@Repository(forEntity = IUserContract.class)
public interface IUserRepository extends Repository
{

}
