package de.tech11.UserManager;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.apache.deltaspike.jpa.api.transaction.TransactionScoped;

@ApplicationScoped
public class EntityManagerProducer {

	@PersistenceUnit(unitName = "tech11")
    private EntityManagerFactory emf;

    @Produces
    @TransactionScoped
    public EntityManager create()
    {
        return emf.createEntityManager();
    }

    public void close(@Disposes EntityManager em)
    {
        if (em.isOpen())
        {
            em.close();
        }
    }

	
}
