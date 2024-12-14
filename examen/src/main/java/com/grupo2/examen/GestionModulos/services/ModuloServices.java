package main.java.com.grupo2.examen.GestionModulos.services;

import java.util.List;
import java.util.Optional;

import main.java.com.grupo2.examen.GestionModulos.model.Modulo;
import main.java.com.grupo2.examen.GestionModulos.repository.ModuloRepository;


public class ModuloServices {

    private ModuloRepository moduloRepository;

    public void ModuloService(ModuloRepository moduloRepository) {
        this.moduloRepository = moduloRepository;
    }

    public Modulo createModulo(Modulo modulo) {
        if (modulo.getCode() == null || modulo.getNombre() == null || modulo.getEstado() == null) {
            throw new IllegalArgumentException("Datos del módulo no válidos");
        }
        return moduloRepository.save(modulo);
    }

    public Modulo updateModulo(String codModulo, Modulo newModulo) {
        Modulo existingModulo = moduloRepository.findById(codModulo)
                .orElseThrow(() -> new IllegalArgumentException("Módulo no encontrado"));
        existingModulo.setNombre(newModulo.getNombre());
        existingModulo.setEstado(newModulo.getEstado());
        existingModulo.setVersion(newModulo.getVersion());
        return moduloRepository.save(existingModulo);
    }

    public List<Modulo> getAllModulos() {
        return moduloRepository.findAll();
    }

    public void deleteModulo(String codModulo) {
        Modulo existingModulo = moduloRepository.findById(codModulo)
                .orElseThrow(() -> new IllegalArgumentException("Módulo no encontrado"));
        moduloRepository.delete(existingModulo);
    }
}
