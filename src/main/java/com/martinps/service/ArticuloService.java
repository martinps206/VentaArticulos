package com.martinps.service;

import com.martinps.model.Articulo;
import com.martinps.repository.ArticuloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloService {

    private final ArticuloRepository articuloRepository;

    public ArticuloService(ArticuloRepository articuloRepository) {
        this.articuloRepository = articuloRepository;
    }

    public List<Articulo> getAllArticulos() {
        return articuloRepository.findAll();
    }

    public Articulo getArticuloById(Long id) {
        return articuloRepository.findById(id).orElse(null); // Devuelve null si el artículo no se encuentra
    }
    public Articulo saveArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    public void deleteArticulo(Long id) {
        articuloRepository.deleteById(id);
    }
}
