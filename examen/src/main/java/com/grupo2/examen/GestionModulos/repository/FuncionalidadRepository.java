package main.java.com.grupo2.examen.GestionModulos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.java.com.grupo2.examen.GestionModulos.model.Funcionalidad;
import main.java.com.grupo2.examen.GestionModulos.model.FuncionalidadPk;

@Repository
public interface FuncionalidadRepository extends JpaRepository<Funcionalidad, FuncionalidadPk> {
    List<Funcionalidad> findByEstadoAndAdmiteCreacion(String estado, boolean admiteCreacion);
}
