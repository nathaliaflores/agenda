package ejb;

import entity.Nota;
import java.util.List;
import javax.ejb.Local;

@Local
public interface NotaFacadeLocal {

    void create(Nota nota);

    void edit(Nota nota);

    void remove(Nota nota);

    Nota find(Object id);

    List<Nota> findAll();

}
