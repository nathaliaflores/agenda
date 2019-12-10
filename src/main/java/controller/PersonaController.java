
package controller;

import ejb.PersonaFacadeLocal;
import entity.Persona;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "personaController")
@SessionScoped
public class PersonaController implements Serializable{
    
    @EJB
    private PersonaFacadeLocal personaEJB;
    private Persona persona;
    private List<Persona> lista;
    
    public List<Persona> getLista(){
        return lista;
    
    }
    
    public void setLista(List<Persona> lista){
        this.lista = lista;
    
    }
    
    public Persona getPersona(){
        return persona;
    
    }
    public void setPersona(Persona persona){
        this.persona = persona;
    }
    
    @PostConstruct
    public void init(){
        persona = new Persona();
    }
    
    public void insertar(){
        try {
            personaEJB.create(persona);
        } catch (Exception e) {
            
        }
    }
    
    public void listar(){
        try {
            lista = personaEJB.findAll();
        } catch (Exception e) {
        }
    }
    
    public void leerid(Persona per){
        try {
            this.persona = per;
        } catch (Exception e) {
        }
    }
    
    public void modificar(){
        try {
            personaEJB.edit(persona);
            lista = personaEJB.findAll();
        } catch (Exception e) {
        }
    }
    
    public void eliminar(Persona per){
        this.persona = per;
        try {
           personaEJB.remove(persona);
           lista = personaEJB.findAll(); 
        } catch (Exception e) {
        }
    }
}
