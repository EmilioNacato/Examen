package main.java.com.grupo2.examen.ControlPermisos.model;

import java.io.Serializable;

@Embeddable
public class PerfilFuncionalidadPk implements Serializable{

    @NotNull
    @Column(name = "COD_PERFIL", nullable = false)
    private String codePerfil;
    @NotNull
    @Column(name = "COD_FUNCIONALIDAD", nullable = false)
    private String codeFuncionalidad;
    @NotNull
    @Column(name = "COD_MODULO", nullable = false)
    private String codeModulo;

    public PerfilFuncionalidadPk() {
    }

    public PerfilFuncionalidadPk(String codePerfil, String codeFuncionalidad, String codeModulo) {
        this.codePerfil = codePerfil;
        this.codeFuncionalidad = codeFuncionalidad;
        this.codeModulo = codeModulo;
    }

    public String getCodePerfil() {
        return codePerfil;
    }

    public void setCodePerfil(String codePerfil) {
        this.codePerfil = codePerfil;
    }

    public String getCodeFuncionalidad() {
        return codeFuncionalidad;
    }

    public void setCodeFuncionalidad(String codeFuncionalidad) {
        this.codeFuncionalidad = codeFuncionalidad;
    }

    public String getCodeModulo() {
        return codeModulo;
    }

    public void setCodeModulo(String codeModulo) {
        this.codeModulo = codeModulo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codePerfil == null) ? 0 : codePerfil.hashCode());
        result = prime * result + ((codeFuncionalidad == null) ? 0 : codeFuncionalidad.hashCode());
        result = prime * result + ((codeModulo == null) ? 0 : codeModulo.hashCode());
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
        PerfilFuncionalidadPk other = (PerfilFuncionalidadPk) obj;
        if (codePerfil == null) {
            if (other.codePerfil != null)
                return false;
        } else if (!codePerfil.equals(other.codePerfil))
            return false;
        if (codeFuncionalidad == null) {
            if (other.codeFuncionalidad != null)
                return false;
        } else if (!codeFuncionalidad.equals(other.codeFuncionalidad))
            return false;
        if (codeModulo == null) {
            if (other.codeModulo != null)
                return false;
        } else if (!codeModulo.equals(other.codeModulo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PerfilFuncionalidadPk [codePerfil=" + codePerfil + ", codeFuncionalidad=" + codeFuncionalidad
                + ", codeModulo=" + codeModulo + "]";
    }

    

    

}
