package com.martinps.controller;

import com.martinps.model.Articulo;
import com.martinps.service.ArticuloService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticuloController {

    private final ArticuloService articuloService;

    public ArticuloController(ArticuloService articuloService) {
        this.articuloService = articuloService;
    }

    @GetMapping("/articulos")
    public List<Articulo> getAllArticulos() {
        return articuloService.getAllArticulos();
    }

    @GetMapping("/articulos/{id}")
    public Articulo getArticuloById(@PathVariable Long id) {
        return articuloService.getArticuloById(id);
    }

    @PostMapping("/articulos")
    public Articulo createArticulo(@RequestBody Articulo articulo) {
        return articuloService.saveArticulo(articulo);
    }

    @DeleteMapping("/articulos/{id}")
    public void deleteArticulo(@PathVariable Long id) {
        articuloService.deleteArticulo(id);
    }
}
