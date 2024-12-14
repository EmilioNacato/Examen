package main.java.com.grupo2.examen.GestionModulos.services;

import java.util.List;

import main.java.com.grupo2.examen.GestionModulos.model.Modulo;
import main.java.com.grupo2.examen.GestionModulos.repository.ModuloRepository;


public class ModuloServices {

    private ModuloRepository moduloRepository;

    public List<Modulo> listarModulos() {
        return moduloRepository.findAll();
    }

    public Modulo buscarPorCodigo(String codModulo) {
        return moduloRepository.findById(codModulo);
    }

    public Modulo guardarModulo(Modulo modulo) {
        return moduloRepository.save(modulo);
    }

    public Modulo actualizarModulo(String codModulo, Modulo moduloDetalles) {
        Modulo modulo = buscarPorCodigo(codModulo);
        if (modulo != null) {
            modulo.setNombre(moduloDetalles.getNombre());
            modulo.setEstado(moduloDetalles.getEstado());
            modulo.setVersion(moduloDetalles.getVersion());
            return moduloRepository.save(modulo);
        }
        return null;
    }

    public void eliminarModulo(String codModulo) {
        moduloRepository.deleteById(codModulo);
    }
}
