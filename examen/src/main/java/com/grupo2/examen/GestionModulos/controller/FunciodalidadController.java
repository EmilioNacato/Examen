package main.java.com.grupo2.examen.GestionModulos.controller;

import java.util.List;

import main.java.com.grupo2.examen.GestionModulos.model.Funcionalidad;
import main.java.com.grupo2.examen.GestionModulos.services.FuncionalidadService;

public class FunciodalidadController {
    private FuncionalidadService funcionalidadService;

    @GetMapping("/activas")
    public List<Funcionalidad> obtenerFuncionalidadesActivas(
            @RequestParam String estado,
            @RequestParam boolean admiteCreacion) {
        return funcionalidadService.listarFuncionalidadesActivas(estado, admiteCreacion);
    }
}
