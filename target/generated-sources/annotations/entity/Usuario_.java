package entity;

import entity.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-10T14:15:17")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> estado;
    public static volatile SingularAttribute<Usuario, Integer> idTipoUsuario;
    public static volatile SingularAttribute<Usuario, String> pass;
    public static volatile SingularAttribute<Usuario, Persona> idUsuario;
    public static volatile SingularAttribute<Usuario, String> usuario;

}