
package controller;

import ejb.NotaFacadeLocal;
import ejb.PersonaFacadeLocal;
import entity.Nota;
import entity.Persona;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "notacontroller")
@SessionScoped 
public class NotaController implements Serializable{
    
    @EJB
    private NotaFacadeLocal notaEJB;
    private Nota nota;
    private List<Nota> lista;
    
    private PersonaFacadeLocal personaEJB;
    private Persona persona;
    private List<Persona>
    
    
    
}
