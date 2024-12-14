package main.java.com.grupo2.examen.GestionModulos.services;

import java.util.List;

import main.java.com.grupo2.examen.GestionModulos.model.Funcionalidad;
import main.java.com.grupo2.examen.GestionModulos.repository.FuncionalidadRepository;

public class FuncionalidadService {

    private FuncionalidadRepository funcionalidadRepository;

    public List<Funcionalidad> listarFuncionalidadesActivas(String estado, boolean admiteCreacion) {
        return funcionalidadRepository.findByEstadoAndAdmiteCreacion(estado, admiteCreacion);
    }
}
