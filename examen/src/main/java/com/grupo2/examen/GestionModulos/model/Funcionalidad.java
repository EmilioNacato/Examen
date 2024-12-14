package main.java.com.grupo2.examen.GestionModulos.model;

import java.io.Serial;
import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "SEG_FUNCIONALIDAD")
public class Funcionalidad implements Serializable{

    @EmbeddedId
    private FuncionalidadPk id;
    @NotNull
    @ManyToOne  
    @JoinColumn(name = "COD_MODULO", referencedColumnName = "COD_MODULO", insertable = false, updatable = false)
    private String codeModulo;
    @NotNull
    @Column(name = "URL_PRINCIPAL", length = 200, nullable = false)
    private String urlPrincipal;
    @NotNull
    @Column(name = "NOMBRE", length = 200, nullable = false)
    private String nombre;
    @Column(name = "DESCRIPCION", length = 50)
    private String descripcion;
    @NotNull
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;

    public Funcionalidad() {
    }

    public Funcionalidad(FuncionalidadPk id) {
        this.id = id;
    }

    public FuncionalidadPk getId() {
        return id;
    }

    public void setId(FuncionalidadPk id) {
        this.id = id;
    }

    public String getCodeModulo() {
        return codeModulo;
    }

    public void setCodeModulo(String codeModulo) {
        this.codeModulo = codeModulo;
    }

    public String getUrlPrincipal() {
        return urlPrincipal;
    }

    public void setUrlPrincipal(String urlPrincipal) {
        this.urlPrincipal = urlPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionalidad other = (Funcionalidad) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Funcionalidad [id=" + id + ", codeModulo=" + codeModulo + ", urlPrincipal=" + urlPrincipal + ", nombre="
                + nombre + ", descripcion=" + descripcion + ", estado=" + estado + "]";
    }

    
}
