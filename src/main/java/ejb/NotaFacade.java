
package ejb;

import entity.Nota;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class NotaFacade extends AbstractFacade<Nota> implements NotaFacadeLocal{
    @PersistenceContext(unitName="conexionPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NotaFacade() {
        super(Nota.class);
      
    }  
}
