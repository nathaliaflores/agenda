package entity;

import entity.Categoria;
import entity.Persona;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-10T14:15:17")
@StaticMetamodel(Nota.class)
public class Nota_ { 

    public static volatile SingularAttribute<Nota, String> comentarioAdmin;
    public static volatile SingularAttribute<Nota, String> encabezado;
    public static volatile SingularAttribute<Nota, Date> fechaCreacion;
    public static volatile SingularAttribute<Nota, Integer> idNota;
    public static volatile SingularAttribute<Nota, Integer> valoracion;
    public static volatile SingularAttribute<Nota, Categoria> idCategoria;
    public static volatile SingularAttribute<Nota, Persona> idPersona;
    public static volatile SingularAttribute<Nota, String> cuerpo;

}