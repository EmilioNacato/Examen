package main.java.com.grupo2.examen.SeguridadAutenticacion.model;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "SEG_REGISTRO_SESION")
public class RegistroSesion implements Serializable{

    @Id
    @NotNull
    @Column(name = "SECUENCIA", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Serial secuencia;
    @NotNull
    @Column(name = "COD_USUARIO", length = 32, nullable = false)
    private String codeUsuario;
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CONEXION", nullable = false)
    private LocalDateTime fechaConexion;
    @NotNull
    @Column(name = "IP_CONEXION", length = 24, nullable = false)
    private String ipConexion;
    @NotNull
    @Column(name = "RESULTADO", length = 3, nullable = false)
    private String resultado;
    @NotNull
    @Column(name = "COD_ERROR", length = 5, nullable = false)
    private String codError;

    public RegistroSesion() {
    }

    public RegistroSesion(Serial secuencia) {
        this.secuencia = secuencia;
    }

    public Serial getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Serial secuencia) {
        this.secuencia = secuencia;
    }

    public String getCodeUsuario() {
        return codeUsuario;
    }

    public void setCodeUsuario(String codeUsuario) {
        this.codeUsuario = codeUsuario;
    }

    public LocalDateTime getFechaConexion() {
        return fechaConexion;
    }

    public void setFechaConexion(LocalDateTime fechaConexion) {
        this.fechaConexion = fechaConexion;
    }

    public String getIpConexion() {
        return ipConexion;
    }

    public void setIpConexion(String ipConexion) {
        this.ipConexion = ipConexion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getCodError() {
        return codError;
    }

    public void setCodError(String codError) {
        this.codError = codError;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((secuencia == null) ? 0 : secuencia.hashCode());
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
        RegistroSesion other = (RegistroSesion) obj;
        if (secuencia == null) {
            if (other.secuencia != null)
                return false;
        } else if (!secuencia.equals(other.secuencia))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RegistroSesion [secuencia=" + secuencia + ", codeUsuario=" + codeUsuario + ", fechaConexion="
                + fechaConexion + ", ipConexion=" + ipConexion + ", resultado=" + resultado + ", codError=" + codError
                + "]";
    }

    
}
