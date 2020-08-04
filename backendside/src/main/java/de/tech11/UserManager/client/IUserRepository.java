package de.tech11.UserManager.client;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;
import de.tech11.UserManager.models.IUserContract;
import de.tech11.UserManager.models.UserEntity;

@Repository(forEntity = IUserContract.class)
public interface IUserRepository extends EntityRepository<UserEntity,Long>
{
}
