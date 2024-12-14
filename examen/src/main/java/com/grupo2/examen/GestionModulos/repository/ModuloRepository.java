package main.java.com.grupo2.examen.GestionModulos.repository;

import java.util.List;

import main.java.com.grupo2.examen.GestionModulos.model.Modulo;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ModuloRepository extends JpaRepository<Modulo, String> {


}
