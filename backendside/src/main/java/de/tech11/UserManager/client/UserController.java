package de.tech11.UserManager.client;

import java.util.Optional;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.hibernate.cfg.NotYetImplementedException;

import de.tech11.UserManager.models.IUserContract;

@Path("/client/user")
public class UserController {
	
	@Inject
	private IUserRepository userRepository;
	
	
	
    @GET
    @Path("/list")
    public String doList(Optional<Long> filters) 
    {
    	
        throw new NotYetImplementedException();
    }
	
    @GET
    @Path("/{id}")
    public String doFind(@PathParam("id") Long id) {
        throw new NotYetImplementedException();
    }

    @POST
    @Path("/create")
    public String doCreate(IUserContract userContract) 
    {
        throw new NotYetImplementedException();
    }
    
    @POST
    @Path("/modify")
    public String doModify(IUserContract userContract) 
    {
        throw new NotYetImplementedException();
    }

    
    @POST
    @Path("/delete")
    public String doDelete(IUserContract userContract) 
    {
        throw new NotYetImplementedException();
    }
    
}
