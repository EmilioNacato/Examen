package main.java.com.grupo2.examen.GestionModulos.model;

import java.io.Serializable;

@Embeddable
public class FuncionalidadPk implements Serializable{

    @Column(name = "COD_MODULO", nullable = false)
    private String codeModulo;
    @Column(name = "COD_FUNCIONALIDAD", nullable = false)
    private String codeFuncionalidad;

    public FuncionalidadPk() {
    }

    public FuncionalidadPk(String codeModulo, String codeFuncionalidad) {
        this.codeModulo = codeModulo;
        this.codeFuncionalidad = codeFuncionalidad;
    }

    public String getCodeModulo() {
        return codeModulo;
    }

    public void setCodeModulo(String codeModulo) {
        this.codeModulo = codeModulo;
    }

    public String getCodeFuncionalidad() {
        return codeFuncionalidad;
    }

    public void setCodeFuncionalidad(String codeFuncionalidad) {
        this.codeFuncionalidad = codeFuncionalidad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        FuncionalidadPk other = (FuncionalidadPk) obj;
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
}
