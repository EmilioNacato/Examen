package main.java.com.grupo2.examen.ControlPermisos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilFuncionalidadRepository extends JpaRepository<main.java.com.grupo2.examen.ControlPermisos.model.PerfilFuncionalidad, main.java.com.grupo2.examen.ControlPermisos.model.PerfilFuncionalidadPk> {

}
