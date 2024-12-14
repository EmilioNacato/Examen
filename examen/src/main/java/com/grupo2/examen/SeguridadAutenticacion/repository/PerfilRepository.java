package main.java.com.grupo2.examen.SeguridadAutenticacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PerfilRepository extends JpaRepository<Perfil, String> {

}
