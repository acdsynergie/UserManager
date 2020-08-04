package de.tech11.UserManager.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.tech11.UserManager.models.IUserContract;
import de.tech11.UserManager.models.UserEntity;

@Path("/client/user")
public class UserController implements IUserController {

	@Inject
	private IUserRepository userRepository;

	@Inject
	private EntityManager em;

	
	@Override
	@GET
	@Transactional
	@Path("/list")
	public List<IUserContract> doList() {
		List<UserEntity> resultList = userRepository.findAll();
		List<IUserContract> result = new ArrayList<IUserContract>();

		if (resultList != null && resultList.size() > 0) {
			resultList.stream().forEach(e -> result.add((IUserContract) e));
		}

		return result;
	}

	@Override
	@GET
	@Path("/{id}")
	@Transactional
	public IUserContract doFind(@PathParam("id") Long id) {
		IUserContract resultEntity = userRepository.findBy(id);
		return resultEntity;
	}

	@Override
	@POST
	@Path("/create")
	@Transactional
	public IUserContract doCreate(IUserContract userContract) {
		UserEntity saved = userRepository.save(UserEntity.fromContract(userContract));
		return saved;
	}

	@Override
	@POST
	@Path("/modify")
	@Transactional
	public void doModify(IUserContract userContract) {
		userRepository.refresh(UserEntity.fromContract(userContract));
	}

	@Override
	@POST
	@Path("/delete")
	@Transactional
	public void doDelete(IUserContract userContract) {
		userRepository.remove(UserEntity.fromContract(userContract));
	}

}
