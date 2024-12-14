package main.java.com.grupo2.examen.GestionModulos.model;

import java.io.Serial;
import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "SEG_FUNCIONALIDAD")
public class Funcionalidad implements Serializable{

    @Id
    @NotNull
    @Column(name = "COD_FUNCIONALIDAD", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Serial code;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "COD_MODULO", referencedColumnName = "COD_MODULO", insertable = false, updatable = false)
    private Comision perfil;


    @NotNull
    @Column(name = "NOMBRE", length = 50, nullable = false)
    private String nombre;
}
