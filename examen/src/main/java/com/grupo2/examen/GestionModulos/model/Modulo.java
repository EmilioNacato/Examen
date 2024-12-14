package main.java.com.grupo2.examen.GestionModulos.model;

import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "SEG_MODULO")
public class Modulo implements Serializable{

    @Id
    @NotNull
    @Column(name = "COD_MODULO", nullable = false, length = 16)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codeModulo;
    @NotNull
    @Column(name = "NOMBRE", length = 50, nullable = false)
    private String nombre;
    @NotNull
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;
    @NotNull
    @Column(name = "VERSION", nullable = false)
    private Integer version;
    
    public Modulo() {
    }

    public Modulo(String codeModuloe) {
        this.codeModulo = codeModulo;
    }

    public String getcodeModulo() {
        return codeModulo;
    }

    public void setCode(String codeModulo) {
        this.codeModulo = codeModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
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
        Modulo other = (Modulo) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Modulo [code=" + code + ", nombre=" + nombre + ", estado=" + estado + ", version=" + version + "]";
    }

    


}
