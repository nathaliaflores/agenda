
package ejb;

import entity.Persona;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PersonaFacade extends AbstractFacade<Persona> implements PersonaFacadeLocal{
    @PersistenceContext(unitName = "conexionPU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager(){
        return em;
    }
    
    public PersonaFacade(){
        super(Persona.class);
    }
}
