package ejb;

import entity.Categoria;
import java.util.List;
import javax.ejb.Local;

@Local
public interface CategoriaFacadeLocal {

    void create(Categoria categoria);

    void edit(Categoria categoria);

    void remove(Categoria categoria);

    Categoria find(Object id);

    List<Categoria> findAll();

}
