package com.martinps.service;

import com.martinps.model.Rubro;
import com.martinps.repository.RubroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubroService {

    private final RubroRepository rubroRepository;

    public RubroService(RubroRepository rubroRepository) {
        this.rubroRepository = rubroRepository;
    }

    public List<Rubro> getAllRubros() {
        return rubroRepository.findAll();
    }

    public Rubro getRubroById(Long id) {
        return rubroRepository.findById(id).orElse(null); // Devuelve null si el rubro no se encuentra
    }

    public Rubro saveRubro(Rubro rubro) {
        return rubroRepository.save(rubro);
    }

    public void deleteRubro(Long id) {
        rubroRepository.deleteById(id);
    }

}
