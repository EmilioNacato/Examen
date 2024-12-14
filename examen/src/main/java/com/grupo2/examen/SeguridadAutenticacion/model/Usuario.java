package main.java.com.grupo2.examen.SeguridadAutenticacion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.security.Identity;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "SEG_USUARIO")
public class Usuario implements Serializable{

    @Id
    @NotNull
    @Column(name = "COD_USUARIO", nullable = false, length = 30)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    @ManyToOne
    @JoinColumn(name = "COD_PERFIL", referencedColumnName = "COD_PERFIL", insertable = false, updatable = false)
    private Comision perfil;
    @NotNull
    @Column(name = "MAIL", length = 128, nullable = false)
    private String mail;
    @NotNull
    @Column(name = "NOMMBRE", length = 128, nullable = false)
    private String nombre;
    @NotNull
    @Column(name = "TELEFONO", length = 10, nullable = false)
    private String telefono;
    @NotNull
    @Column(name = "CLAVE", length = 64, nullable = false)
    private String clave;
    @NotNull
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDateTime fechaCreacion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CAMBIO_CLAVE")
    private LocalDate fechaCambioClave;
    @NotNull
    @Column(name = "NRO_INTENTOS_FALLIDOS", precision = 3, nullable = false)
    private BigDecimal nroIntentosFallidos;
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_ULTIMA_SESION", nullable = false)
    private LocalDateTime fechaUltimaSesion;
    @NotNull
    @Column(name = "SUELDO", precision = 10, scale = 2, nullable = false)
    private BigDecimal sueldo;

    public Usuario() {
    }

    public Usuario(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Comision getPerfil() {
        return perfil;
    }

    public void setPerfil(Comision perfil) {
        this.perfil = perfil;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaCambioClave() {
        return fechaCambioClave;
    }

    public void setFechaCambioClave(LocalDate fechaCambioClave) {
        this.fechaCambioClave = fechaCambioClave;
    }

    public BigDecimal getNroIntentosFallidos() {
        return nroIntentosFallidos;
    }

    public void setNroIntentosFallidos(BigDecimal nroIntentosFallidos) {
        this.nroIntentosFallidos = nroIntentosFallidos;
    }

    public LocalDateTime getFechaUltimaSesion() {
        return fechaUltimaSesion;
    }

    public void setFechaUltimaSesion(LocalDateTime fechaUltimaSesion) {
        this.fechaUltimaSesion = fechaUltimaSesion;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
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
        Usuario other = (Usuario) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [code=" + code + ", perfil=" + perfil + ", mail=" + mail + ", nombre=" + nombre + ", telefono="
                + telefono + ", clave=" + clave + ", estado=" + estado + ", fechaCreacion=" + fechaCreacion
                + ", fechaCambioClave=" + fechaCambioClave + ", nroIntentosFallidos=" + nroIntentosFallidos
                + ", fechaUltimaSesion=" + fechaUltimaSesion + ", sueldo=" + sueldo + "]";
    }

    
    

}
