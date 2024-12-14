package main.java.com.grupo2.examen.SeguridadAutenticacion.model;

import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "SEG_PERFIL")
public class Perfil implements Serializable{

    @Id
    @NotNull
    @Column(name = "COD_PERFIL", nullable = false, length = 8)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    @NotNull
    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;
    @NotNull
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;

    public Perfil() {
    }

    public Perfil(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        Perfil other = (Perfil) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Perfil [code=" + code + ", nombre=" + nombre + ", estado=" + estado + "]";
    }

    

}
