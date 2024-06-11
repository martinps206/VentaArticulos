package com.martinps.controller;

import com.martinps.model.Rubro;
import com.martinps.service.RubroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RubroController {

    private final RubroService rubroService;

    public RubroController(RubroService rubroService) {
        this.rubroService = rubroService;
    }

    @GetMapping("/rubros")
    public List<Rubro> getAllRubros() {
        return rubroService.getAllRubros();
    }

    @GetMapping("/rubros/{id}")
    public Rubro getRubroById(@PathVariable Long id) {
        return rubroService.getRubroById(id);
    }

    @PostMapping("/rubros")
    public Rubro createRubro(@RequestBody Rubro rubro) {
        return rubroService.saveRubro(rubro);
    }

    @DeleteMapping("/rubros/{id}")
    public void deleteRubro(@PathVariable Long id) {
        rubroService.deleteRubro(id);
    }
}
