package de.tech11.UserManager.client;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.tech11.UserManager.models.IUserContract;


public interface IUserController {

	List<IUserContract> doList(Optional<Long> filters);

	IUserContract doFind(Long id);

	IUserContract doCreate(IUserContract userContract);

	void doModify(IUserContract userContract);

	void doDelete(IUserContract userContract);

}