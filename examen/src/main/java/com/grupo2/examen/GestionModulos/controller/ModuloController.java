package main.java.com.grupo2.examen.GestionModulos.controller;

import java.util.List;
import com.grupo2.services.ModuloServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import main.java.com.grupo2.examen.GestionModulos.model.Modulo;

@RestController
@RequestMapping("/modulos")
public class ModuloController {

    private ModuloServices moduloService;

    @GetMapping
    public List<Modulo> listarModulos() {
        return moduloService.listarModulos();
    }

    @GetMapping("/{codModulo}")
    public ResponseEntity<Modulo> buscarModulo(@PathVariable String codModulo) {
        Modulo modulo = moduloService.buscarPorCodigo(codModulo);
        return modulo != null ? ResponseEntity.ok(modulo) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Modulo guardarModulo(@RequestBody Modulo modulo) {
        return moduloService.guardarModulo(modulo);
    }

    @PutMapping("/{codModulo}")
    public ResponseEntity<Modulo> actualizarModulo(@PathVariable String codModulo, @RequestBody Modulo moduloDetalles) {
        Modulo actualizado = moduloService.actualizarModulo(codModulo, moduloDetalles);
        return actualizado != null ? ResponseEntity.ok(actualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{codModulo}")
    public ResponseEntity<Void> eliminarModulo(@PathVariable String codModulo) {
        moduloService.eliminarModulo(codModulo);
        return ResponseEntity.noContent().build();
    }
}
