
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "nota")
public class Nota implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNota;
    
    @JoinColumn(name="idPersona", referencedColumnName = "idPersona", nullable = false)
    @ManyToOne
    private Persona idPersona;
    
    @JoinColumn(name = "idCategoria", referencedColumnName = "idCategoria", nullable = false)
    @ManyToOne
    private Categoria idCategoria;
    
    
    @Column(name="ancabezado")
    private String encabezado;
    
    @Column(name="cuerpo")
    private String cuerpo;
    
    @Temporal(TemporalType.DATE)
    @Column(name="fechaCreacion")
    private Date fechaCreacion;
    
    @Column(name="comentarioAdmin")
    private String comentarioAdmin;
    
    @Column(name="valoracion")
    private int valoracion;

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getComentarioAdmin() {
        return comentarioAdmin;
    }

    public void setComentarioAdmin(String comentarioAdmin) {
        this.comentarioAdmin = comentarioAdmin;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idNota;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nota other = (Nota) obj;
        if (this.idNota != other.idNota) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nota{" + "idNota=" + idNota + ", idPersona=" + idPersona + ", idCategoria=" + idCategoria + ", encabezado=" + encabezado + ", cuerpo=" + cuerpo + ", fechaCreacion=" + fechaCreacion + ", comentarioAdmin=" + comentarioAdmin + ", valoracion=" + valoracion + '}';
    }

    

   
    
    
    
}
