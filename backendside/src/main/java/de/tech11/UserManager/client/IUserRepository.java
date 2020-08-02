package de.tech11.UserManager.client;

import javax.transaction.Transactional;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.Repository;
import de.tech11.UserManager.models.IUserContract;
import de.tech11.UserManager.models.UserEntity;

@Transactional
@Repository(forEntity = IUserContract.class)
public interface IUserRepository extends EntityRepository<UserEntity,Long>
{
    @Query(named = UserEntity.BY_EMAIL)
    Long countAllOlderThan(int minAge);
}
