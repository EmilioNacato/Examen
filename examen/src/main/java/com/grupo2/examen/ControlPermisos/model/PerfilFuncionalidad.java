package main.java.com.grupo2.examen.ControlPermisos.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name = "SEG_PERFIL_FUNCIONALIDAD")
public class PerfilFuncionalidad implements Serializable{

    @EmbeddedId
    private PerfilFuncionalidadPk id;
    @NotNull
    @Column(name = "ORDEN", length = 2, nullable = false)
    private String orden;
    @NotNull
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;
    @NotNull
    @Column(name = "ADMITE_CREACION", nullable = false)
    private Boolean admiteCreacion;
    @NotNull
    @Column(name = "ADMITE_MODIFICACION", nullable = false)
    private Boolean admiteModificacion;

    public PerfilFuncionalidad() {
    }

    public PerfilFuncionalidad(PerfilFuncionalidadPk id) {
        this.id = id;
    }

    public PerfilFuncionalidadPk getId() {
        return id;
    }

    public void setId(PerfilFuncionalidadPk id) {
        this.id = id;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getAdmiteCreacion() {
        return admiteCreacion;
    }

    public void setAdmiteCreacion(Boolean admiteCreacion) {
        this.admiteCreacion = admiteCreacion;
    }

    public Boolean getAdmiteModificacion() {
        return admiteModificacion;
    }

    public void setAdmiteModificacion(Boolean admiteModificacion) {
        this.admiteModificacion = admiteModificacion;
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
        PerfinFulcionalidad other = (PerfilFuncionalidad) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PerfilFuncionalidad [id=" + id + ", orden=" + orden + ", estado=" + estado + ", admiteCreacion="
                + admiteCreacion + ", admiteModificacion=" + admiteModificacion + "]";
    }

    

   

}
