package de.tech11.UserManager.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.deltaspike.jpa.api.transaction.TransactionScoped;
import org.hibernate.HibernateException;

import de.tech11.UserManager.models.IUserContract;
import de.tech11.UserManager.models.UserEntity;

@TransactionScoped
@Path("/client/user")
public class UserController {

	@Inject
	private IUserRepository userRepository;

	/**
	 * Constructor to use for new {@link UserController}
	 */
	public UserController() {
		if (userRepository == null) {
			throw new HibernateException("Something went wrong with DI for mandatory repositories.");
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public List<IUserContract> doList(Optional<Long> filters) {
		List<UserEntity> resultList = userRepository.findAll();
		List<IUserContract> result = new ArrayList<IUserContract>();

		if (resultList != null && resultList.size() > 0) {
			resultList.stream().forEach(e -> result.add((IUserContract) e));
		}

		return result;
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public IUserContract doFind(@PathParam("id") Long id) {
		IUserContract resultEntity = userRepository.findBy(id);
		return resultEntity;
	}

	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public IUserContract doCreate(IUserContract userContract) {
		UserEntity saved = userRepository.save(UserEntity.fromContract(userContract));
		return saved;
	}

	@POST
	@Path("/modify")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void doModify(IUserContract userContract) {
		userRepository.refresh(UserEntity.fromContract(userContract));
	}

	@POST
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void doDelete(IUserContract userContract) {
		userRepository.remove(UserEntity.fromContract(userContract));
	}

}
